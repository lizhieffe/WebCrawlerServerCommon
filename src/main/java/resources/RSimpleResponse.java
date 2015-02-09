package resources;

public class RSimpleResponse {
	private RResponse response;
	private RError error;
	
	public RResponse getResponse() {
		return response;
	}
	
	public void setResponse(RResponse response) {
		this.response = response;
	}
	
	public RError getError() {
		return error;
	}
	
	public void setError(RError error) {
		this.error = error;
	}
}

class RResponse {
	private boolean is_succeed;

	public boolean isIs_succeed() {
		return is_succeed;
	}

	public void setIs_succeed(boolean is_succeed) {
		this.is_succeed = is_succeed;
	}	
}

class RError {
	private int code;
	private String type;
	private String message;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}