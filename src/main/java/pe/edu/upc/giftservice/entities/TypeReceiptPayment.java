package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TypeReceiptPayment")
public class TypeReceiptPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTReceiptP;
    @Column(name = "nameTReceiptP",nullable = false,length = 30)
    private String nameTReceiptP;

    public TypeReceiptPayment() {
    }

    public TypeReceiptPayment(int idTReceiptP, String nameTReceiptP) {
        this.idTReceiptP = idTReceiptP;
        this.nameTReceiptP = nameTReceiptP;
    }

    public int getIdTReceiptP() {
        return idTReceiptP;
    }

    public void setIdTReceiptP(int idTReceiptP) {
        this.idTReceiptP = idTReceiptP;
    }

    public String getNameTReceiptP() {
        return nameTReceiptP;
    }

    public void setNameTReceiptP(String nameTReceiptP) {
        this.nameTReceiptP = nameTReceiptP;
    }
}
