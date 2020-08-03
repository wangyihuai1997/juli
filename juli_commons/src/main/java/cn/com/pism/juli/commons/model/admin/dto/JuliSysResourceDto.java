package cn.com.pism.juli.commons.model.admin.dto;

import lombok.Data;

/**
 * 系统资源
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/02 下午 09:52
 * @since 0.0.1
 */
@Data
public class JuliSysResourceDto {
    /**
     * 访问路径
     */
    private String resourceUrl;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源代码
     */
    private String resourceCode;
}
