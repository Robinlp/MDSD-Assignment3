/**
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.assignment.generator.MathCompilerDslGenerator;
import org.xtext.assignment.mathCompilerDsl.MathLang;
import org.xtext.assignment.tests.MathCompilerDslInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathCompilerDslInjectorProvider.class)
@SuppressWarnings("all")
public class MathCompilerDslParsingTest {
  @Inject
  private ParseHelper<MathLang> parseHelper;
  
  @Test
  public void T01_dummy() {
    Assertions.assertTrue(true);
  }
  
  @Test
  public void T01_loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T01_loadModel\" is 87");
      final MathLang result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result.getMathList().get(0));
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T02_addition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T02_addition\" is 80+7");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T02_addsub() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T02_addsub\" is 100-20+10-3");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T02_muldiv() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T02_muldiv\" is 100*20/10*3");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 600);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T02_parens() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T02_parens\" is (10+3)*7-4");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T03_precedence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T03_precedence\" is 10+3*4-12/3+3");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 21);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T03_left_assoc_minus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T03_left_assoc_minus\" is 10-5-2");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 3);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T03_left_assoc_div() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T03_left_assoc_div\" is 10/5/2");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 1);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T04_let() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T04_let\" is let x=10*8 in x+7 end");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T04_nested_let_other_var() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T04_nested_let_other_var\" is let x=2 in let y=3 in x*y end + x end + 79");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void T04_nested_let_same_var() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result \"T04_nested_let_same_var\" is let x=2 in let x=3 in x*x end + x end + 76");
      final MathLang result = this.parseHelper.parse(_builder);
      int _compute = MathCompilerDslGenerator.compute(result.getMathList().get(0));
      boolean _equals = (_compute == 87);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
