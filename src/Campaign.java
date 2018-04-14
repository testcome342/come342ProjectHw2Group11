import java.util.Scanner;

public class Campaign {
private String title;
private String campaignStartDate;
private String campaignFinishDate;
private double estimatedCost;
Database database=new Database();


public Campaign() {
	super();
}


public Campaign(String title, String campaignStartDate, String campaignFinishDate, double estimatedCost) {
	super();
	this.title = title;
	this.campaignStartDate = campaignStartDate;
	this.campaignFinishDate = campaignFinishDate;
	this.estimatedCost = estimatedCost;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getCampaignStartDate() {
	return campaignStartDate;
}


public void setCampaignStartDate(String campaignStartDate) {
	this.campaignStartDate = campaignStartDate;
}


public String getCampaignFinishDate() {
	return campaignFinishDate;
}


public void setCampaignFinishDate(String campaignFinishDate) {
	this.campaignFinishDate = campaignFinishDate;
}


public double getEstimatedCost() {
	return estimatedCost;
}


public void setEstimatedCost(double estimatedCost) {
	this.estimatedCost = estimatedCost;
}


public void createCampaign() {
	Campaign campaign=new Campaign();
	

	Scanner scan=new Scanner(System.in);
	System.out.print("Campaign Title.:");
	campaign.setTitle(scan.nextLine());
	
	System.out.print("Campaign Start Date..:");
	campaign.setCampaignStartDate(scan.nextLine());
	
	System.out.print("Campaign Finish Date..:");
	campaign.setCampaignFinishDate(scan.nextLine());
	
	System.out.print("Estimated Cost..:");
	campaign.setEstimatedCost(scan.nextDouble());
	
	database.dataCampaign.add(new Campaign(campaign.getTitle(),campaign.getCampaignStartDate(),campaign.getCampaignFinishDate(),campaign.getEstimatedCost()));
	
	System.out.println("Saved Successfull");
	
	

}
public void getCampaign() {
	Database databaseCampaign=new Database("cc");
	for(int i=0;i<databaseCampaign.dataCampaign.size();i++) {
		if(i<=databaseCampaign.dataCampaign.size()) {
			System.out.println(databaseCampaign.dataCampaign.get(i).getTitle());
		}else if(i>databaseCampaign.dataCampaign.size())
		{
			break;
		}
	}
}
	
	
}


