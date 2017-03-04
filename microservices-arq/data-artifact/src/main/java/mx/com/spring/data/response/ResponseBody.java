package mx.com.spring.data.response;

import java.util.HashMap;

import mx.com.spring.entities.AbstractBaseBody;

public class ResponseBody extends AbstractBaseBody<HashMap<String, String>> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4647508463871979496L;

	public ResponseBody() {
		super(new HashMap<String, String>());
	}

	public void setResponseBody(HashMap<String, String> response) {
		setBody(response);
	}

	public HashMap<String, String> getResponseBody() {
		return getBody();
	}

}
