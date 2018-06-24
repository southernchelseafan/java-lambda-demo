package com.southernchelseafan.demo.domain;

public class DemoResponse {
	private Status status;
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override 
	public String toString() {
		return "Response: [status=" + this.status + "]";
	}

	public static class Status {
		private String message;
		private int code;
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		
		@Override
		public String toString() {
			return "Status [message=" + this.message + ", code=" + this.code + "]";
		}
	}
}
