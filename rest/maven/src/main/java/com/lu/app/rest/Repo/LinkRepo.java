package com.lu.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lu.app.rest.Models.Link;

@Repository
public interface LinkRepo extends JpaRepository<Link, Long>{
    
}