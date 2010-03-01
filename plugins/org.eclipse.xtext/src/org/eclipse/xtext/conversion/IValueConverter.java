/*******************************************************************************
 * Copyright (c) itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.conversion;

import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 * @param <Type>
 */
public interface IValueConverter<Type> {
	
	IValueConverter<? extends Object> NO_OP_CONVERTER = new IValueConverter<String>() {
		public String toString(String value) {
			return value;
		}
		public String toValue(String string, AbstractNode node) {
			return string;
		}
	};
	
	/**
	 * @param string
	 * @param node
	 * @return
	 * @throws ValueConverterException
	 */
	public Type toValue(String string, AbstractNode node) throws ValueConverterException;
	
	/**
	 * @param value
	 * @return
	 */
	public String toString(Type value);
}
