package roomcount.database;

import com.mongo.*;
import java.sql.Time;

public class Database_Init_Interface extends DatabaseInterface{
    //private MongoDatabase _db = getConnection().getDatabase(database_name);
	//private MongoCollection _col = db.getCollection(database_collection);
	
	private String DB_NAME = "";
	private MongoDatabase db;
	
	public InitDatabaseInterface(String url , int port) {
		super(url , port);
	}
	
	public boolean pushSessionDocument(String sessionName , int id , String speaker , int roomId , int timeSlotId) {
		MongoCollection<Document> sessionColl = db.getCollection("session");
        Document newSessionDoc = new Document("sessionID" , id).append(
				"sessionName" , sessionName
			).append(
				"speakerName" , speaker
			).append(
				"roomId" , roomId
			).append(
				"timeSlotId" , timeSlotId
			);
		sessionColl.insertOne(newSessionDoc);
		
		//TODO: Check if it actually worked
		return true;
	}
	
	public boolean pushRoomDocument(String roomName , int id , int capacity) {
		
		MongoCollection<Document> roomColl = db.getCollection("room");
        Document newRoomDoc = new Document("roomID" , id).append(
				"roomName" , roomName
			).append(
				"capacity" , capacity
			);
		roomColl.insertOne(newRoomDoc);
		
		//TODO: Check if it actually worked
		return true;
	}
	
	public boolean pushTimeslotDocument(int id , Time startTime , Time endTime) {
		
		MongoCollection<Document> timeSlotColl = db.getCollection("timeslot");
        Document newTimeSlotDoc = new Document("timeSlotId" , id).append(
				"startTime" , startTime
			).append(
				"capacity" , endTime
			);
		roomColl.insertOne(newTimeSlotDoc);
		
		//TODO: Check if it actually worked
		return true;
	}
	
	
	private boolean isNewSession() {
        FindIterable<Document> cursor = col.find(whereQuery);
        for(Document doc : cursor){
            //Session has already been created
            newSession = false;
        }
	}

}
