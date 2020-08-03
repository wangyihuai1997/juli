package cn.com.pism.juli.commons.model.admin.dto;

import lombok.Data;

/**
 * 系统用户数据传输对象
 *
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/02 下午 09:25
 * @since 0.0.1
 */
@Data
public class JuliSysUserDto {
    /**
     * 主键id
     */
    private String id;
    /**
     * 用户名字
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 密码
     */
    private String secretCode;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 账户是否过期
     */
    private Boolean accountNonExpired;

    /**
     * 凭据是否过期
     */
    private Boolean credentialsNonExpired;

    /**
     * 账户是否锁定
     */
    private Boolean accountNonLocked;

    /**
     * 是否删除
     */
    private Boolean deleted;
}
