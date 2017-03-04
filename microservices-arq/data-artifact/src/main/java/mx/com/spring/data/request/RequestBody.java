package mx.com.spring.data.request;

import java.util.HashMap;
import java.util.Map;

import mx.com.spring.data.entities.User;
import mx.com.spring.entities.AbstractBaseBody;

public class RequestBody extends AbstractBaseBody<HashMap<String, User>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1337461613605894138L;

	public RequestBody() {
		super(new HashMap<String, User>());
	}

	public Map<String, User> getUsers() {
		return getBody();
	}

	public void setUsers(HashMap<String, User> users) {
		setBody(users);
	}

}
