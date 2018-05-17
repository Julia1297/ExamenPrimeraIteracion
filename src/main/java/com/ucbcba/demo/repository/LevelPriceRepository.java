package com.ucbcba.demo.repository;

import com.ucbcba.demo.Entities.LevelPrice;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface LevelPriceRepository extends CrudRepository<LevelPrice,Integer> {
}
