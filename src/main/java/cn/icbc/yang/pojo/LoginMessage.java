package cn.icbc.yang.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangyg
 * @since 2023-02-01
 */
@Data
//该注解通常用在实体bean上，不需要写出set和get方法，但是具备实体bean所具备的方法。
//@Data相当于@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode这5个注解的合集

@EqualsAndHashCode(callSuper = false)
@TableName("t_login_message")
@ApiModel(value="LoginMessage对象", description="")
public class LoginMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Usernamenumber;

    private String Username;

    private String Emalenumber;


}
