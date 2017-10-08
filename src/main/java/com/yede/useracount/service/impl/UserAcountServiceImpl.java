package com.yede.useracount.service.impl;

import com.yede.platform.mapper.BaseDao;
import com.yede.platform.service.impl.BaseServiceImpl;
import com.yede.useracount.mapper.UserAccountMapper;
import com.yede.useracount.model.bean.PageBean;
import com.yede.useracount.model.entity.UserAccount;
import com.yede.useracount.service.UserAcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Primary
public class UserAcountServiceImpl extends BaseServiceImpl<UserAccount> implements UserAcountService {

    @Autowired
    private UserAccountMapper userAccountMapper;


    public UserAccount findOne(Long id) {
        return userAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    protected BaseDao<UserAccount, Long> getDao() {
        return userAccountMapper;
    }



    @Override
    public PageBean<UserAccount> getAll() {
        PageBean<UserAccount> pageBean=new PageBean<>();
        List<UserAccount> userAccounts=userAccountMapper.getAll();
        pageBean.setResult(userAccounts);
        return pageBean;
    }
}
