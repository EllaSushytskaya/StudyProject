package by.stormnet.EllaS.inOutSystem;


public class EmployeeInOffice<T extends Employee & LocatedInOffice> {
	private T[] EmployeeInOffice;

	public EmployeeInOffice(T[] EmployeeInOffice) {
		this.EmployeeInOffice = EmployeeInOffice;
	}

	public void infoAboutNumberOfEmployee() {
		for (T EmployeeInOffice : EmployeeInOffice) {
			EmployeeInOffice.locatedInOffice();
		}

	}
}
