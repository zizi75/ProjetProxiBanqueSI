package service;

import java.util.List;

import model.Client;
import persistance.ClientDAO;
import persistance.StockClientDAO;

public class ServiceImplementation implements ServiceClient {

	private ClientDAO dao = new StockClientDAO();

	@Override
	public void addClient(Client c) {
		// TODO Auto-generated method stub

		if (c != null) {
			dao.save(c);
		}
	}

	@Override
	public Client findClientId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return dao.findAllClient();
	}

	@Override
	public void delateClient(Client c) {
		// TODO Auto-generated method stub
		dao.delete(c);
	}

	@Override
	public String modifyClient(Client c) {
		// TODO Auto-generated method stub
		return 
	}

	
	
}
