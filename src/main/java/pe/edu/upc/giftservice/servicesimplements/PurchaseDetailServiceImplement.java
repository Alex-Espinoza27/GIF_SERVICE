package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.PurchaseDetail;
import pe.edu.upc.giftservice.repositories.IPurchaseDetailRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseDetailService;

import java.util.List;

@Service
public class PurchaseDetailServiceImplement implements IPurchaseDetailService {
    @Autowired
    private IPurchaseDetailRepository pdR;

    @Override
    public void insert(PurchaseDetail PurchaseDetail) {
        pdR.save(PurchaseDetail);
    }

    @Override
    public List<PurchaseDetail> list() {
        return pdR.findAll();
    }

    @Override
    public PurchaseDetail getById(int id) {
        return pdR.findById(id).get();
    }

    @Override
    public void update(PurchaseDetail PurchaseDetail) {
        pdR.save(PurchaseDetail);
    }

    @Override
    public void delete(int id) {
        pdR.deleteById(id);
    }

}
