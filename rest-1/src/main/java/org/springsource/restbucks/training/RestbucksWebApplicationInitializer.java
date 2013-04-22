/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springsource.restbucks.training;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Servlet 3.0 {@link WebApplicationInitializer} using Spring 3.2 convenient base class
 * {@link AbstractAnnotationConfigDispatcherServletInitializer}. It essentially sets up a root application context from
 * {@link ApplicationConfig}, and a dispatcher servlet application context from {@link RepositoryRestMvcConfiguration}
 * (enabling Spring Data REST) and {@link WebConfiguration} for general Spring MVC customizations.
 * 
 * @author Oliver Gierke
 */
// TODO-01.00: ---- Spring Data REST ----
// TODO-01.01: Bootstrap web application
public abstract class RestbucksWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/* 
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletFilters()
	 */
	@Override
	protected javax.servlet.Filter[] getServletFilters() {
		return new javax.servlet.Filter[] { new OpenEntityManagerInViewFilter() };
	}

	/**
	 * Web layer configuration enabling Spring MVC, Spring Hateoas hypermedia support.
	 * 
	 * @author Oliver Gierke
	 */
	@Configuration
	// TODO-01.02: Activate Spring Data REST
	// TODO-02.00: ---- Browse resources ----
	// TODO-02.01: Add Jackson/JodaTime integration
	public static class WebConfiguration extends WebMvcConfigurationSupport {

		/*
		 * (non-Javadoc)
		 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#configureContentNegotiation(org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer)
		 */
		@Override
		public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
			configurer.defaultContentType(MediaType.APPLICATION_JSON);
		}
	}
}
