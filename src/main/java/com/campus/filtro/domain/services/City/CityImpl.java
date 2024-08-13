package com.campus.filtro.domain.services.City;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campus.filtro.domain.repositories.CityRepository;
import com.campus.filtro.persistence.entities.City;


@Service
public class CityImpl implements CityService{

   @Autowired
    private CityRepository repository;

    @Transactional
    @Override
    public List<City> findAll() {
        return(List<City>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<City> findById(String codecity) {
       return repository.findById(codecity);
    }

    @Transactional
    @Override
    public City save(City city) {
        return repository.save(city);
    }

    @Transactional
    @Override
    public Optional<City> update(String codecity, City City) {
       Optional<City> CityOpt = repository.findById(codecity);
       if(CityOpt.isPresent()){
            City CityItem = CityOpt.orElseThrow();
            CityItem.setNamecity(City.getNamecity());
            CityItem.setCodereg(City.getCodereg());
            return Optional.of(repository.save(CityItem));
       }
       return CityOpt;
    }

    @Transactional
    @Override
    public Optional<City> delete(String codecity) {
        Optional<City> CityOpt = repository.findById(codecity);
        CityOpt.ifPresent(CityItem ->{
            repository.delete(CityItem);
        });
        return CityOpt;
    }

}


