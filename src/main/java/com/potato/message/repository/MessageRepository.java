package com.potato.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potato.core.entity.Message;


@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
