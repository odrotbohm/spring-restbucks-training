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
package org.springsource.restbucks.training.order;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springsource.restbucks.training.order.Order.Status;

/**
 * Repository to manage {@link Order} instances.
 * 
 * @author Oliver Gierke
 */
// TODO-01.00: ---- Pagination ----
// TODO-01.01: Enable PagingAndSortingRepository
// TODO-02.00: ---- Querydsl ----
// TODO-02.01: Enable Querydsl (pom.xml)
// TODO-02.02: Enable predicate execution
// TODO-03.00: ---- Custom implementation ----
// TODO-03.01: Create custom interface and implementation
public interface OrderRepository extends QueryDslPredicateExecutor<Order>, CrudRepository<Order, Long> {

	/**
	 * Returns all {@link Order}s with the given {@link Status}.
	 * 
	 * @param status must not be {@literal null}.
	 * @return
	 */
	List<Order> findByStatus(@Param("status") Status status);
}
