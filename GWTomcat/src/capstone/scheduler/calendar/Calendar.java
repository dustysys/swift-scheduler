package capstone.scheduler.calendar;

import java.util.ArrayList;
import capstone.scheduler.calendar.Event;

public class Calendar {
	public ArrayList<Event> events;
	public String name;

	public Calendar(String name) {
		this.name = name;
		events = new ArrayList<Event>();
	}

	public void addEvent(Event newEvent) {
		events.add(newEvent);
	}

	public void deleteEvent(String eventName) {
		events.remove(getEventIdx(eventName));
	}

	public int getEventIdx(String eventName) {
		int index = 0;
		boolean found = false;

		for (Event e : events) {
			if (e.getName().equals(eventName)) {
				found = true;
				break;
			}
			index++;
		}

		if (!found) {
			System.out.println("Throw getEventIdx() error");
		}

		return index;
	}
}