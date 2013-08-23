package xing.api.session  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * XASession Class
   */
  public static xing.api.session.IXASession createXASession() {
    return COM4J.createInstance( xing.api.session.IXASession.class, "{7FEF321C-6BFD-413C-AA80-541A275434A1}" );
  }
  
 
}
