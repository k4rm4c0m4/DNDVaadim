package com.karmacoma.dndccu.data.repository;

import com.karmacoma.dndccu.data.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
