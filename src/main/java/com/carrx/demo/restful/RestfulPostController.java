package com.carrx.demo.restful;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/restful")
@RestController
public class RestfulPostController {

    /**
     * POST请求方式1：支持所有GET传参方式
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @PostMapping("/post1")
    public User post1(User user, Role role, @RequestParam String newName, String newRoleName) {
        user.setName(newName);
        user.setRole(role);
        role.setRoleName(newRoleName);
        return user;
    }

    /**
     * POST请求方式1：@RequestBody
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @PostMapping("/post2")
    public Object post2(@RequestBody User user) {
        return user;
    }

}
