/*
 * Copyright 2008-2009 the original author or authors.
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
package net.hasor.core;
/**
 * 当 AppContext 创建这个Bean时。容器会调用Bean实现的这个接口方法，将容器自身注入进来。
 * @version : 2013-11-8
 * @author 赵永春 (zyc@hasor.net)
 */
public interface AppContextAware {
    /**
     * 注入AppContext。
     * @param appContext 注入的AppContext。
     */
    public void setAppContext(AppContext appContext);
}