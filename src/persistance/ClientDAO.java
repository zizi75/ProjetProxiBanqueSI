package persistance;

import java.util.List;

import model.Client;

public interface ClientDAO {

	public void save(Client c);

	public Client findById(int id);

	public List<Client> findAllClient();

	public void delete(Client c);

	public String modify(Client c);
	
	
	

}
