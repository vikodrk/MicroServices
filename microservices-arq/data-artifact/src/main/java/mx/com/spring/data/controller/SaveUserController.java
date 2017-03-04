package mx.com.spring.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.spring.data.request.RequestBody;
import mx.com.spring.data.response.ResponseBody;
import mx.com.spring.entities.Request;
import mx.com.spring.entities.Response;
import mx.com.spring.service.ISaveUserService;

@RestController
public class SaveUserController {

	@Autowired
	private ISaveUserService saveUserService;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public @org.springframework.web.bind.annotation.ResponseBody Response<ResponseBody> saveUser(
			@RequestParam("requestInfo") Request<RequestBody> request) {
		return saveUserService.saveUser(request);
	}

	public void setSaveUserService(ISaveUserService saveUserService) {
		this.saveUserService = saveUserService;
	}

}
