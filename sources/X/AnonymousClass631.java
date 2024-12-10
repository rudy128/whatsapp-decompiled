package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.631  reason: invalid class name */
public final class AnonymousClass631 extends AnonymousClass184 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass631() {
        super(4132, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPhoneidEnabledClientsApps {");
        AnonymousClass186.A00(this.A00, "phoneidEnabledClientsAppName", A10);
        AnonymousClass186.A00(this.A01, "phoneidEnabledClientsAppPackage", A10);
        AnonymousClass186.A00(this.A02, "phoneidEnabledClientsAppSha", A10);
        return AnonymousClass184.A0S(this.A03, "phoneidEnabledClientsDeveloperCertificate", A10);
    }
}
