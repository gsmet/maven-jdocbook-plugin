/*
 * jDocBook, processing of DocBook sources as a Maven plugin
 *
 * Copyright (c) 2009, Red Hat Middleware LLC or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Middleware LLC.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.jboss.maven.plugins.jdocbook;

import org.jboss.jdocbook.JDocBookProcessException;
import org.jboss.jdocbook.i18n.I18nEnvironment;

/**
 * Manages pushing translatable strings from the master translation source into the POT files.
 * 
 * @goal update-pot
 * @requiresDependencyResolution
 *
 * @author Steve Ebersole
 */
public class UpdatePotMojo extends AbstractDocBookMojo implements I18nEnvironment {
	protected void doExecute() throws JDocBookProcessException {
		getI18nProcesserFactory().getPotSynchronizer().synchronizePot();
	}
}
