package org.dbprakt.hibernate.annotations;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
    	
    	mgr.changeEventName(1,"Das Event");
    	List<Event> events = mgr.listEvents();
    	for (Event event : events) {
			System.out.println(event);
		}
    	mgr.changeEventName(1,"foobar Event");
    	
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
    	Event event = new Event();
    	event.setEventTitle(title);
    	event.setAttendees(new HashSet<Person>(attendees));
    	event.setEventDate(date);
    	event.setPromoter(promoter);
    	
    	SessionFactory factory = HibernateUtil.getSessionFactory();
    	Session session = factory.openSession();
    	session.save(event);
    	session.getTransaction().commit();
    	session.close();
    	
    }
     
    /**
     * Aufgabe 3) Gibt eine Liste aller in der Datenbank gespeicherten Events zurück.
     * 
     * @return {@Code List<Events>} Eine Liste aller gespeicherten Events
     */
    private List<Event> listEvents() {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
    	Session session = factory.openSession();
    	Query query = session.createQuery("from Event");
    	List<Event> list =  query.list();
    	session.close();
    	return list;
    }
    
    /**
     * Aufgabe 4) Ändert den Namen eines Events.
     * 
     * @param eventId Die id des zu ändernden Events
     * @param name Der neue Name des zu ändernden Events
     */
    private void changeEventName (Integer eventId, String name) {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
    	Session session = factory.openSession();
    	Query query = session.createQuery("from Event");
    	List<Event> list =  query.list();
    	for (Event event : list) {
    		if(event.getEventId()==eventId){
    			event.setEventTitle(name);
    			session.update(event);
    		}
			
		}
    	session.getTransaction().commit();
    	session.close();
    }
    
}