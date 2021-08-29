package by.stormnet.EllaS.InOutSystem;

public class Jurnal <Register extends Employee & RegisterEmployee> {
	private Register[] EmployeeRegister;

	public Jurnal(Register[] EmployeeRegister) {
		this.EmployeeRegister = EmployeeRegister;
	}

	public void infoAboutNumberOfEmployee() {
		for (Register EmployeeInOffice : EmployeeRegister) {
			EmployeeInOffice.locatedInOffice();
		}
	}
}

























