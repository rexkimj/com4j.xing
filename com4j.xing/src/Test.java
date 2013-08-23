import xing.api.session.ClassFactory;
import xing.api.session.IXASession;
import xing.api.session.events._IXASessionEvents;
import com4j.EventCookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Test {
	final static Logger logger = LoggerFactory.getLogger(Test.class);
public static void main(String arg[]){
		
		logger.debug("test");
		IXASession iXASession = ClassFactory.createXASession();

		boolean isLogin = false;
		if(iXASession.connectServer("Hts.etrade.co.kr", 20001)){ //demo.etrade.co.kr
		   isLogin = iXASession.login("yamiya", "go2money", "make2money", 0, true); //1
		  }

		EventCookie cookie = iXASession.advise(_IXASessionEvents.class, new _IXASessionEvents() {
		   public void login(String szCode, String szMsg){
		    logger.debug("szCode==>{}    szMsg==>{}", szCode, szMsg);
		   }
		  });
		
		
	}

}
