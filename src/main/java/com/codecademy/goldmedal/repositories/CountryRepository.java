package com.codecademy.goldmedal.repositories;

import java.util.Optional;
import java.util.List;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    public Optional<Country> findByName(String name);

    public List<Country> findAllByOrderByNameAsc();
    public List<Country> findAllByOrderByNameDesc();

    public List<Country> findAllByOrderByGdpAsc();
    public List<Country> findAllByOrderByGdpDesc();

    public List<Country> findAllByOrderByPopulationAsc();
    public List<Country> findAllByOrderByPopulationDesc();

    public List<Country> findAll();

}
