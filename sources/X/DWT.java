package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class DWT implements TrustManager, X509TrustManager {
    public final int A00;

    public DWT(int i) {
        this.A00 = i;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        switch (this.A00) {
            case 0:
                throw new CertificateException("No client certificate verification provided");
            case 1:
                return;
            case 2:
                throw new CertificateException("No client certificate verification provided");
            default:
                throw new CertificateException("No client certificate verification provided");
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        switch (this.A00) {
            case 0:
                Date date = new Date();
                for (X509Certificate checkValidity : x509CertificateArr) {
                    checkValidity.checkValidity(date);
                }
                try {
                    CertPathValidator instance = CertPathValidator.getInstance("PKIX");
                    CertPath generateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(x509CertificateArr));
                    HashSet hashSet = new HashSet(r5);
                    for (X509Certificate trustAnchor : getAcceptedIssuers()) {
                        hashSet.add(new TrustAnchor(trustAnchor, (byte[]) null));
                    }
                    try {
                        PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
                        pKIXParameters.setDate(date);
                        pKIXParameters.setRevocationEnabled(false);
                        try {
                            instance.validate(generateCertPath, pKIXParameters);
                            return;
                        } catch (InvalidAlgorithmParameterException | CertPathValidatorException e) {
                            throw new CertificateException(e);
                        }
                    } catch (InvalidAlgorithmParameterException e2) {
                        throw new CertificateException(e2);
                    }
                } catch (NoSuchAlgorithmException e3) {
                    throw new CertificateException(e3);
                }
            case 1:
                return;
            case 2:
                Date date2 = new Date();
                for (X509Certificate checkValidity2 : x509CertificateArr) {
                    checkValidity2.checkValidity(date2);
                }
                try {
                    CertPathValidator instance2 = CertPathValidator.getInstance("PKIX");
                    CertPath generateCertPath2 = CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(x509CertificateArr));
                    HashSet hashSet2 = new HashSet(r5);
                    for (X509Certificate trustAnchor2 : getAcceptedIssuers()) {
                        hashSet2.add(new TrustAnchor(trustAnchor2, (byte[]) null));
                    }
                    try {
                        PKIXParameters pKIXParameters2 = new PKIXParameters(hashSet2);
                        pKIXParameters2.setDate(date2);
                        pKIXParameters2.setRevocationEnabled(false);
                        try {
                            instance2.validate(generateCertPath2, pKIXParameters2);
                            return;
                        } catch (InvalidAlgorithmParameterException | CertPathValidatorException e4) {
                            throw new CertificateException(e4);
                        }
                    } catch (InvalidAlgorithmParameterException e5) {
                        throw new CertificateException(e5);
                    }
                } catch (NoSuchAlgorithmException e6) {
                    throw new CertificateException(e6);
                }
            default:
                Date date3 = new Date();
                for (X509Certificate checkValidity3 : x509CertificateArr) {
                    checkValidity3.checkValidity(date3);
                }
                try {
                    CertPathValidator instance3 = CertPathValidator.getInstance("PKIX");
                    CertPath generateCertPath3 = CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(x509CertificateArr));
                    HashSet hashSet3 = new HashSet(r5);
                    for (X509Certificate trustAnchor3 : getAcceptedIssuers()) {
                        hashSet3.add(new TrustAnchor(trustAnchor3, (byte[]) null));
                    }
                    try {
                        PKIXParameters pKIXParameters3 = new PKIXParameters(hashSet3);
                        pKIXParameters3.setDate(date3);
                        pKIXParameters3.setRevocationEnabled(false);
                        try {
                            instance3.validate(generateCertPath3, pKIXParameters3);
                            return;
                        } catch (InvalidAlgorithmParameterException | CertPathValidatorException e7) {
                            throw new CertificateException(e7);
                        }
                    } catch (InvalidAlgorithmParameterException e8) {
                        throw new CertificateException(e8);
                    }
                } catch (NoSuchAlgorithmException e9) {
                    throw new CertificateException(e9);
                }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        switch (this.A00) {
            case 0:
                return AnonymousClass9AA.A01;
            case 1:
                return null;
            case 2:
                return C27348DcK.A0C;
            default:
                return AnonymousClass9A9.A01;
        }
    }
}
