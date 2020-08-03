package cn.com.pism.juli.commons.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangyihuai
 * @date 2020/07/21 上午 09:40
 */
public interface ComMapper<T> extends BaseMapper<T> {
    int updateBatch(List<T> list);

    int updateBatchSelective(List<T> list);

    int batchInsert(@Param("list") List<T> list);

    int insertOrUpdate(T record);

    int insertOrUpdateSelective(T record);
}
