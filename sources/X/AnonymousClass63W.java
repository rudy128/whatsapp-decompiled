package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63W  reason: invalid class name */
public final class AnonymousClass63W extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;

    public AnonymousClass63W() {
        super(3248, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(7, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(8, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(C108975cc.A0T(C17880vN.A0i(), this.A03, A13), this.A00);
        AnonymousClass184.A0X(A13, 4);
        A13.put(C17880vN.A0l(), this.A01);
        AnonymousClass184.A0X(A13, 6);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A0B(C108955ca.A0e(), this.A04, A13), this.A05, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDirectoryServerRequests {");
        AnonymousClass186.A00(this.A03, "directorySessionId", A10);
        AnonymousClass186.A00(this.A00, "endResponseTime", A10);
        AnonymousClass186.A00(this.A01, "httpResponseCode", A10);
        AnonymousClass186.A00(this.A04, "neworkLibraryType", A10);
        AnonymousClass186.A00(this.A05, "requestEndpoint", A10);
        return AnonymousClass184.A0S(this.A02, "startResponseTime", A10);
    }
}
