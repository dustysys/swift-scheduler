package capstone.gwttrial.client.calendar.service;

import capstone.gwttrial.client.calendar.CalendarDetails;
import capstone.gwttrial.client.calendar.EventDetails;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>CalendarService</code>.
 */
public interface CalendarServiceAsync {
	void getCalendarEvents(String un, AsyncCallback<CalendarDetails> callback)
			throws IllegalArgumentException;

	void addCalendarEvent(EventDetails event, AsyncCallback<Integer> callback)
			throws IllegalArgumentException;

	void removeCalendarEvent(EventDetails event, AsyncCallback<Boolean> callback)
			throws IllegalArgumentException;
}
