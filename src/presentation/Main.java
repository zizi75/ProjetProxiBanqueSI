package presentation;

import model.Client;
import service.ServiceClient;
import service.ServiceImplementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClient sc = new ServiceImplementation();

		Client c1 = null;
		Client c2 = new Client("Boussaa", "Zineb", "0611223345");
		Client c3 = new Client("Boucheffa", "Zineb", "0611252646");
		Client c4 = new Client("Abc", "Def", "0650234587");
		Client c5 = new Client("Gjkdcgksjdg", "Dehcuysgdjhgi", "0650255204");

		sc.addClient(c1);
		sc.addClient(c2);
		sc.addClient(c3);
		sc.addClient(c4);
		sc.addClient(c5);

//		System.out.println(sc.getAllClient());

//		Client client = sc.findClientId(2);
//		System.out.println(client);

		sc.delateClient(c2);
		System.out.println(sc.getAllClient());
	}

}
