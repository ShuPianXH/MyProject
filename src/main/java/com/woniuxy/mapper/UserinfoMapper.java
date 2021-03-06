package com.woniuxy.mapper;

import com.woniuxy.pojo.Userinfo;
import com.woniuxy.pojo.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
	Userinfo login(Userinfo info);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    Userinfo selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Aug 27 15:34:19 CST 2019
     */
    int updateByPrimaryKey(Userinfo record);
}