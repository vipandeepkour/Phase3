package com.simplilearn.Listeners;

//import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventListener implements ApplicationListener<ContextStartedEvent> {
public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Start Event Listener executed");
		
	}

}
