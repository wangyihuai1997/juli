package cn.com.pism.juli.security.service;

import cn.com.pism.juli.api.service.JuliApiUserService;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysResourceDto;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserDto;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserResourceDto;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 10:43
 * @since 0.0.1
 */
@Service("userDetailsServiceImpl")
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private JuliApiUserService juliApiUserService;

    /**
     * Locates the user based on the username. In the actual implementation, the search
     * may possibly be case sensitive, or case insensitive depending on how the
     * implementation instance is configured. In this case, the <code>UserDetails</code>
     * object that comes back may have a username that is of a different case than what
     * was actually requested..
     *
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws UsernameNotFoundException if the user could not be found or the user has no
     *                                   GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("用户->{},登录", username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        //根据用户名，查询用户信息
        JuliSysUserDto juliSysUserDto = juliApiUserService.findUserByUsername(username);
        //根据用户，获取用户拥有的权限列表
        JuliSysUserResourceDto userResourceDto = juliApiUserService.findUserResourceByUser(juliSysUserDto);
        if (null != userResourceDto) {
            List<JuliSysResourceDto> resourceDtos = userResourceDto.getResourceDtos();
            resourceDtos.forEach(o -> {
                grantedAuthorities.add(new SimpleGrantedAuthority(o.getResourceCode()));
                log.info("用户【{}】获得权限：【{}】,资源名称：【{}】", username, o.getResourceCode(), o.getResourceName());
            });
        }
        return new User(juliSysUserDto.getId(), juliSysUserDto.getSecretCode(),
                juliSysUserDto.getDeleted(), juliSysUserDto.getAccountNonExpired(),
                juliSysUserDto.getCredentialsNonExpired(),
                juliSysUserDto.getAccountNonLocked(), grantedAuthorities);
    }
}
