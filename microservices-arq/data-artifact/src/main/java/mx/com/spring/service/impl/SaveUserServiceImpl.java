package mx.com.spring.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import mx.com.spring.data.request.RequestBody;
import mx.com.spring.data.response.ResponseBody;
import mx.com.spring.entities.Request;
import mx.com.spring.entities.Response;
import mx.com.spring.service.ISaveUserService;

public class SaveUserServiceImpl implements ISaveUserService {

	@HystrixCommand(fallbackMethod = "saveUserFallBack")
	public Response<ResponseBody> saveUser(Request<RequestBody> request) {

		return null;
	}

	public Response<ResponseBody> saveUserFallBack(Request<RequestBody> request) {
		return null;
	}

}
