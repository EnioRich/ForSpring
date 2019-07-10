package com.evakule.model;


import javax.persistence.*;
import java.util.List;

@Table(name = "EVENT_STATUS")
@Entity
public class EventStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToOne(mappedBy = "eventStatus", fetch = FetchType.EAGER)
    private Event event;

    @OneToMany(mappedBy = "eventStatus", fetch = FetchType.EAGER)
    private List<UserToEvent> userToEvent;

    public EventStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<UserToEvent> getUserToEvent() {
        return userToEvent;
    }

    public void setUserToEvent(List<UserToEvent> userToEvent) {
        this.userToEvent = userToEvent;
    }

    @Override
    public String toString() {
        return "EventStatus{" +
                "name='" + name + '\'' +
                '}';
    }
}