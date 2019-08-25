package com.woniuxy.mapper;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.MultipleChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MultipleChoiceMapper {

	List<MultipleChoice> findAll();
    List<MultipleChoice> findByPage(Integer page,Integer limit);
    
    List<MultipleChoice> findAllByType(String typename);
    List<MultipleChoice> findByType(String typename, Integer page,Integer limit);
    
	List<MultipleChoice> findAllByQType(String typename);
	List<MultipleChoice> findByQType(String typename, Integer page,Integer limit);

	List<MultipleChoice> findAllByName(String name);
    List<MultipleChoice> findByName(String name, Integer page,Integer limit);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    long countByExample(MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByExample(MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByPrimaryKey(Integer titleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insert(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insertSelective(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    List<MultipleChoice> selectByExample(RowBounds rb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    MultipleChoice selectByPrimaryKey(Integer titleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExample(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKeySelective(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKey(MultipleChoice record);

	
}