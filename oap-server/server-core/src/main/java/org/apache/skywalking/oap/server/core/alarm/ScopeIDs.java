/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.alarm;

import java.util.Arrays;

/**
 * Scope IDs represent IDs of this scope.
 * Such as:
 * 1. Service, Endpoint have a single int ID.
 * 2. Service Relation ID is combined by two INTs.
 */
public class ScopeIDs {
    private int[] ids;

    public ScopeIDs(int... ids) {
        this.ids = ids;
    }

    public int getID(int idx) {
        return ids[idx];
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ScopeIDs ds = (ScopeIDs)o;
        return Arrays.equals(ids, ds.ids);
    }

    @Override public int hashCode() {
        return Arrays.hashCode(ids);
    }
}
