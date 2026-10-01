package prova.ifrn.corporativos.servicoveiculo.exception;

public class VeiculoNaoEncontradoException extends RuntimeException{
    public VeiculoNaoEncontradoException(Long id) {
        super("Veiculo não encontrado com ID: " + id);
    }
}
