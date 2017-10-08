package com.yede.mapper.basic;

import java.io.Serializable;

public interface BaseDao<T extends Serializable , ID extends Serializable> {
    int deleteByPrimaryKey(ID id);

    int insert2(T record);

    int insertSelective(T record);


    T selectByPrimaryKey(ID id);


    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
