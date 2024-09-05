package com.dkd.jobpositions.service.impl;

import java.util.List;

import com.dkd.common.core.domain.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.jobpositions.mapper.JobpositionsMapper;
import com.dkd.jobpositions.domain.Jobpositions;
import com.dkd.jobpositions.service.IJobpositionsService;

import static com.dkd.common.utils.SecurityUtils.getUserId;

/**
 * 发布职位表Service业务层处理
 * 
 * @author oj
 * @date 2024-08-28
 */
@Service
public class JobpositionsServiceImpl implements IJobpositionsService 
{
    @Autowired
    private JobpositionsMapper jobpositionsMapper;

    /**
     * 查询发布职位表
     * 
     * @param positionId 发布职位表主键
     * @return 发布职位表
     */
    @Override
    public Jobpositions selectJobpositionsByPositionId(Long positionId)
    {
        return jobpositionsMapper.selectJobpositionsByPositionId(positionId);
    }

    /**
     * 查询发布职位表列表
     * 
     * @param jobpositions 发布职位表
     * @return 发布职位表
     */
    @Override
    public List<Jobpositions> selectJobpositionsList(Jobpositions jobpositions)
    {
        if(SysUser.isAdmin(getUserId()) != true) {
            jobpositions.setCompanyId(getUserId());
        }
        return jobpositionsMapper.selectJobpositionsList(jobpositions);
    }

    /**
     * 新增发布职位表
     * 
     * @param jobpositions 发布职位表
     * @return 结果
     */
    @Override
    public int insertJobpositions(Jobpositions jobpositions)
    {
        return jobpositionsMapper.insertJobpositions(jobpositions);
    }

    /**
     * 修改发布职位表
     * 
     * @param jobpositions 发布职位表
     * @return 结果
     */
    @Override
    public int updateJobpositions(Jobpositions jobpositions)
    {
        return jobpositionsMapper.updateJobpositions(jobpositions);
    }

    /**
     * 批量删除发布职位表
     * 
     * @param positionIds 需要删除的发布职位表主键
     * @return 结果
     */
    @Override
    public int deleteJobpositionsByPositionIds(Long[] positionIds)
    {
        return jobpositionsMapper.deleteJobpositionsByPositionIds(positionIds);
    }

    /**
     * 删除发布职位表信息
     * 
     * @param positionId 发布职位表主键
     * @return 结果
     */
    @Override
    public int deleteJobpositionsByPositionId(Long positionId)
    {
        return jobpositionsMapper.deleteJobpositionsByPositionId(positionId);
    }
}
