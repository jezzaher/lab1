//Jaouad Ezzaher
public class Main {
	public static  int Yeartowrk=40;
	public static String AnnualReturn="7%";
	public static int YearRetired=20;
	public static String AnnualReturn1="2%";
	public static int RequiredIncome=10000;
	public static int MonthlySSI=2642;
	public static double MoneySaved=(((RequiredIncome-MonthlySSI)*12*YearRetired)/1.21412);
	
	public static void main(String[] args) {
		System.out.printf("Save Each Month: %.2f ",((MoneySaved/12/Yeartowrk)/5.468352605));
		System.out.println("");
		System.out.println("Years To Work:" + Yeartowrk );
		System.out.println("Annual Return:"+ AnnualReturn);
		System.out.printf("What You Need Saved: %.2f ", MoneySaved);
		System.out.println("");
		System.out.println("Years Retired:"+YearRetired);
		System.out.println("Annual Return:"+AnnualReturn1);
		System.out.println("Required Income:"+RequiredIncome);
		System.out.println("Monthly SSI:"+MonthlySSI);

}
}