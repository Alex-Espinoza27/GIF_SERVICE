package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.TypeReceiptPayment;

import java.util.List;

public interface ITypeReceiptPaymentService {
    public void insert(TypeReceiptPayment r);
    public List<TypeReceiptPayment> list();
    public void delete(int id);
    public TypeReceiptPayment listID(int id);
}
