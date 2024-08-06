package javaOops.Inheritance.NetBankingPages;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetBankingFinalImplementation nb = new NetBankingFinalImplementation();
		nb.electricity();
		nb.imps();
		nb.neft();
		nb.resetPassword();
		nb.rtgs();
		

		String a = "xxcaazz", b = "xxbaaz";
		  int lenA = a.length();
		  int count = 0;
		  for (int i=0; i< lenA-1 ; i++) {
		    if (b.indexOf(a.substring(i, i+2)) != -1)
		        count++;
		    System.out.println(a.substring(i, i+2));
		  }
		System.out.println(count);
	}
	

}
