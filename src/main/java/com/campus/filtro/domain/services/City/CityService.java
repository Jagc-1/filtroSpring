
package com.campus.filtro.domain.services.City;


import java.util.List;
import java.util.Optional;

import com.campus.filtro.persistence.entities.City;


public interface CityService {
    List<City> findAll();
    Optional<City> findById(String codecity);
    City save(City city);
    Optional<City> update(String codecity, City city);
    Optional<City> delete(String codecity);
}

