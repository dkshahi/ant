/*
 * Copyright  2001-2004 Apache Software Foundation
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

package org.apache.tools.ant.taskdefs.condition;

import java.util.Enumeration;
import org.apache.tools.ant.BuildException;

/**
 * &lt;and&gt; condition container.
 *
 * <p>Iterates over all conditions and returns false as soon as one
 * evaluates to false.</p>
 *
 * @author Stefan Bodewig
 * @since Ant 1.4
 * @version $Revision$
 */
public class And extends ConditionBase implements Condition {

    /**
     * @return true if all the contained conditions evaluates to true
     * @exception BuildException if an error occurs
     */
    public boolean eval() throws BuildException {
        Enumeration e = getConditions();
        while (e.hasMoreElements()) {
            Condition c = (Condition) e.nextElement();
            if (!c.eval()) {
                return false;
            }
        }
        return true;
    }

}
