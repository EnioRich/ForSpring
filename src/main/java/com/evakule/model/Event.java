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

    @Override
    public String toString() {
        return "Event: " +
                "eventName='" + eventName + '\'' +
                ", eventStatus=" + eventStatus.getName();
    }
}

