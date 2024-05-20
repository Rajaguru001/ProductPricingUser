package productpricingjdpc;

import java.sql.SQLException;

public interface UserDAO {
	void Register (User1 u) throws ClassNotFoundException, SQLException;
	User1 login(User1 u) throws ClassNotFoundException, SQLException;
}
