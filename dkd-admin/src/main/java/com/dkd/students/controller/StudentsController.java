package com.dkd.students.controller;

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
import com.dkd.students.domain.Students;
import com.dkd.students.service.IStudentsService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * 学生信息表Controller
 * 
 * @author oldj
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/students/students")
public class StudentsController extends BaseController
{
    @Autowired
    private IStudentsService studentsService;

    /**
     * 查询学生信息表列表
     */
    @PreAuthorize("@ss.hasPermi('students:students:list')")
    @GetMapping("/list")
    public TableDataInfo list(Students students)
    {
        startPage();
        List<Students> list = studentsService.selectStudentsList(students);
        return getDataTable(list);
    }

    /**
     * 导出学生信息表列表
     */
    @PreAuthorize("@ss.hasPermi('students:students:export')")
    @Log(title = "学生信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Students students)
    {
        List<Students> list = studentsService.selectStudentsList(students);
        ExcelUtil<Students> util = new ExcelUtil<Students>(Students.class);
        util.exportExcel(response, list, "学生信息表数据");
    }

    /**
     * 获取学生信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('students:students:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return success(studentsService.selectStudentsByStudentId(studentId));
    }

    /**
     * 新增学生信息表
     */
    @PreAuthorize("@ss.hasPermi('students:students:add')")
    @Log(title = "学生信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Students students)
    {
        return toAjax(studentsService.insertStudents(students));
    }

    /**
     * 修改学生信息表
     */
    @PreAuthorize("@ss.hasPermi('students:students:edit')")
    @Log(title = "学生信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Students students)
    {
        return toAjax(studentsService.updateStudents(students));
    }

    /**
     * 删除学生信息表
     */
    @PreAuthorize("@ss.hasPermi('students:students:remove')")
    @Log(title = "学生信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(studentsService.deleteStudentsByStudentIds(studentIds));
    }
}
