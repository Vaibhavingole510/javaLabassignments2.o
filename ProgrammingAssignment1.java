import java.util.ArrayList;
import java.util.List;

public class bit510 {

	public static int countValidRegstrationNumbers(List<String>registrationNumbers) {
		int validCount=0;
		List<String>validDepartments=List.of("CSE","BIT","MCH","CEM");
		for (String regNumber:registrationNumbers) {
			String year=regNumber.substring(0,4);
			String deparment=regNumber.substring(4,7);
			String sequence=regNumber.substring(7);
			
			if(validDepartments.contains(deparment)) {
				validCount++;
				
			}
			
			
		}
		return validCount;
		
		
		
	}
	
	public static void main(String[]args) {
		List<String>
		registrationNumbers=new ArrayList<>();
		registrationNumbers.add("2023CSE001");
		registrationNumbers.add("2022bbb002");
		registrationNumbers.add("2022MCH690");
		registrationNumbers.add("2023BIT510");
		registrationNumbers.add("2023CEM5344");
				
		
		int result=countValidRegstrationNumbers(registrationNumbers);
			
		
System.out.println("number of valid numbers" +result);
	}
}