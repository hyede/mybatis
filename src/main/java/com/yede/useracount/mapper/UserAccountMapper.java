package com.yede.useracount.mapper;

import com.yede.platform.mapper.BaseDao;
import com.yede.useracount.model.entity.UserAccount;

import java.util.List;

public interface UserAccountMapper extends BaseDao<UserAccount, Long> {
    List<UserAccount> getAll();
}