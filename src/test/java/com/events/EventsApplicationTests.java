package com.events;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.events.customevent.PublisherEvent;

@SpringBootTest
class EventsApplicationTests {

	Logger log = LoggerFactory.getLogger(EventsApplicationTests.class);
	
	@Autowired
	private PublisherEvent publisherEvent;
	
	@Test
	void sendingEventMessageTest() {
		log.info("Starting test...");
		publisherEvent.publishCustomEvent("Message: " + UUID.randomUUID());
		log.info("Event published...");
	}

}
