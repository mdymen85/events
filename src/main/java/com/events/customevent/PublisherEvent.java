package com.events.customevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PublisherEvent {

	private Logger log = LoggerFactory.getLogger(PublisherEvent.class);
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void publishCustomEvent(final String message) {
		log.info("Publishing event {}", message); 
		CustomEvent customEvent = new CustomEvent(this, message);
		applicationEventPublisher.publishEvent(customEvent);
	}
	
}
