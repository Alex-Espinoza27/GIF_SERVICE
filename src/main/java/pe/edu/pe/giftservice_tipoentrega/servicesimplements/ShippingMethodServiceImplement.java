package pe.edu.pe.giftservice_tipoentrega.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.giftservice_tipoentrega.entities.ShippingMethod;
import pe.edu.pe.giftservice_tipoentrega.repositories.IShippingMethodRepository;
import pe.edu.pe.giftservice_tipoentrega.servicesinterfaces.IShippingMethodService;

import java.util.List;

@Service
public class ShippingMethodServiceImplement implements IShippingMethodService {
    @Autowired
    private IShippingMethodRepository smR;

    @Override
    public void insert(ShippingMethod sm) {
        smR.save(sm);
    }
    @Override
    public List<ShippingMethod> list() {
        return smR.findAll();
    }

    @Override
    public void delete(int id) {
        smR.deleteById(id);
    }

    @Override
    public ShippingMethod listId(int id) {
        return smR.findById(id).orElse(new ShippingMethod());
    }

    @Override
    public List<ShippingMethod> findByNameShippingMethod(String method) {
        return smR.findByNameShippingMethod(method);
    }


}
