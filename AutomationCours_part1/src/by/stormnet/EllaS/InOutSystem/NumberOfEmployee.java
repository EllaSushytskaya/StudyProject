package by.stormnet.EllaS.InOutSystem;

public class NumberOfEmployee {
	int FactNumberOfEmployee = 15; // TODO: 9/1/2021 From the start you always have 15 employees ? [Pavel.Chachotkin]
	int MaxNumberOfEmployee = 15;

	public void NumberOfEmployee(int FactNumberOfEmployee, int MaxNumberOfEmployee) {
		this.FactNumberOfEmployee = FactNumberOfEmployee;
		this.MaxNumberOfEmployee = MaxNumberOfEmployee;
	}

	// TODO: 9/1/2021 Method name must start from lowercase symbol [Pavel.Chachotkin]
	public void Compare() throws ExceededNumberOfEmployee {
		if (FactNumberOfEmployee > MaxNumberOfEmployee) {
			throw new ExceededNumberOfEmployee("Превышено максимальное колличесвто сотрудников. Максимальное количество сотрудников:" + MaxNumberOfEmployee);
		}
	}



	}
