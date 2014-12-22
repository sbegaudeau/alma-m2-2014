/**
 */
package connectedFamily;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wide Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link connectedFamily.WideRouter#getConnectedRouters <em>Connected Routers</em>}</li>
 *   <li>{@link connectedFamily.WideRouter#getSiblings <em>Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @see connectedFamily.ConnectedFamilyPackage#getWideRouter()
 * @model
 * @generated
 */
public interface WideRouter extends Router {
	/**
	 * Returns the value of the '<em><b>Connected Routers</b></em>' reference list.
	 * The list contents are of type {@link connectedFamily.MetropolitanRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Routers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Routers</em>' reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getWideRouter_ConnectedRouters()
	 * @model
	 * @generated
	 */
	EList<MetropolitanRouter> getConnectedRouters();

	/**
	 * Returns the value of the '<em><b>Siblings</b></em>' reference list.
	 * The list contents are of type {@link connectedFamily.WideRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Siblings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siblings</em>' reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getWideRouter_Siblings()
	 * @model
	 * @generated
	 */
	EList<WideRouter> getSiblings();

} // WideRouter
