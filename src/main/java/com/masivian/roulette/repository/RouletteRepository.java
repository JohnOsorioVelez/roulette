package com.masivian.roulette.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivian.roulette.model.Roulette;

@Repository
public interface RouletteRepository extends CrudRepository<Roulette, String> {

	Optional<Roulette> findByState(String state);
}
