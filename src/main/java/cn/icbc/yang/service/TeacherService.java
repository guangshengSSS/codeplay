package cn.icbc.yang.service;

import cn.icbc.yang.pojo.TeacherMessage;
import cn.icbc.yang.vo.TeacherVoGet;

public interface TeacherService {//service层所有业务函数的入口
    public String addteacher(TeacherVoGet teacher);//新增教师
    public TeacherMessage TeacherVoGetChangeTeacherMessage(TeacherVoGet teacher);//对象转化，

}
