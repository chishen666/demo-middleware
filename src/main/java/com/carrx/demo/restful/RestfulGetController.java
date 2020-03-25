package com.carrx.demo.restful;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@RequestMapping("/restful")
@RestController
public class RestfulGetController {

    /**
     * GET请求方式0：@PathVariable传参
     * <p>
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @GetMapping("/get0/{name}/{age}")
    public User get0(@PathVariable String name, @PathVariable Integer age) {
        return new User(name, age);
    }

    /**
     * GET请求方式1：@RequestParam传参
     * <p>
     * 可以不写@RequestParam
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @GetMapping("/get1")
    public User get1(@RequestParam String name, Integer age) {
        return new User(name, age);
    }

    /**
     * GET请求方式2：Object传参
     * <p>
     * Object传参等同于每个属性的@RequestParam传参
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @GetMapping("/get2")
    public User get2(User user) {
        return user;
    }

    /**
     * GET请求方式3：@RequestParam和Object联合传参
     * <p>
     * Object传参等同于每个属性的@RequestParam传参，可以与@RequestParam传参一起用
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @GetMapping("/get3")
    public User get3(User user, Role role, @RequestParam String newName, @RequestParam String newRoleName) {
        user.setName(newName);
        user.setRole(role);
        role.setRoleName(newRoleName);
        return user;
    }

    /**
     * GET请求方式4：Object联合传参【数组】
     *
     * @author Carl.Xiang
     * @date 2020/3/26
     */
    @GetMapping("/get4")
    public Object get4(Integer[] ids) {
        return ids;
    }
    //POST请求测试----------------------------------------

    @GetMapping("/get5")
    public void post1(HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("http://www.baidu.com");
        printWriter.close();
    }

}
