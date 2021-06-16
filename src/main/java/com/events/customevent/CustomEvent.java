package com.events.customevent;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {

	private String message;
	
	public CustomEvent(Object source, String message) {
		super(source);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}

}
