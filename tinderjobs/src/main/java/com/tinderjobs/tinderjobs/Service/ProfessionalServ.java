package com.tinderjobs.tinderjobs.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjobs.tinderjobs.Interface.TinderJobInterf;
import com.tinderjobs.tinderjobs.InterfaceService.TinderJobInterfServ;
import com.tinderjobs.tinderjobs.Model.DadosPessoais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalServ implements TinderJobInterfServ{

    @Autowired
    private TinderJobInterf data;

    @Override
    public List<DadosPessoais> listar() {
        return (List<DadosPessoais>)data.findAll();
    }

    @Override
    public Optional<DadosPessoais> listarPeloId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int salvar(DadosPessoais p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void apagar(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
