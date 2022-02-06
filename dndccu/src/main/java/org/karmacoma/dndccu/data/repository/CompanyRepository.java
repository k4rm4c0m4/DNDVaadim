package org.karmacoma.dndccu.data.repository;

import org.karmacoma.dndccu.data.entity.Company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
