package cn.icbc.yang.controller;

import cn.icbc.yang.mapper.StudentMassageMapper;
import cn.icbc.yang.pojo.StudentMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentMessageController {

    @Autowired
    private StudentMassageMapper studentMassageMapper;//填充一个数据库对象

    /*新增操作，用plus，需要前端传一个 student */
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.POST)*/
    @PostMapping("/StudentMessage/AddStudent")
    public String AddStudent(@RequestBody StudentMessage student)
    {
        List<StudentMessage> list= studentMassageMapper.selectList(null);
        int max=0;
        for (StudentMessage student1 : list)
            if(Integer.parseInt(student1.getStudentid())>max)
                max=Integer.parseInt(student1.getStudentid());

        student.setStudentid(Integer.toString(max+1));
        String change=student.getEntertime();
        String[] change2=change.split("T");
        student.setEntertime(change2[0]);

        int i =  studentMassageMapper.insert(student);
        if (i>0)
            return "插入成功";
        else
            return "插入失败";
    }

    //删除操作,需要前端传一个id
    @PostMapping("/StudentMessage/DeleteStudent")
    public String deleteStudent(@RequestBody StudentMessage student)//id是前端的参数名，post传参的参数名也必须是id，不能是数据库名 Studentid
    {
        int i = studentMassageMapper.delete(student.getStudentid());
        if (i>0)
            return "删除成功";
        else
            return "删除失败";
    }

    //修改操作，需要前端传一个 student 对象
    @PostMapping(value="/StudentMessage/updateStudent")
    public String updateStudent(StudentMessage student)
    {
        int i = studentMassageMapper.update(student);
        if (i>0)
            return "修改成功";
        else
            return "修改失败";
    }


    /*查询操作，查询全部，不需要传参*/
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.GET)*/
    @RequestMapping("/StudentMessage/allStudent")
    public List<StudentMessage> findall()
    {
        List<StudentMessage> list= studentMassageMapper.selectList(null);
        return list;
    }

    /*查询操作，根据学生姓名查询，需要前端传一个 name 字段*/
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.GET)*/
    @RequestMapping(value="/StudentMessage/findStudent")
    public List<StudentMessage> findStudent(String name)
    {
        List<StudentMessage> list= studentMassageMapper.findName(name);
        return list;
    }
}


