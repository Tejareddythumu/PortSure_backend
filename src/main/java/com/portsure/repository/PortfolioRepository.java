package com.portsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portsure.entity.Portfolio;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio, String> {
    List<Portfolio> findByUserId(String userId);
}
