package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.TypeReceiptPayment;
import pe.edu.upc.giftservice.repositories.ITypeReceiptPaymentRepository;
import pe.edu.upc.giftservice.servicesinterfaces.ITypeReceiptPaymentService;

import java.util.List;

@Service
public class TypeReceiptPaymentServiceImplement implements ITypeReceiptPaymentService {
    @Autowired
    private ITypeReceiptPaymentRepository trpR;

    @Override
    public void insert(TypeReceiptPayment r) {
        trpR.save(r);
    }

    @Override
    public List<TypeReceiptPayment> list() {
        return trpR.findAll();
    }

    @Override
    public void delete(int id) {
        trpR.deleteById(id);
    }

    @Override
    public TypeReceiptPayment listID(int id) {
        return trpR.findById(id).orElse(new TypeReceiptPayment());
    }
}
