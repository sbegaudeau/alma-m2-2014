/**
 */
package connectedFamily;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link connectedFamily.LocalRouter#getSuperRouter <em>Super Router</em>}</li>
 * </ul>
 * </p>
 *
 * @see connectedFamily.ConnectedFamilyPackage#getLocalRouter()
 * @model
 * @generated
 */
public interface LocalRouter extends Router {
	/**
	 * Returns the value of the '<em><b>Super Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Router</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Router</em>' reference.
	 * @see #setSuperRouter(MetropolitanRouter)
	 * @see connectedFamily.ConnectedFamilyPackage#getLocalRouter_SuperRouter()
	 * @model
	 * @generated
	 */
	MetropolitanRouter getSuperRouter();

	/**
	 * Sets the value of the '{@link connectedFamily.LocalRouter#getSuperRouter <em>Super Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Router</em>' reference.
	 * @see #getSuperRouter()
	 * @generated
	 */
	void setSuperRouter(MetropolitanRouter value);

} // LocalRouter
