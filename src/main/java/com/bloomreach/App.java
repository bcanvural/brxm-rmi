package com.bloomreach;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.hippoecm.repository.HippoRepository;
import org.hippoecm.repository.HippoRepositoryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            String repositoryLocation = "rmi://127.0.0.1:1099/hipporepository";
            String username = "admin";
            String password = "admin";

            HippoRepository repository = HippoRepositoryFactory.getHippoRepository(repositoryLocation);
            Session session = repository.login(username, password.toCharArray());
            Node node = session.getRootNode();
            assert node != null;
        } catch (RepositoryException ex) {
            LOGGER.error(ex.getMessage());
        }

    }

}
