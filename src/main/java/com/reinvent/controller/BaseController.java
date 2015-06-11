package com.reinvent.controller;


import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.reinvent.web.StandardJsonResponse;
import com.reinvent.mappers.ClassMapper;
import com.reinvent.mappers.GroupsMapper;
import com.reinvent.mappers.MenuMapper;
import com.reinvent.mappers.PermissionsMapper;
import com.reinvent.mappers.SubjectMapper;
import com.reinvent.mappers.UserMapper;

public class BaseController extends MultiActionController {
	@Autowired(required=true)
	protected StandardJsonResponse jsonResponse;
	protected final Log logger = LogFactory.getLog(getClass());
	
	public   final String  SAVED_SUCCESSFULLY ="Record Successfully Saved...";
	public   final String  UPDATED_SUCCESSFULLY ="Record Successfully Updated...";
	public   final String  DELETED_SUCCESSFULLY ="Record Successfully Deleted...";
	
	@Autowired(required=true)
	UserMapper userMapper;
	@Autowired(required=true)
	GroupsMapper groupsMapper;
	@Autowired(required=true)
	MenuMapper menuMapper;
	@Autowired(required=true)
	PermissionsMapper permissionsMapper;
	@Autowired(required=true)
	SubjectMapper subjectMapper;
	@Autowired(required=true)
	ClassMapper classMapper;
	public String jsonObject(StandardJsonResponse jsonResponse){
		String json=null;
		ObjectMapper mapper = new ObjectMapper();
        try {
			json = mapper.writeValueAsString(jsonResponse);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
}
