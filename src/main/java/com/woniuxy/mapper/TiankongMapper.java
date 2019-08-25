package com.woniuxy.mapper;

import com.woniuxy.pojo.Tiankong;
import com.woniuxy.pojo.TiankongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiankongMapper {

	List<Tiankong> findAll();
    List<Tiankong> findByPage(Integer page,Integer limit);

    List<Tiankong> findAllByType(String typename);
	List<Tiankong> findByType(String typename, Integer page, Integer limit);
	
	List<Tiankong> findAllByQType(String typename);
	List<Tiankong> findByQType(String typename, Integer page, Integer limit);
	
	List<Tiankong> findAllByName(String name);
    List<Tiankong> findByName(String name, Integer page,Integer limit);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    long countByExample(TiankongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByExample(TiankongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByPrimaryKey(Integer tiankongId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insert(Tiankong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insertSelective(Tiankong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    List<Tiankong> selectByExample(TiankongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    Tiankong selectByPrimaryKey(Integer tiankongId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tiankong record, @Param("example") TiankongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExample(@Param("record") Tiankong record, @Param("example") TiankongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKeySelective(Tiankong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiankong
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKey(Tiankong record);
}