package com.sam.mapper;

import com.sam.pojo.Customer;
import com.sam.pojo.CustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作者 Sam_T
 * 描述 抽取通用mapper
 * example限制所筛选的行
 * selective限制列中含有值的属性（列）
 * 日期 2020-03-24 11:12
 */
public interface BaseMapper<E,T>  {

    //统计记录总数
    int countByExample(T example);

    //根据限制条件删除
    int deleteByExample(T example);

    //查询限制条件下的记录
    List<E> selectByExample(T example);

    //根据限制条件更新有值列
    int updateByExampleSelective(@Param("record") E record, @Param("example") T example);

    //根据限制条件更新所有列（除了text类型）
    int updateByExample(@Param("record") E record, @Param("example") T example);

    //根据主键删除
    int deleteByPrimaryKey(Integer custId);

    //新增记录所有列
    int insert(E record);

    //新增记录中有值列
    int insertSelective(E record);

    //根据主键查询
    E selectByPrimaryKey(Integer custId);

    //根据主键更新有值列
    int updateByPrimaryKeySelective(E record);

    //根据主键更新所有列
    int updateByPrimaryKey(E record);
}
