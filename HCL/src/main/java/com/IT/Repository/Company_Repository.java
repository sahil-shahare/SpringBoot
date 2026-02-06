package com.IT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IT.Entity.Company;
@Repository
public interface Company_Repository extends JpaRepository<Company, Integer> {

}
