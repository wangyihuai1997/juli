package cn.com.pism.juli.api.service.impl;

import cn.com.pism.juli.admin.entity.JuliSysUser;
import cn.com.pism.juli.admin.service.JuliSysUserService;
import cn.com.pism.juli.api.service.JuliApiUserService;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserDto;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserResourceDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 11:05
 * @since 0.0.1
 */
@Service
public class JuliApiUserServiceImpl implements JuliApiUserService {

    @Resource
    private JuliSysUserService juliSysUserService;

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @author PerccyKing
     * @return 用户信息
     * @date 2020/08/02 下午 09:48
     */
    @Override
    public JuliSysUserDto findUserByUsername(String username){
        JuliSysUser juliSysUser = juliSysUserService.findUserByUsername(username);
        JuliSysUserDto dto = new JuliSysUserDto();
        BeanUtils.copyProperties(juliSysUser,dto);
        return dto;
    }

    /**
     * 根据用户查询用户拥有的资源列表
     *
     * @param user 用户
     * @return 用户所拥有的资源列表
     * @author PerccyKing
     * @date 2020/08/02 下午 10:13
     */
    @Override
    public JuliSysUserResourceDto findUserResourceByUser(JuliSysUserDto user) {
        if (user == null){
            return null;
        }
        JuliSysUserResourceDto userResourceDto = new JuliSysUserResourceDto();
        userResourceDto.setUserDto(user);
        return userResourceDto;
    }
}
