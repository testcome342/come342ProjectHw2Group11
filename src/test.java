import java.util.Scanner;

public class test{
	static AddNewClientUI clientUI=new AddNewClientUI();
	public static void main(String[] args) {
		//String clientName,clientAddress,clientEmail,contactName,contactEmail;
		int selectType;
		
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Transaction Type \n 1 => Create New Client \n 2 => Create New Campaign");
			System.out.print("Select a type of Transaction..:");
			selectType=scan.nextInt();
			
			if(selectType ==1){
				System.out.println("Client List");
				System.out.println("__________________");
				clientUI.startInterfaceUI(1);
				System.out.println("__________________");
				//System.out.println(".......Create New Client......\n .......Client Information......");
				clientUI.createNewClientUI();
				
				clientUI.startInterfaceUI(1);
			}else if(selectType==2) {
				//System.out.println("......Create New Campaign...... \n .......Campaign Information......");
				clientUI.startInterfaceUI(2);
				clientUI.createNewCampaignUI();
				clientUI.startInterfaceUI(2);				
		}
	}	
}
