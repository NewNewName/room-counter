package roomcount.database;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Database_Init_Interface extends DatabaseInterface {
	// private MongoDatabase _db = getConnection().getDatabase(database_name);

	private String DB_NAME = "";
	private MongoDatabase db;

	public Database_Init_Interface(String url , int port) {
		super(url , port);
	}

	public boolean pushSessionDocument(String sessionName, String id, String speaker, String roomId,
			String timeSlotId) {

		MongoCollection<Document> sessionColl = db.getCollection("Session");

		// check and convert ints

		if (!isNewRoom(id, sessionColl)) {
			return false;
		}

		Document newSessionDoc = new Document("sessionID", id).append("sessionName", sessionName)
				.append("speakerName", speaker).append("roomId", roomId).append("timeSlotId", timeSlotId);

		sessionColl.insertOne(newSessionDoc);

		return true;
	}

	public boolean pushRoomDocument(String roomName, String id, String capacity) {

		MongoCollection<Document> roomColl = db.getCollection("Room");

		// check and convert ints

		if (!isNewRoom(roomName, roomColl)) {
			return false;
		}

		Document newRoomDoc = new Document("roomID", id).append("roomName", roomName).append("capacity", capacity);

		roomColl.insertOne(newRoomDoc);

		return true;
	}

	public boolean pushTimeslotDocument(String id, String startTime, String endTime) {

		MongoCollection<Document> timeSlotColl = db.getCollection("TimeSlot");

		// check and convert to epoch

		if (!isNewTimeSlot(startTime_int, endTime_int, timeSlotColl)) {
			return false;
		}

		Document newTimeSlotDoc = new Document("timeSlotId", id).append("startTime", startTime).append("capacity",
				endTime);

		roomColl.insertOne(newTimeSlotDoc);

		return true;
	}

	private boolean isNewSession(String roomName, MongoCollection<Document> col) {
		FindIterable<Document> cursor = col.find(eq("roomName", roomName));
		for (Document doc : cursor) {
			return false;
		}
		return true;
	}

	private boolean isNewTimeSlot(int startTime, int endTime, MongoCollection<Document> col) {
		FindIterable<Document> cursor = col.find(and(eq("startTime", startTime), eq("endTime", endTime)));
		for (Document doc : cursor) {
			return false;
		}
		return true;
	}

	private boolean isNewRoom(String sessionID, MongoCollection<Document> col) {
		FindIterable<Document> cursor = col.find(eq("sessionID", sessionID));
		for (Document doc : cursor) {
			return false;
		}
		return true;
	}
}
