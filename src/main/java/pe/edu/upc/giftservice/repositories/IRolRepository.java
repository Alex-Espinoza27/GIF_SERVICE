package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
}
