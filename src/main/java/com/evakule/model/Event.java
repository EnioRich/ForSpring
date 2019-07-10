package com.evakule.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EVENTS")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String eventName;

    @ManyToMany(mappedBy = "events")
    private List<User> users;

    @OneToOne
    @JoinTable(name = "EVENTS_ALL",
            inverseJoinColumns = @JoinColumn(name = "FK_EVENT_STATUS_ID")
    )
    private EventStatus eventStatus;

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private List<UserToEvent> userToEvent;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public EventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public List<UserToEvent> getUserToEvent() {
        return userToEvent;
    }

    public void setUserToEvent(List<UserToEvent> userToEvent) {
        this.userToEvent = userToEvent;
    }

    @Override
    public String toString() {
        return "Event: " +
                "eventName='" + eventName + '\'' +
                ", eventStatus=" + eventStatus.getName();
    }
}

