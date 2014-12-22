/**
 */
package connectedFamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link connectedFamily.Family#getName <em>Name</em>}</li>
 *   <li>{@link connectedFamily.Family#getMembers <em>Members</em>}</li>
 *   <li>{@link connectedFamily.Family#getRouters <em>Routers</em>}</li>
 * </ul>
 * </p>
 *
 * @see connectedFamily.ConnectedFamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see connectedFamily.ConnectedFamilyPackage#getFamily_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link connectedFamily.Family#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link connectedFamily.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getFamily_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Routers</b></em>' containment reference list.
	 * The list contents are of type {@link connectedFamily.LocalRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routers</em>' containment reference list.
	 * @see connectedFamily.ConnectedFamilyPackage#getFamily_Routers()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalRouter> getRouters();

} // Family
