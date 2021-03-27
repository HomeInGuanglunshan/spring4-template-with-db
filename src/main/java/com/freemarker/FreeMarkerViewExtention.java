package com.freemarker;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

public class FreeMarkerViewExtention extends FreeMarkerView {

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) {

		model.put("basePath", request.getContextPath()); // base目录。

	}
}
