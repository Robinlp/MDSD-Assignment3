/**
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment;

import org.xtext.assignment.MathCompilerDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MathCompilerDslStandaloneSetup extends MathCompilerDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MathCompilerDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
