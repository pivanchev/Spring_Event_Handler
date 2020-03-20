package com.pivanchev;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		
		System.out.println("ContextStoppedEvent Received.");
		
	}

	
	
}
