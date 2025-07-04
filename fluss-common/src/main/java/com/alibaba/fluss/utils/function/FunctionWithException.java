/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.fluss.utils.function;

import com.alibaba.fluss.annotation.PublicStable;

/**
 * A functional interface for a {@link java.util.function.Function} that may throw exceptions.
 *
 * @param <T> The type of the argument to the function.
 * @param <R> The type of the result of the supplier.
 * @param <E> The type of Exceptions thrown by this function.
 * @since 0.1
 */
@PublicStable
@FunctionalInterface
public interface FunctionWithException<T, R, E extends Throwable> {

    /**
     * Calls this function.
     *
     * @param value The argument to the function.
     * @return The result of thus supplier.
     * @throws E This function may throw an exception.
     */
    R apply(T value) throws E;
}
