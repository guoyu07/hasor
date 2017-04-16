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
package net.hasor.graphql.task.source;
import net.hasor.graphql.TaskContext;
import net.hasor.graphql.result.ValueModel;
import net.hasor.graphql.task.AbstractQueryTask;
import net.hasor.graphql.task.TaskType;
/**
 *
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class OriginalSourceTask extends AbstractQueryTask {
    public OriginalSourceTask(String nameOfParent, AbstractQueryTask dataSource) {
        super(nameOfParent, TaskType.V, dataSource);
    }
    @Override
    public Object doTask(TaskContext taskContext, Object inData) throws Throwable {
        return new ValueModel(inData);
    }
}