package day13;

public class Test {

	public static void main(String[] args) {
		
		User  user1 = new User("user1");
		User  user2 = new User("user2");
		User  user3 = new User("user3");
		
		user1.sendMessage(user2, "Hello user2! How are You?");
		user1.sendMessage(user2, "Do you understand JAVA?");
		
		user2.sendMessage(user1, "Hello, i'm fine  thank you");
		user2.sendMessage(user1, "No, i dont understand methods, constructors, objects etc.");
		user2.sendMessage(user1, "What about you?");
		
		user3.sendMessage(user1, "Hey user1, hello, im sorry i'm late");
		user3.sendMessage(user1, "I agree with you, JAVA is difficult.");
		user3.sendMessage(user1, "Actually it need more time to practice and theory");
		user3.sendMessage(user1, "I think,for the beginning, you need to undertand basics");
		
		user1.sendMessage(user3, "Oh man! This JAVA kills me");
		user1.sendMessage(user3, "But i cant stop to learn it");
		user1.sendMessage(user3, "Look, main thing is: Seek, and you shall find ");
		
		MessageDatabase.showDialog(user1, user3);

	}

}
