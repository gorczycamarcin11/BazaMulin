package com.example.BazaMulin.service;

import com.example.BazaMulin.model.Filament;

import java.util.Set;

/**
 * Created by marcin on 30.07.17.
 */
public interface FilamentService {

    boolean save(Filament filament);
    void delete(long id);
    Set<Filament> findAll();
}
