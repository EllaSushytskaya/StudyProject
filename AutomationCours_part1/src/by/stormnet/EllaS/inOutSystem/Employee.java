package by.stormnet.EllaS.inOutSystem;

public abstract class Employee {

	protected final String name;
	protected final String lastName;
	protected Status status;
	protected IDcard idCard;


	public Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.status = Status.OUT_OF_OFFICE;

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

	public void setStatus(Status status) {
		this.status = status;
	}

	public IDcard getIdCard() {
		return idCard;
	}

	public void setIdCard(IDcard idCard) {
		this.idCard = idCard;
	}

	@Override
	public boolean equals(Object ob) {
		if (this == ob)
			return true;
		if (ob == null || getClass() != ob.getClass())
			return false;
		Employee employee = (Employee) ob;
		if (name.equals(employee.getName()) && lastName.equals(employee.getLastName())) {
			return true;
		}
		return false;
	}
}
























