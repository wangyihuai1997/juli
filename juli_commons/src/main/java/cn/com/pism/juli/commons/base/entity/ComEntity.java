package cn.com.pism.juli.commons.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Date;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 08:38
 * @since 0.0.1
 */
@Data
public class ComEntity {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 乐观锁
     */
    @Version
    private Integer revision;

    /**
     * 创建人id
     */
    @TableField(value = "created_id")
    private String createdId;

    /**
     * 创建人名字
     */
    @TableField(value = "created_name")
    private String createdName;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 更新人id
     */
    @TableField(value = "updated_id")
    private String updatedId;

    /**
     * 更新人名字
     */
    @TableField(value = "updated_name")
    private String updatedName;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    /**
     * 是否删除
     */
    @TableField(value = "deleted")
    private Boolean deleted;

    /**
     * 最后修改时间
     */
    @TableField(value = "last_modify")
    private Date lastModify;


    public static final String COL_ID = "id";

    public static final String COL_REVISION = "revision";

    public static final String COL_CREATED_ID = "created_id";

    public static final String COL_CREATED_NAME = "created_name";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_ID = "updated_id";

    public static final String COL_UPDATED_NAME = "updated_name";

    public static final String COL_UPDATED_TIME = "updated_time";

    public static final String COL_DELETED = "deleted";

    public static final String COL_LAST_MODIFY = "last_modify";
}
