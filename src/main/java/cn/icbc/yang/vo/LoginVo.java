package cn.icbc.yang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginVo {
    private String userName;
    //可以用@JsonProperty注解，实现前端后端参数的可调整的传值
    private String emailNumber;
}
