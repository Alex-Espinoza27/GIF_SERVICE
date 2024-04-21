package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.giftservice.entities.Entrepreneurship;

public interface IEntrepreneurshipRepository extends JpaRepository<Entrepreneurship, Long> {
}
