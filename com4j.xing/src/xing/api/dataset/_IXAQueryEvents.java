package xing.api.dataset  ;

import com4j.*;

/**
 * _IXAQueryEvents Interface
 */
@IID("{00020400-0000-0000-C000-000000000046}")
public interface _IXAQueryEvents extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method ReceiveData
   * </p>
   * @param szTrCode Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  void receiveData(
    java.lang.String szTrCode);


  /**
   * <p>
   * method ReceiveMessage
   * </p>
   * @param bIsSystemError Mandatory boolean parameter.
   * @param nMessageCode Mandatory java.lang.String parameter.
   * @param szMessage Mandatory java.lang.String parameter.
   */

  @DISPID(2)
  void receiveMessage(
    boolean bIsSystemError,
    java.lang.String nMessageCode,
    java.lang.String szMessage);


  // Properties:
}
