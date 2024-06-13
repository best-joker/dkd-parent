package com.dkd.students.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.students.mapper.StudentsMapper;
import com.dkd.students.domain.Students;
import com.dkd.students.service.IStudentsService;

/**
 * 学生信息表Service业务层处理
 * 
 * @author oldj
 * @date 2024-08-26
 */
@Service
public class StudentsServiceImpl implements IStudentsService 
{
    @Autowired
    private StudentsMapper studentsMapper;

    /**
     * 查询学生信息表
     * 
     * @param studentId 学生信息表主键
     * @return 学生信息表
     */
    @Override
    public Students selectStudentsByStudentId(Long studentId)
    {
        return studentsMapper.selectStudentsByStudentId(studentId);
    }

    /**
     * 查询学生信息表列表
     * 
     * @param students 学生信息表
     * @return 学生信息表
     */
    @Override
    public List<Students> selectStudentsList(Students students)
    {
        return studentsMapper.selectStudentsList(students);
    }

    /**
     * 新增学生信息表
     * 
     * @param students 学生信息表
     * @return 结果
     */
    @Override
    public int insertStudents(Students students)
    {
        return studentsMapper.insertStudents(students);
    }

    /**
     * 修改学生信息表
     * 
     * @param students 学生信息表
     * @return 结果
     */
    @Override
    public int updateStudents(Students students)
    {
        return studentsMapper.updateStudents(students);
    }

    /**
     * 批量删除学生信息表
     * 
     * @param studentIds 需要删除的学生信息表主键
     * @return 结果
     */
    @Override
    public int deleteStudentsByStudentIds(Long[] studentIds)
    {
        return studentsMapper.deleteStudentsByStudentIds(studentIds);
    }

    /**
     * 删除学生信息表信息
     * 
     * @param studentId 学生信息表主键
     * @return 结果
     */
    @Override
    public int deleteStudentsByStudentId(Long studentId)
    {
        return studentsMapper.deleteStudentsByStudentId(studentId);
    }
}
