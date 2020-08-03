package cn.com.pism.juli.admin.entity;

import cn.com.pism.juli.commons.base.entity.ComEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * 角色表
 *
 * @author PerccyKing
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "juli_sys_role")
public class JuliSysRole extends ComEntity implements Serializable {
    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 角色代码
     */
    @TableField(value = "role_code")
    private String roleCode;

    /**
     * 序号
     */
    @TableField(value = "serial_number")
    private Integer serialNumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_ROLE_CODE = "role_code";

    public static final String COL_SERIAL_NUMBER = "serial_number";
}