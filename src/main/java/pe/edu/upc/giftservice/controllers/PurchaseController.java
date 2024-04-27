package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PurchaseDTO;
import pe.edu.upc.giftservice.entities.Purchase;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseService;

import java.util.List;
import java.util.stream.Collectors;

//@PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDEDOR', 'ADMIN')")
@RestController
@RequestMapping("/Purchase")
public class PurchaseController {
    @Autowired
    private IPurchaseService pS;


    //@PreAuthorize("hasAnyAuthority('USUARIO')")
    @PostMapping
    public void insert(@RequestBody PurchaseDTO paymentTypeDTO){
        ModelMapper m=new ModelMapper();
        Purchase p=m.map(paymentTypeDTO,Purchase.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PurchaseDTO> list(){
        return  pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PurchaseDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasAnyAuthority('USUARIO')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    
}
