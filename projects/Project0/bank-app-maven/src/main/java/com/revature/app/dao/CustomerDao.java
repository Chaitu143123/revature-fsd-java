package om.revature.app.dao;

import java.sql.SQLException;

import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;



public interface CustomerDao {
	void create(Model model)throws SQLException;
	Model getCustomerByEmail(String email);


}
