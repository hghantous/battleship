
/**
 * Fake Player Class
 */
public class Player{

    String username,password;
	static String currentUser,currentOpponent;
    public Player(){
    	username = null;
    	password = null;
    }
       

    public Player(String user, String pass){
        username = user;
        password = pass;
    }

    public void setUser(String user){
        this.username = user;
    }
    public static void setCurrentUser(String cuser){
    	Player.currentUser = cuser;
    }
    public static String getCurrentUser(){
    	return currentUser;
    }
    
    public static void setCurrentOpponent(String copp){
    	Player.currentOpponent = copp;
    }
    public static String getCurrentOpponent(){
    	return currentOpponent;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public String getUser()
    {
        return username;
    }
    
    public String getPass(){
        return password;
    }
    
    
    
    	 public String toString() {
    	        return ("Username: "+this.getUser()+
    	                    "; Password: "+ this.getPass()) + "\n";
    	   }    }

