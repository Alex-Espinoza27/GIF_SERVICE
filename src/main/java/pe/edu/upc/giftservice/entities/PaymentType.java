package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PaymentType")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaymentType;

    @Column(name = "namePaymentType", nullable = false, length = 50)
    private String namePaymentType;

    public PaymentType() {
    }

    public PaymentType(int idPaymentType, String namePaymentType) {
        this.idPaymentType = idPaymentType;
        this.namePaymentType = namePaymentType;
    }

    public int getIdPayment_Type() {
        return idPaymentType;
    }

    public void setIdPayment_Type(int idPayment_Type) {
        this.idPaymentType = idPayment_Type;
    }

    public String getNamePayment_Type() {
        return namePaymentType;
    }

    public void setNamePayment_Type(String namePayment_Type) {
        this.namePaymentType = namePaymentType;
    }
}
