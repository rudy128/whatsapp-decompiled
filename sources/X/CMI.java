package X;

import java.security.cert.CertSelector;

public class CMI {
    public final CertSelector A00;

    public CMI(CertSelector certSelector) {
        this.A00 = (CertSelector) certSelector.clone();
    }
}
