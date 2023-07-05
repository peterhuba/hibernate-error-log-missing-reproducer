package com.example;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContextRepository extends JpaRepository<ContextEntity, Long> {

    Optional<ContextEntity> findByContextId(String paymentContextId);
}
