package com.reinvent.mappers;

import com.reinvent.model.Subject;
import com.reinvent.model.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int countByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int deleteByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int deleteByPrimaryKey(Integer subId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int insert(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int insertSelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    List<Subject> selectByExample(SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    Subject selectByPrimaryKey(Integer subId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int updateByPrimaryKeySelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_subjects
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    int updateByPrimaryKey(Subject record);
}