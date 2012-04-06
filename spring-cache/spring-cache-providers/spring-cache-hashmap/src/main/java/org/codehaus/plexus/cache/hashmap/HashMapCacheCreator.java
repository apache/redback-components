package org.codehaus.plexus.cache.hashmap;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.codehaus.plexus.cache.Cache;
import org.codehaus.plexus.cache.CacheException;
import org.codehaus.plexus.cache.CacheHints;
import org.codehaus.plexus.cache.factory.CacheCreator;

/**
 * HashMapCacheCreator
 *
 * @author <a href="mailto:joakim@erdfelt.com">Joakim Erdfelt</a>
 * @version $Id$
 */
public class HashMapCacheCreator
    implements CacheCreator
{
    public Cache createCache( CacheHints cacheHint )
        throws CacheException
    {
        // Supports NO CacheHints.

        HashMapCache cache = new HashMapCache();

        cache.initialize();

        return cache;
    }
}
