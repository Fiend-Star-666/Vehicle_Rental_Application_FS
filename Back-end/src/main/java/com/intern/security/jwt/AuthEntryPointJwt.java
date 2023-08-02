package com.intern.security.jwt;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {
	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
	      throws IOException, ServletException {

		  // Log the details of the request
		  StringBuilder requestDetails = new StringBuilder();
		  requestDetails.append("Request Details:\n");
		  requestDetails.append("Method: ").append(request.getMethod()).append("\n");
		  requestDetails.append("URL: ").append(request.getRequestURL()).append("\n");
		  requestDetails.append("Query Parameters: ").append(request.getQueryString()).append("\n");
		  requestDetails.append("Headers: ").append(getHeadersAsString(request));

		  logger.error(requestDetails.toString());

		  // Log the details of the response
		  StringBuilder responseDetails = new StringBuilder();
		  responseDetails.append("Response Details:\n");
		  responseDetails.append("Status Code: ").append(response.getStatus()).append("\n");
		  responseDetails.append("Headers: ").append(getHeadersAsString(response));

		  logger.error(responseDetails.toString());

	    logger.error("Unauthorized error: {}", Arrays.toString(authException.getStackTrace()));
	    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
	    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

	    final Map<String, Object> body = new HashMap<>();
	    body.put("status", HttpServletResponse.SC_UNAUTHORIZED);
	    body.put("error", "Unauthorized");
	    body.put("message", authException.getMessage());
	    body.put("path", request.getServletPath());

	    final ObjectMapper mapper = new ObjectMapper();
	    mapper.writeValue(response.getOutputStream(), body);

	  }

	private String getHeadersAsString(HttpServletRequest request) {
		Enumeration<String> headerNames = request.getHeaderNames();
		StringBuilder headersBuilder = new StringBuilder();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			headersBuilder.append(headerName).append(": ").append(headerValue).append(", ");
		}
		return headersBuilder.toString();
	}

	private String getHeadersAsString(HttpServletResponse response) {
		return response.getHeaderNames().stream()
				.map(headerName -> headerName + ": " + response.getHeader(headerName))
				.collect(Collectors.joining(", "));
	}
}
