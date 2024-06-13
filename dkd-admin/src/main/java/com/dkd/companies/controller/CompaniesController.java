package com.dkd.companies.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dkd.common.annotation.Log;
import com.dkd.common.core.controller.BaseController;
import com.dkd.common.core.domain.AjaxResult;
import com.dkd.common.enums.BusinessType;
import com.dkd.companies.domain.Companies;
import com.dkd.companies.service.ICompaniesService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * companiesController
 * 
 * @author oj
 * @date 2024-08-27
 */
@RestController
@RequestMapping("/companies/companies")
public class CompaniesController extends BaseController
{
    @Autowired
    private ICompaniesService companiesService;

    /**
     * 查询companies列表
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:list')")
    @GetMapping("/list")
    public TableDataInfo list(Companies companies)
    {
        startPage();
        List<Companies> list = companiesService.selectCompaniesList(companies);
        return getDataTable(list);
    }

    /**
     * 导出companies列表
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:export')")
    @Log(title = "companies", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Companies companies)
    {
        List<Companies> list = companiesService.selectCompaniesList(companies);
        ExcelUtil<Companies> util = new ExcelUtil<Companies>(Companies.class);
        util.exportExcel(response, list, "companies数据");
    }

    /**
     * 获取companies详细信息
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:query')")
    @GetMapping(value = "/{companyId}")
    public AjaxResult getInfo(@PathVariable("companyId") Long companyId)
    {
        return success(companiesService.selectCompaniesByCompanyId(companyId));
    }

    /**
     * 新增companies
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:add')")
    @Log(title = "companies", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Companies companies)
    {
        return toAjax(companiesService.insertCompanies(companies));
    }

    /**
     * 修改companies
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:edit')")
    @Log(title = "companies", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Companies companies)
    {
        return toAjax(companiesService.updateCompanies(companies));
    }

    /**
     * 删除companies
     */
    @PreAuthorize("@ss.hasPermi('companies:companies:remove')")
    @Log(title = "companies", businessType = BusinessType.DELETE)
	@DeleteMapping("/{companyIds}")
    public AjaxResult remove(@PathVariable Long[] companyIds)
    {
        return toAjax(companiesService.deleteCompaniesByCompanyIds(companyIds));
    }
}
