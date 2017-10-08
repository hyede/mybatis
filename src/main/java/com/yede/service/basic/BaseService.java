package com.yede.service.basic;

import java.io.Serializable;

public interface BaseService<T extends Serializable> {


    T findOne(Long id);

}