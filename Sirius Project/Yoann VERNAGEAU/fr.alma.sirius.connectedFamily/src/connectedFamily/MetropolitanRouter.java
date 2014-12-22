/**
 */
package connectedFamily;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metropolitan Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link connectedFamily.MetropolitanRouter#getSuperRouter <em>Super Router</em>}</li>
 *   <li>{@link connectedFamily.MetropolitanRouter#getConnectedRouters <em>Connected Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @see connectedFamily.ConnectedFamilyPackage#getMetropolitanRouter()
 * @model
 * @generated
 */
public interface MetropolitanRouter extends Router {
	/**
	 * Returns the value of the '<em><b>Super Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Router</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Router</em>' reference.
	 * @see #setSuperRouter(WideRouter)
	 * @see connectedFamily.ConnectedFamilyPackage#getMetropolitanRouter_SuperRouter()
	 * @model
	 * @generated
	 */
	WideRouter getSuperRouter();

	/**
	 * Sets the value of the '{@link connectedFamily.MetropolitanRouter#getSuperRouter <em>Super Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Router</em>' reference.
	 * @see #getSuperRouter()
	 * @generated
	 */
	void setSuperRouter(WideRouter value);

	/**
	 * Returns the value of the '<em><b>Connected Routers</b></em>' reference list.
	 * The list contents are of type {@link connectedFamily.LocalRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Routers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Routers</em>' reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getMetropolitanRouter_ConnectedRouters()
	 * @model
	 * @generated
	 */
	EList<LocalRouter> getConnectedRouters();

} // MetropolitanRouter
