package com.yede.platform.service;

import java.io.Serializable;

public interface BaseService<T extends Serializable> {


    T findOne(Long id);

}