package com.yibaijin.service.boot.dao.mapper.sys;

import com.yibaijin.service.boot.dao.model.mysql.sys.SysGroupGPO;
import com.yibaijin.service.boot.dao.model.mysql.sys.SysGroupGPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface SysGroupGPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    long countByExample(SysGroupGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int deleteByExample(SysGroupGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int insert(SysGroupGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int insertSelective(SysGroupGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    List<SysGroupGPO> selectByExampleWithRowbounds(SysGroupGPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    List<SysGroupGPO> selectByExample(SysGroupGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    SysGroupGPO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByExampleSelective(@Param("record") SysGroupGPO record, @Param("example") SysGroupGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByExample(@Param("record") SysGroupGPO record, @Param("example") SysGroupGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByPrimaryKeySelective(SysGroupGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByPrimaryKey(SysGroupGPO record);
}