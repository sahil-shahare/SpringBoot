package com.Metro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Metro.Entity.Commutor;

@Repository
public interface CommutorRepository extends JpaRepository<Commutor, Long> {
}
