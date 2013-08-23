
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xing.api.session.ClassFactory;
import xing.api.session.IXASession;
import xing.api.session.events._IXASessionEvents;

import com4j.EventCookie;

/**
 * 로그인, 계좌조회 등 세션과 관련된 메소드를 담고있는 클래스
 * 
 * @author sjp
 * 
 */
public class Session {

	final Logger logger = LoggerFactory.getLogger(Session.class);

	/**
	 * 세션 관련
	 */
	private IXASession iXASession = ClassFactory.createXASession();

	/**
	 * 로그인
	 * 
	 * @param szID
	 *            아이디
	 * @param szPwd
	 *            아이디 비밀번호
	 * @param szCertPwd
	 *            공인인증서 비밀번호
	 * @return
	 */
	public Boolean logIn(String szID, String szPwd, String szCertPwd) {
		// String directory = "C:" + File.separator + "xingapi" +
		// File.separator;
		// System.load(directory + "XA_DataSet.dll");
		// System.load(directory + "XA_Session.dll");
		// ISampleService dll = (ISampleService)Native.loadLibrary("XA_Session",
		// ISampleService.class);

		logger.debug("iXASession before ::::: {}", iXASession.toString());

		EventCookie cookie = iXASession.advise(_IXASessionEvents.class,
				new _IXASessionEvents() {
					public void login(String szCode, String szMsg) {
						logger.debug("szCode==>{}    szMsg==>{}", szCode, szMsg);
					}
				});

		iXASession.disconnectServer();

		// TO-DO : 실투자, 모의투자 변수로 받을것
		if (iXASession.connectServer("Hts.etrade.co.kr", 20001)) { // demo.etrade.co.kr
			return iXASession.login(szID, szPwd, szCertPwd, 0, false); // 1
		}

		cookie.close();
		return false;
	}
	
	
}
