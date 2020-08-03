package cn.com.pism.juli.commons.base.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 08:41
 * @since 0.0.1
 */
public interface ComService<E> extends IService<E> {

    int updateBatch(List<E> list);

    int updateBatchSelective(List<E> list);

    int batchInsert(List<E> list);

    int insertOrUpdate(E record);

    int insertOrUpdateSelective(E record);
}
