package org.codehaus.plexus.commandline;

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

import java.util.List;

import org.codehaus.plexus.PlexusTestCase;

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class ExecutableResolverTest
    extends PlexusTestCase
{
    
    
    public void testEmpty()
        throws Exception
    {
        ExecutableResolver helper = (ExecutableResolver) lookup( ExecutableResolver.ROLE );

        assertNotNull( helper.getDefaultPath() );

        assertEquals( 0, helper.getDefaultPath().size() );

    }

    public void testBasic()
        throws Exception
    {

        String separator = System.getProperty( "path.separator" );

        System.setProperty( "plexus.system.path", "a" + separator + "b" );

        ExecutableResolver helper = (ExecutableResolver) lookup( ExecutableResolver.ROLE );

        helper = (ExecutableResolver) lookup( ExecutableResolver.ROLE );

        List path = helper.getDefaultPath();

        assertNotNull( path );

        assertEquals( 2, path.size() );

        assertEquals( "a", path.get( 0 ).toString() );

        assertEquals( "b", path.get( 1 ).toString() );
    }
}
