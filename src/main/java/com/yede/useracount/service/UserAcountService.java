package com.yede.useracount.service;

import com.yede.platform.service.BaseService;
import com.yede.useracount.model.bean.PageBean;
import com.yede.useracount.model.entity.UserAccount;

public interface UserAcountService  extends BaseService<UserAccount>{
    PageBean<UserAccount> getAll();
}
