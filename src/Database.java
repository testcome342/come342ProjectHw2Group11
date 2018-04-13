import java.util.ArrayList;

public class Database {
	ArrayList<Client> dataClient=new ArrayList<Client>();
	
	public Database() {
		dataClient.add(new Client("Appcent","Acıbadem","appcent@appcent.mobi","Arda Altunyay","arda.altunyay@appcent.mobi"));
		dataClient.add(new Client("Vizyoneks","Ataşehir","vizyoneks@gmail.com","Hasan Arınç","hasanarinc@gmail.com"));
		dataClient.add(new Client("HasKaPP","Kadıköy","haskapp@gmail.com","Kaan Kün","kaanforum4@gmail.com"));
		dataClient.add(new Client("Şimşek Holding","Levent","simsekholding@gmail.com","Aslı Şimşek","aslisimsek@gmail.com"));
		dataClient.add(new Client("DOIS","Bağcılar","dois@gmail.com","Doğacan Oymak","dogacanoymak@gmail.com"));
		dataClient.add(new Client("Jele","Kadıköy","jele@gmail.com","Hakan Abi","hakanabi@gmail.com"));

	}

	public ArrayList<Client> getList() {
	       return dataClient;
	}
}
