package cn.icbc.yang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.icbc.yang.pojo.TeacherMessage;
import org.apache.ibatis.annotations.Delete;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangyg
 * @since 2023-01-19
 */
public interface TeacherMessageMapper extends BaseMapper<TeacherMessage> {
    public String findTeacherIDMAX();

    public int insertTeacher(TeacherMessage teacher);

    @Delete("delete from t_teacher_message where TeacherID=#{id}")
    public int delete(String id);
}
