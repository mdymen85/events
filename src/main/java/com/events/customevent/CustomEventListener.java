package com.events.customevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	Logger log = LoggerFactory.getLogger(CustomEventListener.class);
	
	@Override
	public void onApplicationEvent(CustomEvent event) {
		log.info("Event handled {}", event);
		log.info("Event timestamp: {}", event.getTimestamp());
		log.info("Event message: {}", event.getMessage());
		
	}

}
