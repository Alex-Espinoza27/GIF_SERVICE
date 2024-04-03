package pe.edu.upc.gifservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.gifservice.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {

}
