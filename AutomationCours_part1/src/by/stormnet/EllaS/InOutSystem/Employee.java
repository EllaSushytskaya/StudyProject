package by.stormnet.EllaS.InOutSystem;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public abstract class Employee implements LocatedInOffice {
	// TODO: 9/1/2021 fields name must start from lowercase symbol [Pavel.Chachotkin]

	protected String Name = "";
	protected String LastName = "";
	protected String Job = "";
	protected int idCard;

	// TODO: 9/8/2021 Where IdCard field for employee? [Pavel.Chachotkin]

	public Employee(String Name, String LastName, String Job, int idCard) {
		this.Name = Name;
		this.LastName = LastName;
		this.Job = Job;
		this.idCard = idCard;
	}

	public abstract void locatedInOffice();


}









