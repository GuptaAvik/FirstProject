

public interface userDao {
	public boolean signup(User user);
	public boolean signin(User user);
	public boolean update(User user);
	public boolean delete(String name,String password);
}
