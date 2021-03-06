/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.yongchristophertang.config;

import com.github.yongchristophertang.engine.web.annotations.HTTPMethod;

import java.lang.annotation.*;

/**
 * Indicates that the annotated field should be replaced by the property configurations.
 *
 * @author Yong Tang
 * @since 0.4
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@HTTPMethod(HTTPMethod.GET)
@Documented
public @interface Property {
    /**
     * The property name.
     */
    String value();
}
