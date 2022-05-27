package com.example.demoorc.repository;

import com.example.demoorc.entity.Cache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AcamedyRepo extends JpaRepository<Cache, String    > {
    @Procedure("Cache.getCache")
    List<Cache> getCache ();
}
