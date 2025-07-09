package com.javalikes.javalikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalikes.javalikes.model.Discussion;
import com.javalikes.javalikes.model.DiscussionReply;
import com.javalikes.javalikes.repository.DiscussionReplyRepository;
import com.javalikes.javalikes.repository.DiscussionRepository;

@RestController
@RequestMapping("/api/discussions")

public class DiscussionController {

	@Autowired
	private DiscussionRepository discussionRepo;

	@Autowired
	private DiscussionReplyRepository replyRepo;

	@PostMapping
	public String postDiscussion(@RequestBody Discussion discussion) {
		discussionRepo.save(discussion);
		return "Doubt posted!";
	}

	@PostMapping("/reply")
	public String reply(@RequestBody DiscussionReply reply) {
		replyRepo.save(reply);
		return "Reply added!";
	}

	@GetMapping("/{course}")
	public List<Discussion> list(@PathVariable String course) {
		return discussionRepo.findByCourse(course);
	}
}
