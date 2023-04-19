package cn.icbc.yang.service;

import cn.icbc.yang.pojo.StudentMessage;
import cn.icbc.yang.pojo.TeacherMessage;
import cn.icbc.yang.vo.TeacherVoGet;

import java.util.List;

public interface TeacherService {//service层所有业务函数的入口
    public String addteacher(TeacherVoGet teacher);//新增教师
    public TeacherMessage TeacherVoGetChangeTeacherMessage(TeacherVoGet teacher);//对象转化，
    public List<StudentMessage> findAllStudentBelongOneTeacher(String teacherid);//根据教师ID查询全部所教授的学生
}
