
package fr.utbm.core.service;

import fr.utbm.core.entity.Location;
import fr.utbm.core.repository.LocationDao;
import java.util.List;

public class LocationService {
    public List<Location> getList() {
        LocationDao dao = new LocationDao();
        return dao.getLocationList();
    }
}
