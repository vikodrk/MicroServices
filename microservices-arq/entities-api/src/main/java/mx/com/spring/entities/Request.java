package mx.com.spring.entities;

import java.io.Serializable;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Request<T extends AbstractBaseBody<? extends Serializable>> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2904200445399105025L;

	private String serviceRequested;

	private String serviceRequest;

	private T requestBody;

	public Request(T body) {
		setRequestBody(body);
	}

	public T getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(T requestBody) {
		this.requestBody = requestBody;
	}

	public String getServiceRequested() {
		return serviceRequested;
	}

	public void setServiceRequested(String serviceRequested) {
		this.serviceRequested = serviceRequested;
	}

	public String getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	@Override
	public int hashCode() {
		Long hashCode = null;
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getServiceRequest().hashCode());
		builder.append(getRequestBody().hashCode());
		hashCode = Long.valueOf(builder.toHashCode());
		return hashCode.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.serviceRequest).append(" - call -> ").append(this.serviceRequested);
		builder.append(" || with -> ").append(this.requestBody);
		return builder.toString();
	}

}
