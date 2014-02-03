/*
 * Copyright 2014 the original author or authors.
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

import static org.springsource.restbucks.training.Restbucks.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.hal.CurieProvider;
import org.springframework.hateoas.hal.DefaultCurieProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Web layer configuration enabling Spring MVC, Spring Hateoas hypermedia support.
 * 
 * @author Oliver Gierke
 */
@Configuration
@Import({ ApplicationConfig.class, RepositoryRestMvcConfiguration.class })
@ComponentScan(excludeFilters = @Filter({ Service.class, Configuration.class }))
class WebConfiguration extends WebMvcConfigurationSupport {

	// TODO-06.00: ---- Improve discoverability ----
	// TODO-06.01: Enable CurieProvider
	// @Bean
	public CurieProvider curieProvider() {
		return new DefaultCurieProvider(CURIE_NAMESPACE, new UriTemplate("http://localhost:8080/rels/{rel}.html"));
	}
}
