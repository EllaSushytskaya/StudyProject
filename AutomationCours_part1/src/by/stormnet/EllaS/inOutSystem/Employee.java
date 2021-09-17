package by.stormnet.EllaS.inOutSystem;

public abstract class Employee  {

	protected String name = "";
	protected String lastName = "";
	protected Status status;
	protected IDcard idCard;




	public Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.status = Status.Out_Office;

	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setIdCard(IDcard idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Status getStatus() {
		return status;
	}

	public IDcard getIdCard() {
		return idCard;
	}
}











