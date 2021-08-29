package by.stormnet.EllaS.InOutSystem;

public class Office<InOffise extends Employee & LocatedInOffice> {
	private InOffise[] EmployeeInOffice;

	public Office(InOffise[] EmployeeInOffice) {
		this.EmployeeInOffice = EmployeeInOffice;
	}

	public void info() {
		for (InOffise EmployeeInOffice : EmployeeInOffice) {
			EmployeeInOffice.locatedInOffice();
		}
	}

}
