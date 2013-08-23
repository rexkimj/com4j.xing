package xing.api;

import java.util.List;
import java.util.Map;
import java.util.Observable;

public class ResultQuery  extends Observable{

	private List<Map<String, String>> list;

	public List<Map<String, String>> getList() {
		return list;
	}

	public void setList(List<Map<String, String>> list) {
		this.list = list;
		
		setChanged();
		notifyObservers(null);
	}

}
