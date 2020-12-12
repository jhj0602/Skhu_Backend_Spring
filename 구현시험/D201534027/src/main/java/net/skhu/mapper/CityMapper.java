package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.City;

@Mapper
public interface CityMapper {
	@Select("SELECT * FROM city WHERE districtId = #{districtId}")
	List<City> findByDistrictId(int districtId);
}