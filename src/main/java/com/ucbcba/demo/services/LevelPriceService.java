package com.ucbcba.demo.services;

import com.ucbcba.demo.Entities.LevelPrice;
import com.ucbcba.demo.repository.LevelPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public interface LevelPriceService {


    Iterable<LevelPrice> listAllLevels();

    void saveCity(LevelPrice levelPrice);

    LevelPrice getCity(Integer id);

    void deleteCity(Integer id);

}
