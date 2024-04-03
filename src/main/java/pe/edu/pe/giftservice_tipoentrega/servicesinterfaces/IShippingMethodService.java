package pe.edu.pe.giftservice_tipoentrega.servicesinterfaces;

import pe.edu.pe.giftservice_tipoentrega.entities.ShippingMethod;

import java.util.List;

public interface IShippingMethodService {
    public void insert(ShippingMethod sm);
    public List<ShippingMethod> list();
}
