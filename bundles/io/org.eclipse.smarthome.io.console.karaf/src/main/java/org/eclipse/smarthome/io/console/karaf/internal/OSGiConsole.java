/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.console.karaf.internal;

import org.eclipse.smarthome.io.console.Console;

/**
 *
 * @author Markus Rathgeb - Initial contribution and API
 *
 */
public class OSGiConsole implements Console {

    private final String scope;

    public OSGiConsole(final String scope) {
        this.scope = scope;
    }

    @Override
    public void print(final String s) {
        System.out.print(s);
    }

    @Override
    public void println(final String s) {
        System.out.println(s);
    }

    @Override
    public void printUsage(final String s) {
        System.out.println(String.format("Usage: %s:%s", scope, s));
    }

}
