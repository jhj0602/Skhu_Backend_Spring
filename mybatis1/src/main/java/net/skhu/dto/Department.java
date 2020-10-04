package net.skhu.dto;

public class Department {
	int id;
	String departmentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
// Department 테이블에서 조회한 데이터를 채울 DTO (data transfer object)
