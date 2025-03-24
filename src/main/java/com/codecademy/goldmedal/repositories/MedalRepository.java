package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codecademy.goldmedal.model.GoldMedal;

@Repository
public interface MedalRepository extends JpaRepository<GoldMedal, Long>{
    public List<GoldMedal> findByCountryOrderByYearAsc(String country);
    public List<GoldMedal> findByCountryOrderByYearDesc(String country);
   
    public List<GoldMedal> findByCountryOrderBySeasonAsc(String country);
    public List<GoldMedal> findByCountryOrderBySeasonDesc(String country);

    public List<GoldMedal> findByCountryOrderByCityAsc(String country);
    public List<GoldMedal> findByCountryOrderByCityDesc(String country);

    public List<GoldMedal> findByCountryOrderByNameAsc(String country);
    public List<GoldMedal> findByCountryOrderByNameDesc(String country);

    public List<GoldMedal> findByCountryOrderByEventAsc(String country);
    public List<GoldMedal> findByCountryOrderByEventDesc(String country);

    public Integer countByCountry(String country);

    public List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String country, String season);

    //get the total number of events at the Summer Olympics
    public Integer countByCountryAndSeason(String country, String season);

    public Integer countByCountryAndGender(String country, String gender);

}
