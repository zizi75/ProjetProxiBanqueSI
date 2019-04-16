package service;

import java.util.List;

import model.Client;

public interface ServiceClient {

	public void addClient(Client c);

	public Client findClientId(int id);

	public List<Client> getAllClient();

	public void delateClient(Client c);
	
	public String modifyClient (Client c);
}
