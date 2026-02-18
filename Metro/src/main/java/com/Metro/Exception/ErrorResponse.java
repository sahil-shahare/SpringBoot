package com.Metro.Exception;

import java.time.LocalDateTime;

public class ErrorResponse {

	int StatusCOde;
	String msg;
	LocalDateTime time;
	String trace;
	
	public int getStatusCOde() {
		return StatusCOde;
	}
	public void setStatusCOde(int statusCOde) {
		StatusCOde = statusCOde;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}
	
	
}
