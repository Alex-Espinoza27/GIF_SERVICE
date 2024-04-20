package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConversation;
    @Column(name = "DateConversation", nullable = false)
    private LocalDate DateConversation;
    @Column(name = "TextConversation", nullable = false)
    private String TextConversation;

    @ManyToOne
    @JoinColumn(name = "Entrepreneurship_id")
    private Entrepreneurship entrepreneurship;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    public Conversation() {
    }

    public Conversation(int idConversation, LocalDate dateConversation, String textConversation, Entrepreneurship entrepreneurship, User user) {
        this.idConversation = idConversation;
        DateConversation = dateConversation;
        TextConversation = textConversation;
        this.entrepreneurship = entrepreneurship;
        this.user = user;
    }

    public int getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(int idConversation) {
        this.idConversation = idConversation;
    }

    public LocalDate getDateConversation() {
        return DateConversation;
    }

    public void setDateConversation(LocalDate dateConversation) {
        DateConversation = dateConversation;
    }

    public String getTextConversation() {
        return TextConversation;
    }

    public void setTextConversation(String textConversation) {
        TextConversation = textConversation;
    }

    public Entrepreneurship getEntrepreneurship() {
        return entrepreneurship;
    }

    public void setEntrepreneurship(Entrepreneurship entrepreneurship) {
        this.entrepreneurship = entrepreneurship;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
