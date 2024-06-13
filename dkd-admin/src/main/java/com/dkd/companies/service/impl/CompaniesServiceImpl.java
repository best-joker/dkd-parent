package com.dkd.companies.service.impl;

import java.util.List;

import com.dkd.common.core.domain.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.companies.mapper.CompaniesMapper;
import com.dkd.companies.domain.Companies;
import com.dkd.companies.service.ICompaniesService;

import static com.dkd.common.utils.SecurityUtils.getUserId;

/**
 * companiesService业务层处理
 * 
 * @author oj
 * @date 2024-08-27
 */
@Service
public class CompaniesServiceImpl implements ICompaniesService 
{
    @Autowired
    private CompaniesMapper companiesMapper;

    /**
     * 查询companies
     * 
     * @param companyId companies主键
     * @return companies
     */
    @Override
    public Companies selectCompaniesByCompanyId(Long companyId)
    {
        return companiesMapper.selectCompaniesByCompanyId(companyId);
    }

    /**
     * 查询companies列表
     * 
     * @param companies companies
     * @return companies
     */
    @Override
    public List<Companies> selectCompaniesList(Companies companies)
    {
        if(SysUser.isAdmin(getUserId()) != true) {
            companies.setCompanyNum(String.valueOf(getUserId()));
        }
        return companiesMapper.selectCompaniesList(companies);
    }

    /**
     * 新增companies
     * 
     * @param companies companies
     * @return 结果
     */
    @Override
    public int insertCompanies(Companies companies)
    {
        return companiesMapper.insertCompanies(companies);
    }

    /**
     * 修改companies
     * 
     * @param companies companies
     * @return 结果
     */
    @Override
    public int updateCompanies(Companies companies)
    {
        return companiesMapper.updateCompanies(companies);
    }

    /**
     * 批量删除companies
     * 
     * @param companyIds 需要删除的companies主键
     * @return 结果
     */
    @Override
    public int deleteCompaniesByCompanyIds(Long[] companyIds)
    {
        return companiesMapper.deleteCompaniesByCompanyIds(companyIds);
    }

    /**
     * 删除companies信息
     * 
     * @param companyId companies主键
     * @return 结果
     */
    @Override
    public int deleteCompaniesByCompanyId(Long companyId)
    {
        return companiesMapper.deleteCompaniesByCompanyId(companyId);
    }
}
