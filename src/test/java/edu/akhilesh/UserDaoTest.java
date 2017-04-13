package edu.akhilesh;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.junit.*;
import edu.akhilesh.domain.User;
import edu.akhilesh.service.UserDAO;
import junit.framework.Assert;

public class UserDaoTest {

	private static UserDAO userService;

	@Before
	public void setup() {
		userService = new UserDAO();
	}

	@After
	public void teardown() {
		userService = null;
	}

	@Test
	public void testGetUserById() {

		Integer userId = 100;
		User expectedResult = new User();
		expectedResult.setUserId(100);
		try {
			User actResult = userService.getUserById(userId);
			System.out.println(actResult.toString());
			Assert.assertEquals(expectedResult.getUserId(), actResult.getUserId());
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			Assert.fail("Error process for getting user");
		}

		/*
		 * User user = userService.getUserById(100); Assert.assertNotNull(user);
		 * System.out.println(user);
		 */
	}

	/*
	 * @Test() public void testGetAllUsers() { List<User> users =
	 * userService.getAllUsers(); Assert.assertNotNull(users); for (User user :
	 * users) { System.out.println(user); }
	 * 
	 * }
	 * 
	 * @Test public void testInsertUser() { User user = new User();
	 * user.setEmailId("test_email_" + System.currentTimeMillis() +
	 * "@gmail.com"); user.setPassword("secret");
	 * user.setFirstName("TestFirstName"); user.setLastName("TestLastName");
	 * 
	 * userService.insertUser(user); Assert.assertTrue(user.getUserId() != 0);
	 * User createdUser = userService.getUserById(user.getUserId());
	 * Assert.assertNotNull(createdUser); Assert.assertEquals(user.getEmailId(),
	 * createdUser.getEmailId()); Assert.assertEquals(user.getPassword(),
	 * createdUser.getPassword()); Assert.assertEquals(user.getFirstName(),
	 * createdUser.getFirstName()); Assert.assertEquals(user.getLastName(),
	 * createdUser.getLastName());
	 * 
	 * }
	 * 
	 * @Test public void testUpdateUser() { long timestamp =
	 * System.currentTimeMillis(); User user = userService.getUserById(2);
	 * user.setFirstName("TestFirstName" + timestamp);
	 * user.setLastName("TestLastName" + timestamp);
	 * userService.updateUser(user); User updatedUser =
	 * userService.getUserById(2); Assert.assertEquals(user.getFirstName(),
	 * updatedUser.getFirstName()); Assert.assertEquals(user.getLastName(),
	 * updatedUser.getLastName()); }
	 * 
	 * @Test public void testDeleteUser() { User user =
	 * userService.getUserById(4); userService.deleteUser(user.getUserId());
	 * User deletedUser = userService.getUserById(4);
	 * Assert.assertNull(deletedUser);
	 * 
	 * }
	 */
}
