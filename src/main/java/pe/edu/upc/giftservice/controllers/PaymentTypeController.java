package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PaymentTypeDTO;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.servicesinterfaces.IPaymentTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipopago")
public class PaymentTypeController {
    @Autowired
    private IPaymentTypeService iP;

    @PostMapping
    public void insert(@RequestBody PaymentTypeDTO paymentTypeDTO){
        ModelMapper m=new ModelMapper();
        PaymentType p=m.map(paymentTypeDTO, PaymentType.class);
        iP.insert(p);
    }

    @GetMapping
    public List<PaymentTypeDTO> list(){

        return  iP.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PaymentTypeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iP.delete(id);
    }
    @GetMapping("/buscar")
    public PaymentTypeDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PaymentTypeDTO dto = m.map(iP.listId(id), PaymentTypeDTO.class);
        return dto;
    }
}
