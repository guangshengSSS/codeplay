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
 * @since 2023-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_student_teacher")
@ApiModel(value="StudentTeacher对象", description="")
public class StudentTeacherMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer connectionID;

    private String StudentID;

    private String TeacherID;
}
