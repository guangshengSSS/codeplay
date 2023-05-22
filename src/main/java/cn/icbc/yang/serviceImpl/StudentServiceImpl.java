package cn.icbc.yang.serviceImpl;

import cn.icbc.yang.mapper.StudentMassageMapper;
import cn.icbc.yang.pojo.StudentMessage;
import cn.icbc.yang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMassageMapper studentMassageMapper;//填充一个数据库对象

    public String InsertNewStudent(StudentMessage student)
    {
        String StudentMAXID= studentMassageMapper.selectStudentMAXID();//查询最大学生编号

        int max=Integer.parseInt(StudentMAXID);
        student.setStudentid(Integer.toString(max+1));//设置新增学生编号
        String change=student.getEntertime();
        String[] change2=change.split("T");//设置时间
        student.setEntertime(change2[0]);

        int i =  studentMassageMapper.insert(student);
        if (i>0)
            return "插入成功";
        else
            return "插入失败";
    }

    public String deleteOldStudent(StudentMessage student)
    {
        List<StudentMessage> list= studentMassageMapper.selectList(null);
        int i = studentMassageMapper.delete(student.getStudentid());

        if (i>0)
            return "删除成功";
        else
            return "删除失败";
    }

    public String updateOldStudent(StudentMessage student)
    {
        int i = studentMassageMapper.update(student);
        if (i>0)
            return "修改成功";
        else
            return "修改失败";
    }

    public List<StudentMessage> selectAllStudent()
    {
        List<StudentMessage> list= studentMassageMapper.selectList(null);
        return list;
    }

    public List<StudentMessage> findOldStudent(String name)
    {
        List<StudentMessage> list= studentMassageMapper.findName(name);
        return list;
    }

}
