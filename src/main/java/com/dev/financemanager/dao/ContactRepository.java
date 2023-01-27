package com.dev.financemanager.dao;

import com.dev.financemanager.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByEmailOrderByCreatedDesc(String email);

    List<Contact> findTop5ByEmailAndAnswerIsNull(String email);
}
