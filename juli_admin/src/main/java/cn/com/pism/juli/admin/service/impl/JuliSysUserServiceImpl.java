package cn.com.pism.juli.admin.service.impl;

import cn.com.pism.juli.admin.entity.JuliSysUser;
import cn.com.pism.juli.admin.mapper.JuliSysUserMapper;
import cn.com.pism.juli.admin.service.JuliSysUserService;
import cn.com.pism.juli.commons.base.service.impl.ComServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author PerccyKing
 */
@Service
public class JuliSysUserServiceImpl extends ComServiceImpl<JuliSysUserMapper, JuliSysUser> implements JuliSysUserService {

    @Resource
    private JuliSysUserMapper juliSysUserMapper;

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @author PerccyKing
     * @return 用户信息
     * @date 2020/08/02 下午 09:48
     */
    @Override
    public JuliSysUser findUserByUsername(String username) {
        return juliSysUserMapper.findUserByUsername(username);
    }
}

