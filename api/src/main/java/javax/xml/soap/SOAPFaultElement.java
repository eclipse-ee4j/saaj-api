/*
 * Copyright (c) 2004, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package javax.xml.soap;

/**
 * A representation of the contents in
 * a {@code SOAPFault} object.  The {@code Detail} interface
 * is a {@code SOAPFaultElement}.
 * <P>
 * Content is added to a {@code SOAPFaultElement} using the
 * {@code SOAPElement} method {@code addTextNode}.
 *
 * @since 1.6
 */
public interface SOAPFaultElement extends SOAPElement {
}
