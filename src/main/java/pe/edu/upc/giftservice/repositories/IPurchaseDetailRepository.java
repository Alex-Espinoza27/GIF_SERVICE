package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.PurchaseDetail;

import java.util.List;

@Repository
public interface IPurchaseDetailRepository extends JpaRepository<PurchaseDetail, Integer> {

    @Query(value = "SELECT e.name_entrepreneurship AS EntrepreneurshipName, \n" +
            "       COUNT(pd.id_purchase_detail) AS PurchaseDetailCount \n" +
            "FROM entrepreneurships e \n" +
            "INNER JOIN Product p ON e.id = p.entrepreneurship_id \n" +
            "INNER JOIN purchase_detail pd ON e.id = pd.product_id \n" +
            "GROUP BY e.name_entrepreneurship;",nativeQuery = true)
    public List<String[]> quantityPurchaseByEntrepreneurship();

    @Query(value = "SELECT e.name_entrepreneurship AS EntrepreneurshipName,\tsum(pd.ctotal_purchase_detail) AS TotalSales \n" +
            "FROM entrepreneurships e \n" +
            "INNER JOIN Product p ON e.id = p.entrepreneurship_id \n" +
            "INNER JOIN purchase_detail pd ON e.id = pd.product_id \n" +
            "GROUP BY e.name_entrepreneurship", nativeQuery = true)
    public List<String[]> TotalAmountByEntrepreneurship();

    @Query(value = "select ca.name_category, sum(pu_d.cantidad_purchase_detail) as total from \n" +
            "entrepreneurships ent INNER JOIN \n" +
            "product pr ON ent.id = pr.entrepreneurship_id INNER JOIN \n" +
            "categories ca ON pr.category_id = ca.id INNER JOIN \n" +
            "purchase_detail pu_d ON pr.id_product = pu_d.product_id INNER JOIN \n" +
            "purchase pu ON pu_d.id_purchase_detail = pu.id_purchase \n" +
            "WHERE ent.id = ?1 and pu.purchase_status = 'true' \n" +
            "GROUP BY ca.name_category \n" +
            "ORDER BY sum(pu_d.cantidad_purchase_detail) desc \n", nativeQuery = true)
    public List<String[]> RankingCategoryPurchase(Long entrepreneurships_id);

}
