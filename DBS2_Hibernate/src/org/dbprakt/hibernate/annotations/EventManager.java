package org.dbprakt.hibernate.annotations;

import java.util.*;

/**
 * EventManager
 */
public class EventManager {
    /**
     * main
     * @param args 
     */
    public static void main(String[] args) {
    	EventManager mgr = new EventManager();
    	
    	Promoter promter = new Promoter();
    	promter.setAge(26);
    	promter.setName("Promoter 1");
    	promter.setSkills("Moderieren");
    	
    	ArrayList<Person> p = new ArrayList<Person>();
    	p.add(new Person("Person 1", 19));
        p.add(new Person("Person 2", 20));
    	
    	//mgr.changeEventName(...);
    	//List<Event> events = mgr.listEvents(...);
    	// TODO liste ausgeben
    	//mgr.changeEventName(...);
    	
    	System.exit( 0 );
    }

    /**
     * Aufgabe 2)
     * Erstellt einen neuen Event und speichert diesen in der Datenbank.
     * 
     * @param title Der Name des Events
     * @param date Der Zeitpunkt des Events
     * @param attendees
     */
    private void createAndStoreEvent(String title, Date date, List<Person> attendees, Promoter promoter) {
    	throw new UnsupportedOperationException("Not supported yet.");
    }
     
    /**
     * Aufgabe 3) Gibt eine Liste aller in der Datenbank gespeicherten Events zurück.
     * 
     * @return {@Code List<Events>} Eine Liste aller gespeicherten Events
     */
    private List<Event> listEvents() {
    	throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Aufgabe 4) Ändert den Namen eines Events.
     * 
     * @param eventId Die id des zu ändernden Events
     * @param name Der neue Name des zu ändernden Events
     */
    private void changeEventName (Integer eventId, String name) {
    	throw new UnsupportedOperationException("Not supported yet.");
    }
    
}