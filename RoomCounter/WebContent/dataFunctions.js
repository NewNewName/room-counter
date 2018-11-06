function deleteTimeSlot() {
	var selected = $("#timeSlotSelect").children("option:selected");
	selected.remove();
	// communicate to db that entry needs to be removed
}

function deleteRoom() {
	// todo
	// communicate to db that entry needs to be removed
}

function deleteSession() {
	// todo
	// communicate to db that entry needs to be removed
}

function modifyTimeSlot() { // called by modify button
	var selected = $("#timeSlotSelect").children("option:selected").text()
	.split("-");
	var start = $("input[name='start']");
	start.val(selected[0]);
	var start = $("input[name='end']");
	start.val(selected[1]);
	// communicate to db the changes that occur
}

function modifyRoom() { // called by modify button
	// todo
	// communicate to db the changes that occur
}

function modifySession() { // called by modify button
	// todo
	// communicate to db the changes that occur
}

function displayTimeSlots(json) {
	var obj = JSON.parse(json);

	var output = '<select id="timeSlotSelect" class="dynam-select">';
	var count = 0;
	for ( var i in obj.timeslot) {
		output += '<option value=' + obj.timeslot[count].id + '>'
		+ obj.timeslot[count].start + '-' + obj.timeslot[count].end
		+ '</option>';
		count++;
	}
	output += "</select>";

	$('#curTimeSlots').append(output);
}

function displayRooms(json) {
	var obj = JSON.parse(json);

	var output = '<select id="roomSelect" class="dynam-select">';
	var count = 0;
	for ( var i in obj.room) {
		output += '<option value=' + obj.room[count].id + '>Roomname:'
		+ obj.room[count].roomname + ' Capacity:' + obj.room[count].capacity
		+ '</option>';
		count++;
	}
	output += "</select>";

	$('#curRooms').append(output);
}

function displaySessions(json) {
	var obj = JSON.parse(json);

	var output = '<select id="sessionSelect" class="dynam-select" multiple>';
	var count = 0;
	for ( var i in obj.session) {
		output += '<option value=' + obj.session[count].id + '>Session Name:'
		+ obj.session[count].name + ' Session Number:' + obj.session[count].number
		+ ' Speaker:' + obj.session[count].speaker + ' Date:' + obj.session[count].date
		+ ' Time Slot:' + obj.session[count].timeslot + ' Room:' + obj.session[count].room
		+ '</option>';
		count++;
	}
	output += "</select>";

	$('#curSessions').append(output);
}

function createTimeSlotDropdown() {
	// todo
}
function createRoomDropdown() {
	// todo
}

$(document).ready(
		function() {

			// connection to db needs to happen to get data for display
			// we need to
			// 1. put timeslots and rooms into the options menu of session
			// 2. populate the modification containers (as I have done for time
			// slot) (needs to be done for session and room)
			var text = '{ "timeslot" : ['
				+ '{ "id":"1" ,"start":"12:00" , "end":"14:00" },'
				+ '{ "id":"2" ,"start":"9:00" , "end":"12:00" },'
				+ '{ "id":"3" ,"start":"10:00" , "end":"12:00" },'
				+ '{ "id":"4" ,"start":"9:00" , "end":"12:00" },'
				+ '{ "id":"5" ,"start":"13:00" , "end":"12:00" },'
				+ '{ "id":"6" ,"start":"9:00" , "end":"19:00" },'
				+ '{ "id":"7" ,"start":"19:00" , "end":"12:00" },'
				+ '{ "id":"8" ,"start":"17:00" , "end":"12:00" },'
				+ '{ "id":"9" ,"start":"9:00" , "end":"18:00" },'
				+ '{ "id":"12" ,"start":"10:00" , "end":"12:00" },'
				+ '{ "id":"11" ,"start":"9:00" , "end":"12:00" },'
				+ '{ "id":"13" ,"start":"12:00" , "end":"16:00" },'
				+ '{ "id":"14" ,"start":"9:00" , "end":"12:00" },'
				+ '{ "id":"10" ,"start":"14:00" , "end":"15:00" } ]}';

			var text2 = '{ "room" : ['
				+ '{ "id":"1" ,"roomname":"A" , "capacity":"14" },'
				+ '{ "id":"2" ,"roomname":"B" , "capacity":"12" },'
				+ '{ "id":"3" ,"roomname":"C" , "capacity":"12" },'
				+ '{ "id":"4" ,"roomname":"D" , "capacity":"12" },'
				+ '{ "id":"5" ,"roomname":"E" , "capacity":"12" },'
				+ '{ "id":"6" ,"roomname":"F" , "capacity":"19" },'
				+ '{ "id":"7" ,"roomname":"G" , "capacity":"12" },'
				+ '{ "id":"8" ,"roomname":"H" , "capacity":"12" },'
				+ '{ "id":"9" ,"roomname":"I" , "capacity":"18" },'
				+ '{ "id":"12" ,"roomname":"J" , "capacity":"12" },'
				+ '{ "id":"11" ,"roomname":"K" , "capacity":"12" },'
				+ '{ "id":"13" ,"roomname":"L" , "capacity":"16" },'
				+ '{ "id":"14" ,"roomname":"M" , "capacity":"12" },'
				+ '{ "id":"10" ,"roomname":"N" , "capacity":"15" } ]}';

			displayTimeSlots(text);
			displayRooms(text2);
			// displaySessions(jsondata);

		});
