/*
 * Copyright 2012-2015 the original author or authors.
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
package org.springsource.restbucks.training.order;

import static org.springsource.restbucks.training.core.Currencies.*;

import org.javamoney.moneta.Money;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springsource.restbucks.training.AbstractIntegrationTest;

/**
 * Integration tests for Spring Data based {@link OrderRepository}.
 * 
 * @author Oliver Gierke
 */
@Ignore
public class OrderRepositoryIntegrationTest extends AbstractIntegrationTest {

	@Autowired OrderRepository repository;

	@Test
	public void findsAllOrders() {
		// TODO-03.02: Implement test case
	}

	@Test
	public void createsNewOrder() {
		// TODO-03.03: Implement test case
	}

	@Test
	public void findsOrderByStatus() {
		// TODO-03.04: Implement test case
	}

	public static Order createOrder() {
		return new Order(new Item("English breakfast", Money.of(2.70, EURO)));
	}
}
