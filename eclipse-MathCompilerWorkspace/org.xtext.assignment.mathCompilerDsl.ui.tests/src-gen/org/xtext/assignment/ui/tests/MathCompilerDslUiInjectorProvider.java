/*
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.assignment.mathCompilerDsl.ui.internal.MathCompilerDslActivator;

public class MathCompilerDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MathCompilerDslActivator.getInstance().getInjector("org.xtext.assignment.MathCompilerDsl");
	}

}