package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TemplateCommand {
	public String execute(HttpServletRequest request, HttpServletResponse resonse);
}
