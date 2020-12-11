package net.skhu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.skhu.dto.Department;

@Mapper // mybatis mapper에는 @Mapper 애너테이션이 붙어있어야 한다.
public interface DepartmentMapper {
	@Select("SELECT * FROM department")
	List<Department> findAll();
	// findAll 메소드는 department 테이블의 모든 레코드를 조회해서 리턴
	// findAll 메소드를 호출하면 , "SELECT * FROM department" SQL 명령이 mySQL 엔진에서 실행된다.

	@Select("SELECT * FROM department WHERE id = #{id}")
	Department findOne(int id);
	// findOne department 테이블의 레코드 한 개를 조회해서 리턴한다.
	// findOne 메소드를 호출하면 "SELECT * FROM department WHERE id = #{id}" 명령이 mySQL엔진에서
	// 실행
	// 이 메소드의 파라미터 id 변수의 값이 ,#{id} 부분에 채워진 후 실행된다.
	// 결과가 없을 경우에 이 메소드는 null 을 리턴한다

	@Insert("INSERT department (departmentName) VALUES (#{departmentName})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Department department);
	
	//insert 메소드의 파라미터 변수가 Department 객체이다.
//	INSERT SQL 명령의 #{...} 부분에 채워져서 실행된다
//	Java
//	객체의 속성명과 #{...} 부분의 이름이 일치해야 속성값이 채워질 수 있다
//   #{...} 부분의 이름과 일치하는 java 객체의 속성이 없을 경우에, 에러가 발생한다.
// @Options(useGeneratedKeys=true, keyProperty="id") Insert 할 테이블의 기본키 필드 이름이 "id" 이고
//	이 필드의 값은 자동으로 생성된다는 선언이다. (Auto Increment 필드
	

	@Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
	void update(Department department);

	
	@Delete("DELETE FROM department WHERE id = #{id}")
	void delete(int id);
}