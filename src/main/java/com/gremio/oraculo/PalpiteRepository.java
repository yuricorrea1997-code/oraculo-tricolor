package com.gremio.oraculo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PalpiteRepository extends JpaRepository<Palpite, Long> {
    // É só isso mesmo! O Spring faz a mágica de criar o SQL sozinho.
}
