package com.yede.useracount.controller;

import com.yede.platform.controller.ResponseVO;
import com.yede.platform.controller.vo.BaseController;
import com.yede.useracount.model.bean.PageBean;
import com.yede.useracount.model.entity.UserAccount;
import com.yede.useracount.service.UserAcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/users")
public class UserAcountController extends BaseController {
    @Autowired
    private UserAcountService userAccountService;

    //查询所有用户
    @GetMapping("")
    @ResponseBody
    public ResponseVO listUsers() {
        PageBean<UserAccount> pageBean = userAccountService.getAll();

        return this.successResponse(pageBean);
    }
}
