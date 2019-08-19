
class Employee{
	private int eno;
	private String ename;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEno(5);
		emp.setEname("Someone");
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
	}

}
