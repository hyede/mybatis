package com.yede.service.impl;

import com.yede.mapper.UserMapper;
import com.yede.mapper.basic.BaseDao;
import com.yede.model.entity.UserEntity;
import com.yede.service.UserEntityService;
import com.yede.service.basic.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserEntity>
        implements UserEntityService {

    @Autowired
    private UserMapper userMapper;


    public UserEntity findOneById(Long Id) {
        return userMapper.getOne(Id);
    }


    @Override
    protected BaseDao<UserEntity, Long> getDao() {
        return userMapper;
    }

    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }

    @Override
    public void insert(UserEntity user) {
        userMapper.insert(user);
        double d=1/0;
    }

    @Override
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
