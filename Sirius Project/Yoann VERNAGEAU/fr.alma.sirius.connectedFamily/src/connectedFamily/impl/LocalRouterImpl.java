/**
 */
package connectedFamily.impl;

import connectedFamily.ConnectedFamilyPackage;
import connectedFamily.LocalRouter;
import connectedFamily.MetropolitanRouter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link connectedFamily.impl.LocalRouterImpl#getSuperRouter <em>Super Router</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalRouterImpl extends RouterImpl implements LocalRouter {
	/**
	 * The cached value of the '{@link #getSuperRouter() <em>Super Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperRouter()
	 * @generated
	 * @ordered
	 */
	protected MetropolitanRouter superRouter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalRouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectedFamilyPackage.Literals.LOCAL_ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetropolitanRouter getSuperRouter() {
		if (superRouter != null && superRouter.eIsProxy()) {
			InternalEObject oldSuperRouter = (InternalEObject)superRouter;
			superRouter = (MetropolitanRouter)eResolveProxy(oldSuperRouter);
			if (superRouter != oldSuperRouter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER, oldSuperRouter, superRouter));
			}
		}
		return superRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetropolitanRouter basicGetSuperRouter() {
		return superRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperRouter(MetropolitanRouter newSuperRouter) {
		MetropolitanRouter oldSuperRouter = superRouter;
		superRouter = newSuperRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER, oldSuperRouter, superRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER:
				if (resolve) return getSuperRouter();
				return basicGetSuperRouter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER:
				setSuperRouter((MetropolitanRouter)newValue);
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
			case ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER:
				setSuperRouter((MetropolitanRouter)null);
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
			case ConnectedFamilyPackage.LOCAL_ROUTER__SUPER_ROUTER:
				return superRouter != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalRouterImpl
