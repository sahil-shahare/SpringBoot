package com.RBA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RBA.Entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

}
