package com.mindtree.channelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.channelmanagement.entity.Shows;

@Repository
public interface ShowRepository extends JpaRepository<Shows, Integer> {

}
