package com.ibm.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ibm.app.entity.Company;

@Mapper
public interface  CompanyDao {
	
	@Select("select * from company")
	List<Company> listAll();

	@Select("select c.* from company c where id = #{id}")
	Company getById(int id);

	@Delete("delete from company c where id = #{id}")
	int delete(int id);

	@Insert("insert into company(id, name, code) values(#{id},#{name},#{code})")
	int save(Company company);
	
	@Update("update company set name = #{name}, code = #{code} where id = #{id}")
	int update(Company company);
}
