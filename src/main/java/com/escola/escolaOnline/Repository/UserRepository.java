package com.escola.escolaOnline.Repository;

import com.escola.escolaOnline.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByNomeContainingIgnoreCase(String nome);
}
