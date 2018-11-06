
public class SendMock
{
	/*
	Time time1 = new Time("user1", "1200", "1300");
	Time time2 = new Time("user2", "1300", "1400");
	Time time3 = new Time("user3", "1400", "1500");
	Time time4 = new Time("user4", "1500", "1600");
	
	Room room1 = new Room("user1", "room1", 100);
	Room room2 = new Room("user2", "room2", 150);
	Room room3 = new Room("user3", "room3", 200);
	
	Session session1 = new Session("user1", "session1", "speaker1", 1);
	Session session2 = new Session("user2", "session2", "speaker2", 2);
	Session session3 = new Session("user3", "session3", "speaker3", 3);
	*/
	
	public static void main(String[] args)
	{
		Time time1 = new Time("user1", "1200", "1300");
		System.out.println(time1.getUser());
		time1.setStartTime("1230");
		time1.setEndTime("1330");
		System.out.println(time1.getStartTime() + ", " + time1.getEndTime());
		Room room1 = new Room("user1", "rainbowRoom", 123);
		System.out.println(room1.getUser() + " entered " + room1.getRoomName() + " has capacity: " + room1.getRoomCapacity());
	}
	
	public static class Time
	{
		private String user, startTime, endTime;
		
		public Time(String user, String startTime, String endTime)
		{
			this.user = user;
			this.startTime = startTime;
			this.endTime = endTime;
		}
		public String getUser()
		{
			return user;
		}
		public String getStartTime()
		{
			return startTime;
		}
		public String getEndTime()
		{
			return endTime;
		}
		
		public void setUser(String user)
		{
			this.user = user;
		}
		public void setStartTime(String startTime)
		{
			this.startTime = startTime;
		}
		public void setEndTime(String endTime)
		{
			this.endTime = endTime;
		}
	}
	public static class Room
	{
		private String user, roomName;
		private int roomCapacity;
		
		public Room(String user, String roomName, int roomCapacity)
		{
			this.user = user;
			this.roomName = roomName;
			this.roomCapacity = roomCapacity;
		}
		public String getUser()
		{
			return user;
		}
		public String getRoomName()
		{
			return roomName;
		}
		public int getRoomCapacity()
		{
			return roomCapacity;
		}
		
		public void setUser(String user)
		{
			this.user = user;
		}
		public void setRoomName(String roomName)
		{
			this.roomName = roomName;
		}
		public void setRoomCapacity(int roomCapacity)
		{
			this.roomCapacity = roomCapacity;
		}
	}
	public static class Session
	{
		private String user, sessionName, speaker;
		private int sessionNumber;
		
		public Session(String user, String sessionName, String speaker, int sessionNumber)
		{
			this.user = user;
			this.sessionName = sessionName;
			this.speaker = speaker;
			this.sessionNumber = sessionNumber;
		}
		public String getUser()
		{
			return user;
		}
		public String getSessionName()
		{
			return sessionName;
		}
		public String getSpeaker()
		{
			return speaker;
		}
		public int getSessionNumber()
		{
			return sessionNumber;
		}
		
		public void setUser(String user)
		{
			this.user = user;
		}
		public void setSessionName(String sessionName)
		{
			this.sessionName = sessionName;
		}
		public void setSpeaker(String speaker)
		{
			this.speaker = speaker;
		}
		public void setSessionNumber(int sessionNumber)
		{
			this.sessionNumber = sessionNumber;
		}
	}
	
}
