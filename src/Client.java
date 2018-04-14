import java.util.ArrayList;
import java.util.Scanner;


public class Client {
	private String companyName;
	private String companyAddress;
	private String companyEmail;
	private String contactName;
	private String contactEmail;
	static Database database=new Database();
	private ArrayList<Campaign> clientCampaign=new ArrayList<Campaign>();
	static Client client=new Client();
	Scanner scan=new Scanner(System.in);
	int campaignNumber;
	
	public Client() {
		super();
	}
	
	
	public Client(String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail, ArrayList<Campaign> clientCampaign) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.clientCampaign = clientCampaign;
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


	public ArrayList<Campaign> getClientCampaign() {
		return clientCampaign;
	}


	public void setClientCampaign(ArrayList<Campaign> clientCampaign) {
		this.clientCampaign = clientCampaign;
	}


	public void createClient() {		
		
		System.out.print("Company Name..:");
		client.setCompanyName(scan.nextLine());
		
		System.out.print("Company Address..:");
		client.setCompanyAddress(scan.nextLine());
		
		System.out.print("Company Email..:");
		client.setCompanyEmail(scan.nextLine());
		
		System.out.print("Contact Name..:");
		client.setContactName(scan.nextLine());
		
		System.out.print("Contact Email..:");
		client.setContactEmail(scan.nextLine());
		
		database.dataClient.add(new Client(client.getCompanyName(),client.getCompanyAddress(),client.getCompanyName(),client.getContactName(),client.getContactEmail(), clientCampaign));
		
		System.out.println("Saved Successfull");
		
		
		client.addNewCampaign();
		
		client.clientInformation();
	}
	public void addNewCampaign() {
		Campaign campaign =new Campaign();
		Database databaseCampaign=new Database("cc");

		campaign.getCampaign();
		System.out.print("CAMPAIGN LIST");
		System.out.println("_________________");
		System.out.print("Select a Campaign for "+ client.getCompanyName()+"..:");
		
		campaignNumber=scan.nextInt();
		
		for(int i=0;i<databaseCampaign.dataCampaign.size();i++)
		{
			if(campaignNumber==i+1) {
				client.clientCampaign.add(new Campaign(databaseCampaign.dataCampaign.get(i).getTitle(),databaseCampaign.dataCampaign.get(i).getCampaignStartDate(),databaseCampaign.dataCampaign.get(i).getCampaignFinishDate(),databaseCampaign.dataCampaign.get(i).getEstimatedCost()));
				System.out.println("OMG OMG OMG OMG OMG");
			}
		}
		
	}
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
	public void clientInformation() {
		System.out.println("           Client Information");
		System.out.println("__________________________________________");
		System.out.println("Company Name..:"+client.companyName +"\n"+
		"Company Address..:"+client.companyAddress +"\n"+
		"Company Email..:"+client.companyEmail+ "\n"+
		"Contact Name..:"+client.contactName +"\n"+
		"Contact Email..:"+client.contactEmail+"\n");
		System.out.println("Campaign Title..:"+client.clientCampaign.get(0).getTitle()+"\n"+
		"Campaign Start Date"+client.clientCampaign.get(0).getCampaignStartDate()+"\n"+
		"Campaign Finish Date..:"+client.clientCampaign.get(0).getCampaignFinishDate()+"\n"+
		"Campaign Estimated Cost..:"+client.clientCampaign.get(0).getEstimatedCost()+"\n");
		
	}

}
