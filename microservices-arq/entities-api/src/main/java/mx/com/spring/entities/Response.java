package mx.com.spring.entities;

import java.io.Serializable;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.http.HttpStatus;

public class Response<T extends AbstractBaseBody<? extends Serializable>> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9177707412267153647L;

	private HttpStatus statusResponse;

	private String serviceResponse;

	private T requestBody;

	public HttpStatus getStatusResponse() {
		return statusResponse;
	}

	public void setStatusResponse(HttpStatus statusResponse) {
		this.statusResponse = statusResponse;
	}

	public String getServiceResponse() {
		return serviceResponse;
	}

	public void setServiceResponse(String serviceResponse) {
		this.serviceResponse = serviceResponse;
	}

	public T getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(T requestBody) {
		this.requestBody = requestBody;
	}

	@Override
	public int hashCode() {
		Long hashCode;
		hashCode = Long.valueOf((new HashCodeBuilder().append(serviceResponse).toHashCode())
				+ (new HashCodeBuilder().append(requestBody).toHashCode()));
		return hashCode.hashCode();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(statusResponse).append(" - ");
		builder.append(serviceResponse).append(" -- ").append(requestBody);
		return builder.toString();
	}

}
