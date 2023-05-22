package cn.icbc.yang.service;

import cn.icbc.yang.pojo.StudentMessage;

import java.util.List;

public interface StudentService {
    public String InsertNewStudent(StudentMessage student);
    public String deleteOldStudent(StudentMessage student);
    public String updateOldStudent(StudentMessage student);
    public List<StudentMessage> selectAllStudent();
    public List<StudentMessage> findOldStudent(String name);
}
