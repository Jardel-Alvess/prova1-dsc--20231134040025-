package prova.ifrn.corporativos.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class VeiculoRequestDTO {
    
    @NotBlank
    private String placa;

    @NotBlank
    private String modelo;

    @NotNull
    private Integer anoFabricacao;

    @NotBlank
    private String tipo;

    @NotBlank
    private String nomeProprietario;
}
