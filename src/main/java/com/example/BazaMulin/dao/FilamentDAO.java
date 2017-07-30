package com.example.BazaMulin.dao;

import com.example.BazaMulin.model.Filament;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by marcin on 30.07.17.
 */
@Repository
public interface FilamentDAO extends CrudRepository<Filament, Long> {


    @Query("select f from Filament f order by f.filamentCodename asc")
    Set<Filament> findAllOrderByFilamentCodenameAsc();
}
