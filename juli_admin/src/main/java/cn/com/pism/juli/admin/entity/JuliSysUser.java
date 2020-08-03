package cn.com.pism.juli.admin.entity;

import cn.com.pism.juli.commons.base.entity.ComEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * 用户表
 *
 * @author PerccyKing
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "juli_sys_user")
public class JuliSysUser extends ComEntity implements Serializable {
    /**
     * 用户名字
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 用户账号
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 用户类型
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 密码
     */
    @TableField(value = "secret_code")
    private String secretCode;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 账户是否过期
     */
    @TableField(value = "account_non_expired")
    private Boolean accountNonExpired;

    /**
     * 凭据是否过期
     */
    @TableField(value = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    /**
     * 账户是否锁定
     */
    @TableField(value = "account_non_locked")
    private Boolean accountNonLocked;

    private static final long serialVersionUID = 1L;

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_USER_ACCOUNT = "user_account";

    public static final String COL_USER_TYPE = "user_type";

    public static final String COL_SECRET_CODE = "secret_code";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_ACCOUNT_NON_EXPIRED = "account_non_expired";

    public static final String COL_CREDENTIALS_NON_EXPIRED = "credentials_non_expired";

    public static final String COL_ACCOUNT_NON_LOCKED = "account_non_locked";
}