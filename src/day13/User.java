package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
	private List<User> subscriptions;
	
	public User(String username) {
		this.username = username;
		this.subscriptions = new ArrayList();
	}

	public String getUsername() {
		return username;
	}

	public List<User> getSubscriptions() {
		return subscriptions;
	}
	
	public void subscribe (User user) {
		this.subscriptions.add(user);
	}
	
	//подписывает пользователя на пользователя user
	//С помощью цикла надо пройтись по подпискам usera 
	public boolean isSubscribed (User user) {
		for(User activeUser:subscriptions) {
			if(activeUser.getUsername().equals(user.getUsername())) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isFriend (User user) {
		return  this.isSubscribed(user) && user.isSubscribed(this);
		
	}
	
	public void sendMessage (User user, String text) {
		//Здесь должен использоваться статик метож из MessaageDatabase 
		MessageDatabase.addMessage(this, user, text);
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
	
	
	
	
	
	
	
	

}
