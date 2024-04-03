package pe.edu.pe.giftservice_tipoentrega.servicesimplements;

import io.swagger.v3.oas.annotations.servers.Server;
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
}
