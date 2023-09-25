package com.trang.TrangWebYTe.mapper;

import com.trang.TrangWebYTe.model.ToaThuoc;
import com.trang.TrangWebYTe.model.ToaThuocExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ToaThuocMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	long countByExample(ToaThuocExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int deleteByExample(ToaThuocExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int deleteByPrimaryKey(Integer ma);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int insert(ToaThuoc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int insertSelective(ToaThuoc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	List<ToaThuoc> selectByExample(ToaThuocExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	ToaThuoc selectByPrimaryKey(Integer ma);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByExampleSelective(@Param("record") ToaThuoc record, @Param("example") ToaThuocExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByExample(@Param("record") ToaThuoc record, @Param("example") ToaThuocExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByPrimaryKeySelective(ToaThuoc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table toathuoc
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByPrimaryKey(ToaThuoc record);
}