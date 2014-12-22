/**
 */
package connectedFamily.impl;

import connectedFamily.ConnectedFamilyPackage;
import connectedFamily.LocalRouter;
import connectedFamily.MetropolitanRouter;
import connectedFamily.WideRouter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metropolitan Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link connectedFamily.impl.MetropolitanRouterImpl#getSuperRouter <em>Super Router</em>}</li>
 *   <li>{@link connectedFamily.impl.MetropolitanRouterImpl#getConnectedRouters <em>Connected Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetropolitanRouterImpl extends RouterImpl implements MetropolitanRouter {
	/**
	 * The cached value of the '{@link #getSuperRouter() <em>Super Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperRouter()
	 * @generated
	 * @ordered
	 */
	protected WideRouter superRouter;

	/**
	 * The cached value of the '{@link #getConnectedRouters() <em>Connected Routers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalRouter> connectedRouters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetropolitanRouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectedFamilyPackage.Literals.METROPOLITAN_ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WideRouter getSuperRouter() {
		if (superRouter != null && superRouter.eIsProxy()) {
			InternalEObject oldSuperRouter = (InternalEObject)superRouter;
			superRouter = (WideRouter)eResolveProxy(oldSuperRouter);
			if (superRouter != oldSuperRouter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER, oldSuperRouter, superRouter));
			}
		}
		return superRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WideRouter basicGetSuperRouter() {
		return superRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperRouter(WideRouter newSuperRouter) {
		WideRouter oldSuperRouter = superRouter;
		superRouter = newSuperRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER, oldSuperRouter, superRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalRouter> getConnectedRouters() {
		if (connectedRouters == null) {
			connectedRouters = new EObjectResolvingEList<LocalRouter>(LocalRouter.class, this, ConnectedFamilyPackage.METROPOLITAN_ROUTER__CONNECTED_ROUTERS);
		}
		return connectedRouters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER:
				if (resolve) return getSuperRouter();
				return basicGetSuperRouter();
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__CONNECTED_ROUTERS:
				return getConnectedRouters();
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
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER:
				setSuperRouter((WideRouter)newValue);
				return;
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__CONNECTED_ROUTERS:
				getConnectedRouters().clear();
				getConnectedRouters().addAll((Collection<? extends LocalRouter>)newValue);
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
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER:
				setSuperRouter((WideRouter)null);
				return;
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__CONNECTED_ROUTERS:
				getConnectedRouters().clear();
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
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__SUPER_ROUTER:
				return superRouter != null;
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER__CONNECTED_ROUTERS:
				return connectedRouters != null && !connectedRouters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetropolitanRouterImpl
