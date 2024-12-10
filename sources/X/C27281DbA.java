package X;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* renamed from: X.DbA  reason: case insensitive filesystem */
public class C27281DbA extends X509CRLSelector {
    public final DZQ A00;

    public boolean match(CRL crl) {
        DZQ dzq = this.A00;
        if (dzq == null) {
            return AnonymousClass000.A1W(crl);
        }
        return dzq.Bj5(crl);
    }

    public C27281DbA(DZQ dzq) {
        this.A00 = dzq;
        CRLSelector cRLSelector = dzq.A00;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }
}
