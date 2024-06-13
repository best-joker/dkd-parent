package com.dkd.jobpositions.controller;

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
import com.dkd.jobpositions.domain.Jobpositions;
import com.dkd.jobpositions.service.IJobpositionsService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * 发布职位表Controller
 * 
 * @author oj
 * @date 2024-08-28
 */
@RestController
@RequestMapping("/jobpositions/jobpositions")
public class JobpositionsController extends BaseController
{
    @Autowired
    private IJobpositionsService jobpositionsService;

    /**
     * 查询发布职位表列表
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jobpositions jobpositions)
    {
        startPage();
        List<Jobpositions> list = jobpositionsService.selectJobpositionsList(jobpositions);
        return getDataTable(list);
    }

    /**
     * 导出发布职位表列表
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:export')")
    @Log(title = "发布职位表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Jobpositions jobpositions)
    {
        List<Jobpositions> list = jobpositionsService.selectJobpositionsList(jobpositions);
        ExcelUtil<Jobpositions> util = new ExcelUtil<Jobpositions>(Jobpositions.class);
        util.exportExcel(response, list, "发布职位表数据");
    }

    /**
     * 获取发布职位表详细信息
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:query')")
    @GetMapping(value = "/{positionId}")
    public AjaxResult getInfo(@PathVariable("positionId") Long positionId)
    {
        return success(jobpositionsService.selectJobpositionsByPositionId(positionId));
    }

    /**
     * 新增发布职位表
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:add')")
    @Log(title = "发布职位表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jobpositions jobpositions)
    {
        return toAjax(jobpositionsService.insertJobpositions(jobpositions));
    }

    /**
     * 修改发布职位表
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:edit')")
    @Log(title = "发布职位表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jobpositions jobpositions)
    {
        return toAjax(jobpositionsService.updateJobpositions(jobpositions));
    }

    /**
     * 删除发布职位表
     */
    @PreAuthorize("@ss.hasPermi('jobpositions:jobpositions:remove')")
    @Log(title = "发布职位表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{positionIds}")
    public AjaxResult remove(@PathVariable Long[] positionIds)
    {
        return toAjax(jobpositionsService.deleteJobpositionsByPositionIds(positionIds));
    }
}
