public class AddNewClientControl {
	
	Client client=new Client();
	//Campaign campaign=new Campaign();
	public void createNewClientControl() {
		client.createClient();
	}
	public void createNewCampaignControl(String _title,String _campaignStartDate,String _campaignFinishDate,double _estimatedCost) {
		//campaign.createCampaign(_title,_campaignStartDate,_campaignFinishDate,_estimatedCost);
	}	
	public void getClientControl() {
		client.getClient();
	}
}
