package com.javalikes.javalikes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DiscussionReply {
	@Id
	@GeneratedValue
	private Long id;
	private Long discussionId;
	private String repliedBy;
	private String replyText;
	private LocalDateTime createdAt = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDiscussionId() {
		return discussionId;
	}

	public void setDiscussionId(Long discussionId) {
		this.discussionId = discussionId;
	}

	public String getRepliedBy() {
		return repliedBy;
	}

	public void setRepliedBy(String repliedBy) {
		this.repliedBy = repliedBy;
	}

	public String getReplyText() {
		return replyText;
	}

	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}