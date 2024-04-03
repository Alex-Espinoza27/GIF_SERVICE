package pe.edu.upc.giftservice.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Rol;
import pe.edu.upc.giftservice.repositories.IRolRepository;
import pe.edu.upc.giftservice.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;
    @Override
    public void insert(Rol r) {
        rR.save(r);
    }
    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Rol listID(int id) {
        return rR.findById(id).orElse(new Rol());
    }


}
