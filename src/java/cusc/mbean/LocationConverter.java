package cusc.mbean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("locationConverter")
public class LocationConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (null == value || 0 == value.length()) {
            return null;
        }
        String locationParts[] = value.split(",");
        if (locationParts.length != 3
                || locationParts[0].length() == 0
                || locationParts[1].length() == 0
                || locationParts[2].length() == 0) {
            FacesMessage message = new FacesMessage("Địa chỉ không đúng định dạng (address, city, country).", 
                    "Định dạng địa chỉ là {address, city, country)}.");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(message);
        }
        String address = locationParts[0];
        String city = locationParts[1];
        String country = locationParts[2];
        Location location = new Location(address, city, country);
        return location;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Location location = (Location) value;
        return location.getAddress() + ", " + location.getCity() + ", " + location.getCountry();
    }
}
