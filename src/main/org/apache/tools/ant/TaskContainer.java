/*
 * Copyright  2001-2002,2004 Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant;

/**
 * Interface for objects which can contain tasks.
 * <p>
 * It is recommended that implementations call perform rather than
 * execute for the tasks they contain, as this method ensures that the
 * appropriate BuildEvents will be generated.
 *
 * @see Task#perform
 * @see Task#execute
 * @see BuildEvent
 *
 * @author Conor MacNeill
 */
public interface TaskContainer {
    /**
     * Adds a task to this task container
     *
     * @param task The task to be added to this container.
     *             Must not be <code>null</code>.
     */
    void addTask(Task task);
}

