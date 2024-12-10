package X;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

public class DZP implements C28673EDp {
    public final CertSelector A00;

    public DZP(CertSelector certSelector) {
        this.A00 = certSelector;
    }

    public Object clone() {
        return new DZP(this.A00);
    }

    public /* bridge */ /* synthetic */ boolean Bj5(Object obj) {
        return this.A00.match((Certificate) obj);
    }
}
