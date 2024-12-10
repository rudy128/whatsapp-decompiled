package org.spongycastle.jce.provider;

import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEB;
import X.C17880vN;
import X.C25261Cc2;
import X.C25962CpU;
import X.C26068Cri;
import X.C26284Cwf;
import X.C26295Cx7;
import X.C27275Db2;
import X.C27283DbC;
import X.C28300Dx8;
import X.C28314DxM;
import X.C28324DxW;
import X.C2W;
import X.DU8;
import X.DU9;
import X.DUA;
import X.DZB;
import X.DZI;
import X.DZP;
import X.E3Q;
import X.E3R;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    public final E3R A00;
    public final boolean A01;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    public PKIXCertPathValidatorSpi(boolean z) {
        this.A00 = new DZI();
        this.A01 = z;
    }

    public static void A00(X509Certificate x509Certificate) {
        if (x509Certificate instanceof E3Q) {
            try {
                if (((C27283DbC) ((E3Q) x509Certificate)).c.A03 == null) {
                    e = null;
                    throw C2W.A01("unable to process TBSCertificate", e);
                }
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            try {
                C28300Dx8.A01(x509Certificate.getTBSCertificate());
            } catch (CertificateEncodingException e2) {
                throw C2W.A01("unable to process TBSCertificate", e2);
            } catch (IllegalArgumentException e3) {
                throw C2W.A00(e3.getMessage());
            }
        }
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        DU9 du9;
        C28324DxW dxW;
        PublicKey publicKey;
        DZB dzb;
        HashSet A12;
        HashSet A122;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            du9 = new DU9(new C25962CpU((PKIXParameters) certPathParameters2));
        } else if (certPathParameters2 instanceof DU8) {
            du9 = ((DU8) certPathParameters2).A02;
        } else if (certPathParameters2 instanceof DU9) {
            du9 = (DU9) certPathParameters2;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parameters must be a ");
            BE7.A1E(PKIXParameters.class, A10);
            throw BE6.A0y(AnonymousClass000.A0y(" instance.", A10));
        }
        Set set = du9.A08;
        if (set != null) {
            CertPath certPath2 = certPath;
            List<? extends Certificate> certificates = certPath2.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Date date = new Date();
                String str = C26284Cwf.A01;
                Date date2 = du9.A03;
                if (date2 != null) {
                    date = new Date(date2.getTime());
                }
                PKIXParameters pKIXParameters = du9.A01;
                Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
                try {
                    TrustAnchor A012 = C26284Cwf.A01(pKIXParameters.getSigProvider(), BE6.A0z(certificates, AnonymousClass3MX.A02(certificates, 1)), set);
                    if (A012 != null) {
                        A00(A012.getTrustedCert());
                        C25962CpU cpU = new C25962CpU(du9);
                        cpU.A05 = Collections.singleton(A012);
                        DU9 du92 = new DU9(cpU);
                        int i = size + 1;
                        ArrayList[] arrayListArr = new ArrayList[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayListArr[i2] = AnonymousClass000.A13();
                        }
                        HashSet A123 = C17880vN.A12();
                        DUA dua = new DUA("2.5.29.32.0", (PolicyNode) null, BE8.A0n("2.5.29.32.0", A123), A123, C17880vN.A12(), 0, false);
                        arrayListArr[0].add(dua);
                        C25261Cc2 cc2 = new C25261Cc2();
                        HashSet A124 = C17880vN.A12();
                        PKIXParameters pKIXParameters2 = du92.A01;
                        int i3 = i;
                        if (pKIXParameters2.isExplicitPolicyRequired()) {
                            i3 = 0;
                        }
                        int i4 = i;
                        if (pKIXParameters2.isAnyPolicyInhibited()) {
                            i4 = 0;
                        }
                        if (pKIXParameters2.isPolicyMappingInhibited()) {
                            i = 0;
                        }
                        X509Certificate trustedCert = A012.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                dxW = C26068Cri.A02(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (RuntimeException e) {
                                throw C27275Db2.A00("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            dxW = C26068Cri.A03(A012.getCA());
                            publicKey = A012.getCAPublicKey();
                        }
                        try {
                            C26284Cwf.A08(publicKey);
                            DZP dzp = du92.A09;
                            if (dzp != null) {
                                if (!dzp.A00.match((Certificate) certificates.get(0))) {
                                    throw C27275Db2.A00("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                                }
                            }
                            List<PKIXCertPathChecker> certPathCheckers = pKIXParameters2.getCertPathCheckers();
                            for (PKIXCertPathChecker init : certPathCheckers) {
                                init.init(false);
                            }
                            if (du92.A0A) {
                                dzb = new DZB(this.A00);
                            } else {
                                dzb = null;
                            }
                            int A013 = AnonymousClass3MX.A01(certificates);
                            int i5 = size;
                            X509Certificate x509Certificate = null;
                            while (A013 >= 0) {
                                int i6 = size - A013;
                                x509Certificate = BE6.A0z(certificates, A013);
                                boolean A1T = AnonymousClass000.A1T(A013, AnonymousClass3MX.A01(certificates));
                                try {
                                    A00(x509Certificate);
                                    C26295Cx7.A0A(publicKey, certPath2, trustedCert, date, dxW, dzb, du92, A013, A1T);
                                    boolean z = this.A01;
                                    C25261Cc2 cc22 = cc2;
                                    C26295Cx7.A0I(certPath2, cc22, A013, z);
                                    dua = C26295Cx7.A08(certPath2, C26295Cx7.A07(certPath2, A124, dua, arrayListArr, A013, i4, z), A013);
                                    if (i3 > 0 || dua != null) {
                                        if (i6 != size) {
                                            if (x509Certificate == null || x509Certificate.getVersion() != 1) {
                                                C26295Cx7.A0C(certPath2, A013);
                                                dua = C26295Cx7.A09(certPath2, dua, arrayListArr, A013, i);
                                                C26295Cx7.A0H(certPath2, cc22, A013);
                                                int A07 = BEB.A07(certPath2, A013, i3);
                                                int A072 = BEB.A07(certPath2, A013, i);
                                                int A073 = BEB.A07(certPath2, A013, i4);
                                                i3 = C26295Cx7.A00(certPath2, A013, A07);
                                                i = C26295Cx7.A01(certPath2, A013, A072);
                                                i4 = C26295Cx7.A02(certPath2, A013, A073);
                                                C26295Cx7.A0D(certPath2, A013);
                                                if (!BE9.A1W(BE9.A0x(certPath2, A013))) {
                                                    if (i5 > 0) {
                                                        i5--;
                                                    } else {
                                                        throw C27275Db2.A00("Max path length not greater than zero", (Throwable) null, certPath2, A013);
                                                    }
                                                }
                                                i5 = C26295Cx7.A03(certPath2, A013, i5);
                                                C26295Cx7.A0E(certPath2, A013);
                                                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                                if (criticalExtensionOIDs != null) {
                                                    A122 = AnonymousClass8BR.A12(criticalExtensionOIDs);
                                                    BEB.A1Q(A122);
                                                } else {
                                                    A122 = C17880vN.A12();
                                                }
                                                C26295Cx7.A0F(certPath2, certPathCheckers, A122, A013);
                                                dxW = C26068Cri.A02(x509Certificate);
                                                try {
                                                    publicKey = C26284Cwf.A00(certPath2.getCertificates(), this.A00, A013);
                                                    C26284Cwf.A08(publicKey);
                                                    trustedCert = x509Certificate;
                                                } catch (CertPathValidatorException e2) {
                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath2, A013);
                                                }
                                            } else if (i6 != 1 || !x509Certificate.equals(A012.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, A013);
                                            }
                                        }
                                        A013--;
                                    } else {
                                        throw C27275Db2.A00("No valid policy tree found when one expected.", (Throwable) null, certPath2, A013);
                                    }
                                } catch (C2W e3) {
                                    throw new CertPathValidatorException(e3.getMessage(), e3._underlyingException, certPath2, A013);
                                }
                            }
                            Class cls = C26295Cx7.A00;
                            if (!BE9.A1W(x509Certificate) && i3 != 0) {
                                i3--;
                            }
                            int i7 = A013 + 1;
                            int A04 = C26295Cx7.A04(certPath2, i7, i3);
                            Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                A12 = AnonymousClass8BR.A12(criticalExtensionOIDs2);
                                BEB.A1Q(A12);
                                A12.remove(C26295Cx7.A04);
                                A12.remove(C28314DxM.A0E.A01);
                            } else {
                                A12 = C17880vN.A12();
                            }
                            C26295Cx7.A0G(certPath2, certPathCheckers, A12, i7);
                            DUA A06 = C26295Cx7.A06(certPath2, initialPolicies, A124, du92, dua, arrayListArr, i7);
                            if (A04 > 0 || A06 != null) {
                                return new PKIXCertPathValidatorResult(A012, A06, x509Certificate.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, A013);
                        } catch (CertPathValidatorException e4) {
                            throw C27275Db2.A00("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (C2W e5) {
                    throw new CertPathValidatorException(e5.getMessage(), e5._underlyingException, certPath2, AnonymousClass3MX.A02(certificates, 1));
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw BE6.A0y("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
