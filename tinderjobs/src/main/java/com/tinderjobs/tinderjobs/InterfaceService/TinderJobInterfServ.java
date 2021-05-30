package com.tinderjobs.tinderjobs.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjobs.tinderjobs.Model.DadosPessoais;

public interface TinderJobInterfServ {

    public List<DadosPessoais> listar();
    public Optional<DadosPessoais> listarPeloId(int id);
    public int salvar(DadosPessoais p);
    public void apagar(int id);
    
}
