/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.NumericExpression;
import fr.inria.lang.vM.NumericExpression_List;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.NumericExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.NumericExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.NumericExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.NumericExpressionImpl#getExpression_list <em>Expression list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericExpressionImpl extends ExpressionImpl implements NumericExpression
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected NumericExpression expression;

  /**
   * The cached value of the '{@link #getExpression_list() <em>Expression list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_list()
   * @generated
   * @ordered
   */
  protected NumericExpression_List expression_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumericExpressionImpl()
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
    return VMPackage.Literals.NUMERIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(NumericExpression newExpression, NotificationChain msgs)
  {
    NumericExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(NumericExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.NUMERIC_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.NUMERIC_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression_List getExpression_list()
  {
    return expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_list(NumericExpression_List newExpression_list, NotificationChain msgs)
  {
    NumericExpression_List oldExpression_list = expression_list;
    expression_list = newExpression_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST, oldExpression_list, newExpression_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_list(NumericExpression_List newExpression_list)
  {
    if (newExpression_list != expression_list)
    {
      NotificationChain msgs = null;
      if (expression_list != null)
        msgs = ((InternalEObject)expression_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST, null, msgs);
      if (newExpression_list != null)
        msgs = ((InternalEObject)newExpression_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST, null, msgs);
      msgs = basicSetExpression_list(newExpression_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST, newExpression_list, newExpression_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST:
        return basicSetExpression_list(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VMPackage.NUMERIC_EXPRESSION__VALUE:
        return getValue();
      case VMPackage.NUMERIC_EXPRESSION__OP:
        return getOp();
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return getExpression();
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST:
        return getExpression_list();
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
      case VMPackage.NUMERIC_EXPRESSION__VALUE:
        setValue((String)newValue);
        return;
      case VMPackage.NUMERIC_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION:
        setExpression((NumericExpression)newValue);
        return;
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST:
        setExpression_list((NumericExpression_List)newValue);
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
      case VMPackage.NUMERIC_EXPRESSION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case VMPackage.NUMERIC_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION:
        setExpression((NumericExpression)null);
        return;
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST:
        setExpression_list((NumericExpression_List)null);
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
      case VMPackage.NUMERIC_EXPRESSION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case VMPackage.NUMERIC_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return expression != null;
      case VMPackage.NUMERIC_EXPRESSION__EXPRESSION_LIST:
        return expression_list != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //NumericExpressionImpl
