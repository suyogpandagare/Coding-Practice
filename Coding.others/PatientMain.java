package study.coding.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientMain {

	public static void main(String[] args) {

		//you are given list of patients you have to find list of patients having corona & the age should be less than 25
		//2nd you have to print the average bill paid by all corona patients
		Patient p1 = new Patient("suyog",24,"corona",50000);
		Patient p2 = new Patient("sanket",24,"dengue",60000);
		Patient p3 = new Patient("aniket",24,"corona",3000);
		Patient p4 = new Patient("abhi",30,"corona",1000);
		
		List<Patient> list = Arrays.asList(p1,p2,p3,p4);
		list.stream().filter(p -> p.getDisease().equals("corona") && p.getAge() <= 25 ).forEach(System.out::println);
		
     	Double avgAmtPaidByCoronapatients =	list.stream().filter(p -> p.getDisease().equals("corona")).collect(Collectors.averagingDouble(Patient::getAmount));
     	System.out.println("avgAmtPaidByCoronapatients = "+avgAmtPaidByCoronapatients);
	}

}
