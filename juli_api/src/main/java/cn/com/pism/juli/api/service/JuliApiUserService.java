package cn.com.pism.juli.api.service;

import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserDto;
import cn.com.pism.juli.commons.model.admin.dto.JuliSysUserResourceDto;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 11:08
 * @since 0.0.1
 */
public interface JuliApiUserService {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @author PerccyKing
     * @return 用户信息
     * @date 2020/08/02 下午 09:48
     */
    JuliSysUserDto findUserByUsername(String username);

    /**
     * 根据用户查询用户拥有的资源列表
     * @param user 用户
     * @author PerccyKing
     * @return 用户所拥有的资源列表
     * @date 2020/08/02 下午 10:13
     */
    JuliSysUserResourceDto findUserResourceByUser(JuliSysUserDto user);
}
