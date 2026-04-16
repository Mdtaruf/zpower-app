package com.wnm.zpower.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wnm.zpower.entities.ContactLead;

public interface ContactRepository extends JpaRepository<ContactLead, Long> {
}
