package com.yedam.departments;

import java.util.List;
import java.util.Scanner;

public class DeptImpl {

	Scanner sc = new Scanner(System.in);
	
	// 1.전체조회 
	public void getDeptList() {
		List<DeptDTO> list = DeptDAO.getInstance().getDeptList();
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println("Department_ID : " + list.get(i).getDepartmentId());
			System.out.println("Department_NAME : " + list.get(i).getDepartmentName());
			System.out.println("Manager_ID : " + list.get(i).getManagerId());
			System.out.println("Location_ID : " + list.get(i).getLocationId());
		}
	}
	
	//2. 부서 정보 조회 ( 단건 )
	public void getDept() {
		System.out.println("조회할 부서 >");
		int departmentId = Integer.parseInt(sc.nextLine());
		DeptDTO dept = DeptDAO.getInstance().getDept(departmentId);
		
		if(dept == null) {
			System.out.println("해당 사원은 존재하지 않습니다.");
		}else {
			System.out.println("Department_ID : " + dept.getDepartmentId());
			System.out.println("Department_NAME : " + dept.getDepartmentName());
			System.out.println("Manager_ID : "+ dept.getManagerId());
			System.out.println("Location_ID : " + dept.getLocationId());
		}
	}
	
	//3. 부서 생성
	public void deptAdd() {
		DeptDTO dept = new DeptDTO();
		
		System.out.println("부서번호를 입력하세요 >");
		int deptId = Integer.parseInt(sc.nextLine());
		System.out.println("부서명을 입력하세요 >");
		String deptName = sc.nextLine();
		
		dept.setDepartmentId(deptId);
		dept.setDepartmentName(deptName);
		
		int result = DeptDAO.getInstance().deptAdd(dept);
		
		if(result > 0) {
			System.out.println("생성이 완료되었습니다.");
		}else {
			System.out.println("생성에 실패하였습니다.");
		}
	}
	
	//4. 부서 수정
	public void deptUpdate() {
		DeptDTO dept = new DeptDTO();
		
		System.out.println("부서 번호 입력 >");
		int deptId = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 Manager_id 입력 >");
		int deptMId = Integer.parseInt(sc.nextLine());
		
		dept.setDepartmentId(deptId);
		dept.setManagerId(deptMId);
		
		int result = DeptDAO.getInstance().deptUpdate(dept);
		
		if(result > 0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
	}
	
	//5. 부서 삭제
	public void deptDelete() {
		
		System.out.println("삭제할 부서 번호 입력 >");
		int deptId = Integer.parseInt(sc.nextLine());
		
		int result = DeptDAO.getInstance().deptDelete(deptId);
		
		if(result > 0) {
			System.out.println("삭제 성공했습니다.");
		}else {
			System.out.println("삭제 실패했습니다.");
		}
			
	}
}
