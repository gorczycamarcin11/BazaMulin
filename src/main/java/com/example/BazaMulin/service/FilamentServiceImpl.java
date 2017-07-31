package com.example.BazaMulin.service;

import com.example.BazaMulin.dao.FilamentDAO;
import com.example.BazaMulin.model.Filament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by marcin on 30.07.17.
 */

@Service
public class FilamentServiceImpl implements FilamentService {

    @Autowired
    FilamentDAO filamentDAO;

    @Override
    public boolean save(Filament filament) {
        filamentDAO.save(filament);
        return false;
    }

    @Override
    public void delete(long id) {
        filamentDAO.delete(id);
    }

    @Override
    public List<Filament> findAll() {

        Collection<Filament> collection = filamentDAO.findAllOrderByFilamentCodenameAsc();
        List<Filament> filaments = new ArrayList<>();
        collection.forEach(filaments::add);
        return filaments;
    }
}
