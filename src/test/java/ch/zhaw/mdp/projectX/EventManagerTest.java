package ch.zhaw.mdp.projectX;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.zhaw.mdp.projectX.events.EventListener;
import ch.zhaw.mdp.projectX.events.EventManager;

@RunWith(JMock.class)
public class EventManagerTest {

	// class under test
	private EventManager eventManager = EventManager.instance();

	private static Mockery mockery;

	@BeforeClass
	public static void setUp() {
		mockery = new JUnit4Mockery();
	}

	@Test
	public void testFireEvents() throws Exception {

		// mock an event listener
		final EventListener listener = mockery.mock(EventListener.class);

		// add to eventmanger
		eventManager.addEventListener(listener);

		mockery.checking(new Expectations() {
			{
				exactly(2).of(listener).handleEvent("event");
			}
		});

		// fire first event
		eventManager.fireEvent("event");

		// fire second event
		eventManager.fireEvent("event");

		// deregister listener and fire event again
		eventManager.removeEventListener(listener);
		eventManager.fireEvent("event");
	}

}
