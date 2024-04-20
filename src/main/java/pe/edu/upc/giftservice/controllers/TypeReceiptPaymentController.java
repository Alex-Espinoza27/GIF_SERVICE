package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.TypeReceiptPaymentDTO;
import pe.edu.upc.giftservice.entities.TypeReceiptPayment;
import pe.edu.upc.giftservice.servicesinterfaces.ITypeReceiptPaymentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TypeReceiptPaymentController")
public class TypeReceiptPaymentController {
    @Autowired
    private ITypeReceiptPaymentService itrpS;

    @PostMapping
    public void insertar(@RequestBody TypeReceiptPaymentDTO typeDTO){
        ModelMapper m = new ModelMapper();
        TypeReceiptPayment r = m.map(typeDTO, TypeReceiptPayment.class);
        itrpS.insert(r);
    }
    @GetMapping
    public List<TypeReceiptPaymentDTO> listar(){
        return itrpS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,TypeReceiptPaymentDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        itrpS.delete(id);
    }

    @GetMapping("/{id}")
    public TypeReceiptPaymentDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TypeReceiptPaymentDTO dto = m.map(itrpS.listID(id), TypeReceiptPaymentDTO.class);
        return dto;
    }
}
