/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.local;

import org.eclipse.che.api.core.ConflictException;
import org.eclipse.che.api.user.server.TokenValidator;
import org.eclipse.che.api.user.server.dao.User;
import org.eclipse.che.commons.env.EnvironmentContext;

import javax.inject.Singleton;

/**
 * Dummy implementation of {@link org.eclipse.che.api.user.server.TokenValidator}.
 * 
 * @author Ann Shumilova
 * @author Dmitry Shnurenko
 */
@Singleton
public class DummyTokenValidator implements TokenValidator {

    @Override
    public User validateToken(String token) throws ConflictException {
        return new User().withName("che").withEmail("che@eclipse.org");
    }
}
