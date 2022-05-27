package com.example.demoorc.service.impl;

import com.example.demoorc.entity.Cache;
import com.example.demoorc.repository.AcamedyRepo;
import com.example.demoorc.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    AcamedyRepo acamedyRepo;
    @Override
    public ArrayList<Cache> get() {
        return (ArrayList<Cache>) acamedyRepo.getCache();
    }
}
