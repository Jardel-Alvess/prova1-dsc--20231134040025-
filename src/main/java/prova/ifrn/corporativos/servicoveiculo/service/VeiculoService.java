package prova.ifrn.corporativos.servicoveiculo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import prova.ifrn.corporativos.DTO.VeiculoRequestDTO;
import prova.ifrn.corporativos.DTO.VeiculoResponseDTO;
import prova.ifrn.corporativos.servicoveiculo.exception.VeiculoNaoEncontradoException;
import prova.ifrn.corporativos.servicoveiculo.model.Veiculo;
import prova.ifrn.corporativos.servicoveiculo.repository.VeiculoRepository;

@Service 
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository){
        this.veiculoRepository = veiculoRepository;
    }

    public List<VeiculoResponseDTO> listar() {
        return veiculoRepository.findAll().stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public VeiculoResponseDTO criar(VeiculoRequestDTO dto) {
        Veiculo salvo = veiculoRepository.save(toEntity(dto));
        return toResponseDTO(salvo);
    }

    public VeiculoResponseDTO buscarPorId(Long id) {
        Veiculo imovel = veiculoRepository.findById(id)
                .orElseThrow(() -> new VeiculoNaoEncontradoException(id));
        return toResponseDTO(veiculo);
    }

    public VeiculoResponseDTO editar(Long id, VeiculoRequestDTO dto) {
        buscarPorId(id);
        Veiculo veiculo = toEntity(dto);
        veiculo.setId(id);
        return toResponseDTO(veiculoRepository.save(veiculo));
    }

    public void excluir(Long id) {
        buscarPorId(id);
        veiculoRepository.deleteById(id);
    }

    private VeiculoResponseDTO toResponseDTO(Veiculo salvo) {
        return new Veiculo(null, dto.getId(), dto.getplaca(), dto.getmodelo(), dto.getanoFabricacao(), dto.gettipo(), dto.getnomeProprietario());;
    }

    private Object toEntity(VeiculoRequestDTO dto) {
        return new VeiculoResponseDTO(veiculo.getId(), veiculo.getEndereco(), veiculo.getValorAluguel());
    }
}