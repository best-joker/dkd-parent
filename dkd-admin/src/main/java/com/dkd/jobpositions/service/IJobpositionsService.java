package com.dkd.jobpositions.service;

import java.util.List;
import com.dkd.jobpositions.domain.Jobpositions;

/**
 * 发布职位表Service接口
 * 
 * @author oj
 * @date 2024-08-28
 */
public interface IJobpositionsService 
{
    /**
     * 查询发布职位表
     * 
     * @param positionId 发布职位表主键
     * @return 发布职位表
     */
    public Jobpositions selectJobpositionsByPositionId(Long positionId);

    /**
     * 查询发布职位表列表
     * 
     * @param jobpositions 发布职位表
     * @return 发布职位表集合
     */
    public List<Jobpositions> selectJobpositionsList(Jobpositions jobpositions);

    /**
     * 新增发布职位表
     * 
     * @param jobpositions 发布职位表
     * @return 结果
     */
    public int insertJobpositions(Jobpositions jobpositions);

    /**
     * 修改发布职位表
     * 
     * @param jobpositions 发布职位表
     * @return 结果
     */
    public int updateJobpositions(Jobpositions jobpositions);

    /**
     * 批量删除发布职位表
     * 
     * @param positionIds 需要删除的发布职位表主键集合
     * @return 结果
     */
    public int deleteJobpositionsByPositionIds(Long[] positionIds);

    /**
     * 删除发布职位表信息
     * 
     * @param positionId 发布职位表主键
     * @return 结果
     */
    public int deleteJobpositionsByPositionId(Long positionId);
}
