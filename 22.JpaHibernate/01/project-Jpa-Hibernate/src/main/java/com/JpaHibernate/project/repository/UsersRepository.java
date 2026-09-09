package com.JpaHibernate.project.repository;

import com.JpaHibernate.project.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Camada que acessa a tabela users.
 * JpaRepository já disponibiliza save, findAll, findById e delete.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {

    boolean existsByEmail(String email);
}
