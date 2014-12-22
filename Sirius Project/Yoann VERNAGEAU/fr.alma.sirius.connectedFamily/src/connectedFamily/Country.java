/**
 */
package connectedFamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link connectedFamily.Country#getCities <em>Cities</em>}</li>
 *   <li>{@link connectedFamily.Country#getRouters <em>Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @see connectedFamily.ConnectedFamilyPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link connectedFamily.City}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getCountry_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>Routers</b></em>' containment reference list.
	 * The list contents are of type {@link connectedFamily.WideRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routers</em>' containment reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getCountry_Routers()
	 * @model containment="true"
	 * @generated
	 */
	EList<WideRouter> getRouters();

} // Country
