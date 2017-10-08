package com.yede.mapper;

import com.yede.mapper.basic.BaseDao;
import com.yede.model.entity.UserEntity;

import java.util.List;

public interface UserMapper extends BaseDao<UserEntity, Long>{

    List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}