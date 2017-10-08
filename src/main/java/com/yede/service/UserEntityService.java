package com.yede.service;

import com.yede.model.entity.UserEntity;
import com.yede.service.basic.BaseService;

import java.util.List;

public interface UserEntityService extends BaseService<UserEntity> {
    UserEntity findOneById(Long Id);

    List<UserEntity> getAll();

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}