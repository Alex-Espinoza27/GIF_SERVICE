package pe.edu.pe.giftservice_tipoentrega.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.giftservice_tipoentrega.dtos.ShippingMethodDTO;
import pe.edu.pe.giftservice_tipoentrega.entities.ShippingMethod;
import pe.edu.pe.giftservice_tipoentrega.servicesinterfaces.IShippingMethodService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodeentrega")
public class ShippingMethodController {
    @Autowired
    private IShippingMethodService smS;

    @PostMapping
    public void insertar(@RequestBody ShippingMethodDTO shippingMethodDTO) {
        ModelMapper m = new ModelMapper();
        ShippingMethod sm=m.map(shippingMethodDTO, ShippingMethod.class);
        smS.insert(sm);
    }

    @GetMapping
    public List<ShippingMethodDTO> listar() {
        return smS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ShippingMethodDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        smS.delete(id);
    }

    @GetMapping("/{id}")
    public ShippingMethodDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        ShippingMethodDTO dto =m.map(smS.listId(id),ShippingMethodDTO.class);
        return dto;
    }

    @GetMapping("/buscarTipoEntrega")
    public List<ShippingMethodDTO> buscarTipoEntrega(@RequestParam String method) {
        return smS.findByNameShippingMethod(method).stream().map(y -> {
            ModelMapper m=new ModelMapper();
            return m.map(y, ShippingMethodDTO.class);
        }).collect(Collectors.toList());
    }

}
