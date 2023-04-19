package cn.icbc.yang.mapper;

import cn.icbc.yang.pojo.StudentMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.icbc.yang.pojo.TeacherMessage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangyg
 * @since 2023-01-19
 */
@Mapper
public interface TeacherMessageMapper extends BaseMapper<TeacherMessage> {
    public String findTeacherIDMAX();

    public int insertTeacher(TeacherMessage teacher);

    @Delete("delete from t_teacher_message where TeacherID=#{id}")
    public int delete(String id);

    public List<StudentMessage> findallstudentbelongone(String teacherid);
}
