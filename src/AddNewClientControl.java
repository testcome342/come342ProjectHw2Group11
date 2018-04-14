public class AddNewClientControl {
	
	Client client=new Client();
	Campaign campaign=new Campaign();
	public void createNewClientControl() {
		client.createClient();
	}
	public void createNewCampaignControl() {
		campaign.createCampaign();
	}	
	public void getClientControl(int selectType) {
		if(selectType==1) {
			client.getClient();
		}else if(selectType==2) {
			campaign.getCampaign();
		}
	}
}
