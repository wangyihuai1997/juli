package cn.com.pism.juli.admin.mapper;

import cn.com.pism.juli.admin.entity.JuliSysUser;
import cn.com.pism.juli.commons.base.mapper.ComMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author PerccyKing
 */
@Mapper
public interface JuliSysUserMapper extends ComMapper<JuliSysUser> {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @author PerccyKing
     * @return 用户信息
     * @date 2020/08/02 下午 09:48
     */
    JuliSysUser findUserByUsername(@Param("username") String username);
}