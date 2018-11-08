package roomcount.database;

public class Database_Init_Interface {
	
	//Database Objects
    private MongoDatabase _db;
    private MongoCollection _sessions;
    private MongoCollection _rooms;
    private MongoCollection _timeSlots;
	
	//Session Fields
	private String _sessionName;
	private int _sessionNumber;
	private String _speaker;
	private int _roomCount1;
	private int _roomCount2;
	private int _roomCount3;
	
	//Room Fields
	private String _roomName;
	private int _capacity;
	
	//Timeslot Fields
	private Date _date;
	private String _startTime;
	private String _endTime;
	
	public void initInterface() {
		_db = getConnection().getDatabase(database_name);
		_sessions = db.getCollection("Sessions");
		_rooms = db.getCollection("Rooms");
		_timeSlots = db.getCollection("TimeSlots");
	}	
    private static MongoClient getConnection() {
        int port_num = 8080;
        String url = "localhost";
        return new MongoClient(url, port_num);
    }
    
	//Needs Validation
	public boolean pushSessionDocument(String sessionName, String sessionNumber, String speaker, String roomCount1, String roomCount2, String roomCount3) {
		
		//Validation Check
		
		List<BasicDBObject> sessionDoc = new ArrayList<BasicDBObject>();
		sesh.add(new BasicDBObject("sessionName", _sessionName));
		sesh.add(new BasicDBObject("sessionID", _sessionNumber));
		sesh.add(new BasicDBObject("speakerName", _speaker));
		sesh.add(new BasicDBObject("speakerName", _roomCount1));
		sesh.add(new BasicDBObject("speakerName", _roomCount2));
		sesh.add(new BasicDBObject("speakerName", _roomCount3));	
		
	    if (isNewSession()){
	    	
	    	//Send to database
	    	
	    	return true;
		}
	    
		return false;
	}
	
	//Needs Validation
	public boolean pushRoomDocument(String roomName, String roomCapacity) {
		
		//Validation Check
		
		List<BasicDBObject> roomDoc = new ArrayList<BasicDBObject>();
		roomDoc.add(new BasicDBObject("_roomName", roomName));
		roomDoc.add(new BasicDBObject("_capacity", roomCapacity));
		
	    if (isNewRoom()){
	    	
	    	//Send to database
	    	
	    	return true;
		}
	    
		return false;
	}	
	
	//Needs Validation
	public boolean pushTimeslotDocument(String startTime, String endTime, String date) {
		
		//Validation Check
		
		List<BasicDBObject> timeSlotDoc = new ArrayList<BasicDBObject>();
		timeSlotDoc.add(new BasicDBObject("_date", startTime));
		timeSlotDoc.add(new BasicDBObject("_startTime", endTime));
		timeSlotDoc.add(new BasicDBObject("_endTime", date));
		
	    if (isNewSession()){
	    	
	    	//Send to database
	    	
	    	return true;
		}
	    
		return false;
	}
	
	//Needs to be completed
	private boolean isNewSession() {
        FindIterable<Document> cursor = col.find(whereQuery);
        for(Document doc : cursor){
            //Session has already been created
        }
	}
	
	//Needs to be completed
	private boolean isNewRoom() {
        FindIterable<Document> cursor = col.find(whereQuery);
        for(Document doc : cursor){
            //Session has already been created
        }
	}
	
	//Needs to be completed
	private boolean isNewTimeSlot() {
        FindIterable<Document> cursor = col.find(whereQuery);
        for(Document doc : cursor){
            //Session has already been created
        }
	}
}
