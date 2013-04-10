/*
 * Copyright 2013 the original author or authors.
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
package org.springsource.restbucks.training.order.web;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springsource.restbucks.training.AbstractWebIntegrationTest;

/**
 * @author Oliver Gierke
 */
// TODO-03.00: ---- General web test setup ----
// TODO-04.00: ---- Define web tests ----
@Ignore
public class OrderResourceIntegrationTest extends AbstractWebIntegrationTest {

	@Autowired
	WebApplicationContext context;

	MockMvc mvc;

	@Before
	public void setUp() {

		OpenEntityManagerInViewFilter oemivFilter = new OpenEntityManagerInViewFilter();
		oemivFilter.setServletContext(context.getServletContext());

		mvc = MockMvcBuilders.webAppContextSetup(context). // TODO-03.02: Set up MockMvc
				addFilter(oemivFilter). // TODO-03.03: Add OEMIV
				build();
	}

	@Test
	public void exposesOrdersResourceViaRootResource() throws Exception {

		// TODO-04.01: Perform GET request
		// TODO-04.02: Assert 200
		// TODO-04.03: Assert media type
		// TODO-04.04: Assert order link present
	}
}
