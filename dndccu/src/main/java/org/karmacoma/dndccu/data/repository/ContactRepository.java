package org.karmacoma.dndccu.data.repository;

import org.karmacoma.dndccu.data.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
