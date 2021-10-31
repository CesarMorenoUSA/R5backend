/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.cicloweb.ciclo3.repository.crud;

import org.springframework.data.repository.CrudRepository;
import co.usa.cicloweb.ciclo3.model.Car;

/**
 *
 * @author cesar
 */
public interface CarCrudRepository extends CrudRepository<Car,Integer>{
    
}
