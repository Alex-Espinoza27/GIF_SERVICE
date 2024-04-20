package pe.edu.upc.giftservice.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.giftservice.entities.Product;
import pe.edu.upc.giftservice.entities.User;

import java.time.LocalDate;

public class ReviewsDTO {
    private int idReviews;
    private LocalDate dateReviews;
    private double scoreReviews;
    private String commentReviews;
    private User user;
    private Product product;

    public int getIdReviews() {
        return idReviews;
    }

    public void setIdReviews(int idReviews) {
        this.idReviews = idReviews;
    }

    public LocalDate getDateReviews() {
        return dateReviews;
    }

    public void setDateReviews(LocalDate dateReviews) {
        this.dateReviews = dateReviews;
    }

    public double getScoreReviews() {
        return scoreReviews;
    }

    public void setScoreReviews(double scoreReviews) {
        this.scoreReviews = scoreReviews;
    }

    public String getCommentReviews() {
        return commentReviews;
    }

    public void setCommentReviews(String commentReviews) {
        this.commentReviews = commentReviews;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
