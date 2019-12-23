package com.mindtree.channelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.channelmanagement.entity.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {

}
