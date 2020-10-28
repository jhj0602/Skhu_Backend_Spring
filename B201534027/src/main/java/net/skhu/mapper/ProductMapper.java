package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Product;

@Mapper
public interface ProductMapper {

	@Select("Select * From Product Where id = #{id}")
	Product findOne(int id);

//	@Select("select * From Product Where employeeNo = #{employeeNo}")
//	Product findByEmployeeNo(String employeeNo);

	@Select("Select p.*, c.title  " + "From Product p left join Category c  " + "On p.categoryId = c.id	")
	List<Product> findAll();

	@Update("UPDATE Product SET " + " name = #{name}, " + " categoryId = #{categoryId}, " + " price = #{price}, "
			+ " quantity = #{quantity} " + "WHERE id = #{id} ")
	void update(Product product);
}
