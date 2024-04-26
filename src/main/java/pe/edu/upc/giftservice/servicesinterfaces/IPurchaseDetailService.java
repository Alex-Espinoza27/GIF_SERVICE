package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.PurchaseDetail;

import java.util.List;

public interface IPurchaseDetailService {
    public void insert(PurchaseDetail purchaseDetail);

    public List<PurchaseDetail> list();
    public PurchaseDetail getById(int id);
    public void update(PurchaseDetail purchaseDetail);

    public void delete(int id);
}
