/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ingvard.incubator.ignite.flyway.common.sql.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.jetbrains.annotations.Nullable;

/**
 * The Ignite table works on a cache that must be configured either implicitly or explicitly.
 * It is set to {@link org.apache.ignite.cache.QueryEntity}.
 */
@Getter
@RequiredArgsConstructor
public class TableStoreConfig {
    /**
     * Cache name.
     */
    @Nullable
    private final String cacheName;

    /**
     * Cache group.
     */
    @Nullable
    @SuppressWarnings("JavaAbbreviationUsage")
    private final String cacheGroup;

    /**
     * Data region.
     */
    @Nullable
    private final String dataRegion;

    /**
     * Parallelism.
     */
    private final int parallelism;

    /**
     * Backups.
     */
    private final int backups;

    /**
     * Atomicity.
     */
    @Nullable
    private final String atomicity;

    /**
     * Write synchronization mode.
     */
    @Nullable
    private final CacheWriteSynchronizationMode writeSynchronizationMode;

    //TODO add arguments
    //TODO cacheCfgTemplate
    //TODO KEY_TYPE
    //TODO VALUE_TYPE
    //TODO WRAP_KEY
    //TODO WRAP_VALUE
    //TODO ENCRYPTED
    //TODO PK_INLINE_SIZE
    //TODO AFFINITY_INDEX_INLINE_SIZE
}
