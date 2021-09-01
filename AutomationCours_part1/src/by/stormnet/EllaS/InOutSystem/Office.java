package by.stormnet.EllaS.InOutSystem;

// TODO: 9/1/2021 As rule in Generic classes we should use 'T' instead 'Register' as name for generic type [Pavel.Chachotkin]
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
