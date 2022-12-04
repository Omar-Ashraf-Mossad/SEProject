import java.util.ArrayList;


public class UsersList {
		private ArrayList<User> list;
		
		private static UsersList mainobject;
		
		
		private UsersList(){
			list = new ArrayList<User>();
		}
		
		public static UsersList getInstance () {
			if (mainobject == null) { mainobject = new UsersList(); }
			return mainobject;
		}
		
		public boolean check_email(String email)
		{
			User user;
			for(int i=0;i<list.size();i++)
			{
				user = list.get(i);
				if(user.compare_email(email))
					return true;
			}
			return false;
		}
		
		public boolean check_name(String name)
		{
			User user;
			for(int i=0;i<list.size();i++)
			{
				user = list.get(i);
				if(user.compare_name(name))
					return true;
			}
			return false;
		}
		
		
		public void add_user(User u)
		{
			list.add(u);
		}
		
		public boolean check_exist(String email,String password)
		{
			User user;
			for(int i=0;i<list.size();i++)
			{
				user = list.get(i);
				if(user.compare_email(email)&&user.compare_password(password))
					return true;
			}
			return false;
		}
		
		public User get_user(String email)
		{
			User user = null;
			for(int i=0;i<list.size();i++)
			{
				user = list.get(i);
				if(user.compare_email(email))
					break;
			}
			return user;
		}
		
		public User get_userbyname(String name)
		{
			User user = null;
			for(int i=0;i<list.size();i++)
			{
				user = list.get(i);
				if(user.compare_name(name))
					break;
			}
			return user;
		}
		
}
