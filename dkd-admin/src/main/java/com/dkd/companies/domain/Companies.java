package com.dkd.companies.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * companies对象 tb_companies
 * 
 * @author oj
 * @date 2024-08-27
 */
public class Companies extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long companyId;

    /** 公司账号 */
    @Excel(name = "公司账号")
    private String companyNum;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 公司密码，加密存储 */
    private String companyPwd;

    /** 联系人信息 */
    @Excel(name = "联系人信息")
    private String contactInfo;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    /** 所属行业 */
    @Excel(name = "所属行业")
    private String industry;

    /** 公司规模 */
    @Excel(name = "公司规模")
    private String size;

    /** 公司资质 */
    @Excel(name = "公司资质")
    private String credential;

    /** 其他详情 */
    @Excel(name = "其他详情")
    private String details;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String review;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 记录创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 记录更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    /** 公司状态，例如：未签约 */
    @Excel(name = "公司状态，例如：未签约")
    private String status;

    /** 权限级别 */
    @Excel(name = "权限级别")
    private Long permissions;

    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setCompanyNum(String companyNum) 
    {
        this.companyNum = companyNum;
    }

    public String getCompanyNum() 
    {
        return companyNum;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setCompanyPwd(String companyPwd) 
    {
        this.companyPwd = companyPwd;
    }

    public String getCompanyPwd() 
    {
        return companyPwd;
    }
    public void setContactInfo(String contactInfo) 
    {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() 
    {
        return contactInfo;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setSize(String size) 
    {
        this.size = size;
    }

    public String getSize() 
    {
        return size;
    }
    public void setCredential(String credential) 
    {
        this.credential = credential;
    }

    public String getCredential() 
    {
        return credential;
    }
    public void setDetails(String details) 
    {
        this.details = details;
    }

    public String getDetails() 
    {
        return details;
    }
    public void setReview(String review) 
    {
        this.review = review;
    }

    public String getReview() 
    {
        return review;
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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setPermissions(Long permissions) 
    {
        this.permissions = permissions;
    }

    public Long getPermissions() 
    {
        return permissions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("companyId", getCompanyId())
            .append("companyNum", getCompanyNum())
            .append("companyName", getCompanyName())
            .append("companyPwd", getCompanyPwd())
            .append("contactInfo", getContactInfo())
            .append("address", getAddress())
            .append("industry", getIndustry())
            .append("size", getSize())
            .append("credential", getCredential())
            .append("details", getDetails())
            .append("review", getReview())
            .append("remarks", getRemarks())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("status", getStatus())
            .append("permissions", getPermissions())
            .toString();
    }
}
