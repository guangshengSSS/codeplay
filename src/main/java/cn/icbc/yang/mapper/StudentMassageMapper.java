package cn.icbc.yang.mapper;

import cn.icbc.yang.pojo.StudentMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentMassageMapper extends BaseMapper<StudentMessage> {
    @Select("Select * from t_student_message where Name=#{name}")
    public List<StudentMessage> findName(String name);
    @Delete("delete from t_student_message where Studentid=#{id}")
    public int delete(String id);

    @Update("update t_student_message set Studentid=#{Studentid}," +
            "name={name}," +
            "Sex={Sex}," +
            "School={School}," +
            "Grade={Grade}," +
            "StudentClass={Studentclass}," +
            "EnterTime={Entertime}," +
            "StayTimeClass={Staytimeclass}," +
            "GivenMoney={Givenmoney where id=#{id}")
    int update(StudentMessage studentMessage);

    public String selectStudentMAXID();
}

