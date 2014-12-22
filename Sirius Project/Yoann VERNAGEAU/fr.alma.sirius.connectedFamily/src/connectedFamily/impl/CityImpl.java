/**
 */
package connectedFamily.impl;

import connectedFamily.City;
import connectedFamily.ConnectedFamilyPackage;
import connectedFamily.Family;
import connectedFamily.MetropolitanRouter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link connectedFamily.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link connectedFamily.impl.CityImpl#getFamilies <em>Families</em>}</li>
 *   <li>{@link connectedFamily.impl.CityImpl#getRouters <em>Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFamilies() <em>Families</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilies()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> families;

	/**
	 * The cached value of the '{@link #getRouters() <em>Routers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<MetropolitanRouter> routers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectedFamilyPackage.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectedFamilyPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getFamilies() {
		if (families == null) {
			families = new EObjectContainmentEList<Family>(Family.class, this, ConnectedFamilyPackage.CITY__FAMILIES);
		}
		return families;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetropolitanRouter> getRouters() {
		if (routers == null) {
			routers = new EObjectContainmentEList<MetropolitanRouter>(MetropolitanRouter.class, this, ConnectedFamilyPackage.CITY__ROUTERS);
		}
		return routers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectedFamilyPackage.CITY__FAMILIES:
				return ((InternalEList<?>)getFamilies()).basicRemove(otherEnd, msgs);
			case ConnectedFamilyPackage.CITY__ROUTERS:
				return ((InternalEList<?>)getRouters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectedFamilyPackage.CITY__NAME:
				return getName();
			case ConnectedFamilyPackage.CITY__FAMILIES:
				return getFamilies();
			case ConnectedFamilyPackage.CITY__ROUTERS:
				return getRouters();
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
			case ConnectedFamilyPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case ConnectedFamilyPackage.CITY__FAMILIES:
				getFamilies().clear();
				getFamilies().addAll((Collection<? extends Family>)newValue);
				return;
			case ConnectedFamilyPackage.CITY__ROUTERS:
				getRouters().clear();
				getRouters().addAll((Collection<? extends MetropolitanRouter>)newValue);
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
			case ConnectedFamilyPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConnectedFamilyPackage.CITY__FAMILIES:
				getFamilies().clear();
				return;
			case ConnectedFamilyPackage.CITY__ROUTERS:
				getRouters().clear();
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
			case ConnectedFamilyPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConnectedFamilyPackage.CITY__FAMILIES:
				return families != null && !families.isEmpty();
			case ConnectedFamilyPackage.CITY__ROUTERS:
				return routers != null && !routers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CityImpl
