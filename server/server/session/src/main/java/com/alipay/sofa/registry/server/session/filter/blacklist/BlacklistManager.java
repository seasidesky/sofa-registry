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
 */
package com.alipay.sofa.registry.server.session.filter.blacklist;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shangyu.wh
 * @version 1.0: BlacklistManager.java, v 0.1 2019-06-19 18:27 shangyu.wh Exp $
 */
public interface BlacklistManager {
    /**
     * load list first
     */
    void load();

    /**
     * get list
     * @return
     */
    List<BlacklistConfig> getBlacklistConfigList();

    /**
     * set list
     * @param blacklistConfigList
     */
    void setBlacklistConfigList(List<BlacklistConfig> blacklistConfigList);

    /**
     * convert blacklist map to blacklist config list
     * @param config
     * @return
     * blacklistConfigMap key:blacklist type
     * Map<String, Set<String>> key:MatchType
     * set:match patterns
     */
    Map<String, Map<String, Set<String>>> convertBlacklistConfig(String config);
}