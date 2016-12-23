package tmDemoClient.com.att.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by bartoszjedrzejewski on 08/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView {

	private long id;
	private String fName;
	private String lName;
	private String organisation;
	private List<String> notifications;
	private int points;

	public long getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getOrganisation() {
		return organisation;
	}

	public List<String> getNotifications() {
		return notifications;
	}

	public int getPoints() {
		return points;
	}

}
