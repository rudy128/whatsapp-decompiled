package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Cwf  reason: case insensitive filesystem */
public abstract class C26284Cwf {
    public static final String A00 = C28314DxM.A09.A01;
    public static final String A01 = C28314DxM.A0K.A01;
    public static final String A02 = C28314DxM.A05.A01;

    public static TrustAnchor A01(String str, X509Certificate x509Certificate, Set set) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e = null;
        C28324DxW dxW = null;
        PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (!(trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null)) {
                    if (dxW == null) {
                        dxW = C28324DxW.A01(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (dxW.equals(C28324DxW.A01(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(publicKey);
                    } catch (Exception e2) {
                        e = e2;
                        trustAnchor = null;
                        publicKey = null;
                    }
                } else {
                    x509Certificate.verify(publicKey, str);
                }
            }
        }
        if (trustAnchor != null || e == null) {
            return trustAnchor;
        }
        throw C2W.A01("TrustAnchor found but certificate validation failed.", e);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [X.Dws, java.lang.Object] */
    public static LinkedHashSet A03(X509Certificate x509Certificate, List list, List list2) {
        C28284Dws dws;
        byte[] bArr;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(C26068Cri.A01(x509Certificate).A0B());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(A02);
                if (extensionValue != null) {
                    byte[] A05 = C28342Dxo.A05(extensionValue);
                    if (A05 instanceof C28284Dws) {
                        dws = (C28284Dws) A05;
                    } else if (A05 != null) {
                        C28339Dxl A052 = C28339Dxl.A05(A05);
                        ? obj = new Object();
                        Enumeration A0L = A052.A0L();
                        while (A0L.hasMoreElements()) {
                            C28341Dxn A03 = C28341Dxn.A03(A0L.nextElement());
                            int i = A03.A00;
                            if (i == 0) {
                                obj.A01 = C28342Dxo.A04(A03, false);
                            } else if (i == 1) {
                                obj.A02 = new C28317DxP(C28339Dxl.A06(A03, false));
                            } else if (i == 2) {
                                obj.A00 = C28337Dxj.A03(A03);
                            } else {
                                throw AnonymousClass000.A0k("illegal tag");
                            }
                        }
                        dws = obj;
                    } else {
                        dws = null;
                    }
                    C28342Dxo dxo = dws.A01;
                    if (dxo != null) {
                        bArr = dxo.A00;
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new C28327DxZ(bArr).A0B());
                    }
                }
            } catch (Exception unused) {
            }
            DZP dzp = new DZP(new CMI(x509CertSelector).A00);
            LinkedHashSet A14 = C17880vN.A14();
            try {
                A09(A14, list, dzp);
                A09(A14, list2, dzp);
                return A14;
            } catch (C2W e) {
                throw C2W.A01("Issuer certificate cannot be searched.", e);
            }
        } catch (Exception e2) {
            throw C2W.A01("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Set A04(DU8 du8) {
        X509Certificate x509Certificate;
        DU9 du9 = du8.A02;
        DZP dzp = du9.A09;
        LinkedHashSet A14 = C17880vN.A14();
        try {
            A09(A14, du9.A05, dzp);
            A09(A14, du9.A01.getCertStores(), dzp);
            if (!A14.isEmpty()) {
                return A14;
            }
            CertSelector certSelector = dzp.A00;
            if (certSelector instanceof X509CertSelector) {
                x509Certificate = ((X509CertSelector) certSelector).getCertificate();
            } else {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                return Collections.singleton(x509Certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (C2W e) {
            throw new C27272Day(e);
        }
    }

    public static void A07(Object obj, X509CRL x509crl, Date date, COn cOn) {
        X509CRLEntry x509CRLEntry;
        int i;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C28314DxM.A0K.A01);
            if (extensionValue != null && C28306DxE.A01(C28342Dxo.A05(extensionValue)).A03) {
                x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber());
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = x509crl.getIssuerX500Principal();
                    }
                    if (!C26068Cri.A00(obj).equals(C26068Cri.A03(certificateIssuer))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!C26068Cri.A00(obj).equals(C26068Cri.A03(x509crl.getIssuerX500Principal())) || (x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            if (x509CRLEntry.hasExtensions()) {
                if (!x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    try {
                        C28335Dxh A022 = C28335Dxh.A02(A05(C28314DxM.A0T.A01, x509CRLEntry));
                        if (A022 != null) {
                            i = A022.A0K();
                            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime() || i == 0 || i == 1 || i == 2 || i == 10) {
                                cOn.A00 = i;
                                cOn.A01 = x509CRLEntry.getRevocationDate();
                            }
                            return;
                        }
                    } catch (Exception e) {
                        throw C2W.A01("Reason code CRL entry extension could not be decoded.", e);
                    }
                } else {
                    throw C2W.A00("CRL entry has unsupported critical extensions.");
                }
            }
            i = 0;
            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime()) {
            }
            cOn.A00 = i;
            cOn.A01 = x509CRLEntry.getRevocationDate();
        } catch (Exception e2) {
            throw new C27270Daw(e2);
        } catch (CRLException e3) {
            throw C2W.A01("Failed check for indirect CRL.", e3);
        }
    }

    public static PublicKey A00(List list, E3R e3r, int i) {
        DSAKey dSAKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        boolean z = publicKey instanceof DSAPublicKey;
        DSAPublicKey dSAPublicKey = publicKey;
        if (z) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
            DSAParams params = dSAPublicKey2.getParams();
            dSAPublicKey = dSAPublicKey2;
            if (params == null) {
                do {
                    i++;
                    if (i < list.size()) {
                        PublicKey publicKey2 = ((Certificate) list.get(i)).getPublicKey();
                        if (publicKey2 instanceof DSAPublicKey) {
                            dSAKey = (DSAKey) publicKey2;
                        } else {
                            throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                        }
                    } else {
                        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                    }
                } while (dSAKey.getParams() == null);
                DSAParams params2 = dSAKey.getParams();
                try {
                    return KeyFactory.getInstance("DSA", ((DZI) e3r).A00).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params2.getP(), params2.getQ(), params2.getG()));
                } catch (Exception e) {
                    throw AnonymousClass8BR.A0w(e.getMessage());
                }
            }
        }
        return dSAPublicKey;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Cr0, java.lang.Object] */
    public static final HashSet A02(C28339Dxl dxl) {
        HashSet A12 = C17880vN.A12();
        if (dxl != null) {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            ? obj = new Object();
            obj.A00 = A15;
            Enumeration A0L = dxl.A0L();
            while (A0L.hasMoreElements()) {
                try {
                    AnonymousClass1Bx r0 = (AnonymousClass1Bx) A0L.nextElement();
                    if (r0 != null) {
                        obj.A05(r0.CP9(), true);
                        A12.add(new PolicyQualifierInfo(A15.toByteArray()));
                        A15.reset();
                    } else {
                        throw C17880vN.A0f("null object detected");
                    }
                } catch (IOException e) {
                    throw new C27275Db2("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return A12;
    }

    public static AnonymousClass1Bz A05(String str, X509Extension x509Extension) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return AnonymousClass1Bz.A01(C28342Dxo.A05(extensionValue));
        } catch (Exception e) {
            throw C2W.A01(AnonymousClass001.A1H("exception processing extension ", str, AnonymousClass000.A10()), e);
        }
    }

    public static DUA A06(DUA dua, DUA dua2, List[] listArr) {
        DUA dua3 = (DUA) dua2.getParent();
        if (dua != null) {
            if (dua3 == null) {
                for (int i = 0; i < listArr.length; i++) {
                    listArr[i] = AnonymousClass000.A13();
                }
            } else {
                dua3.A01.remove(dua2);
                A0A(dua2, listArr);
                return dua;
            }
        }
        return null;
    }

    public static void A08(PublicKey publicKey) {
        try {
            C28294Dx2.A01(publicKey.getEncoded());
        } catch (Exception e) {
            throw new C27275Db2("Subject public key cannot be decoded.", e);
        }
    }

    public static void A09(LinkedHashSet linkedHashSet, List list, DZP dzp) {
        ArrayList arrayList;
        for (Object next : list) {
            if (next instanceof DSI) {
                DSI dsi = (DSI) next;
                if (dzp == null) {
                    arrayList = C17880vN.A10(dsi.A00);
                } else {
                    try {
                        arrayList = AnonymousClass000.A13();
                        for (Object next2 : dsi.A00) {
                            if (dzp.Bj5(next2)) {
                                arrayList.add(next2);
                            }
                        }
                    } catch (DZW e) {
                        throw C2W.A01("Problem while picking certificates from X.509 store.", e);
                    }
                }
                linkedHashSet.addAll(arrayList);
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new C27282DbB(dzp)));
                } catch (CertStoreException e2) {
                    throw C2W.A01("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    public static void A0A(DUA dua, List[] listArr) {
        listArr[dua.getDepth()].remove(dua);
        if (AnonymousClass000.A1a(dua.A01)) {
            Iterator children = dua.getChildren();
            while (children.hasNext()) {
                A0A((DUA) children.next(), listArr);
            }
        }
    }
}
