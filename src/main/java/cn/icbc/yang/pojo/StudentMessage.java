package cn.icbc.yang.pojo;
//entity:数据表对应到实体类的映射
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_student_message")
public class StudentMessage {
    private String Studentid;
    private String name;
    private String sex;
    private String school;
    private String Grade;
    private String Studentclass;
    private String Entertime;
    private String Staytimeclass;
    private String Givenmoney;

    public String getStudentid() {
        return Studentid;
    }

    public void setStudentid(String studentid) {
        Studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getStudentclass() {
        return Studentclass;
    }

    public void setStudentclass(String studentclass) {
        Studentclass = studentclass;
    }

    public String getEntertime() {
        return Entertime;
    }

    public void setEntertime(String entertime) {
        Entertime = entertime;
    }

    public String getStaytimeclass() {
        return Staytimeclass;
    }

    public void setStaytimeclass(String staytimeclass) {
        Staytimeclass = staytimeclass;
    }

    public String getGivenmoney() {
        return Givenmoney;
    }

    public void setGivenmoney(String givenmoney) {
        Givenmoney = givenmoney;
    }

    @Override
    public String toString() {
        return "StudentMessage{" +
                "Studentid='" + Studentid + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                ", Grade='" + Grade + '\'' +
                ", Studentclass='" + Studentclass + '\'' +
                ", Entertime='" + Entertime + '\'' +
                ", Staytimeclass='" + Staytimeclass + '\'' +
                ", Givenmoney='" + Givenmoney + '\'' +
                '}';
    }
}
