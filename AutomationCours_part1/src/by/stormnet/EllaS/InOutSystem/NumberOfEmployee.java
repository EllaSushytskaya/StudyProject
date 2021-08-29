package by.stormnet.EllaS.InOutSystem;

public class NumberOfEmployee {
	int FactNumberOfEmployee = 15;
	int MaxNumberOfEmployee = 15;

	public void NumberOfEmployee(int FactNumberOfEmployee, int MaxNumberOfEmployee) {
		this.FactNumberOfEmployee = FactNumberOfEmployee;
		this.MaxNumberOfEmployee = MaxNumberOfEmployee;
	}

	public void Compare() throws ExceededNumberOfEmployee {
		if (FactNumberOfEmployee > MaxNumberOfEmployee) {
			throw new ExceededNumberOfEmployee("Превышено максимальное колличесвто сотрудников. Максимальное количество сотрудников:" + MaxNumberOfEmployee);
		}
	}



	}
