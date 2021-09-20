package by.stormnet.EllaS.inOutSystem;

public class Office <T>{
	private T employee;

	Office (T employee){
		this.employee=employee;
	}
	public T enterToOffice (){
		return employee;
	}

}
