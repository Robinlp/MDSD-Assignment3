package org.xtext.assignment.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.xtext.assignment.generator.MathCompilerDslGenerator;
import org.xtext.assignment.mathCompilerDsl.MathExp;

@SuppressWarnings("all")
public class MathHoverProvider extends DefaultEObjectHoverProvider {
  @Override
  public String getHoverInfoAsHtml(final EObject object) {
    String _switchResult = null;
    boolean _matched = false;
    if (object instanceof MathExp) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>result of <i>");
      String _display = MathCompilerDslGenerator.display(((MathExp)object));
      _builder.append(_display);
      _builder.append("</i> is <b>");
      int _compute = MathCompilerDslGenerator.compute(((MathExp)object));
      _builder.append(_compute);
      _builder.append("</b></p>");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      _switchResult = super.getHoverInfoAsHtml(object);
    }
    return _switchResult;
  }
}
