package cn.com.pism.juli.admin.service;

import cn.com.pism.juli.admin.entity.JuliSysUser;
import java.util.List;

import cn.com.pism.juli.commons.base.service.ComService;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * @author wangyihuai
 */
public interface JuliSysUserService extends ComService<JuliSysUser> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @author PerccyKing
     * @return 用户信息
     * @date 2020/08/02 下午 09:48
     */
    JuliSysUser findUserByUsername(String username);
}
