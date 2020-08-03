package cn.com.pism.juli.commons.base.service.impl;

import cn.com.pism.juli.commons.base.mapper.ComMapper;
import cn.com.pism.juli.commons.base.service.ComService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 08:46
 * @since 0.0.1
 */
public class ComServiceImpl<M extends ComMapper<E>,E> extends ServiceImpl<M, E> implements ComService<E> {

    @Override
    public int updateBatch(List<E> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<E> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<E> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(E record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(E record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
