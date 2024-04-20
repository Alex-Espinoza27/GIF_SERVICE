package pe.edu.upc.giftservice.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.entities.User;

import java.time.LocalDate;

public class ConversationDTO {
    private int idConversation;
    private LocalDate DateConversation;
    private String TextConversation;
    private Entrepreneurship entrepreneurship;
    private User user;

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
