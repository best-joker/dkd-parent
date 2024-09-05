package com.dkd.jobpositions.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * 发布职位表对象 tb_jobpositions
 * 
 * @author oj
 * @date 2024-08-28
 */
public class Jobpositions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long positionId;

    /** 公司的ID，外键 */
    @Excel(name = "公司的ID，外键")
    private Long companyId;

    /** 职位类型的ID，外键 */
    @Excel(name = "职位类型的ID，外键")
    private Long jobTypeId;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String positionName;

    /** 职位地址 */
    @Excel(name = "职位地址")
    private String positionLocation;

    /** 职位描述 */
    @Excel(name = "职位描述")
    private String description;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private String department;

    /** 任职要求 */
    @Excel(name = "任职要求")
    private String Requirement;

    /** 薪资范围 */
    @Excel(name = "薪资范围")
    private String salaryRange;

    /** 招聘人数 */
    @Excel(name = "招聘人数")
    private String vacancies;

    /** 发布日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date postingDate;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deadline;

    /** 职位状态 */
    @Excel(name = "职位状态")
    private String status;

    public void setPositionId(Long positionId) 
    {
        this.positionId = positionId;
    }

    public Long getPositionId() 
    {
        return positionId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setJobTypeId(Long jobTypeId) 
    {
        this.jobTypeId = jobTypeId;
    }

    public Long getJobTypeId() 
    {
        return jobTypeId;
    }
    public void setPositionName(String positionName) 
    {
        this.positionName = positionName;
    }

    public String getPositionName() 
    {
        return positionName;
    }
    public void setPositionLocation(String positionLocation) 
    {
        this.positionLocation = positionLocation;
    }

    public String getPositionLocation() 
    {
        return positionLocation;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setRequirement(String Requirement) 
    {
        this.Requirement = Requirement;
    }

    public String getRequirement() 
    {
        return Requirement;
    }
    public void setSalaryRange(String salaryRange) 
    {
        this.salaryRange = salaryRange;
    }

    public String getSalaryRange() 
    {
        return salaryRange;
    }
    public void setVacancies(String vacancies) 
    {
        this.vacancies = vacancies;
    }

    public String getVacancies() 
    {
        return vacancies;
    }
    public void setPostingDate(Date postingDate) 
    {
        this.postingDate = postingDate;
    }

    public Date getPostingDate() 
    {
        return postingDate;
    }
    public void setDeadline(Date deadline) 
    {
        this.deadline = deadline;
    }

    public Date getDeadline() 
    {
        return deadline;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("positionId", getPositionId())
            .append("companyId", getCompanyId())
            .append("jobTypeId", getJobTypeId())
            .append("positionName", getPositionName())
            .append("positionLocation", getPositionLocation())
            .append("description", getDescription())
            .append("department", getDepartment())
            .append("Requirement", getRequirement())
            .append("salaryRange", getSalaryRange())
            .append("vacancies", getVacancies())
            .append("postingDate", getPostingDate())
            .append("deadline", getDeadline())
            .append("status", getStatus())
            .toString();
    }
}
