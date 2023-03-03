
package webService;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserSession_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "UserSession");
    private final static QName _UserStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "UserStatus");
    private final static QName _EmployeeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "EmployeeInfo");
    private final static QName _EventEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "EventEntry");
    private final static QName _EventDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "EventDescription");
    private final static QName _ArrayOfLogParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "ArrayOfLogParameter");
    private final static QName _LogParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "LogParameter");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _AumsUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "AumsUser");
    private final static QName _ArrayOfINSAGetGroupRights_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Administration", "ArrayOfINSAGetGroupRights");
    private final static QName _INSAGetGroupRights_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Administration", "INSAGetGroupRights");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _LoginUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "Password");
    private final static QName _LoginDatabaseSet_QNAME = new QName("http://tempuri.org/", "DatabaseSet");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetUserStatusPublicname_QNAME = new QName("http://tempuri.org/", "publicname");
    private final static QName _GetUserStatusResponseGetUserStatusResult_QNAME = new QName("http://tempuri.org/", "GetUserStatusResult");
    private final static QName _LogOffSessionID_QNAME = new QName("http://tempuri.org/", "SessionID");
    private final static QName _LogOffDataSet_QNAME = new QName("http://tempuri.org/", "DataSet");
    private final static QName _CheckAccessPublicName_QNAME = new QName("http://tempuri.org/", "PublicName");
    private final static QName _ChangePasswordOldPassword_QNAME = new QName("http://tempuri.org/", "oldPassword");
    private final static QName _ChangePasswordNewPassword_QNAME = new QName("http://tempuri.org/", "NewPassword");
    private final static QName _ChangePasswordResponseChangePasswordResult_QNAME = new QName("http://tempuri.org/", "ChangePasswordResult");
    private final static QName _GetUserNameResponseGetUserNameResult_QNAME = new QName("http://tempuri.org/", "getUserNameResult");
    private final static QName _GetEmpInfoResponseGetEmpInfoResult_QNAME = new QName("http://tempuri.org/", "getEmpInfoResult");
    private final static QName _AddEventLogEv_QNAME = new QName("http://tempuri.org/", "ev");
    private final static QName _AddEventLogDataset_QNAME = new QName("http://tempuri.org/", "dataset");
    private final static QName _AddEventParamLogParamsList_QNAME = new QName("http://tempuri.org/", "paramsList");
    private final static QName _EncryptValue_QNAME = new QName("http://tempuri.org/", "value");
    private final static QName _EncryptResponseEncryptResult_QNAME = new QName("http://tempuri.org/", "EncryptResult");
    private final static QName _DecryptResponseDecryptResult_QNAME = new QName("http://tempuri.org/", "DecryptResult");
    private final static QName _GetHashCodeResponseGetHashCodeResult_QNAME = new QName("http://tempuri.org/", "GetHashCodeResult");
    private final static QName _CheckPasswordPolicyMessage_QNAME = new QName("http://tempuri.org/", "message");
    private final static QName _CheckPasswordPolicyResponseCheckPasswordPolicyResult_QNAME = new QName("http://tempuri.org/", "CheckPasswordPolicyResult");
    private final static QName _UserStateLogin_QNAME = new QName("http://tempuri.org/", "login");
    private final static QName _UserStateResponseUserStateResult_QNAME = new QName("http://tempuri.org/", "UserStateResult");
    private final static QName _IsBlockedLoginUserName_QNAME = new QName("http://tempuri.org/", "userName");
    private final static QName _IncrementWrongLoginsUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _GetGroupRightsDataset_QNAME = new QName("http://tempuri.org/", "Dataset");
    private final static QName _GetGroupRightsResponseGetGroupRightsResult_QNAME = new QName("http://tempuri.org/", "getGroupRightsResult");
    private final static QName _INSAGetGroupRightsRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Administration", "right");
    private final static QName _LogParameterName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Name");
    private final static QName _LogParameterNewValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "NewValue");
    private final static QName _LogParameterOldValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "OldValue");
    private final static QName _EventDescriptionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Description");
    private final static QName _AumsUserAdminLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "AdminLogin");
    private final static QName _AumsUserBranch_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Branch");
    private final static QName _AumsUserCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "City");
    private final static QName _AumsUserDBSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "DBSet");
    private final static QName _AumsUserDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Description");
    private final static QName _AumsUserEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Email");
    private final static QName _AumsUserFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Fax");
    private final static QName _AumsUserFlatNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "FlatNo");
    private final static QName _AumsUserHouseNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "HouseNo");
    private final static QName _AumsUserLockName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "LockName");
    private final static QName _AumsUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Name");
    private final static QName _AumsUserOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Office");
    private final static QName _AumsUserPhoneNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "PhoneNo");
    private final static QName _AumsUserPost_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Post");
    private final static QName _AumsUserPostCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "PostCity");
    private final static QName _AumsUserPostalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "PostalCode");
    private final static QName _AumsUserProgrammer_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Programmer");
    private final static QName _AumsUserRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Region");
    private final static QName _AumsUserReportingRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "ReportingRegion");
    private final static QName _AumsUserRepresentative_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Representative");
    private final static QName _AumsUserRoomNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "RoomNo");
    private final static QName _AumsUserSetSelection_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "SetSelection");
    private final static QName _AumsUserState_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "State");
    private final static QName _AumsUserStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Street");
    private final static QName _AumsUserSurname_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "Surname");
    private final static QName _AumsUserSystemUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "SystemUser");
    private final static QName _AumsUserUserLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "UserLogin");
    private final static QName _AumsUserWindowsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.GBK", "WindowsName");
    private final static QName _EventEntryEntitySymbol_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "EntitySymbol");
    private final static QName _EventEntryKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Key");
    private final static QName _EventEntryModule_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Module");
    private final static QName _EventEntryParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Parameters");
    private final static QName _EventEntryProgram_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Program");
    private final static QName _EventEntryUserLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "UserLogin");
    private final static QName _EventEntryValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "Value");
    private final static QName _EventEntryEventDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "eventDescription");
    private final static QName _EmployeeInfoFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "FirstName");
    private final static QName _EmployeeInfoLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "LastName");
    private final static QName _EmployeeInfoMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "MiddleName");
    private final static QName _EmployeeInfoWorkId_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "WorkId");
    private final static QName _UserSessionUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/INSA.Web.Security", "UserName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UserSession }
     * 
     */
    public UserSession createUserSession() {
        return new UserSession();
    }

    /**
     * Create an instance of {@link GetUserStatus }
     * 
     */
    public GetUserStatus createGetUserStatus() {
        return new GetUserStatus();
    }

    /**
     * Create an instance of {@link GetUserStatusResponse }
     * 
     */
    public GetUserStatusResponse createGetUserStatusResponse() {
        return new GetUserStatusResponse();
    }

    /**
     * Create an instance of {@link UserStatus }
     * 
     */
    public UserStatus createUserStatus() {
        return new UserStatus();
    }

    /**
     * Create an instance of {@link LogOff }
     * 
     */
    public LogOff createLogOff() {
        return new LogOff();
    }

    /**
     * Create an instance of {@link LogOffResponse }
     * 
     */
    public LogOffResponse createLogOffResponse() {
        return new LogOffResponse();
    }

    /**
     * Create an instance of {@link MustChangePassword }
     * 
     */
    public MustChangePassword createMustChangePassword() {
        return new MustChangePassword();
    }

    /**
     * Create an instance of {@link MustChangePasswordResponse }
     * 
     */
    public MustChangePasswordResponse createMustChangePasswordResponse() {
        return new MustChangePasswordResponse();
    }

    /**
     * Create an instance of {@link CheckAccess }
     * 
     */
    public CheckAccess createCheckAccess() {
        return new CheckAccess();
    }

    /**
     * Create an instance of {@link CheckAccessResponse }
     * 
     */
    public CheckAccessResponse createCheckAccessResponse() {
        return new CheckAccessResponse();
    }

    /**
     * Create an instance of {@link IsAuthorized }
     * 
     */
    public IsAuthorized createIsAuthorized() {
        return new IsAuthorized();
    }

    /**
     * Create an instance of {@link IsAuthorizedResponse }
     * 
     */
    public IsAuthorizedResponse createIsAuthorizedResponse() {
        return new IsAuthorizedResponse();
    }

    /**
     * Create an instance of {@link IsSecured }
     * 
     */
    public IsSecured createIsSecured() {
        return new IsSecured();
    }

    /**
     * Create an instance of {@link IsSecuredResponse }
     * 
     */
    public IsSecuredResponse createIsSecuredResponse() {
        return new IsSecuredResponse();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link GetUserName }
     * 
     */
    public GetUserName createGetUserName() {
        return new GetUserName();
    }

    /**
     * Create an instance of {@link GetUserNameResponse }
     * 
     */
    public GetUserNameResponse createGetUserNameResponse() {
        return new GetUserNameResponse();
    }

    /**
     * Create an instance of {@link GetEmpInfo }
     * 
     */
    public GetEmpInfo createGetEmpInfo() {
        return new GetEmpInfo();
    }

    /**
     * Create an instance of {@link GetEmpInfoResponse }
     * 
     */
    public GetEmpInfoResponse createGetEmpInfoResponse() {
        return new GetEmpInfoResponse();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link AddEventLog }
     * 
     */
    public AddEventLog createAddEventLog() {
        return new AddEventLog();
    }

    /**
     * Create an instance of {@link EventEntry }
     * 
     */
    public EventEntry createEventEntry() {
        return new EventEntry();
    }

    /**
     * Create an instance of {@link AddEventLogResponse }
     * 
     */
    public AddEventLogResponse createAddEventLogResponse() {
        return new AddEventLogResponse();
    }

    /**
     * Create an instance of {@link AddEventParamLog }
     * 
     */
    public AddEventParamLog createAddEventParamLog() {
        return new AddEventParamLog();
    }

    /**
     * Create an instance of {@link ArrayOfLogParameter }
     * 
     */
    public ArrayOfLogParameter createArrayOfLogParameter() {
        return new ArrayOfLogParameter();
    }

    /**
     * Create an instance of {@link AddEventParamLogResponse }
     * 
     */
    public AddEventParamLogResponse createAddEventParamLogResponse() {
        return new AddEventParamLogResponse();
    }

    /**
     * Create an instance of {@link Encrypt }
     * 
     */
    public Encrypt createEncrypt() {
        return new Encrypt();
    }

    /**
     * Create an instance of {@link EncryptResponse }
     * 
     */
    public EncryptResponse createEncryptResponse() {
        return new EncryptResponse();
    }

    /**
     * Create an instance of {@link Decrypt }
     * 
     */
    public Decrypt createDecrypt() {
        return new Decrypt();
    }

    /**
     * Create an instance of {@link DecryptResponse }
     * 
     */
    public DecryptResponse createDecryptResponse() {
        return new DecryptResponse();
    }

    /**
     * Create an instance of {@link GetHashCode }
     * 
     */
    public GetHashCode createGetHashCode() {
        return new GetHashCode();
    }

    /**
     * Create an instance of {@link GetHashCodeResponse }
     * 
     */
    public GetHashCodeResponse createGetHashCodeResponse() {
        return new GetHashCodeResponse();
    }

    /**
     * Create an instance of {@link CheckPasswordPolicy }
     * 
     */
    public CheckPasswordPolicy createCheckPasswordPolicy() {
        return new CheckPasswordPolicy();
    }

    /**
     * Create an instance of {@link CheckPasswordPolicyResponse }
     * 
     */
    public CheckPasswordPolicyResponse createCheckPasswordPolicyResponse() {
        return new CheckPasswordPolicyResponse();
    }

    /**
     * Create an instance of {@link UserState }
     * 
     */
    public UserState createUserState() {
        return new UserState();
    }

    /**
     * Create an instance of {@link UserStateResponse }
     * 
     */
    public UserStateResponse createUserStateResponse() {
        return new UserStateResponse();
    }

    /**
     * Create an instance of {@link AumsUser }
     * 
     */
    public AumsUser createAumsUser() {
        return new AumsUser();
    }

    /**
     * Create an instance of {@link MaxLoginRetryCount }
     * 
     */
    public MaxLoginRetryCount createMaxLoginRetryCount() {
        return new MaxLoginRetryCount();
    }

    /**
     * Create an instance of {@link MaxLoginRetryCountResponse }
     * 
     */
    public MaxLoginRetryCountResponse createMaxLoginRetryCountResponse() {
        return new MaxLoginRetryCountResponse();
    }

    /**
     * Create an instance of {@link IsBlockedLogin }
     * 
     */
    public IsBlockedLogin createIsBlockedLogin() {
        return new IsBlockedLogin();
    }

    /**
     * Create an instance of {@link IsBlockedLoginResponse }
     * 
     */
    public IsBlockedLoginResponse createIsBlockedLoginResponse() {
        return new IsBlockedLoginResponse();
    }

    /**
     * Create an instance of {@link IncrementWrongLogins }
     * 
     */
    public IncrementWrongLogins createIncrementWrongLogins() {
        return new IncrementWrongLogins();
    }

    /**
     * Create an instance of {@link IncrementWrongLoginsResponse }
     * 
     */
    public IncrementWrongLoginsResponse createIncrementWrongLoginsResponse() {
        return new IncrementWrongLoginsResponse();
    }

    /**
     * Create an instance of {@link GetGroupRights }
     * 
     */
    public GetGroupRights createGetGroupRights() {
        return new GetGroupRights();
    }

    /**
     * Create an instance of {@link GetGroupRightsResponse }
     * 
     */
    public GetGroupRightsResponse createGetGroupRightsResponse() {
        return new GetGroupRightsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfINSAGetGroupRights }
     * 
     */
    public ArrayOfINSAGetGroupRights createArrayOfINSAGetGroupRights() {
        return new ArrayOfINSAGetGroupRights();
    }

    /**
     * Create an instance of {@link EventDescription }
     * 
     */
    public EventDescription createEventDescription() {
        return new EventDescription();
    }

    /**
     * Create an instance of {@link LogParameter }
     * 
     */
    public LogParameter createLogParameter() {
        return new LogParameter();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link INSAGetGroupRights }
     * 
     */
    public INSAGetGroupRights createINSAGetGroupRights() {
        return new INSAGetGroupRights();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "UserSession")
    public JAXBElement<UserSession> createUserSession(UserSession value) {
        return new JAXBElement<UserSession>(_UserSession_QNAME, UserSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "UserStatus")
    public JAXBElement<UserStatus> createUserStatus(UserStatus value) {
        return new JAXBElement<UserStatus>(_UserStatus_QNAME, UserStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "EmployeeInfo")
    public JAXBElement<EmployeeInfo> createEmployeeInfo(EmployeeInfo value) {
        return new JAXBElement<EmployeeInfo>(_EmployeeInfo_QNAME, EmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "EventEntry")
    public JAXBElement<EventEntry> createEventEntry(EventEntry value) {
        return new JAXBElement<EventEntry>(_EventEntry_QNAME, EventEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "EventDescription")
    public JAXBElement<EventDescription> createEventDescription(EventDescription value) {
        return new JAXBElement<EventDescription>(_EventDescription_QNAME, EventDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "ArrayOfLogParameter")
    public JAXBElement<ArrayOfLogParameter> createArrayOfLogParameter(ArrayOfLogParameter value) {
        return new JAXBElement<ArrayOfLogParameter>(_ArrayOfLogParameter_QNAME, ArrayOfLogParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "LogParameter")
    public JAXBElement<LogParameter> createLogParameter(LogParameter value) {
        return new JAXBElement<LogParameter>(_LogParameter_QNAME, LogParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "AumsUser")
    public JAXBElement<AumsUser> createAumsUser(AumsUser value) {
        return new JAXBElement<AumsUser>(_AumsUser_QNAME, AumsUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Administration", name = "ArrayOfINSAGetGroupRights")
    public JAXBElement<ArrayOfINSAGetGroupRights> createArrayOfINSAGetGroupRights(ArrayOfINSAGetGroupRights value) {
        return new JAXBElement<ArrayOfINSAGetGroupRights>(_ArrayOfINSAGetGroupRights_QNAME, ArrayOfINSAGetGroupRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INSAGetGroupRights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INSAGetGroupRights }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Administration", name = "INSAGetGroupRights")
    public JAXBElement<INSAGetGroupRights> createINSAGetGroupRights(INSAGetGroupRights value) {
        return new JAXBElement<INSAGetGroupRights>(_INSAGetGroupRights_QNAME, INSAGetGroupRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = Login.class)
    public JAXBElement<String> createLoginUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = Login.class)
    public JAXBElement<String> createLoginDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<UserSession> createLoginResponseLoginResult(UserSession value) {
        return new JAXBElement<UserSession>(_LoginResponseLoginResult_QNAME, UserSession.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publicname", scope = GetUserStatus.class)
    public JAXBElement<String> createGetUserStatusPublicname(String value) {
        return new JAXBElement<String>(_GetUserStatusPublicname_QNAME, String.class, GetUserStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = GetUserStatus.class)
    public JAXBElement<String> createGetUserStatusDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, GetUserStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserStatusResult", scope = GetUserStatusResponse.class)
    public JAXBElement<UserStatus> createGetUserStatusResponseGetUserStatusResult(UserStatus value) {
        return new JAXBElement<UserStatus>(_GetUserStatusResponseGetUserStatusResult_QNAME, UserStatus.class, GetUserStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionID", scope = LogOff.class)
    public JAXBElement<String> createLogOffSessionID(String value) {
        return new JAXBElement<String>(_LogOffSessionID_QNAME, String.class, LogOff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = LogOff.class)
    public JAXBElement<String> createLogOffDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, LogOff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = MustChangePassword.class)
    public JAXBElement<String> createMustChangePasswordUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, MustChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = CheckAccess.class)
    public JAXBElement<String> createCheckAccessUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, CheckAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PublicName", scope = CheckAccess.class)
    public JAXBElement<String> createCheckAccessPublicName(String value) {
        return new JAXBElement<String>(_CheckAccessPublicName_QNAME, String.class, CheckAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = CheckAccess.class)
    public JAXBElement<String> createCheckAccessDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, CheckAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionID", scope = IsAuthorized.class)
    public JAXBElement<String> createIsAuthorizedSessionID(String value) {
        return new JAXBElement<String>(_LogOffSessionID_QNAME, String.class, IsAuthorized.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PublicName", scope = IsAuthorized.class)
    public JAXBElement<String> createIsAuthorizedPublicName(String value) {
        return new JAXBElement<String>(_CheckAccessPublicName_QNAME, String.class, IsAuthorized.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = IsAuthorized.class)
    public JAXBElement<String> createIsAuthorizedDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, IsAuthorized.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PublicName", scope = IsSecured.class)
    public JAXBElement<String> createIsSecuredPublicName(String value) {
        return new JAXBElement<String>(_CheckAccessPublicName_QNAME, String.class, IsSecured.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = IsSecured.class)
    public JAXBElement<String> createIsSecuredDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, IsSecured.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "oldPassword", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordOldPassword(String value) {
        return new JAXBElement<String>(_ChangePasswordOldPassword_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NewPassword", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordNewPassword(String value) {
        return new JAXBElement<String>(_ChangePasswordNewPassword_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangePasswordResult", scope = ChangePasswordResponse.class)
    public JAXBElement<String> createChangePasswordResponseChangePasswordResult(String value) {
        return new JAXBElement<String>(_ChangePasswordResponseChangePasswordResult_QNAME, String.class, ChangePasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatabaseSet", scope = GetUserName.class)
    public JAXBElement<String> createGetUserNameDatabaseSet(String value) {
        return new JAXBElement<String>(_LoginDatabaseSet_QNAME, String.class, GetUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getUserNameResult", scope = GetUserNameResponse.class)
    public JAXBElement<String> createGetUserNameResponseGetUserNameResult(String value) {
        return new JAXBElement<String>(_GetUserNameResponseGetUserNameResult_QNAME, String.class, GetUserNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = GetEmpInfo.class)
    public JAXBElement<String> createGetEmpInfoDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, GetEmpInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getEmpInfoResult", scope = GetEmpInfoResponse.class)
    public JAXBElement<EmployeeInfo> createGetEmpInfoResponseGetEmpInfoResult(EmployeeInfo value) {
        return new JAXBElement<EmployeeInfo>(_GetEmpInfoResponseGetEmpInfoResult_QNAME, EmployeeInfo.class, GetEmpInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ev", scope = AddEventLog.class)
    public JAXBElement<EventEntry> createAddEventLogEv(EventEntry value) {
        return new JAXBElement<EventEntry>(_AddEventLogEv_QNAME, EventEntry.class, AddEventLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataset", scope = AddEventLog.class)
    public JAXBElement<String> createAddEventLogDataset(String value) {
        return new JAXBElement<String>(_AddEventLogDataset_QNAME, String.class, AddEventLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paramsList", scope = AddEventParamLog.class)
    public JAXBElement<ArrayOfLogParameter> createAddEventParamLogParamsList(ArrayOfLogParameter value) {
        return new JAXBElement<ArrayOfLogParameter>(_AddEventParamLogParamsList_QNAME, ArrayOfLogParameter.class, AddEventParamLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataset", scope = AddEventParamLog.class)
    public JAXBElement<String> createAddEventParamLogDataset(String value) {
        return new JAXBElement<String>(_AddEventLogDataset_QNAME, String.class, AddEventParamLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = Encrypt.class)
    public JAXBElement<String> createEncryptValue(String value) {
        return new JAXBElement<String>(_EncryptValue_QNAME, String.class, Encrypt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EncryptResult", scope = EncryptResponse.class)
    public JAXBElement<String> createEncryptResponseEncryptResult(String value) {
        return new JAXBElement<String>(_EncryptResponseEncryptResult_QNAME, String.class, EncryptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = Decrypt.class)
    public JAXBElement<String> createDecryptValue(String value) {
        return new JAXBElement<String>(_EncryptValue_QNAME, String.class, Decrypt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DecryptResult", scope = DecryptResponse.class)
    public JAXBElement<String> createDecryptResponseDecryptResult(String value) {
        return new JAXBElement<String>(_DecryptResponseDecryptResult_QNAME, String.class, DecryptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = GetHashCode.class)
    public JAXBElement<String> createGetHashCodeValue(String value) {
        return new JAXBElement<String>(_EncryptValue_QNAME, String.class, GetHashCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHashCodeResult", scope = GetHashCodeResponse.class)
    public JAXBElement<String> createGetHashCodeResponseGetHashCodeResult(String value) {
        return new JAXBElement<String>(_GetHashCodeResponseGetHashCodeResult_QNAME, String.class, GetHashCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = CheckPasswordPolicy.class)
    public JAXBElement<String> createCheckPasswordPolicyUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, CheckPasswordPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = CheckPasswordPolicy.class)
    public JAXBElement<String> createCheckPasswordPolicyPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, CheckPasswordPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "message", scope = CheckPasswordPolicy.class)
    public JAXBElement<String> createCheckPasswordPolicyMessage(String value) {
        return new JAXBElement<String>(_CheckPasswordPolicyMessage_QNAME, String.class, CheckPasswordPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CheckPasswordPolicyResult", scope = CheckPasswordPolicyResponse.class)
    public JAXBElement<String> createCheckPasswordPolicyResponseCheckPasswordPolicyResult(String value) {
        return new JAXBElement<String>(_CheckPasswordPolicyResponseCheckPasswordPolicyResult_QNAME, String.class, CheckPasswordPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = UserState.class)
    public JAXBElement<String> createUserStateLogin(String value) {
        return new JAXBElement<String>(_UserStateLogin_QNAME, String.class, UserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = UserState.class)
    public JAXBElement<String> createUserStateDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, UserState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserStateResult", scope = UserStateResponse.class)
    public JAXBElement<AumsUser> createUserStateResponseUserStateResult(AumsUser value) {
        return new JAXBElement<AumsUser>(_UserStateResponseUserStateResult_QNAME, AumsUser.class, UserStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = MaxLoginRetryCount.class)
    public JAXBElement<String> createMaxLoginRetryCountDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, MaxLoginRetryCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = IsBlockedLogin.class)
    public JAXBElement<String> createIsBlockedLoginUserName(String value) {
        return new JAXBElement<String>(_IsBlockedLoginUserName_QNAME, String.class, IsBlockedLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = IsBlockedLogin.class)
    public JAXBElement<String> createIsBlockedLoginDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, IsBlockedLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = IncrementWrongLogins.class)
    public JAXBElement<AumsUser> createIncrementWrongLoginsUser(AumsUser value) {
        return new JAXBElement<AumsUser>(_IncrementWrongLoginsUser_QNAME, AumsUser.class, IncrementWrongLogins.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet", scope = IncrementWrongLogins.class)
    public JAXBElement<String> createIncrementWrongLoginsDataSet(String value) {
        return new JAXBElement<String>(_LogOffDataSet_QNAME, String.class, IncrementWrongLogins.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Dataset", scope = GetGroupRights.class)
    public JAXBElement<String> createGetGroupRightsDataset(String value) {
        return new JAXBElement<String>(_GetGroupRightsDataset_QNAME, String.class, GetGroupRights.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getGroupRightsResult", scope = GetGroupRightsResponse.class)
    public JAXBElement<ArrayOfINSAGetGroupRights> createGetGroupRightsResponseGetGroupRightsResult(ArrayOfINSAGetGroupRights value) {
        return new JAXBElement<ArrayOfINSAGetGroupRights>(_GetGroupRightsResponseGetGroupRightsResult_QNAME, ArrayOfINSAGetGroupRights.class, GetGroupRightsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Administration", name = "right", scope = INSAGetGroupRights.class)
    public JAXBElement<String> createINSAGetGroupRightsRight(String value) {
        return new JAXBElement<String>(_INSAGetGroupRightsRight_QNAME, String.class, INSAGetGroupRights.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Name", scope = LogParameter.class)
    public JAXBElement<String> createLogParameterName(String value) {
        return new JAXBElement<String>(_LogParameterName_QNAME, String.class, LogParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "NewValue", scope = LogParameter.class)
    public JAXBElement<String> createLogParameterNewValue(String value) {
        return new JAXBElement<String>(_LogParameterNewValue_QNAME, String.class, LogParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "OldValue", scope = LogParameter.class)
    public JAXBElement<String> createLogParameterOldValue(String value) {
        return new JAXBElement<String>(_LogParameterOldValue_QNAME, String.class, LogParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Description", scope = EventDescription.class)
    public JAXBElement<String> createEventDescriptionDescription(String value) {
        return new JAXBElement<String>(_EventDescriptionDescription_QNAME, String.class, EventDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "AdminLogin", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserAdminLogin(String value) {
        return new JAXBElement<String>(_AumsUserAdminLogin_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Branch", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserBranch(String value) {
        return new JAXBElement<String>(_AumsUserBranch_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "City", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserCity(String value) {
        return new JAXBElement<String>(_AumsUserCity_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "DBSet", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserDBSet(String value) {
        return new JAXBElement<String>(_AumsUserDBSet_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Description", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserDescription(String value) {
        return new JAXBElement<String>(_AumsUserDescription_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Email", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserEmail(String value) {
        return new JAXBElement<String>(_AumsUserEmail_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Fax", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserFax(String value) {
        return new JAXBElement<String>(_AumsUserFax_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "FlatNo", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserFlatNo(String value) {
        return new JAXBElement<String>(_AumsUserFlatNo_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "HouseNo", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserHouseNo(String value) {
        return new JAXBElement<String>(_AumsUserHouseNo_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "LockName", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserLockName(String value) {
        return new JAXBElement<String>(_AumsUserLockName_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Name", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserName(String value) {
        return new JAXBElement<String>(_AumsUserName_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Office", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserOffice(String value) {
        return new JAXBElement<String>(_AumsUserOffice_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "PhoneNo", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserPhoneNo(String value) {
        return new JAXBElement<String>(_AumsUserPhoneNo_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Post", scope = AumsUser.class)
    public JAXBElement<Integer> createAumsUserPost(Integer value) {
        return new JAXBElement<Integer>(_AumsUserPost_QNAME, Integer.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "PostCity", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserPostCity(String value) {
        return new JAXBElement<String>(_AumsUserPostCity_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "PostalCode", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserPostalCode(String value) {
        return new JAXBElement<String>(_AumsUserPostalCode_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Programmer", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserProgrammer(String value) {
        return new JAXBElement<String>(_AumsUserProgrammer_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Region", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserRegion(String value) {
        return new JAXBElement<String>(_AumsUserRegion_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "ReportingRegion", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserReportingRegion(String value) {
        return new JAXBElement<String>(_AumsUserReportingRegion_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Representative", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserRepresentative(String value) {
        return new JAXBElement<String>(_AumsUserRepresentative_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "RoomNo", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserRoomNo(String value) {
        return new JAXBElement<String>(_AumsUserRoomNo_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "SetSelection", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserSetSelection(String value) {
        return new JAXBElement<String>(_AumsUserSetSelection_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "State", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserState(String value) {
        return new JAXBElement<String>(_AumsUserState_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Street", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserStreet(String value) {
        return new JAXBElement<String>(_AumsUserStreet_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "Surname", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserSurname(String value) {
        return new JAXBElement<String>(_AumsUserSurname_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "SystemUser", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserSystemUser(String value) {
        return new JAXBElement<String>(_AumsUserSystemUser_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "UserLogin", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserUserLogin(String value) {
        return new JAXBElement<String>(_AumsUserUserLogin_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.GBK", name = "WindowsName", scope = AumsUser.class)
    public JAXBElement<String> createAumsUserWindowsName(String value) {
        return new JAXBElement<String>(_AumsUserWindowsName_QNAME, String.class, AumsUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "EntitySymbol", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryEntitySymbol(String value) {
        return new JAXBElement<String>(_EventEntryEntitySymbol_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Key", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryKey(String value) {
        return new JAXBElement<String>(_EventEntryKey_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Module", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryModule(String value) {
        return new JAXBElement<String>(_EventEntryModule_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Parameters", scope = EventEntry.class)
    public JAXBElement<ArrayOfanyType> createEventEntryParameters(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_EventEntryParameters_QNAME, ArrayOfanyType.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Program", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryProgram(String value) {
        return new JAXBElement<String>(_EventEntryProgram_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "UserLogin", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryUserLogin(String value) {
        return new JAXBElement<String>(_EventEntryUserLogin_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "Value", scope = EventEntry.class)
    public JAXBElement<String> createEventEntryValue(String value) {
        return new JAXBElement<String>(_EventEntryValue_QNAME, String.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "eventDescription", scope = EventEntry.class)
    public JAXBElement<EventDescription> createEventEntryEventDescription(EventDescription value) {
        return new JAXBElement<EventDescription>(_EventEntryEventDescription_QNAME, EventDescription.class, EventEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "FirstName", scope = EmployeeInfo.class)
    public JAXBElement<String> createEmployeeInfoFirstName(String value) {
        return new JAXBElement<String>(_EmployeeInfoFirstName_QNAME, String.class, EmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "LastName", scope = EmployeeInfo.class)
    public JAXBElement<String> createEmployeeInfoLastName(String value) {
        return new JAXBElement<String>(_EmployeeInfoLastName_QNAME, String.class, EmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "MiddleName", scope = EmployeeInfo.class)
    public JAXBElement<String> createEmployeeInfoMiddleName(String value) {
        return new JAXBElement<String>(_EmployeeInfoMiddleName_QNAME, String.class, EmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "WorkId", scope = EmployeeInfo.class)
    public JAXBElement<String> createEmployeeInfoWorkId(String value) {
        return new JAXBElement<String>(_EmployeeInfoWorkId_QNAME, String.class, EmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", name = "UserName", scope = UserSession.class)
    public JAXBElement<String> createUserSessionUserName(String value) {
        return new JAXBElement<String>(_UserSessionUserName_QNAME, String.class, UserSession.class, value);
    }

}
