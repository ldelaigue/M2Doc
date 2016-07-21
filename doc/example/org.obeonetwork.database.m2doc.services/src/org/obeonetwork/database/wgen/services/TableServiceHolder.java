/*******************************************************************************
 *  Copyright (c) 2016 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
package org.obeonetwork.database.wgen.services;

import org.obeonetwork.m2doc.services.IServiceHolder;

/**
 * Holder for the {@link TableServices}.
 * 
 * @author Romain Guider
 */
public class TableServiceHolder implements IServiceHolder {

    @Override
    public Class<?> getServiceClass() {
        return TableServices.class;
    }

}
