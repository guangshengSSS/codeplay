package cn.icbc.yang.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TeacherVoGet {
    private String teacherID;
    private String teacherName;
    private String sex;
    private String subject;
    private String enterTime;
}
