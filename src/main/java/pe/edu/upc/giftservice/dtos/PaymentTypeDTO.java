package pe.edu.upc.giftservice.dtos;

public class PaymentTypeDTO {
    private  String namePayment_Type;
    private int idPaymentType;

    public int getIdPaymentType() {
        return idPaymentType;
    }

    public void setIdPaymentType(int idPaymentType) {
        this.idPaymentType = idPaymentType;
    }

    public String getNamePayment_Type() {
        return namePayment_Type;
    }
    public void setNamePayment_Type(String namePayment_Type) {
        this.namePayment_Type = namePayment_Type;
    }
}
