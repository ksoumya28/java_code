package codePrep.interviewQ1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solve {
	
	public static void main(String[] args)
	{
		
		Transactions txn = new Transactions("26/9/2024","John","Success","HDFC",500.00);
		Transactions txn4 = new Transactions("28/9/2024","Anish","Success","HDFC",1000.00);
		Transactions txn1 = new Transactions("25/9/2024","Duke","Success","HSBC",500.00);
		Transactions txn2 = new Transactions("25/9/2024","Hannah","Failure","Standard Chartered",500.00);
		Transactions txn5= new Transactions("25/9/2024","Hannah","Failure","Standard Chartered",500.00);
		Transactions txn3 = new Transactions("25/9/2024","Abhishek","Failure","ICCI",500.00);
		
		List<Transactions> txnList = Arrays.asList(txn,txn4,txn1,txn2,txn3);

		
//		Map<String, Long> sucessMap=txnList.stream()
//		.filter(t->t.getTxnStatus().equals("Success")).
//		collect(Collectors.groupingBy(e->e.bankName,Collectors.counting()));
		
		
		Map<String, Map<String, Map<String, Long>>> map=txnList.stream().
				collect(Collectors.groupingBy(Transactions::getBankName,Collectors.groupingBy(Transactions::getTxnDate, Collectors.groupingBy(Transactions::getTxnStatus,Collectors.counting()))));
				
		
		System.out.println(map);
			map.forEach((bank,dateMap)->{
				
				System.out.println("Bank "+bank);
				  dateMap.forEach((date, statusMap) -> {
		                System.out.println("  Date: " + date);
		                System.out.println("    Success: " + statusMap.getOrDefault("Success", 0L));
		                System.out.println("    Failure: " + statusMap.getOrDefault("Failure", 0L));
		            });
			}
				);
	}

}
