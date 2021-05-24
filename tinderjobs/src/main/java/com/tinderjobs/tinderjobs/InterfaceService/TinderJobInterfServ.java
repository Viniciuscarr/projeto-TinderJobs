package com.tinderjobs.tinderjobs.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjobs.tinderjobs.Model.Professional;

public interface TinderJobInterfServ {

    public List<Professional> listar();
    public Optional<Professional> listarPeloId(int id);
    public int salvar(Professional p);
    public void apagar(int id);
    
}
