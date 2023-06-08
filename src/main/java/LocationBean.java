import java.io.Serializable;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("locations")
@ViewScoped
public class LocationBean implements Serializable {

	private LocationDTO location;

	public void load() {
		Map<String, String> parameterMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		location = new LocationDTO();
		location.setLat(parameterMap.get("lat"));
		location.setLng(parameterMap.get("lng"));
	}

	public LocationDTO getLocation() {
		return location;
	}
}