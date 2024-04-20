package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.giftservice.entities.TypeReceiptPayment;

@Repository
public interface ITypeReceiptPaymentRepository extends JpaRepository<TypeReceiptPayment,Integer> {
}
