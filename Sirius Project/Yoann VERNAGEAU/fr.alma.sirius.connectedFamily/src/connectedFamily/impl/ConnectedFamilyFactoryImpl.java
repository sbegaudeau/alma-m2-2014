/**
 */
package connectedFamily.impl;

import connectedFamily.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectedFamilyFactoryImpl extends EFactoryImpl implements ConnectedFamilyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectedFamilyFactory init() {
		try {
			ConnectedFamilyFactory theConnectedFamilyFactory = (ConnectedFamilyFactory)EPackage.Registry.INSTANCE.getEFactory(ConnectedFamilyPackage.eNS_URI);
			if (theConnectedFamilyFactory != null) {
				return theConnectedFamilyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConnectedFamilyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedFamilyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConnectedFamilyPackage.COUNTRY: return createCountry();
			case ConnectedFamilyPackage.CITY: return createCity();
			case ConnectedFamilyPackage.FAMILY: return createFamily();
			case ConnectedFamilyPackage.WOMAN: return createWoman();
			case ConnectedFamilyPackage.MAN: return createMan();
			case ConnectedFamilyPackage.LOCAL_ROUTER: return createLocalRouter();
			case ConnectedFamilyPackage.METROPOLITAN_ROUTER: return createMetropolitanRouter();
			case ConnectedFamilyPackage.WIDE_ROUTER: return createWideRouter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman createWoman() {
		WomanImpl woman = new WomanImpl();
		return woman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man createMan() {
		ManImpl man = new ManImpl();
		return man;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalRouter createLocalRouter() {
		LocalRouterImpl localRouter = new LocalRouterImpl();
		return localRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetropolitanRouter createMetropolitanRouter() {
		MetropolitanRouterImpl metropolitanRouter = new MetropolitanRouterImpl();
		return metropolitanRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WideRouter createWideRouter() {
		WideRouterImpl wideRouter = new WideRouterImpl();
		return wideRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedFamilyPackage getConnectedFamilyPackage() {
		return (ConnectedFamilyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConnectedFamilyPackage getPackage() {
		return ConnectedFamilyPackage.eINSTANCE;
	}

} //ConnectedFamilyFactoryImpl
