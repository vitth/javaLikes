package com.javalikes.javalikes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalikes.javalikes.model.DiscussionReply;

@Repository
public interface DiscussionReplyRepository extends JpaRepository<DiscussionReply, Long> {
    List<DiscussionReply> findByDiscussionId(Long discussionId);
}
