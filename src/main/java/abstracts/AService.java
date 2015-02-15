package abstracts;

import interfaces.IService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import utils.ResponseUtil;
import utils.SimpleLogger;

import com.zl.factories.RestTemplateFactory;

abstract public class AService implements IService {
	
	protected RestTemplate restTemplate;

	public AService() {
		this.restTemplate = RestTemplateFactory.getRestTemplateWithTimeout();
	}
	
	@Override
	public void start() {
		SimpleLogger.info("[" + getUri() + "] Request is sent");
		ResponseEntity<String> response = restTemplate.exchange(constructRequestUrl(),
				getHttpMethod(), constructRequestHttpEntity(), String.class);
		boolean isSuccess = isSuccess(response);
		if (isSuccess)
			onSuccess(response);
		else
			onFailure(response);		
		SimpleLogger.info("[" + getUri() + "] Response is back: " + isSuccess);
	}
	
	/**
	 * how to deal with timeout????
	 */
	@Override
	public boolean isSuccess(ResponseEntity<String> response) {
		return response.getStatusCode() == HttpStatus.OK && ResponseUtil.isSuccess(response);
	}
}
