package io.naren.org.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.naren.org.model.Topic;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	private TopicsService service;
	
	@RequestMapping(value="listall", method=RequestMethod.GET)
	public List<Topic> getTopic()
	{
		return service.getAllTopics();
	}
	
	@RequestMapping(value="addtopic" , method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic)
	{
		service.addTopic(topic);
	}
	
	@RequestMapping(value="getbyid/{id}" , method=RequestMethod.GET)
	public Topic getById(@PathParam("id") String id)
	{
		return service.getbyId(id);
	}
	
	@RequestMapping(value="deletetopic" , method=RequestMethod.DELETE)
	public void deleteCourse(@RequestBody Topic id)
	{
		service.deleteTopic(id);
	}
	
	@RequestMapping(value="update" , method=RequestMethod.POST)
	public void updateTopic(@RequestBody Topic topic)
	{
		service.addTopic(topic);
	}
}