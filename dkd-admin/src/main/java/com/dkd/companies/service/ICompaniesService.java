package com.dkd.companies.service;

import java.util.List;
import com.dkd.companies.domain.Companies;

/**
 * companiesService接口
 * 
 * @author oj
 * @date 2024-08-27
 */
public interface ICompaniesService 
{
    /**
     * 查询companies
     * 
     * @param companyId companies主键
     * @return companies
     */
    public Companies selectCompaniesByCompanyId(Long companyId);

    /**
     * 查询companies列表
     * 
     * @param companies companies
     * @return companies集合
     */
    public List<Companies> selectCompaniesList(Companies companies);

    /**
     * 新增companies
     * 
     * @param companies companies
     * @return 结果
     */
    public int insertCompanies(Companies companies);

    /**
     * 修改companies
     * 
     * @param companies companies
     * @return 结果
     */
    public int updateCompanies(Companies companies);

    /**
     * 批量删除companies
     * 
     * @param companyIds 需要删除的companies主键集合
     * @return 结果
     */
    public int deleteCompaniesByCompanyIds(Long[] companyIds);

    /**
     * 删除companies信息
     * 
     * @param companyId companies主键
     * @return 结果
     */
    public int deleteCompaniesByCompanyId(Long companyId);
}
