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
 * @version $Id: KeyToolResult.java 18901 2013-11-08 18:51:14Z tchemit $
 * @since 1.1
 */
public interface KeyToolResult
{

    /**
     * Gets the command line used.
     *
     * @return The command line used
     */
    Commandline getCommandline();

    /**
     * Gets the exception that possibly occurred during the execution of the command line.
     *
     * @return The exception that prevented to invoke KeyTool or <code>null</code> if the command line was successfully
     *         processed by the operating system.
     */
    CommandLineException getExecutionException();

    /**
     * Gets the exit code from the KeyTool invocation. A non-zero value indicates a build failure.
     * <p/>
     * <strong>Note:</strong> This value is undefined if {@link #getExecutionException()} reports an exception.
     *
     * @return The exit code from the Jarsigner invocation.
     */
    int getExitCode();
}
