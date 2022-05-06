package com.example.reactspringbootjwt.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.reactspringbootjwt.models.ERole;
import com.example.reactspringbootjwt.models.Role;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
