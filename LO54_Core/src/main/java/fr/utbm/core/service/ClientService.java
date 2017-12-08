
package fr.utbm.core.service;

import fr.utbm.core.entity.Client;
import fr.utbm.core.repository.ClientDao;

public class ClientService {
    public void inscribe(Client client) {
        ClientDao dao = new ClientDao();
        dao.inscribe(client);
    }
}
