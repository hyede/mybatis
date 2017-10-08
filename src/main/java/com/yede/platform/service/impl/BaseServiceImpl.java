package com.yede.platform.service.impl;

import com.yede.platform.mapper.BaseDao;
import com.yede.platform.model.entity.AbstractEntity;
import com.yede.platform.service.BaseService;
import org.springframework.transaction.annotation.Transactional;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;



@Transactional
public abstract class BaseServiceImpl<T extends AbstractEntity>
        implements BaseService<T> {

    protected abstract BaseDao<T,  Long> getDao();

    protected Class<T> entityClazz;


    @SuppressWarnings("unchecked")
    public BaseServiceImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClazz = (Class<T>) params[0];
    }



    @Transactional(readOnly = true)
    public T findOne(Long id) {
        return getDao().selectByPrimaryKey(id);
    }

}
