package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociation;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AuthUserGroupAssociationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    long countByExample(AuthUserGroupAssociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int deleteByExample(AuthUserGroupAssociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int insert(AuthUserGroupAssociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int insertSelective(AuthUserGroupAssociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    List<AuthUserGroupAssociation> selectByExampleWithRowbounds(AuthUserGroupAssociationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    List<AuthUserGroupAssociation> selectByExample(AuthUserGroupAssociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    AuthUserGroupAssociation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int updateByExampleSelective(@Param("record") AuthUserGroupAssociation record, @Param("example") AuthUserGroupAssociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int updateByExample(@Param("record") AuthUserGroupAssociation record, @Param("example") AuthUserGroupAssociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int updateByPrimaryKeySelective(AuthUserGroupAssociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_group_association
     *
     * @mbg.generated 2018-06-06 01:51:54
     */
    int updateByPrimaryKey(AuthUserGroupAssociation record);
}