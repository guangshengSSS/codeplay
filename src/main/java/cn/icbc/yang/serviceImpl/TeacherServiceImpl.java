package cn.icbc.yang.serviceImpl;

import cn.icbc.yang.mapper.TeacherMessageMapper;
import cn.icbc.yang.pojo.TeacherMessage;
import cn.icbc.yang.service.TeacherService;
import cn.icbc.yang.vo.TeacherVoGet;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {//所有service层业务函数的业务逻辑

    @Autowired
    private TeacherMessageMapper teacherMessageMapper;

    @Override
    public String addteacher(TeacherVoGet teacher)//增加教师函数
    {
        TeacherMessage teacher2 =TeacherVoGetChangeTeacherMessage(teacher);//生成一个数据层对象

        String a=teacherMessageMapper.findTeacherIDMAX();
        int max=0;
        if(a== null)
            a="0";
        max= Integer.parseInt(a);//调用数据层函数，获得编号最大值
        teacher2.setTeacherID(Integer.toString(max+1));//设置新教师的ID

        int i=teacherMessageMapper.insertTeacher(teacher2);//直接调用mybatis自带插入函数
        if(i>0)
            return "successful";
        else
            return "unsuccessful";
    }

    @Override
    public TeacherMessage TeacherVoGetChangeTeacherMessage(TeacherVoGet teacher)
    {
        TeacherMessage teacher2=new TeacherMessage();//生成一个数据层对象
        //设置数据层对象的参数
        teacher2.setEnterTime(teacher.getEnterTime());
        teacher2.setName(teacher.getTeacherName());
        teacher2.setSex(teacher.getSex());
        teacher2.setSubject(teacher.getSubject());
        teacher2.setTeacherID("needSet");
        //传出数据层对象供他人使用
        return teacher2;
    }
}
