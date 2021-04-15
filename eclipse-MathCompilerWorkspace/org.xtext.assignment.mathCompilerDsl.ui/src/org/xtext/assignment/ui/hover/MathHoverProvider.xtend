package org.xtext.assignment.ui.hover

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.xtext.assignment.mathCompilerDsl.MathExp
import static extension org.xtext.assignment.generator.MathCompilerDslGenerator.compute
import static extension org.xtext.assignment.generator.MathCompilerDslGenerator.display

class MathHoverProvider extends DefaultEObjectHoverProvider {
	
	override getHoverInfoAsHtml(EObject object) {
		switch object {
			MathExp: '''<p>result of <i>«object.display»</i> is <b>«object.compute»</b></p>'''
			default: super.getHoverInfoAsHtml(object)
		}
	}
	
}