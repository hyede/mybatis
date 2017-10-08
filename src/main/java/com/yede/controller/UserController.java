package com.yede.controller;

import java.util.List;


import com.yede.model.entity.UserEntity;
import com.yede.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/accounts")
public class UserController {
	
	@Autowired
	private UserEntityService userEntityService;
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userEntityService.getAll();
		return users;
	}
	
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=userEntityService.findOneById(id);
        return user;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void save(@RequestBody  UserEntity user) {
        userEntityService.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(UserEntity user) {
        userEntityService.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userEntityService.delete(id);
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public Object hello(){
        return "Hello Spring";
    }



}