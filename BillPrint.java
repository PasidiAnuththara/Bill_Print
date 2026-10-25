import java.util.*;
class BillPrint{
	public static void main(String [] args){
		System.out.println("================================================================================");
		System.out.println("__          __  _                           _          _ __  __            _                                                                        "); 
		System.out.println("\\ \\        / / | |                         | |        (_)  \\/  |          | |                                                                      ");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___  __   | |_ ___    _| \\  / | __ _ _ __| |_                                       ");
		System.out.println("  \\ \\/  \\/ /  _\\ |/ __/ _ \\|  _   _ \\/ _ \\ | __/ _ \\  | | |\\/| |/ _  |  __| __|                                     ");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | | __/ | || (_) | | | |  | | (_| | |  | |_                                                   ");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___| \\__\\___|  |_|_|  |_|\\__ _|_|   \\__|                   ");     
		System.out.println("                                                                                                                                                                                               ");    
		System.out.println("=================================================================================");       
		Scanner input=new Scanner(System.in);

		System.out.println("                                                                                                                                                        ");
		System.out.print("Enter Customer Phone Number - ");
		String CustomerPhoneNumber=input.nextLine();
		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Enter Customer Name - " );
		String CustomerName=input.nextLine();
		System.out.println("                                                                                                                                                                                            ");
		System.out.println("\n=================================================================================");	

		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Basmathi\tRs.250.00\tQty(Kg) -");
		Double Basmathi=input.nextDouble();
		Double BasmathiTotal=Basmathi * 250;
		System.out.println("Basmathi Total = Rs. "+BasmathiTotal);

		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Dhal\tRs.180.00\tQty(Kg) -");
		Double Dhal=input.nextDouble();
		Double DhalTotal=Dhal * 180;
		System.out.println("Dhal Total = Rs. "+DhalTotal);

		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Sugar\tRs.150.00\tQty(Kg)-");
		Double Sugar=input.nextDouble();
  		Double SugarTotal=Sugar* 150;
		System.out.println("Sugar Total = Rs. "+SugarTotal);


		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Highland\tRs.1200.00\tQty-");
		Double Highland=input.nextDouble();
		Double HighlandTotal=Highland * 1200;
		System.out.println("Highland Total = Rs. "+HighlandTotal);
		
		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Yoghurt\tRs.50.00\tQty-");
		Double Yoghurt=input.nextDouble();
		Double YoghurtTotal=Yoghurt * 50;
		System.out.println("Yoghurt Total =Rs. "+YoghurtTotal);

		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Flour\tRs.120.00\tQty(Kg)-");
		Double Flour=input.nextDouble();
		Double FlourTotal=Flour * 120;
		System.out.println("Flour Total = Rs. " +FlourTotal);

		System.out.println("                                                                                                                                                                                            ");
		System.out.print("Soap\tRs.160.00\tQty-");
		Double Soap=input.nextDouble();
		Double SoapTotal=Soap * 160;
		System.out.println("Soap Total = Rs. "+SoapTotal);
		System.out.println("                                                                                                                                 ");
		System.out.println("+--------------------------------------------------------------------------------------------------+");
		System.out.println("|                  _   __  __          ____  ________                                              |");
		System.out.println("|                 (_) |  \\/  |   /\\   |  _  \\__   __|                                              | ");
		System.out.println("|                  _  | \\  / |  /  \\  | |_) |  | |                                                 |");
		System.out.println("|                 | | | |\\/| | / /\\ \\ |  _  /  | |                                                 |");
		System.out.println("|                 | | | |  | |/ ___  \\| | \\ \\  | |                                                 |");
		System.out.println("|                 |_| |_|  |_/_/   \\_ \\_|  \\ \\ |_|                                                 |");
		System.out.println("|                      225,Galle Road,Panadura                                                     |");
		System.out.println("|                                                                                                  |");
		System.out.println("+--------------------------------------------------------------------------------------------------+");
		System.out.printf("|                             # Tel : %s                                                            |\n", CustomerPhoneNumber);
		System.out.printf("|                             # Name : %s                                                           |\n", CustomerName);
		System.out.println("+--------------------------------------------------------------------------------------------------+");
		System.out.println("|                    |      Qty         |             Rs.          |          Price                |");
		System.out.println("+--------------------------------------------------------------------------------------------------+");
		System.out.printf("|#Basmathi           |      %s         |          %s             |          %s                |\n",Basmathi,250,BasmathiTotal);
		System.out.printf("|#Dhal               |      %s         |          %s             |          %s                |\n",Dhal,180,DhalTotal);
		System.out.printf("|#Sugar              |      %s         |          %s             |          %s                |\n",Sugar,150,SugarTotal);
		System.out.printf("|#Highland           |      %s         |          %s            |          %s               |\n",Highland,1200,HighlandTotal);
		System.out.printf("|#Yoghurt            |      %s         |          %s              |          %s                |\n",Yoghurt,50,YoghurtTotal);
		System.out.printf("|#Flour              |      %s         |          %s             |          %s                |\n",Flour,120,FlourTotal);
		System.out.printf("|#Soap               |      %s         |          %s             |          %s               |\n",Soap,160,SoapTotal);
		System.out.println("|                    |                  |                          |                               |");
		System.out.println("+--------------------+------------------+--------------------------+-------------------------------+");
		Double TotalBill=BasmathiTotal + DhalTotal +  SugarTotal + HighlandTotal + YoghurtTotal + FlourTotal + SoapTotal;
		System.out.println("|                                       | Total Bill               |          Rs. "+TotalBill);
		System.out.println("|                                       +-------------------------+--------------------------------+");
		Double Discount=TotalBill *10/100;
		System.out.println("|                                       |  Discount                |          Rs. "+Discount);
		System.out.println("|                                       +-------------------------+--------------------------------+");
		Double Price=TotalBill-Discount;
		System.out.println("|                                       |  Price                   |          Rs."+Price);
		System.out.println("+---------------------------------------+-------------------------+--------------------------------+");




	
		
	}              

}
