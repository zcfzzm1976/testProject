package com.project.action;

import com.project.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserAction {

    @RequestMapping("getUser")
    public UserBean getBean(){
        return new UserBean(1,"张三","13594864390");
    }
}
