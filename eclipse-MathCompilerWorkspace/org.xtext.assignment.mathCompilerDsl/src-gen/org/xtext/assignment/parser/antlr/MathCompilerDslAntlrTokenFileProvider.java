/*
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MathCompilerDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/assignment/parser/antlr/internal/InternalMathCompilerDsl.tokens");
	}
}
