package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Purchase;

import java.util.List;

@Repository
public interface IPurchaseRepository extends JpaRepository<Purchase, Integer> {
    @Query(value = "SELECT (select count(*) from purchase) as total_de_compras,'RECOJO' AS tipo_entrega, COUNT(id_purchase) AS cantidad_total_de_compras_de_usuarios FROM purchase \n" +
            "WHERE delivery_type_id = 1 \n" +
            "UNION\n" +
            "SELECT (select count(*) from purchase) as total_de_compras,'DELIVERY' AS tipo_entrega, COUNT(id_purchase) AS cantidad_total_de_compras_de_usuarios FROM purchase \n" +
            "WHERE delivery_type_id = 2; \n", nativeQuery = true)
    public List<String[]> QuantityByTypeDelivery ();
}
