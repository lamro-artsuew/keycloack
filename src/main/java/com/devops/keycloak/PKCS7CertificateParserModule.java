package com.devops.keycloak;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.ServerInfoAwareProviderFactory;


import java.util.Collections;
import java.util.Map;

public class PKCS7CertificateParserModuleFactory implements ProviderFactory<PKCS7CertificateParserModule>, ServerInfoAwareProviderFactory {
    @Override
    public PKCS7CertificateParserModule create(KeycloakSession session) {
        return new PKCS7CertificateParserModule(session);
    }
    @Override
    public void init(Config.Scope config) {
        // TODO: Initialization logic here
    }
    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // TODO: Post-initialization logic here
    }
    @Override
    public void close() {
        // TODO: Close down resources/logic here
    }
    @Override
    public String getId() {
        return "PKCS7CertificateParserModule";
    }
    @Override
    public Map<String, String> getOperationalInfo() {
        return Collections.emptyMap();
    }
}