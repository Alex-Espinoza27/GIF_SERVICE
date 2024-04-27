package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.RankingCategoryPurchaseDTO;
import pe.edu.upc.giftservice.dtos.PurchaseByEntrepreneurshipDTO;
import pe.edu.upc.giftservice.dtos.PurchaseDetailDTO;
import pe.edu.upc.giftservice.dtos.TotalAmountByEntrepreneurshipDTO;
import pe.edu.upc.giftservice.entities.PurchaseDetail;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseDetailService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PurchaseDetails")
public class PurchaseDetailController {
    @Autowired
    private IPurchaseDetailService pdS;


    //@PreAuthorize("hasAnyAuthority('USUARIO')")
    @PostMapping
    public void insertar(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.insert(e);
    }

//    @PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDEDOR','ADMIN')")
    @GetMapping
    public List<PurchaseDetailDTO> list() {
        return pdS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, PurchaseDetailDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDEDOR')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        pdS.delete(id);
    }

    //@PreAuthorize("hasAnyAuthority('ADMIN')")
    @PutMapping
    public void update(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.update(e);
    }

    //@PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/{id}")
    public PurchaseDetailDTO listById(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = pdS.getById(id);
        return m.map(e, PurchaseDetailDTO.class);
    }

    //@PreAuthorize("hasAnyAuthority('EMPRENDEDOR', 'ADMIN')")
    @GetMapping("/cantidaddecomprasporEmprendimiento")
    public List<PurchaseByEntrepreneurshipDTO> quantityPurchaseByEntrepreneurship(){
        List<String[]> filaLista=pdS.quantityPurchaseByEntrepreneurship();
        List<PurchaseByEntrepreneurshipDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            PurchaseByEntrepreneurshipDTO dto=new PurchaseByEntrepreneurshipDTO();
            dto.setNameEntrepreneurship(columna[0]);
            dto.setQuantityPurchaseD(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    //@PreAuthorize("hasAnyAuthority('EMPRENDEDOR', 'ADMIN')")
    @GetMapping("/montodeventasporEmprendimiento")
    public List<TotalAmountByEntrepreneurshipDTO> monto(){
        List<String[]> filaLista= pdS.TotalAmountByEntrepreneurship();
        List<TotalAmountByEntrepreneurshipDTO> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            TotalAmountByEntrepreneurshipDTO dto=new TotalAmountByEntrepreneurshipDTO();
            dto.setNameEntrepreneurship(columna[0]);
            dto.setTotalAmount(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/Ranking_Category_purchase")
    public List<RankingCategoryPurchaseDTO> RankingCategoryPurchase(@RequestParam  Long id){
        List<String[]> filaLista= pdS.RankingCategoryPurchase(id);
        List<RankingCategoryPurchaseDTO> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            RankingCategoryPurchaseDTO dto=new RankingCategoryPurchaseDTO();
            dto.setNameCategory(columna[0]);
            dto.setTotal(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }


}
