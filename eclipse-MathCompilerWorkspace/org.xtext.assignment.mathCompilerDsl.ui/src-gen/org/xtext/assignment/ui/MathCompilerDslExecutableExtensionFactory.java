/*
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.assignment.mathCompilerDsl.ui.internal.MathCompilerDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MathCompilerDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MathCompilerDslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MathCompilerDslActivator activator = MathCompilerDslActivator.getInstance();
		return activator != null ? activator.getInjector(MathCompilerDslActivator.ORG_XTEXT_ASSIGNMENT_MATHCOMPILERDSL) : null;
	}

}