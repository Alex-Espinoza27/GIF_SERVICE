package pe.edu.upc.giftservice.serviceinterfaces;

import pe.edu.upc.giftservice.entities.Rol;

import java.util.List;


public interface IRolService {
    public void insert(Rol r);
    public List<Rol> list();
    public void delete(int id);
    public Rol listID(int id);
}
