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

import net.minidev.json.parser.JSONParser;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springsource.restbucks.training.AbstractWebIntegrationTest;

/**
 * @author Oliver Gierke
 */
// TODO-02.00: ---- General web test setup ----
// TODO-03.00: ---- Define web tests ----
@Ignore
public class OrderResourceIntegrationTest extends AbstractWebIntegrationTest {

	@Autowired WebApplicationContext context;

	JSONParser parser;

	@Before
	@Override
	public void setUp() {
		parser = new JSONParser(JSONParser.MODE_PERMISSIVE);
	}

	@Test
	public void exposesOrdersResourceViaRootResource() throws Exception {

		// TODO-03.01: Perform GET request
		// mvc.perform(get("/")).//
		// TODO-03.02: Assert 200
		// andExpect(status().isOk()). //
		// TODO-03.03: Assert media type
		// andExpect(content().contentType(MediaTypes.HAL_JSON)). //
		// TODO-03.04: Assert order link present
		// andExpect(jsonPath("$_links.orders.href", notNullValue()));
	}
}
