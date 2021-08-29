package by.stormnet.EllaS.InOutSystem;

public class Office<InOffice extends Employee & LocatedInOffice> {
	private InOffice[] EmployeeInOffice;

	public Office(InOffice[] EmployeeInOffice) {
		this.EmployeeInOffice = EmployeeInOffice;
	}

	public void infoAboutNumberOfEmployee() {
		for (InOffice EmployeeInOffice : EmployeeInOffice) {
			EmployeeInOffice.locatedInOffice();
		}
	}

}
