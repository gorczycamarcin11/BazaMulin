package com.example.BazaMulin.service;

import com.example.BazaMulin.model.Filament;

import java.util.List;

/**
 * Created by marcin on 30.07.17.
 */
public interface FilamentService {

    boolean save(Filament filament);
    void delete(long id);
    List<Filament> findAll();
    Filament get(long id);
}
