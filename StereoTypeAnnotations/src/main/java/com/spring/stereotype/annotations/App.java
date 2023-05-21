package com.spring.stereotype.annotations;
import com.user.controller.UserController;
import com.user.model.User;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserController controller = new UserController();
    	User user = new User();
    	user.setEmail("varun@gmail.com");
    	user.setName("Varun");
    	user.setPassword("Varun123");
    	controller.addUser(user);
    }
}
