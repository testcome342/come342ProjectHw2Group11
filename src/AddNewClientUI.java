public class AddNewClientUI {
	
	AddNewClientControl clientControl =new AddNewClientControl();
	
	public void startInterfaceUI() {
		clientControl.getClientControl();
	}
	public void createNewClientUI() {
		
		
		clientControl.createNewClientControl();
		
	}
	public void createNewCampaignUI(String title,String campaignStartDate,String campaignFinishDate,double estimatedCost) {
		clientControl.createNewCampaignControl(title, campaignStartDate, campaignFinishDate, estimatedCost);
	}	
}
