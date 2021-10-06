package om.revature.app.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;

public interface AccountDao {
	
 void create(CreateAccout model) throws SQLException;
	public List<CreateAccout> showAccounts() throws SQLException;











}

