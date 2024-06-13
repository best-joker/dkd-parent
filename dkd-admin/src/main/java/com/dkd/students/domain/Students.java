package com.dkd.students.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * 学生信息表对象 tb_students
 * 
 * @author oldj
 * @date 2024-08-26
 */
public class Students extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生的ID，作为主键 */
    private Long studentId;

    /** 学生的账号 */
    @Excel(name = "学生的账号")
    private String studentNum;

    /** 学生的密码 */
    @Excel(name = "学生的密码")
    private String studentPwd;

    /** 学生所属学校的ID，外键 */
    @Excel(name = "学生所属学校的ID，外键")
    private Long schoolId;

    /** 二级学院 */
    @Excel(name = "二级学院")
    private Long collegeId;

    /** 学生的姓名 */
    @Excel(name = "学生的姓名")
    private String studentName;

    /** 学生的性别 */
    @Excel(name = "学生的性别")
    private String sex;

    /** 学生的出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "学生的出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birth;

    /** 学生所在的年级 */
    @Excel(name = "学生所在的年级")
    private String grade;

    /** 学生的专业 */
    @Excel(name = "学生的专业")
    private String major;

    /** 学生的班级或教室号 */
    @Excel(name = "学生的班级或教室号")
    private String classRoom;

    /** 学生的地址 */
    @Excel(name = "学生的地址")
    private String address;

    /** 学生的状态，例如在读或毕业 */
    @Excel(name = "学生的状态，例如在读或毕业")
    private String status;

    /** 学生的学历 */
    @Excel(name = "学生的学历")
    private String qualification;

    /** 学生的联系方式 */
    @Excel(name = "学生的联系方式")
    private String contactInfo;

    /** 关于学生的任何备注 */
    @Excel(name = "关于学生的任何备注")
    private String remarks;

    /** 记录创建的时间 */
    private Date createdAt;

    /** 记录最后一次更新的时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录最后一次更新的时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    /** 学生的权限级别 */
    @Excel(name = "学生的权限级别")
    private Long permissions;

    /** 所关联的用户ID  */
    @Excel(name = "所关联的用户ID ")
    private Long userId;

    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setStudentNum(String studentNum) 
    {
        this.studentNum = studentNum;
    }

    public String getStudentNum() 
    {
        return studentNum;
    }
    public void setStudentPwd(String studentPwd) 
    {
        this.studentPwd = studentPwd;
    }

    public String getStudentPwd() 
    {
        return studentPwd;
    }
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }
    public void setCollegeId(Long collegeId) 
    {
        this.collegeId = collegeId;
    }

    public Long getCollegeId() 
    {
        return collegeId;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirth(Date birth) 
    {
        this.birth = birth;
    }

    public Date getBirth() 
    {
        return birth;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setClassRoom(String classRoom) 
    {
        this.classRoom = classRoom;
    }

    public String getClassRoom() 
    {
        return classRoom;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setQualification(String qualification) 
    {
        this.qualification = qualification;
    }

    public String getQualification() 
    {
        return qualification;
    }
    public void setContactInfo(String contactInfo) 
    {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() 
    {
        return contactInfo;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }
    public void setPermissions(Long permissions) 
    {
        this.permissions = permissions;
    }

    public Long getPermissions() 
    {
        return permissions;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("studentId", getStudentId())
            .append("studentNum", getStudentNum())
            .append("studentPwd", getStudentPwd())
            .append("schoolId", getSchoolId())
            .append("collegeId", getCollegeId())
            .append("studentName", getStudentName())
            .append("sex", getSex())
            .append("birth", getBirth())
            .append("grade", getGrade())
            .append("major", getMajor())
            .append("classRoom", getClassRoom())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("qualification", getQualification())
            .append("contactInfo", getContactInfo())
            .append("remarks", getRemarks())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("permissions", getPermissions())
            .append("userId", getUserId())
            .toString();
    }
}
