package com.project.action;

import com.project.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserAction {

    @RequestMapping("getUser")
    public UserBean getBean(){
        return new UserBean(1,"张无忌","13594864390");
    }

    @RequestMapping("findAll")
    public List<UserBean> getList(){
        return Arrays.asList(new UserBean(1,"张三","13594864390"),
                new UserBean(2,"李四","15298543212"),
                new UserBean(3,"赵峰","13455621890"));
    }
}
