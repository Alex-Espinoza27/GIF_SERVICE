package pe.edu.pe.giftservice_tipoentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.giftservice_tipoentrega.entities.ShippingMethod;

@Repository
public interface IShippingMethodRepository extends JpaRepository<ShippingMethod,Integer> {
}
