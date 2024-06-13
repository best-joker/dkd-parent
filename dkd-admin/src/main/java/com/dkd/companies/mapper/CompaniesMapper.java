package com.dkd.companies.mapper;

import java.util.List;
import com.dkd.companies.domain.Companies;

/**
 * companiesMapper接口
 * 
 * @author oj
 * @date 2024-08-27
 */
public interface CompaniesMapper 
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
     * 删除companies
     * 
     * @param companyId companies主键
     * @return 结果
     */
    public int deleteCompaniesByCompanyId(Long companyId);

    /**
     * 批量删除companies
     * 
     * @param companyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCompaniesByCompanyIds(Long[] companyIds);
}
