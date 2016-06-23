package org.dbprakt.hibernate.annotations;

import javax.persistence.Entity;

/**
 * 
 * Mit der Annotation @Entity wird Hibernate angewiesen diese Klasse zu mappen.
 * Damit Hibernate die Klasse untersucht muss die Klasse in der hibernate.cfg.xml eingetragen werden.
 * Dies geschieht durch folgendes XML:
 * 		<mapping class="org.dbprakt.hibernate.annotations.Promoter"/>
 */
@Entity
public class Promoter extends Person {


	/**
	 * Diese Attribut wird von Hibernate gemapped, weitere Anweisungen an Hibernate sind dafür nicht nötig.
	 */
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	} 
	
}
