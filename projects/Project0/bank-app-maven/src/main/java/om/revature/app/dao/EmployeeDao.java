package om.revature.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;
import com.revature.bankapp.model.Transacation;

public interface EmployeeDao {
List<Model> viewCustomer() throws SQLException;
	
	List<CreateAccout> viewAccount() throws SQLException;
	
	List<Transacation> viewTransaction() throws SQLException;

}
