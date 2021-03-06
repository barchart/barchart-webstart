package org.codehaus.mojo.keytool;

/*
 * Copyright 2005-2013 The Codehaus
 *
 * Licensed under the Apache License, Version 2.0 (the "License" );
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

import org.apache.maven.shared.utils.cli.CommandLineException;
import org.apache.maven.shared.utils.cli.Commandline;

/**
 * Describes the result of a KeyTool invocation.
 *
 * @author tchemit <chemit@codelutin.com>
 * @version $Id: DefaultKeyToolResult.java 18901 2013-11-08 18:51:14Z tchemit $
 * @since 1.1
 */
public class DefaultKeyToolResult
    implements KeyToolResult
{
    /**
     * The exception that prevented to execute the command line, will be <code>null</code> if keyTool could be
     * successfully started.
     */
    private CommandLineException executionException;

    /**
     * The exit code reported by the Maven invocation.
     */
    private int exitCode = Integer.MIN_VALUE;

    /**
     * The command line whick produce this result.
     */
    private Commandline commandline;

    /**
     * Creates a new invocation result
     */
    DefaultKeyToolResult()
    {
        // hide constructor
    }

    /**
     * {@inheritDoc}
     */
    public int getExitCode()
    {
        return exitCode;
    }

    /**
     * {@inheritDoc}
     */
    public Commandline getCommandline()
    {
        return commandline;
    }

    /**
     * {@inheritDoc}
     */
    public CommandLineException getExecutionException()
    {
        return executionException;
    }

    /**
     * Sets the exit code reported by the Jarsigner invocation.
     *
     * @param exitCode The exit code reported by the JarSigner invocation.
     */
    void setExitCode( int exitCode )
    {
        this.exitCode = exitCode;
    }

    /**
     * Sets the exception that prevented to execute the command line.
     *
     * @param executionException The exception that prevented to execute the command line, may be <code>null</code>.
     */
    void setExecutionException( CommandLineException executionException )
    {
        this.executionException = executionException;
    }

    /**
     * Sets the command line taht produce this result.
     *
     * @param commandline the incoming command line
     */
    void setCommandline( Commandline commandline )
    {
        this.commandline = commandline;
    }
}