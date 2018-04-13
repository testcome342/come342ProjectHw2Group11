import java.util.Scanner;

public class test{
	static AddNewClientUI clientUI=new AddNewClientUI();
	public static void main(String[] args) {
		//String clientName,clientAddress,clientEmail,contactName,contactEmail;
		String title,campaignStartDate,campaignFinishDate;
		double estimatedCost=0.0;
		int selectType;
		Database database=new Database();
		
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Transaction Type \n 1 => Create New Client \n 2 => Create New Campaign");
			System.out.print("Select a type of Transaction..:");
			selectType=scan.nextInt();
			
			if(selectType ==1){
				System.out.println("..Client List..");
				clientUI.startInterfaceUI();
				//System.out.println(".......Create New Client......\n .......Client Information......");
				clientUI.createNewClientUI();
				
				clientUI.startInterfaceUI();
			}else if(selectType==2) {
				System.out.println("......Create New Campaign...... \n .......Campaign Information......");
				System.out.print("Enter a Campaign Title..:");
				title=scan.nextLine();
				
				System.out.print("Enter a Campaign Start Date..:");
				campaignStartDate=scan.nextLine();		
				
				System.out.print("Enter a Campaign Finish Date..:");
				campaignFinishDate=scan.nextLine();
				
				System.out.print("Enter a Estimated Cost..:");
				estimatedCost=scan.nextDouble();
				clientUI.createNewCampaignUI(title, campaignStartDate, campaignFinishDate, estimatedCost);
				
		}
	}	
}
