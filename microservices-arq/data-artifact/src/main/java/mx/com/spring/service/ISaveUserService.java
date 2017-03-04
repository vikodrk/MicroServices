package mx.com.spring.service;

import org.springframework.stereotype.Service;

import mx.com.spring.data.request.RequestBody;
import mx.com.spring.data.response.ResponseBody;
import mx.com.spring.entities.Request;
import mx.com.spring.entities.Response;

@Service
public interface ISaveUserService {

	Response<ResponseBody> saveUser(Request<RequestBody> request);

}
