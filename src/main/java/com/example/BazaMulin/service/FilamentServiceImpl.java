package com.example.BazaMulin.service;

import com.example.BazaMulin.dao.FilamentDAO;
import com.example.BazaMulin.model.Filament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

/**
 * Created by marcin on 30.07.17.
 */

@Service
public class FilamentServiceImpl implements FilamentService {

    @Autowired
    private FilamentDAO filamentDAO;

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
        filaments.addAll(collection);
        return filaments;
    }

    @Override
    public Filament get(long id) {
        return filamentDAO.findOne(id);
    }

    @Override
    public List<Filament> findByCodename(String filamentCodename) {

        Collection<Filament> collection = filamentDAO.findFilamentByFilamentCodename(filamentCodename);
        List<Filament> filaments = new ArrayList<>();
        filaments.addAll(collection);
        return filaments;
    }

}
