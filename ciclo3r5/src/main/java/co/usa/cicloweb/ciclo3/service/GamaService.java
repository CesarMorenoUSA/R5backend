/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.cicloweb.ciclo3.service;

import co.usa.cicloweb.ciclo3.repository.GamaRepository;
import co.usa.cicloweb.ciclo3.model.Gama;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cesar
 */
@Service
public class GamaService {
    @Autowired
    private GamaRepository metodosCrud;

    public List<Gama> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Gama> getGama(int GamaId) {
        return metodosCrud.getGama(GamaId);
    }

    public Gama save(Gama gama) {
        if (gama.getIdGama()== null) {
            return metodosCrud.save(gama);
        } else {
            Optional<Gama> gama1 = metodosCrud.getGama(gama.getIdGama());
            if (gama1.isEmpty()) {
                return metodosCrud.save(gama);
            } else {
                return gama;
            }
        }
    }

    public Gama update(Gama gama){
        if(gama.getIdGama()!=null){
            Optional<Gama>g=metodosCrud.getGama(gama.getIdGama());
            if(!g.isEmpty()){
                if(gama.getDescription()!=null){
                    g.get().setDescription(gama.getDescription());
                }
                if(gama.getName()!=null){
                    g.get().setName(gama.getName());
                }
                return metodosCrud.save(g.get());
            }
        }
        return gama;
    }
    public boolean deleteGama(int gamaId){
        Boolean d=getGama(gamaId).map(gama -> {
            metodosCrud.delete(gama);
            return true;
        }).orElse(false);
        return d;
    }    
}
