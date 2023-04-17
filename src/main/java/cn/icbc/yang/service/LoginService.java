package cn.icbc.yang.service;

import cn.icbc.yang.dto.LoginVoChangeLoginMessage;
import cn.icbc.yang.pojo.LoginMessage;
import cn.icbc.yang.vo.LoginVo;

public interface LoginService {

    public String judgeLoginer(LoginVo requestPerson);
}
