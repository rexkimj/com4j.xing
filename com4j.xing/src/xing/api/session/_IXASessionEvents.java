package xing.api.session  ;

import com4j.*;

/**
 * _IXASessionEvents Interface
 */
@IID("{00020400-0000-0000-C000-000000000046}")
public interface _IXASessionEvents extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method OnLogIn
   * </p>
   * @param szCode Mandatory java.lang.String parameter.
   * @param szMsg Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  void login(
    java.lang.String szCode,
    java.lang.String szMsg);


  /**
   * <p>
   * method OnLogOut
   * </p>
   */

  @DISPID(2)
  void logout();


  /**
   * <p>
   * method OnDisConnect
   * </p>
   */

  @DISPID(3)
  void disconnect();


  // Properties:
}
