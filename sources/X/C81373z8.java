package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3z8  reason: invalid class name and case insensitive filesystem */
public final class C81373z8 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C81373z8() {
        super(1156, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A03(C17880vN.A0i(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDeepLinkClick {");
        AnonymousClass186.A00(this.A00, "deepLinkHasPhoneNumber", A10);
        AnonymousClass186.A00(this.A01, "deepLinkHasText", A10);
        return AnonymousClass184.A0S(this.A02, "deepLinkSessionId", A10);
    }
}
