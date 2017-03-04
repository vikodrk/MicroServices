package mx.com.spring.entities;

import java.io.Serializable;
import java.util.Map;

public abstract class AbstractBaseBody<T extends Map<String, ? extends Serializable>> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -841707437288400779L;
	private T body;

	public AbstractBaseBody(T body) {
		setBody(body);
	}

	protected T getBody() {
		return body;
	}

	protected void setBody(T body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		return getBody().hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getBody().toString();
	}

}
