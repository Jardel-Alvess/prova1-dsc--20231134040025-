package prova.ifrn.corporativos.servicoveiculo.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import prova.ifrn.corporativos.DTO.VeiculoRequestDTO;
import prova.ifrn.corporativos.DTO.VeiculoResponseDTO;
import prova.ifrn.corporativos.servicoveiculo.service.VeiculoService;

@RestController 
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService){
        this.veiculoService = veiculoService;
    }

    @PostMapping 
    public ResponseEntity<VeiculoResponseDTO> criar (@Valid @RequestBody VeiculoRequestDTO dto){
        VeiculoResponseDTO veiculoSalvo = veiculoService.criar(dto);
        URI location = URI.create("/veiculos/" + veiculoSalvo.getId());
        return ResponseEntity.created(location).body(veiculoSalvo);
    }
    
}
