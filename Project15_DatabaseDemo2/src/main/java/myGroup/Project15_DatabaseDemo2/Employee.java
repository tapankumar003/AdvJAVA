package myGroup.Project15_DatabaseDemo2;

public class Employee {

	private int empId;
	private String empName;
	private String empAdr;

	
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String empAdr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdr = empAdr;
	}

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

	public String getEmpAdr() {
		return empAdr;
	}

	public void setEmpAdr(String empAdr) {
		this.empAdr = empAdr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdr=" + empAdr + "]";
	}
	
}
