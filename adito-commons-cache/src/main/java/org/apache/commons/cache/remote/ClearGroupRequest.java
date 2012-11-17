/*
 * Copyright 2001-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cache.remote;

import java.io.Serializable;

/**
 * tk.
 *
 * @version $Id: ClearGroupRequest.java 155435 2005-02-26 13:17:27Z dirkv $
 * @author Rodney Waldhoff
 */
public class ClearGroupRequest implements CacheRequest {
  protected Serializable _group = null;

  public ClearGroupRequest(Serializable group) {
    _group = group;
  }

  public Serializable getGroup() {
    return _group;
  }

  public boolean equals(ClearGroupRequest req) {
    return ( (null != req)  && (null == req.getGroup() ? null == _group : _group.equals(req.getGroup())) );
  }

  public int hashCode() {
    return (null == _group ? -1 : _group.hashCode());
  }
}