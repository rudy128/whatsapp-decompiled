package X;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Db7  reason: case insensitive filesystem */
public class C27278Db7 extends PKIXRevocationChecker implements E8M {
    public static final Map A04;
    public C25597Cic A00;
    public final E3R A01;
    public final DZB A02;
    public final DZC A03;

    public C27278Db7(E3R e3r) {
        this.A01 = e3r;
        this.A02 = new DZB(e3r);
        this.A03 = new DZC(e3r, this);
    }

    public void BdV(C25597Cic cic) {
        this.A00 = cic;
        this.A02.BdV(cic);
        this.A03.BdV(cic);
    }

    public void check(Certificate certificate, Collection collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!getOptions().contains(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (getOptions().contains(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.A02.check(certificate);
                } catch (C27274Db1 e) {
                    e = e;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A03.check(certificate);
                        return;
                    }
                    throw e;
                }
            } else {
                try {
                    this.A03.check(certificate);
                } catch (C27274Db1 e2) {
                    e = e2;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A02.check(certificate);
                        return;
                    }
                    throw e;
                }
            }
        }
    }

    public Set getSupportedExtensions() {
        return null;
    }

    public void init(boolean z) {
        this.A00 = null;
        DZB dzb = this.A02;
        if (!z) {
            dzb.A01 = null;
            dzb.A00 = new Date();
            DZC dzc = this.A03;
            dzc.A01 = null;
            dzc.A02 = C25917Cob.A01("ocsp.enable");
            dzc.A00 = C25917Cob.A00("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public List getSoftFailExceptions() {
        Map map = DZC.A05;
        return null;
    }

    static {
        HashMap A11 = C17880vN.A11();
        A04 = A11;
        A11.put(BE6.A19("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A11.put(AnonymousClass1Bw.A2D, "SHA224WITHRSA");
        A11.put(AnonymousClass1Bw.A2E, "SHA256WITHRSA");
        BEB.A1K(AnonymousClass1Bw.A2F, A11);
        BEB.A1J(EBF.A0G, A11);
    }
}
