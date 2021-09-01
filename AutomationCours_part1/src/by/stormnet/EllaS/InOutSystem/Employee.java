package by.stormnet.EllaS.InOutSystem;

public abstract class Employee implements LocatedInOffice,RegisterEmployee{
	// TODO: 9/1/2021 fields name must start from lowercase symbol [Pavel.Chachotkin]
	protected String Name = "";
	protected String LastName = "";
	protected String Job = "";

	public Employee(String Name, String LastName, String Job) {
		this.Name = Name;
		this.LastName = LastName;
		this.Job = Job;
	}


	public abstract void locatedInOffice();
	public abstract void registerEmployee();


}










