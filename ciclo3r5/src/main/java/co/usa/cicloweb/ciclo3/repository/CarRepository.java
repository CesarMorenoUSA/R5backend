/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.cicloweb.ciclo3.repository;

import co.usa.cicloweb.ciclo3.repository.crud.CarCrudRepository;
import co.usa.cicloweb.ciclo3.model.Car;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class CarRepository {
    
    @Autowired
    private CarCrudRepository crud;

    public List<Car> getAll(){
        return (List<Car>) crud.findAll();
    }

    public Optional<Car> getCar(int id){
        return crud.findById(id);
    }

    public Car save(Car car){
        return crud.save(car);
    }
    public void delete(Car car){
        crud.delete(car);
    }
}
