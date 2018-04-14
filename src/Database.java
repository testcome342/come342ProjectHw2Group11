import java.util.ArrayList;

public class Database {
	ArrayList<Client> dataClient=new ArrayList<Client>();
	ArrayList<Campaign> dataCampaign=new ArrayList<Campaign>();

	
	public Database() {
		dataClient.add(new Client("Appcent","AcÄ±badem","appcent@appcent.mobi","Arda Altunyay","arda.altunyay@appcent.mobi",dataCampaign));
		dataClient.add(new Client("Vizyoneks","AtaÅŸehir","vizyoneks@gmail.com","Hasan ArÄ±nÃ§","hasanarinc@gmail.com",dataCampaign));
		dataClient.add(new Client("HasKaPP","KadÄ±kÃ¶y","haskapp@gmail.com","Kaan KÃ¼n","kaanforum4@gmail.com",dataCampaign));
		dataClient.add(new Client("Å�imÅŸek Holding","Levent","simsekholding@gmail.com","AslÄ± Å�imÅŸek","aslisimsek@gmail.com",dataCampaign));
		dataClient.add(new Client("DOIS","BaÄŸcÄ±lar","dois@gmail.com","DoÄŸacan Oymak","dogacanoymak@gmail.com",dataCampaign));
		dataClient.add(new Client("Jele","KadÄ±kÃ¶y","jele@gmail.com","Hakan Abi","hakanabi@gmail.com",dataCampaign));
		

	}
	public  Database(String campaign) {
		dataCampaign.add(new Campaign("Yellow Friday","01/01/2018","01/06/2018",128.50));
		dataCampaign.add(new Campaign("Black Friday","20/10/2018","24/10/2018",85.0));
		dataCampaign.add(new Campaign("New Year","30/12/2017","01/01/2018",100.0));
		dataCampaign.add(new Campaign("Valentine's Day","14/02/2018","15/02/2018",15.75));
	}

	public ArrayList<Client> getList() {
	       return dataClient;
	}
}
