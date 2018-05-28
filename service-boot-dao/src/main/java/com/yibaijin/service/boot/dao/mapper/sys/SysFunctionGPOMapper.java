package com.yibaijin.service.boot.dao.mapper.sys;

import com.yibaijin.service.boot.dao.model.mysql.sys.SysFunctionGPO;
import com.yibaijin.service.boot.dao.model.mysql.sys.SysFunctionGPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface SysFunctionGPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    long countByExample(SysFunctionGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int deleteByExample(SysFunctionGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int insert(SysFunctionGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int insertSelective(SysFunctionGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    List<SysFunctionGPO> selectByExampleWithRowbounds(SysFunctionGPOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    List<SysFunctionGPO> selectByExample(SysFunctionGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    SysFunctionGPO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByExampleSelective(@Param("record") SysFunctionGPO record, @Param("example") SysFunctionGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByExample(@Param("record") SysFunctionGPO record, @Param("example") SysFunctionGPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByPrimaryKeySelective(SysFunctionGPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_function
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    int updateByPrimaryKey(SysFunctionGPO record);
}