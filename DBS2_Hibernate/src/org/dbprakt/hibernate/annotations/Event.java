package org.dbprakt.hibernate.annotations;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EVENTS
 */
// TODO
public class Event {

	// TODO
    private int eventId;
	
    // TODO
    private String eventTitle;
	
    // TODO
    private Date eventDate;
    
    // TODO
    private Set<Person> attendees;

    // TODO
    private Promoter promoter;
    
    /**
     * Hibernate ben�tigt einen Parameterlosen Konstruktor in jeder Klasse
     */
    public Event() {
    	attendees = new HashSet<Person>();
    }

    public Event(int eventId) {
    	attendees = new HashSet<Person>();
        this.eventId = eventId;
    }

    public Event(int eventId, String eventTitle, Date eventDate) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventDate = eventDate;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

	public Set<Person> getAttendees() {
		return attendees;
	}

	public void setAttendees(Set<Person> attendees) {
		this.attendees = attendees;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Person p : attendees) {
			sb.append(p + " ");
		}
		return "Event [" + eventId + ", " + eventTitle
				+ ", " + eventDate + ", " + sb + "]";
	}

	public Promoter getPromoter() {
		return promoter;
	}

	public void setPromoter(Promoter promoter) {
		this.promoter = promoter;
	}
	
	
}