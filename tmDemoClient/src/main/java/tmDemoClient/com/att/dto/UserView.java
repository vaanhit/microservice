package tmDemoClient.com.att.dto;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * @author Rohit
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView {

	private long id;
	private String fName;
	private String lName;
	private String organisation;
	private ArrayList<String> notifications;
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

	public ArrayList<String> getNotifications() {
		return notifications;
	}

	public int getPoints() {
		return points;
	}

}
