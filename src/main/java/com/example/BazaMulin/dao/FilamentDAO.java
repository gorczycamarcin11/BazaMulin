package com.example.BazaMulin.dao;

import com.example.BazaMulin.model.Filament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by marcin on 30.07.17.
 */
@Repository
public interface FilamentDAO extends JpaRepository<Filament, Long> {

    @Query("select f from Filament f where f.filamentCodename=:filamentCodename")
    List<Filament> findFilamentByFilamentCodename(@Param("filamentCodename") String filamentCodename);

    @Query("select f from Filament f order by f.filamentCodename asc")
    List<Filament> findAllOrderByFilamentCodenameAsc();

}
