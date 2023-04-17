package cn.icbc.yang.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginVoChangeLoginMessage {
    String username;
    String Emailnumber;
}
