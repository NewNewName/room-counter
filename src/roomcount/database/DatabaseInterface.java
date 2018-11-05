package roomcount.database;

import java.sql.Time;
import com.mongodb.*;

public class DatabaseInterface {

	private String DB_NAME = "";
	private MongoDatabase db;

	public DatabaseInterface(String url , int port){
		db = getConnection(url , port).getDatabase(DB_NAME);
	}

	private static MongoClient getConnection(url , port_num) {
        int port_num = 8080;
        String url = "localhost";
        
        MongoClient mongoClntObj = new MongoClient(url, port_num);
        return mongoClntObj;
	}
	
	public String getRoomName(){
		return "";
	}

	public int getRoomCapacity() {
		return 0;
	}

	public Time getTimeSlot() {
		return null;
	}

	public String getSessionName() {
		return "";
	}

	public int getSessionNumber() {
		return 0;
	}

	public String getSpeakerName() {
		return "";
	}

	public boolean setRoomName() {
		return false;
	}

	public boolean setRoomCapacity() {
		return false;
	}

	public boolean setTimeSlot() {
		return false;
	}

	public boolean setSessionName() {
		return false;
	}

	public boolean setSessionNumber() {
		return false;
	}

	public boolean setSpeakerName() {
		return false;
	}
}
