package cn.com.pism.juli.admin.entity;

import cn.com.pism.juli.commons.base.entity.ComEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * 资源表
 *
 * @author PerccyKing
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "juli_sys_user_role")
public class JuliSysUserRole extends ComEntity implements Serializable {
    /**
     * 关系代码
     */
    @TableField(value = "union_code")
    private String unionCode;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private String roleId;

    private static final long serialVersionUID = 1L;

    public static final String COL_UNION_CODE = "union_code";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_ROLE_ID = "role_id";
}