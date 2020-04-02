package com.sam.service.impl;

import com.sam.mapper.BaseMapper;
import com.sam.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-24 11:14
 */
public class BaseServiceImpl<E,T> implements BaseService<E,T> {
    @Autowired
    protected BaseMapper<E,T> mapper;

    protected T t;

    @Override
    public List<E> list(){
        return mapper.selectByExample(t);
    }


    //新增记录所有列
    @Override
    public Integer insert(E entity){
        return mapper.insert(entity);
    }

    //新增记录中有值列
    @Override
    public Integer insertSelective(E entity){
        return mapper.insertSelective(entity);
    }

    //根据id删除
    @Override
    public Integer deleteById(Integer id){
        return mapper.deleteByPrimaryKey(id);
    }

    //根据id查询
    @Override
    public E selectById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }

    //根据
    @Override
    public Integer updateById(E entity){
        return mapper.updateByPrimaryKey(entity);
    }
}
