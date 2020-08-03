package cn.com.pism.juli.commons.model.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * 系统用户资源
 *
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/02 下午 09:51
 * @since 0.0.1
 */
@Data
public class JuliSysUserResourceDto {
    /**
     * 用户对象
     */
    private JuliSysUserDto userDto;
    /**
     * 资源列表
     */
    private List<JuliSysResourceDto> resourceDtos;
}
