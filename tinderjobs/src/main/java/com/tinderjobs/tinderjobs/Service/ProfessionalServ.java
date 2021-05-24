package com.tinderjobs.tinderjobs.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjobs.tinderjobs.Interface.TinderJobInterf;
import com.tinderjobs.tinderjobs.InterfaceService.TinderJobInterfServ;
import com.tinderjobs.tinderjobs.Model.Professional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalServ implements TinderJobInterfServ{

    @Autowired
    private TinderJobInterf data;

    @Override
    public List<Professional> listar() {
        return (List<Professional>)data.findAll();
    }

    @Override
    public Optional<Professional> listarPeloId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int salvar(Professional p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void apagar(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
