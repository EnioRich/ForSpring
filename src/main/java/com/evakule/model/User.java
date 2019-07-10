package com.evakule.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
@NamedEntityGraph(name = "User.events", attributeNodes = @NamedAttributeNode("events"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "EVENTS_ALL",
            joinColumns = @JoinColumn(name = "FK_USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_EVENT_ID")
    )
    private List<Event> events;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserToEvent> userToEvent;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}