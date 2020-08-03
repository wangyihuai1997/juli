package cn.com.pism.juli.admin.entity;

import cn.com.pism.juli.commons.base.entity.ComEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@TableName(value = "juli_sys_resource")
public class JuliSysResource extends ComEntity implements Serializable {
    /**
     * 访问路径
     */
    @TableField(value = "resource_url")
    private String resourceUrl;

    /**
     * 资源名称
     */
    @TableField(value = "resource_name")
    private String resourceName;

    /**
     * 资源类型
     */
    @TableField(value = "resource_type")
    private String resourceType;

    /**
     * 资源代码
     */
    @TableField(value = "resource_code")
    private String resourceCode;

    /**
     * 父节点id
     */
    @TableField(value = "parent_id")
    private String parentId;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 序号
     */
    @TableField(value = "serial_number")
    private Integer serialNumber;

    private static final long serialVersionUID = 1L;

    public static final String COL_RESOURCE_URL = "resource_url";

    public static final String COL_RESOURCE_NAME = "resource_name";

    public static final String COL_RESOURCE_TYPE = "resource_type";

    public static final String COL_RESOURCE_CODE = "resource_code";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_ICON = "icon";

    public static final String COL_SERIAL_NUMBER = "serial_number";
}