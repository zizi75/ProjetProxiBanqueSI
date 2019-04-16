package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Client;

public class StockClientDAO implements ClientDAO {

	private static final Map<Integer, Client> DB = new HashMap<>();

	private static Integer Id = 0;

	@Override
	public void save(Client c) {
		// TODO Auto-generated method stub
		c.setId(Id);
		DB.put(c.getId(), c);
		Id++;
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return DB.get(id);
	}

	@Override
	public List<Client> findAllClient() {
		// TODO Auto-generated method stub
		return new ArrayList<>(DB.values());
	}

	@Override
	public void delete(Client c) {
		// TODO Auto-generated method stub

		DB.remove(c.getId());
	}

	@Override
	public String modify(Client c) {
		// TODO Auto-generated method stub
		
	}

	
////	@Override
//	public String modify(Client c) {
//		// TODO Auto-generated method stub
//	//	;
//	}


}
