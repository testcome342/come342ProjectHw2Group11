public class AddNewClientUI {
	
	AddNewClientControl clientControl =new AddNewClientControl();
	
	public void startInterfaceUI(int selectType) {
		if (selectType==1) {
			clientControl.getClientControl(1);

		}else if (selectType==2) {
			clientControl.getClientControl(2);

		}
	}
	public void createNewClientUI() {
		
		
		clientControl.createNewClientControl();
		
	}
	public void createNewCampaignUI() {
		clientControl.createNewCampaignControl();
	}	
}
