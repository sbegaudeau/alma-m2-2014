/**
 */
package connectedFamily;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see connectedFamily.ConnectedFamilyPackage
 * @generated
 */
public interface ConnectedFamilyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectedFamilyFactory eINSTANCE = connectedFamily.impl.ConnectedFamilyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family</em>'.
	 * @generated
	 */
	Family createFamily();

	/**
	 * Returns a new object of class '<em>Woman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Woman</em>'.
	 * @generated
	 */
	Woman createWoman();

	/**
	 * Returns a new object of class '<em>Man</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Man</em>'.
	 * @generated
	 */
	Man createMan();

	/**
	 * Returns a new object of class '<em>Local Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Router</em>'.
	 * @generated
	 */
	LocalRouter createLocalRouter();

	/**
	 * Returns a new object of class '<em>Metropolitan Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metropolitan Router</em>'.
	 * @generated
	 */
	MetropolitanRouter createMetropolitanRouter();

	/**
	 * Returns a new object of class '<em>Wide Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wide Router</em>'.
	 * @generated
	 */
	WideRouter createWideRouter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConnectedFamilyPackage getConnectedFamilyPackage();

} //ConnectedFamilyFactory
