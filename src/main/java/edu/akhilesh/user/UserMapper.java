package edu.akhilesh.user;
import java.util.List;
import edu.akhilesh.domain.User;
public interface UserMapper {
	public void insertUser(User user);

	 public User getUserById(Integer userId);

	 public List<User> getAllUsers();

	 public void updateUser(User user);

	 public void deleteUser(Integer userId);

}
