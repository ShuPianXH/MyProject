package com.woniuxy.mapper;

import com.woniuxy.pojo.Clazz;
import com.woniuxy.pojo.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    long countByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int deleteByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int insert(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int insertSelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    List<Clazz> selectByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    Clazz selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByPrimaryKeySelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByPrimaryKey(Clazz record);
}