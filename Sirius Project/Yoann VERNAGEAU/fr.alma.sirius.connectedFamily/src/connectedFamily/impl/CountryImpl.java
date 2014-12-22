/**
 */
package connectedFamily.impl;

import connectedFamily.City;
import connectedFamily.ConnectedFamilyPackage;
import connectedFamily.Country;
import connectedFamily.WideRouter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link connectedFamily.impl.CountryImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link connectedFamily.impl.CountryImpl#getRouters <em>Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> cities;

	/**
	 * The cached value of the '{@link #getRouters() <em>Routers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<WideRouter> routers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectedFamilyPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this, ConnectedFamilyPackage.COUNTRY__CITIES);
		}
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WideRouter> getRouters() {
		if (routers == null) {
			routers = new EObjectContainmentEList<WideRouter>(WideRouter.class, this, ConnectedFamilyPackage.COUNTRY__ROUTERS);
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
			case ConnectedFamilyPackage.COUNTRY__CITIES:
				return ((InternalEList<?>)getCities()).basicRemove(otherEnd, msgs);
			case ConnectedFamilyPackage.COUNTRY__ROUTERS:
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
			case ConnectedFamilyPackage.COUNTRY__CITIES:
				return getCities();
			case ConnectedFamilyPackage.COUNTRY__ROUTERS:
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
			case ConnectedFamilyPackage.COUNTRY__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
				return;
			case ConnectedFamilyPackage.COUNTRY__ROUTERS:
				getRouters().clear();
				getRouters().addAll((Collection<? extends WideRouter>)newValue);
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
			case ConnectedFamilyPackage.COUNTRY__CITIES:
				getCities().clear();
				return;
			case ConnectedFamilyPackage.COUNTRY__ROUTERS:
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
			case ConnectedFamilyPackage.COUNTRY__CITIES:
				return cities != null && !cities.isEmpty();
			case ConnectedFamilyPackage.COUNTRY__ROUTERS:
				return routers != null && !routers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CountryImpl
