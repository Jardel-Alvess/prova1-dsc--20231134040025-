package prova.ifrn.corporativos.servicoveiculo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import prova.ifrn.corporativos.servicoveiculo.model.Veiculo;

public class VeiculoRepository {
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final AtomicLong proximoId = new AtomicLong(1);

    public 
    public List<Veiculo> findAll() {
        return new ArrayList<>(veiculos);
    }

    public Veiculo save(Veiculo veiculo) {
        if (veiculo.getId() == null) {
            veiculo.setId(proximoId.getAndIncrement());
        } else {
            deleteById(veiculo.getId());
        }
        veiculos.add(veiculo);
        return veiculo;
    }

    public void deleteById(Long id) {
        veiculos.removeIf(veiculo -> veiculo.getId().equals(id));
    }
}
