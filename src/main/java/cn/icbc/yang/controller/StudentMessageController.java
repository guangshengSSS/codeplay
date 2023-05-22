package cn.icbc.yang.controller;

import cn.icbc.yang.pojo.StudentMessage;
import cn.icbc.yang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentMessageController {

    @Autowired
    private StudentService studentService;

    /*新增操作，用plus，需要前端传一个 student */
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.POST)*/
    @PostMapping("/StudentMessage/AddStudent")
    public String AddStudent(@RequestBody StudentMessage student)
    {
        String result=studentService.InsertNewStudent(student);
        return result;
    }

    //删除操作,需要前端传一个id
    @PostMapping("/StudentMessage/DeleteStudent")
    public String deleteStudent(@RequestBody StudentMessage student)//id是前端的参数名，post传参的参数名也必须是id，不能是数据库名 Studentid
    {
        String result=studentService.deleteOldStudent(student);
        return result;

    }

    //修改操作，需要前端传一个 student 对象
    @PostMapping(value="/StudentMessage/updateStudent")
    public String updateStudent(StudentMessage student)
    {
        String result=studentService.updateOldStudent(student);
        return result;
    }


    /*查询操作，查询全部，不需要传参*/
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.GET)*/
    @RequestMapping("/StudentMessage/allStudent")
    public List<StudentMessage> findall()
    {
        List<StudentMessage> result=studentService.selectAllStudent();
        return result;
    }

    /*查询操作，根据学生姓名查询，需要前端传一个 name 字段*/
    /* 请求方式：@RequestMapping(value="/{id}"),method=RequestMethod.GET)*/
    @RequestMapping(value="/StudentMessage/findStudent")
    public List<StudentMessage> findStudent(String name)
    {
        List<StudentMessage> result=studentService.findOldStudent(name);
        return result;
    }
}


