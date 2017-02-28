package io.naren.org.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.naren.org.model.*;

@Service
public class TopicsService {

	@Autowired
	private TopicRepo topicrepo;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> list = new ArrayList<>();
		topicrepo.findAll().forEach(list::add);
		return list;
	}
	
	public void addTopic(Topic topic)
	{
		topicrepo.save(topic);
	}
	
	public void updateTopic(Topic topic)
	{
		topicrepo.save(topic);
	}
	
	public void deleteTopic(Topic id)
	{
		topicrepo.delete(id);
	}
	
	public Topic getbyId(String id)
	{
		return topicrepo.findOne(id);
	}
}
