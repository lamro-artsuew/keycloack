package com.devops.keycloak;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;
import com.devops.keycloak.PKCS7CertificateParserModule;
public class PKCS7SPI implements Spi {

    public boolean isInternal() {
        return false;
    }

    public String getName() {
        return "PKCS7SPI";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        // TODO: Return the appropriate provider class
        return PKCS7CertificateParserModule.class; // Change Provider.class to your own implementation
    }

    public Class<? extends Provider> getCertificateParserProviderClass() {
        return PKCS7CertificateParserModule.class;
    }

    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return PKCS7CertificateParserModuleFactory.class;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}