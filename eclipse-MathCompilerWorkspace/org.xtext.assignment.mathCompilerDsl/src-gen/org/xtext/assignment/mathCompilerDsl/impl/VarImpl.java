/**
 * generated by Xtext 2.24.0
 */
package org.xtext.assignment.mathCompilerDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.assignment.mathCompilerDsl.Let;
import org.xtext.assignment.mathCompilerDsl.MathCompilerDslPackage;
import org.xtext.assignment.mathCompilerDsl.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.assignment.mathCompilerDsl.impl.VarImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarImpl extends VariableUseImpl implements Var
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Let ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MathCompilerDslPackage.Literals.VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Let getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Let)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathCompilerDslPackage.VAR__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(Let newRef)
  {
    Let oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathCompilerDslPackage.VAR__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MathCompilerDslPackage.VAR__REF:
        if (resolve) return getRef();
        return basicGetRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MathCompilerDslPackage.VAR__REF:
        setRef((Let)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MathCompilerDslPackage.VAR__REF:
        setRef((Let)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MathCompilerDslPackage.VAR__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //VarImpl
