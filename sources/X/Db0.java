package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

public class Db0 extends CertPathBuilderSpi {
    public Exception A00;
    public final E3R A01;
    public final boolean A02;

    public Db0() {
        this(false);
    }

    public Db0(boolean z) {
        this.A01 = new DZI();
        this.A02 = z;
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        DU8 du8;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            new C25962CpU((PKIXParameters) pKIXBuilderParameters);
            du8 = new DU8(new C25564Ci2(pKIXBuilderParameters));
        } else if (certPathParameters instanceof DU8) {
            du8 = (DU8) certPathParameters;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parameters must be an instance of ");
            BE7.A1E(PKIXBuilderParameters.class, A10);
            A10.append(" or ");
            BE7.A1E(DU8.class, A10);
            throw BE6.A0y(AnonymousClass000.A0y(".", A10));
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = C26284Cwf.A04(du8).iterator();
        CertPathBuilderResult certPathBuilderResult = null;
        while (true) {
            if (it.hasNext()) {
                if (certPathBuilderResult != null) {
                    break;
                }
                certPathBuilderResult = A00((X509Certificate) it.next(), A13, du8);
            } else if (certPathBuilderResult == null) {
                Exception exc = this.A00;
                if (exc == null) {
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof C2W) {
                    throw new CertPathBuilderException(exc.getMessage(), this.A00.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", exc);
                }
            }
        }
        return certPathBuilderResult;
    }

    public /* bridge */ /* synthetic */ CertPathChecker engineGetRevocationChecker() {
        return new C27278Db7(this.A01);
    }

    public CertPathBuilderResult A00(X509Certificate x509Certificate, List list, DU8 du8) {
        int i;
        Throwable th;
        C2W c2w;
        Collection A13;
        HashSet A12;
        CertPath engineGenerateCertPath;
        CertPathBuilderResult certPathBuilderResult = null;
        if (!list.contains(x509Certificate) && !du8.A01.contains(x509Certificate) && ((i = du8.A00) == -1 || AnonymousClass3MX.A01(list) <= i)) {
            list.add(x509Certificate);
            try {
                CertificateFactory certificateFactory = new CertificateFactory();
                C27276Db4 db4 = new C27276Db4(this.A02);
                try {
                    DU9 du9 = du8.A02;
                    Set set = du9.A08;
                    PKIXParameters pKIXParameters = du9.A01;
                    boolean z = false;
                    try {
                        if (C26284Cwf.A01(pKIXParameters.getSigProvider(), x509Certificate, set) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        try {
                            engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        } catch (Exception e) {
                            c2w = C2W.A01("Certification path could not be constructed from certificate list.", e);
                            throw c2w;
                        }
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) db4.engineValidate(engineGenerateCertPath, du8);
                            return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e2) {
                            c2w = C2W.A01("Certification path could not be validated.", e2);
                            throw c2w;
                        }
                    } else {
                        ArrayList A132 = AnonymousClass000.A13();
                        A132.addAll(du9.A05);
                        try {
                            byte[] extensionValue = x509Certificate.getExtensionValue(C28314DxM.A0J.A01);
                            Map map = du9.A07;
                            if (extensionValue == null) {
                                A13 = Collections.EMPTY_LIST;
                            } else {
                                C28322DxU[] A012 = C28317DxP.A01(C28342Dxo.A05(extensionValue));
                                A13 = AnonymousClass000.A13();
                                for (int i2 = 0; i2 != A012.length; i2++) {
                                    map.get(A012[i2]);
                                }
                            }
                            A132.addAll(A13);
                            A12 = C17880vN.A12();
                        } catch (CertificateParsingException e3) {
                            c2w = C2W.A01("No additional X.509 stores can be added from certificate locations.", e3);
                            throw c2w;
                        }
                        try {
                            A12.addAll(C26284Cwf.A03(x509Certificate, pKIXParameters.getCertStores(), A132));
                            if (!A12.isEmpty()) {
                                Iterator it = A12.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = A00((X509Certificate) it.next(), list, du8);
                                }
                                if (certPathBuilderResult == null) {
                                    list.remove(x509Certificate);
                                    return certPathBuilderResult;
                                }
                            } else {
                                th = C2W.A01("No issuer certificate for certificate in certification path found.", (Throwable) null);
                                throw th;
                            }
                        } catch (C2W e4) {
                            c2w = C2W.A01("Cannot find issuer certificate for certificate in certification path.", e4);
                            throw c2w;
                        }
                    }
                } catch (C2W e5) {
                    this.A00 = e5;
                }
            } catch (Exception unused2) {
                th = AnonymousClass8BR.A0w("Exception creating support classes.");
            }
        }
        return certPathBuilderResult;
    }
}
