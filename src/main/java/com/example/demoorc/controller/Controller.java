package com.example.demoorc.controller;

import com.example.demoorc.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt")
public class Controller {
    @Autowired
    CacheService cacheService;

    @GetMapping
    @Transactional(readOnly = true)
    public Object get() {
        return cacheService.get();
    }
}
