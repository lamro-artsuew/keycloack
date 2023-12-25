package com.devops.keycloak;

import org.keycloak.models.UserModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.cert.X509Certificate;

@Service
public interface CertificateService {
    X509Certificate getCertificate(UserModel user);
    void saveCertificate(UserModel user, X509Certificate certificate);
}