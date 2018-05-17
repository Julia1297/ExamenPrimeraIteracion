package com.ucbcba.demo.services;

import com.ucbcba.demo.Entities.LevelPrice;
import com.ucbcba.demo.repository.LevelPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LevelPriceServiceImpl implements LevelPriceService {


    private LevelPriceRepository levelPriceRepository;
    @Autowired
    @Qualifier(value="levelPriceRepository")
    public void setLevelPriceRepository(LevelPriceRepository levelPriceRepository) {
        this.levelPriceRepository = levelPriceRepository;
    }

    @Override
    public Iterable<LevelPrice> listAllLevels() {
        return levelPriceRepository.findAll();
    }

    @Override
    public void saveCity(LevelPrice levelPrice) {
        levelPriceRepository.save(levelPrice);
    }

    @Override
    public LevelPrice getCity(Integer id) {
        return levelPriceRepository.findById(id).get();
    }

    @Override
    public void deleteCity(Integer id) {
        levelPriceRepository.deleteById(id);
    }


}
