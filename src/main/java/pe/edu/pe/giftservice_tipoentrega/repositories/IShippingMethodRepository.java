package pe.edu.pe.giftservice_tipoentrega.repositories;

import ch.qos.logback.core.net.AutoFlushingObjectWriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.giftservice_tipoentrega.entities.ShippingMethod;

import java.util.List;

@Repository
public interface IShippingMethodRepository extends JpaRepository<ShippingMethod,Integer> {
    public List<ShippingMethod> findByNameShippingMethod(String method);
}
