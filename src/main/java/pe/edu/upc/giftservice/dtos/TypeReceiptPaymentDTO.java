package pe.edu.upc.giftservice.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class TypeReceiptPaymentDTO {
    private int idTReceiptP;
    private String nameTReceiptP;

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
