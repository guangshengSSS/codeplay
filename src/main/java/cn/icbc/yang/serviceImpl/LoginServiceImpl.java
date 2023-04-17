package cn.icbc.yang.serviceImpl;

import cn.icbc.yang.dto.LoginVoChangeLoginMessage;
import cn.icbc.yang.mapper.LoginMessageMapper;
import cn.icbc.yang.pojo.LoginMessage;
import cn.icbc.yang.service.LoginService;
import cn.icbc.yang.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMessageMapper loginmessagemapper;

    @Override
    public String judgeLoginer(LoginVo requestPerson)
    {
        List<LoginMessage> databasePassword=loginmessagemapper.findLoginer(requestPerson.getUserName());

        Integer flag=0;
        if(databasePassword.size()==0)
            return "can't find person！please register.";
        else
        {
            for (LoginMessage a:databasePassword)
                if (a.getEmalenumber().equals(requestPerson.getEmailNumber()))
                    return "sucessful";
            return "password wrong!";
        }
    }

}

