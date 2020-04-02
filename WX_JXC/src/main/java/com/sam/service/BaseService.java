package com.sam.service;

import java.util.List;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-24 11:13
 */
public interface BaseService<E,T> {
    //查询所有
    List<E> list();

    //新增记录所有列
    Integer insert(E record);

    //新增记录中有值列
    Integer insertSelective(E record);

    //根据id删除
    Integer deleteById(Integer id);

    //根据id查询
    E selectById(Integer id);

    //更新
    Integer updateById(E entity);
}
