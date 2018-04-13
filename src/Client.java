import java.util.ArrayList;
import java.util.Scanner;


public class Client {
	private String companyName;
	private String companyAddress;
	private String companyEmail;
	private String contactName;
	private String contactEmail;
	static Database database=new Database();
	
	public Client() {
		super();
	}
	public Client(String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	public void createClient() {		
		Client client=new Client();
		Scanner scan=new Scanner(System.in);
		System.out.print("Company Name..:");
		client.setCompanyName(scan.nextLine());
		
		System.out.print("Company Address..:");
		client.setCompanyAddress(scan.nextLine());
		
		System.out.print("Company Email..:");
		client.setCompanyEmail(scan.nextLine());
		
		System.out.print("Contract Name..:");
		client.setContactName(scan.nextLine());
		
		System.out.print("Company Email..:");
		client.setContactEmail(scan.nextLine());
		
		System.out.println("Saved Successfull");
		
		database.dataClient.add(new Client(client.getCompanyName(),client.getCompanyAddress(),client.getCompanyName(),client.getContactName(),client.getContactEmail()));
		
		/*System.out.println("           Client Information");
		System.out.println("__________________________________________");
		System.out.println("Company Name..:"+client.companyName +"\n"+
		"Company Address..:"+client.companyAddress +"\n"+
		"Company Email..:"+client.companyEmail+ "\n"+
		"Contact Name..:"+client.contactName +"\n"+
		"Contact Email..:"+client.contactEmail+"\n");
		*/
		
	}
	/*public void addNewCampaign() {
		Campaign campaign =new Campaign();
		
		campaign.createCampaign("Yellow Friday","01/01/2018","01/06/2018",750.45);
	}*/
	public void getClient() {
		
		
		for(int i=0;i<database.dataClient.size();i++) {
			if(i<=database.dataClient.size()) {
				System.out.println(database.dataClient.get(i).getCompanyName());
			}else if(i>database.dataClient.size())
			{
				break;
			}
		}
	}

}
