package by.stormnet.EllaS.InOutSystem.NumberOfEmployee;

// TODO: 9/1/2021 Exception class must have 'Exception' as postfix in the class name [Pavel.Chachotkin]
public class ExceededNumberOfEmployeeException extends Exception {
	public ExceededNumberOfEmployeeException(String s) {
		super(s);
	}
}
