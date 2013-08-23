

import java.util.List;
import java.util.Map;

import com.sun.jna.Library;

public interface ISampleService extends Library {
	
	public List<Map<String, String>> getList(List queryBean) throws InterruptedException;
	
}
