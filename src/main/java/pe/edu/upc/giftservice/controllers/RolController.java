package pe.edu.upc.giftservice.controllers;


import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.RolDTO;
import pe.edu.upc.giftservice.entities.Rol;
import pe.edu.upc.giftservice.serviceinterfaces.IRolService;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("rolUser")
public class RolController {
    @Autowired
    private IRolService iR;

    @PostMapping
    public void insertar(@RequestBody RolDTO rolDTO){
        ModelMapper m = new ModelMapper();
        Rol r = m.map(rolDTO, Rol.class);
        iR.insert(r);
    }
    @GetMapping
    public List<RolDTO> listar(){
        return iR.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iR.delete(id);
    }

    @GetMapping("/{id}")
    public RolDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RolDTO dto = m.map(iR.listID(id), RolDTO.class);
        return dto;
    }
}
