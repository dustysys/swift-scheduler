package capstone.gwttrial.client;

import capstone.gwttrial.client.calendar.Constants;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.logging.client.SimpleRemoteLogHandler;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTtrial implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final EventBus eventBus = new SimpleEventBus();
		AppController appViewer = new AppController(eventBus);
		Constants.logger.addHandler(new SimpleRemoteLogHandler());

		appViewer.go(RootPanel.get());
	}
}