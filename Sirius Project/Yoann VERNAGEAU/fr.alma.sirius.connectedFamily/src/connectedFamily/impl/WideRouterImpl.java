/**
 */
package connectedFamily.impl;

import connectedFamily.ConnectedFamilyPackage;
import connectedFamily.MetropolitanRouter;
import connectedFamily.WideRouter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wide Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link connectedFamily.impl.WideRouterImpl#getConnectedRouters <em>Connected Routers</em>}</li>
 *   <li>{@link connectedFamily.impl.WideRouterImpl#getSiblings <em>Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WideRouterImpl extends RouterImpl implements WideRouter {
	/**
	 * The cached value of the '{@link #getConnectedRouters() <em>Connected Routers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<MetropolitanRouter> connectedRouters;

	/**
	 * The cached value of the '{@link #getSiblings() <em>Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<WideRouter> siblings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WideRouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectedFamilyPackage.Literals.WIDE_ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetropolitanRouter> getConnectedRouters() {
		if (connectedRouters == null) {
			connectedRouters = new EObjectResolvingEList<MetropolitanRouter>(MetropolitanRouter.class, this, ConnectedFamilyPackage.WIDE_ROUTER__CONNECTED_ROUTERS);
		}
		return connectedRouters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WideRouter> getSiblings() {
		if (siblings == null) {
			siblings = new EObjectResolvingEList<WideRouter>(WideRouter.class, this, ConnectedFamilyPackage.WIDE_ROUTER__SIBLINGS);
		}
		return siblings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectedFamilyPackage.WIDE_ROUTER__CONNECTED_ROUTERS:
				return getConnectedRouters();
			case ConnectedFamilyPackage.WIDE_ROUTER__SIBLINGS:
				return getSiblings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConnectedFamilyPackage.WIDE_ROUTER__CONNECTED_ROUTERS:
				getConnectedRouters().clear();
				getConnectedRouters().addAll((Collection<? extends MetropolitanRouter>)newValue);
				return;
			case ConnectedFamilyPackage.WIDE_ROUTER__SIBLINGS:
				getSiblings().clear();
				getSiblings().addAll((Collection<? extends WideRouter>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConnectedFamilyPackage.WIDE_ROUTER__CONNECTED_ROUTERS:
				getConnectedRouters().clear();
				return;
			case ConnectedFamilyPackage.WIDE_ROUTER__SIBLINGS:
				getSiblings().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConnectedFamilyPackage.WIDE_ROUTER__CONNECTED_ROUTERS:
				return connectedRouters != null && !connectedRouters.isEmpty();
			case ConnectedFamilyPackage.WIDE_ROUTER__SIBLINGS:
				return siblings != null && !siblings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WideRouterImpl
