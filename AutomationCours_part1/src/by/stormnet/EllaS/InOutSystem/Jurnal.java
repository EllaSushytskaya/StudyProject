package by.stormnet.EllaS.InOutSystem;

// TODO: 9/1/2021 As rule in Generic classes we should use 'T' instead 'Register' as name for generic type [Pavel.Chachotkin]
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

























