package mx.com.spring.entities;

import java.io.Serializable;

public abstract class AbstractBaseEntity<T extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6814340526809896538L;
	
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();
	
	public abstract String toString();
	
}
