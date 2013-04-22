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
package org.springsource.restbucks.training.payment.web;

import org.springframework.hateoas.Link;
import org.springsource.restbucks.training.order.Order;
import org.springsource.restbucks.training.payment.Payment;
import org.springsource.restbucks.training.payment.Payment.Receipt;

/**
 * Helper component to create links to the {@link Payment} and {@link Receipt}.
 * 
 * @author Oliver Gierke
 */
// TODO-01.02: Enable PaymentLinks
// TODO-02.00: ---- Using EntityLinks ----
// TODO-02.01: Use EntityLinks
public class PaymentLinks {

	static final String PAYMENT = "/payment";
	static final String RECEIPT = "/receipt";
	static final String PAYMENT_REL = "payment";
	static final String RECEIPT_REL = "receipt";

	/**
	 * Returns the {@link Link} to point to the {@link Payment} for the given {@link Order}.
	 * 
	 * @param order must not be {@literal null}.
	 * @return
	 */
	Link getPaymentLink(Order order) {

		// TODO-01.03: Implement link using ControllerLinkBuilder
		// TODO-02.02: Implement link using EntityLinks
		return null;
	}

	/**
	 * Returns the {@link Link} to the {@link Receipt} of the given {@link Order}.
	 * 
	 * @param order
	 * @return
	 */
	Link getReceiptLink(Order order) {

		// TODO-01.03: Implement link using ControllerLinkBuilder
		// TODO-02.02: Implement link using EntityLinks
		return null;
	}
}
