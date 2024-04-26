package pe.edu.upc.giftservice.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import java.util.List;

@Repository
public interface IEntrepreneurshipRepository extends JpaRepository<Entrepreneurship, Long> {
    @Query("SELECT pd.namePersonalizedDetail, COUNT(p) AS usageCount " +
            "FROM Product p " +
            "JOIN p.entrepreneurship e " +
            "JOIN p.personalizedDetail pd " +
            "WHERE e.id = :entrepreneurshipId " +
            "GROUP BY pd " +
            "ORDER BY usageCount DESC")
    List<String[]> findTop3PersonalizationsByEntrepreneurshipId(@Param("entrepreneurshipId") Long entrepreneurshipId, Pageable pageable);

    @Query("SELECT p.nameProduct, COUNT(r) AS reviewCount " +
            "FROM Reviews r " +
            "JOIN r.product p " +
            "JOIN p.entrepreneurship e " +
            "WHERE e.id = :entrepreneurshipId " +
            "GROUP BY p " +
            "ORDER BY reviewCount DESC")
    List<String[]> quantityReviewsByProduct(@Param("entrepreneurshipId") Long entrepreneurshipId);
}
