/*
 * Copyright 2013-2015 the original author or authors.
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

import org.junit.Test;
import org.springsource.restbucks.training.AbstractWebIntegrationTest;

/**
 * @author Oliver Gierke
 */
// TODO-03.00: ---- General web test setup ----
// TODO-04.00: ---- Define web tests ----
public class OrderResourceIntegrationTest extends AbstractWebIntegrationTest {

	@Test
	public void exposesOrdersResourceViaRootResource() throws Exception {

		// TODO-04.01: Perform GET request
		// mvc.perform(get("/")).//
		// TODO-04.02: Assert 200
		// andExpect(status().isOk()). //
		// TODO-04.03: Assert media type
		// andExpect(content().contentType(MediaTypes.HAL_JSON)). //
		// TODO-04.04: Assert order link present
		// andExpect(jsonPath("$_links.orders.href", notNullValue()));
	}
}
