
package webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IAdministration", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IAdministration {


    /**
     * 
     * @param password
     * @param createPresistCookie
     * @param userName
     * @param databaseSet
     * @return
     *     returns webService.UserSession
     */
    @WebMethod(operationName = "Login", action = "http://tempuri.org/IAdministration/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Login", targetNamespace = "http://tempuri.org/", className = "webService.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://tempuri.org/", className = "webService.LoginResponse")
    public UserSession login(
        @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "createPresistCookie", targetNamespace = "http://tempuri.org/")
        Boolean createPresistCookie,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param publicname
     * @param userId
     * @param databaseSet
     * @return
     *     returns webService.UserStatus
     */
    @WebMethod(operationName = "GetUserStatus", action = "http://tempuri.org/IAdministration/GetUserStatus")
    @WebResult(name = "GetUserStatusResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetUserStatus", targetNamespace = "http://tempuri.org/", className = "webService.GetUserStatus")
    @ResponseWrapper(localName = "GetUserStatusResponse", targetNamespace = "http://tempuri.org/", className = "webService.GetUserStatusResponse")
    public UserStatus getUserStatus(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        Integer userId,
        @WebParam(name = "publicname", targetNamespace = "http://tempuri.org/")
        String publicname,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param sessionID
     * @param dataSet
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "LogOff", action = "http://tempuri.org/IAdministration/LogOff")
    @WebResult(name = "LogOffResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LogOff", targetNamespace = "http://tempuri.org/", className = "webService.LogOff")
    @ResponseWrapper(localName = "LogOffResponse", targetNamespace = "http://tempuri.org/", className = "webService.LogOffResponse")
    public Boolean logOff(
        @WebParam(name = "SessionID", targetNamespace = "http://tempuri.org/")
        String sessionID,
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param userName
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "MustChangePassword", action = "http://tempuri.org/IAdministration/MustChangePassword")
    @WebResult(name = "MustChangePasswordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MustChangePassword", targetNamespace = "http://tempuri.org/", className = "webService.MustChangePassword")
    @ResponseWrapper(localName = "MustChangePasswordResponse", targetNamespace = "http://tempuri.org/", className = "webService.MustChangePasswordResponse")
    public Integer mustChangePassword(
        @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
        String userName);

    /**
     * 
     * @param publicName
     * @param userName
     * @param databaseSet
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "CheckAccess", action = "http://tempuri.org/IAdministration/CheckAccess")
    @WebResult(name = "CheckAccessResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckAccess", targetNamespace = "http://tempuri.org/", className = "webService.CheckAccess")
    @ResponseWrapper(localName = "CheckAccessResponse", targetNamespace = "http://tempuri.org/", className = "webService.CheckAccessResponse")
    public Boolean checkAccess(
        @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "PublicName", targetNamespace = "http://tempuri.org/")
        String publicName,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param publicName
     * @param sessionID
     * @param databaseSet
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsAuthorized", action = "http://tempuri.org/IAdministration/IsAuthorized")
    @WebResult(name = "IsAuthorizedResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsAuthorized", targetNamespace = "http://tempuri.org/", className = "webService.IsAuthorized")
    @ResponseWrapper(localName = "IsAuthorizedResponse", targetNamespace = "http://tempuri.org/", className = "webService.IsAuthorizedResponse")
    public Boolean isAuthorized(
        @WebParam(name = "SessionID", targetNamespace = "http://tempuri.org/")
        String sessionID,
        @WebParam(name = "PublicName", targetNamespace = "http://tempuri.org/")
        String publicName,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param publicName
     * @param databaseSet
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsSecured", action = "http://tempuri.org/IAdministration/IsSecured")
    @WebResult(name = "IsSecuredResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsSecured", targetNamespace = "http://tempuri.org/", className = "webService.IsSecured")
    @ResponseWrapper(localName = "IsSecuredResponse", targetNamespace = "http://tempuri.org/", className = "webService.IsSecuredResponse")
    public Boolean isSecured(
        @WebParam(name = "PublicName", targetNamespace = "http://tempuri.org/")
        String publicName,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param oldPassword
     * @param newPassword
     * @param userName
     * @param databaseSet
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ChangePassword", action = "http://tempuri.org/IAdministration/ChangePassword")
    @WebResult(name = "ChangePasswordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ChangePassword", targetNamespace = "http://tempuri.org/", className = "webService.ChangePassword")
    @ResponseWrapper(localName = "ChangePasswordResponse", targetNamespace = "http://tempuri.org/", className = "webService.ChangePasswordResponse")
    public String changePassword(
        @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "oldPassword", targetNamespace = "http://tempuri.org/")
        String oldPassword,
        @WebParam(name = "NewPassword", targetNamespace = "http://tempuri.org/")
        String newPassword,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param userid
     * @param databaseSet
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/IAdministration/getUserName")
    @WebResult(name = "getUserNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getUserName", targetNamespace = "http://tempuri.org/", className = "webService.GetUserName")
    @ResponseWrapper(localName = "getUserNameResponse", targetNamespace = "http://tempuri.org/", className = "webService.GetUserNameResponse")
    public String getUserName(
        @WebParam(name = "Userid", targetNamespace = "http://tempuri.org/")
        Integer userid,
        @WebParam(name = "DatabaseSet", targetNamespace = "http://tempuri.org/")
        String databaseSet);

    /**
     * 
     * @param userid
     * @param dataSet
     * @return
     *     returns webService.EmployeeInfo
     */
    @WebMethod(action = "http://tempuri.org/IAdministration/getEmpInfo")
    @WebResult(name = "getEmpInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getEmpInfo", targetNamespace = "http://tempuri.org/", className = "webService.GetEmpInfo")
    @ResponseWrapper(localName = "getEmpInfoResponse", targetNamespace = "http://tempuri.org/", className = "webService.GetEmpInfoResponse")
    public EmployeeInfo getEmpInfo(
        @WebParam(name = "Userid", targetNamespace = "http://tempuri.org/")
        Integer userid,
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param ev
     * @param dataset
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "AddEventLog", action = "http://tempuri.org/IAdministration/AddEventLog")
    @WebResult(name = "AddEventLogResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddEventLog", targetNamespace = "http://tempuri.org/", className = "webService.AddEventLog")
    @ResponseWrapper(localName = "AddEventLogResponse", targetNamespace = "http://tempuri.org/", className = "webService.AddEventLogResponse")
    public Integer addEventLog(
        @WebParam(name = "ev", targetNamespace = "http://tempuri.org/")
        EventEntry ev,
        @WebParam(name = "dataset", targetNamespace = "http://tempuri.org/")
        String dataset);

    /**
     * 
     * @param dataset
     * @param paramsList
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "AddEventParamLog", action = "http://tempuri.org/IAdministration/AddEventParamLog")
    @WebResult(name = "AddEventParamLogResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddEventParamLog", targetNamespace = "http://tempuri.org/", className = "webService.AddEventParamLog")
    @ResponseWrapper(localName = "AddEventParamLogResponse", targetNamespace = "http://tempuri.org/", className = "webService.AddEventParamLogResponse")
    public Integer addEventParamLog(
        @WebParam(name = "paramsList", targetNamespace = "http://tempuri.org/")
        ArrayOfLogParameter paramsList,
        @WebParam(name = "dataset", targetNamespace = "http://tempuri.org/")
        String dataset);

    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Encrypt", action = "http://tempuri.org/IAdministration/Encrypt")
    @WebResult(name = "EncryptResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Encrypt", targetNamespace = "http://tempuri.org/", className = "webService.Encrypt")
    @ResponseWrapper(localName = "EncryptResponse", targetNamespace = "http://tempuri.org/", className = "webService.EncryptResponse")
    public String encrypt(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        String value);

    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Decrypt", action = "http://tempuri.org/IAdministration/Decrypt")
    @WebResult(name = "DecryptResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Decrypt", targetNamespace = "http://tempuri.org/", className = "webService.Decrypt")
    @ResponseWrapper(localName = "DecryptResponse", targetNamespace = "http://tempuri.org/", className = "webService.DecryptResponse")
    public String decrypt(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        String value);

    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHashCode", action = "http://tempuri.org/IAdministration/GetHashCode")
    @WebResult(name = "GetHashCodeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetHashCode", targetNamespace = "http://tempuri.org/", className = "webService.GetHashCode")
    @ResponseWrapper(localName = "GetHashCodeResponse", targetNamespace = "http://tempuri.org/", className = "webService.GetHashCodeResponse")
    public String getHashCode(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        String value);

    /**
     * 
     * @param password
     * @param userName
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CheckPasswordPolicy", action = "http://tempuri.org/IAdministration/CheckPasswordPolicy")
    @WebResult(name = "CheckPasswordPolicyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckPasswordPolicy", targetNamespace = "http://tempuri.org/", className = "webService.CheckPasswordPolicy")
    @ResponseWrapper(localName = "CheckPasswordPolicyResponse", targetNamespace = "http://tempuri.org/", className = "webService.CheckPasswordPolicyResponse")
    public String checkPasswordPolicy(
        @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "message", targetNamespace = "http://tempuri.org/")
        String message);

    /**
     * 
     * @param login
     * @param dataSet
     * @return
     *     returns webService.AumsUser
     */
    @WebMethod(operationName = "UserState", action = "http://tempuri.org/IAdministration/UserState")
    @WebResult(name = "UserStateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UserState", targetNamespace = "http://tempuri.org/", className = "webService.UserState")
    @ResponseWrapper(localName = "UserStateResponse", targetNamespace = "http://tempuri.org/", className = "webService.UserStateResponse")
    public AumsUser userState(
        @WebParam(name = "login", targetNamespace = "http://tempuri.org/")
        String login,
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param dataSet
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "MaxLoginRetryCount", action = "http://tempuri.org/IAdministration/MaxLoginRetryCount")
    @WebResult(name = "MaxLoginRetryCountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MaxLoginRetryCount", targetNamespace = "http://tempuri.org/", className = "webService.MaxLoginRetryCount")
    @ResponseWrapper(localName = "MaxLoginRetryCountResponse", targetNamespace = "http://tempuri.org/", className = "webService.MaxLoginRetryCountResponse")
    public Integer maxLoginRetryCount(
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param userName
     * @param dataSet
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsBlockedLogin", action = "http://tempuri.org/IAdministration/IsBlockedLogin")
    @WebResult(name = "IsBlockedLoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsBlockedLogin", targetNamespace = "http://tempuri.org/", className = "webService.IsBlockedLogin")
    @ResponseWrapper(localName = "IsBlockedLoginResponse", targetNamespace = "http://tempuri.org/", className = "webService.IsBlockedLoginResponse")
    public Boolean isBlockedLogin(
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param maxLoginRetryCount
     * @param user
     * @param dataSet
     * @param incorrectLoginsCount
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IncrementWrongLogins", action = "http://tempuri.org/IAdministration/IncrementWrongLogins")
    @WebResult(name = "IncrementWrongLoginsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IncrementWrongLogins", targetNamespace = "http://tempuri.org/", className = "webService.IncrementWrongLogins")
    @ResponseWrapper(localName = "IncrementWrongLoginsResponse", targetNamespace = "http://tempuri.org/", className = "webService.IncrementWrongLoginsResponse")
    public Boolean incrementWrongLogins(
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        AumsUser user,
        @WebParam(name = "maxLoginRetryCount", targetNamespace = "http://tempuri.org/")
        Integer maxLoginRetryCount,
        @WebParam(name = "incorrectLoginsCount", targetNamespace = "http://tempuri.org/")
        Integer incorrectLoginsCount,
        @WebParam(name = "DataSet", targetNamespace = "http://tempuri.org/")
        String dataSet);

    /**
     * 
     * @param userId
     * @param dataset
     * @return
     *     returns webService.ArrayOfINSAGetGroupRights
     */
    @WebMethod(action = "http://tempuri.org/IAdministration/getGroupRights")
    @WebResult(name = "getGroupRightsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getGroupRights", targetNamespace = "http://tempuri.org/", className = "webService.GetGroupRights")
    @ResponseWrapper(localName = "getGroupRightsResponse", targetNamespace = "http://tempuri.org/", className = "webService.GetGroupRightsResponse")
    public ArrayOfINSAGetGroupRights getGroupRights(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        Integer userId,
        @WebParam(name = "Dataset", targetNamespace = "http://tempuri.org/")
        String dataset);

}