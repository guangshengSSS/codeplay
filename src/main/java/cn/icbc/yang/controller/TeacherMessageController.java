package cn.icbc.yang.controller;


import cn.icbc.yang.mapper.TeacherMessageMapper;
import cn.icbc.yang.pojo.TeacherMessage;
import cn.icbc.yang.service.TeacherService;
import cn.icbc.yang.vo.TeacherVoGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangyg
 * @since 2023-01-19
 */
@RestController
@RequestMapping("/teachermessage")
@Configuration
public class TeacherMessageController {

    @Autowired
    private TeacherMessageMapper teacherMessageMapper;

    @PostMapping("/findallteacher")//查询所有教师。
    public List<TeacherMessage> findAllTeacher()
    {
        List<TeacherMessage> result=teacherMessageMapper.selectList(null);
        return result;
    }

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/AddTeacher")
    public String addteacher(@RequestBody TeacherVoGet teacher)
    {
        String result=teacherService.addteacher(teacher);//将前端数据传入service层执行业务逻辑
        return result;
    }

    @PostMapping("/DeleteTeacher")
    public String deleteTeacher(@RequestBody TeacherVoGet teacher)
    {
        TeacherMessage teacher2=teacherService.TeacherVoGetChangeTeacherMessage(teacher);
        int result=teacherMessageMapper.delete(teacher2.getTeacherID());
        if(result>0)
            return "successful";
        else
            return "unsuccessful";
    }
}
