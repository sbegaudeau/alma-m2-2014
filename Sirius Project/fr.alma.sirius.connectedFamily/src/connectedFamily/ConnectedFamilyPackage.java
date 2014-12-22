/**
 */
package connectedFamily;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see connectedFamily.ConnectedFamilyFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectedFamilyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "connectedFamily";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/connectedFamily";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "connectedFamily";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectedFamilyPackage eINSTANCE = connectedFamily.impl.ConnectedFamilyPackageImpl.init();

	/**
	 * The meta object id for the '{@link connectedFamily.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.CountryImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CITIES = 0;

	/**
	 * The feature id for the '<em><b>Routers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ROUTERS = 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.CityImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Families</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__FAMILIES = 1;

	/**
	 * The feature id for the '<em><b>Routers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ROUTERS = 2;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.FamilyImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Routers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ROUTERS = 2;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.PersonImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.WomanImpl <em>Woman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.WomanImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getWoman()
	 * @generated
	 */
	int WOMAN = 4;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__SURNAME = PERSON__SURNAME;

	/**
	 * The number of structural features of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.ManImpl <em>Man</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.ManImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getMan()
	 * @generated
	 */
	int MAN = 5;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__SURNAME = PERSON__SURNAME;

	/**
	 * The number of structural features of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.RouterImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.LocalRouterImpl <em>Local Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.LocalRouterImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getLocalRouter()
	 * @generated
	 */
	int LOCAL_ROUTER = 7;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ROUTER__REFERENCE = ROUTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Super Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ROUTER__SUPER_ROUTER = ROUTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ROUTER_FEATURE_COUNT = ROUTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ROUTER_OPERATION_COUNT = ROUTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.MetropolitanRouterImpl <em>Metropolitan Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.MetropolitanRouterImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getMetropolitanRouter()
	 * @generated
	 */
	int METROPOLITAN_ROUTER = 8;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METROPOLITAN_ROUTER__REFERENCE = ROUTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Super Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METROPOLITAN_ROUTER__SUPER_ROUTER = ROUTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Routers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METROPOLITAN_ROUTER__CONNECTED_ROUTERS = ROUTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metropolitan Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METROPOLITAN_ROUTER_FEATURE_COUNT = ROUTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Metropolitan Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METROPOLITAN_ROUTER_OPERATION_COUNT = ROUTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link connectedFamily.impl.WideRouterImpl <em>Wide Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see connectedFamily.impl.WideRouterImpl
	 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getWideRouter()
	 * @generated
	 */
	int WIDE_ROUTER = 9;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_ROUTER__REFERENCE = ROUTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Connected Routers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_ROUTER__CONNECTED_ROUTERS = ROUTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_ROUTER__SIBLINGS = ROUTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wide Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_ROUTER_FEATURE_COUNT = ROUTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wide Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_ROUTER_OPERATION_COUNT = ROUTER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link connectedFamily.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see connectedFamily.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.Country#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see connectedFamily.Country#getCities()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Cities();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.Country#getRouters <em>Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routers</em>'.
	 * @see connectedFamily.Country#getRouters()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Routers();

	/**
	 * Returns the meta object for class '{@link connectedFamily.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see connectedFamily.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link connectedFamily.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see connectedFamily.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.City#getFamilies <em>Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Families</em>'.
	 * @see connectedFamily.City#getFamilies()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Families();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.City#getRouters <em>Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routers</em>'.
	 * @see connectedFamily.City#getRouters()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Routers();

	/**
	 * Returns the meta object for class '{@link connectedFamily.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see connectedFamily.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the attribute '{@link connectedFamily.Family#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see connectedFamily.Family#getName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.Family#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see connectedFamily.Family#getMembers()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link connectedFamily.Family#getRouters <em>Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routers</em>'.
	 * @see connectedFamily.Family#getRouters()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Routers();

	/**
	 * Returns the meta object for class '{@link connectedFamily.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see connectedFamily.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link connectedFamily.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see connectedFamily.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for class '{@link connectedFamily.Woman <em>Woman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Woman</em>'.
	 * @see connectedFamily.Woman
	 * @generated
	 */
	EClass getWoman();

	/**
	 * Returns the meta object for class '{@link connectedFamily.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Man</em>'.
	 * @see connectedFamily.Man
	 * @generated
	 */
	EClass getMan();

	/**
	 * Returns the meta object for class '{@link connectedFamily.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see connectedFamily.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link connectedFamily.Router#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see connectedFamily.Router#getReference()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Reference();

	/**
	 * Returns the meta object for class '{@link connectedFamily.LocalRouter <em>Local Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Router</em>'.
	 * @see connectedFamily.LocalRouter
	 * @generated
	 */
	EClass getLocalRouter();

	/**
	 * Returns the meta object for the reference '{@link connectedFamily.LocalRouter#getSuperRouter <em>Super Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Router</em>'.
	 * @see connectedFamily.LocalRouter#getSuperRouter()
	 * @see #getLocalRouter()
	 * @generated
	 */
	EReference getLocalRouter_SuperRouter();

	/**
	 * Returns the meta object for class '{@link connectedFamily.MetropolitanRouter <em>Metropolitan Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metropolitan Router</em>'.
	 * @see connectedFamily.MetropolitanRouter
	 * @generated
	 */
	EClass getMetropolitanRouter();

	/**
	 * Returns the meta object for the reference '{@link connectedFamily.MetropolitanRouter#getSuperRouter <em>Super Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Router</em>'.
	 * @see connectedFamily.MetropolitanRouter#getSuperRouter()
	 * @see #getMetropolitanRouter()
	 * @generated
	 */
	EReference getMetropolitanRouter_SuperRouter();

	/**
	 * Returns the meta object for the reference list '{@link connectedFamily.MetropolitanRouter#getConnectedRouters <em>Connected Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Routers</em>'.
	 * @see connectedFamily.MetropolitanRouter#getConnectedRouters()
	 * @see #getMetropolitanRouter()
	 * @generated
	 */
	EReference getMetropolitanRouter_ConnectedRouters();

	/**
	 * Returns the meta object for class '{@link connectedFamily.WideRouter <em>Wide Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wide Router</em>'.
	 * @see connectedFamily.WideRouter
	 * @generated
	 */
	EClass getWideRouter();

	/**
	 * Returns the meta object for the reference list '{@link connectedFamily.WideRouter#getConnectedRouters <em>Connected Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Routers</em>'.
	 * @see connectedFamily.WideRouter#getConnectedRouters()
	 * @see #getWideRouter()
	 * @generated
	 */
	EReference getWideRouter_ConnectedRouters();

	/**
	 * Returns the meta object for the reference list '{@link connectedFamily.WideRouter#getSiblings <em>Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Siblings</em>'.
	 * @see connectedFamily.WideRouter#getSiblings()
	 * @see #getWideRouter()
	 * @generated
	 */
	EReference getWideRouter_Siblings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectedFamilyFactory getConnectedFamilyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link connectedFamily.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.CountryImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__CITIES = eINSTANCE.getCountry_Cities();

		/**
		 * The meta object literal for the '<em><b>Routers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__ROUTERS = eINSTANCE.getCountry_Routers();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.CityImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Families</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__FAMILIES = eINSTANCE.getCity_Families();

		/**
		 * The meta object literal for the '<em><b>Routers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__ROUTERS = eINSTANCE.getCity_Routers();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.FamilyImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__NAME = eINSTANCE.getFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MEMBERS = eINSTANCE.getFamily_Members();

		/**
		 * The meta object literal for the '<em><b>Routers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__ROUTERS = eINSTANCE.getFamily_Routers();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.PersonImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.WomanImpl <em>Woman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.WomanImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getWoman()
		 * @generated
		 */
		EClass WOMAN = eINSTANCE.getWoman();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.ManImpl <em>Man</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.ManImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getMan()
		 * @generated
		 */
		EClass MAN = eINSTANCE.getMan();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.RouterImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__REFERENCE = eINSTANCE.getRouter_Reference();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.LocalRouterImpl <em>Local Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.LocalRouterImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getLocalRouter()
		 * @generated
		 */
		EClass LOCAL_ROUTER = eINSTANCE.getLocalRouter();

		/**
		 * The meta object literal for the '<em><b>Super Router</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_ROUTER__SUPER_ROUTER = eINSTANCE.getLocalRouter_SuperRouter();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.MetropolitanRouterImpl <em>Metropolitan Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.MetropolitanRouterImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getMetropolitanRouter()
		 * @generated
		 */
		EClass METROPOLITAN_ROUTER = eINSTANCE.getMetropolitanRouter();

		/**
		 * The meta object literal for the '<em><b>Super Router</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METROPOLITAN_ROUTER__SUPER_ROUTER = eINSTANCE.getMetropolitanRouter_SuperRouter();

		/**
		 * The meta object literal for the '<em><b>Connected Routers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METROPOLITAN_ROUTER__CONNECTED_ROUTERS = eINSTANCE.getMetropolitanRouter_ConnectedRouters();

		/**
		 * The meta object literal for the '{@link connectedFamily.impl.WideRouterImpl <em>Wide Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see connectedFamily.impl.WideRouterImpl
		 * @see connectedFamily.impl.ConnectedFamilyPackageImpl#getWideRouter()
		 * @generated
		 */
		EClass WIDE_ROUTER = eINSTANCE.getWideRouter();

		/**
		 * The meta object literal for the '<em><b>Connected Routers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDE_ROUTER__CONNECTED_ROUTERS = eINSTANCE.getWideRouter_ConnectedRouters();

		/**
		 * The meta object literal for the '<em><b>Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDE_ROUTER__SIBLINGS = eINSTANCE.getWideRouter_Siblings();

	}

} //ConnectedFamilyPackage
