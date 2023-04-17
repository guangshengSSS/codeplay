package cn.icbc.yang.controller;


import cn.icbc.yang.mapper.LoginMessageMapper;
import cn.icbc.yang.pojo.LoginMessage;
import cn.icbc.yang.pojo.StudentMessage;
import cn.icbc.yang.service.LoginService;
import cn.icbc.yang.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangyg
 * @since 2023-02-01
 */
@RestController
@RequestMapping("/StudentMessage")//类的父地址
@CrossOrigin
public class LoginMessageController {

    @Autowired
    private LoginService Loginservice;

    @PostMapping("/Login")
    public String login(@RequestBody LoginVo loginer)
    {
        String result = Loginservice.judgeLoginer(loginer);//判断login是否合法
        return result;
    }
}
