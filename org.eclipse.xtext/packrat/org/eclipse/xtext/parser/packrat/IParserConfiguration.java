/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat;

import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.KeywordConsumer;
import org.eclipse.xtext.parser.packrat.consumers.EnumLiteralConsumer;

/**
 * This interface is not intended to be implemented by clients. A implementation
 * is usually generated by Xtext.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface IParserConfiguration {

	/**
	 * Return a references to the same and same again root consumer.
	 * @return a consumer that allows to parse the root node of a language.
	 */
	INonTerminalConsumer getRootConsumer();

	/**
	 * Create any non-terminal consumers, that are required.
	 * Do not initialize their internal state except for a valid constructor call.
	 * Implementors should note, that any created consumer should be referable by
	 * a meaningful getter.
	 * Ensure that you call {@link #createNonTerminalConsumers()} for any referenced
	 * other parser configuration in this method.
	 * It is ensured that {@link #createTerminalConsumers()} is called before {@link #createNonTerminalConsumers()} thus
	 * the terminals can be used to set the hidden tokens per terminal.
	 * @see #configureConsumers()
	 * @see #createTerminalConsumers()
	 */
	void createNonTerminalConsumers();

	/**
	 * Create any terminal consumers, that are required.
	 * This is the first method that is called during the lifecycle. Do not initialize
	 * them further. Therefore {@link #configureConsumers()} will be called.
	 * @see #configureConsumers()
	 */
	void createTerminalConsumers();

	/**
	 * Initialize the created consumers. Set any references to allowed or disallowed follow rules.
	 * It is ensured, that {@link #createNonTerminalConsumers()} and {@link #createTerminalConsumers()}
	 * was called before.
	 */
	void configureConsumers();

	/**
	 * The created keyword consumer should not be referenced from the parser configuration.
	 * @return a fresh keyword consumer.
	 */
	KeywordConsumer createKeywordConsumer();

	/**
	 * The created literal consumer should not be referenced from the parser configuration.
	 * @return a fresh literal consumer.
	 */
	EnumLiteralConsumer createLiteralConsumer();

	/**
	 * Provides access to the initial (e.g. default) hidden terminal consumers.
	 * @return the initial hidden terminals.
	 */
	ITerminalConsumer[] getInitialHiddenTerminals();

}
