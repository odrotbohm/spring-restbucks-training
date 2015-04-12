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
package org.springsource.restbucks.training;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Spring JavaConfig configuration class to setup a Spring container and infrastructure components like a
 * {@link DataSource}, a {@link EntityManagerFactory} and a {@link PlatformTransactionManager}.
 *
 * @author Oliver Gierke
 */
@SpringBootApplication
@EntityScan(basePackageClasses = { Application.class, Jsr310JpaConverters.class })
class Application {

}
