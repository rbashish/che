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
package org.eclipse.che.ide.ext.java.shared.dto;

import org.eclipse.che.dto.shared.DTO;

/**
 * @author Evgen Vidolob
 */
@DTO
public interface ProposalPresentation {

    String getImage();

    void setImage(String image);

    String getDisplayString();

    void setDisplayString(String displayString);

    boolean isAutoInsertable();

    void setAutoInsertable(boolean insertable);

    int getIndex();

    void setIndex(int index);

    String getActionId();

    void setActionId(String actionId);

}
