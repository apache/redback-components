package org.apache.archiva.redback.components.evaluator.sources;

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

import org.apache.archiva.redback.components.evaluator.ExpressionSource;

import java.util.Properties;

/**
 * PropertiesExpressionSource 
 *
 * @author <a href="mailto:joakim@erdfelt.com">Joakim Erdfelt</a>
 *
 * 
 */
public class PropertiesExpressionSource
    implements ExpressionSource
{
    private Properties properties;

    public String getExpressionValue( String expression )
    {
        if ( properties == null )
        {
            throw new IllegalStateException( "Properties object has not been initialized." );
        }

        try
        {
            return properties.getProperty( expression );
        }
        catch ( Exception e )
        {
            return null;
        }
    }

    public Properties getProperties()
    {
        return properties;
    }

    public void setProperties( Properties properties )
    {
        this.properties = properties;
    }

}
