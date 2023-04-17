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
 * @since 2023-01-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_teacher_message")
@ApiModel(value="TeacherMessage对象", description="")
public class TeacherMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String TeacherID;

    private String Name;

    private String Sex;

    private String Subject;

    private String EnterTime;


}
