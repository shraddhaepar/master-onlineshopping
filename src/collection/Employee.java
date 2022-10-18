package collection;

public class Employee {
	private int empId=20;
	private String empName = "Amay";
	private int empSalary= 20000;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "empName"+ empName ;
	}
	

}
