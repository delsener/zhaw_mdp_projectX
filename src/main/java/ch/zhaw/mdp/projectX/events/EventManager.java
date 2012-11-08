package ch.zhaw.mdp.projectX.events;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages events. Events are fired using the
 * {@link EventManager#fireEvent(String)} method. When this happens, all
 * registered IEventListener's are notified about the event.
 * 
 * @author delsener, rknecht
 * 
 */
public final class EventManager {

	/** Singleton instance. */
	private static EventManager instance;
	
	private List<EventListener> eventListeners = new ArrayList<EventListener>();

	public static EventManager instance() {
		if (instance == null) {
			instance = new EventManager();
		}
		return instance;
	}

	private EventManager() {
		// private constructor
	}

	public void fireEvent(String event) {
		for (EventListener eventListener : eventListeners) {
			eventListener.handleEvent(event);
		}
	}
	
	public void addEventListener(EventListener eventListener) {
		eventListeners.add(eventListener);
	}
	
	public void removeEventListener(EventListener eventListener) {
		eventListeners.remove(eventListener);
	}
}
