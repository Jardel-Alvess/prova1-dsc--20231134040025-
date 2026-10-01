package prova.ifrn.corporativos.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class VeiculoRequestDTO {
    private Long id;
    private String placa;
    private String modelo;
    private Integer anoFabricacao;
    private String tipo;
    private String nomeProprietario;
}
