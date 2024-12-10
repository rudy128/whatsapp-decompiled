package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zU  reason: invalid class name and case insensitive filesystem */
public final class C81593zU extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public C81593zU() {
        super(2136, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(6, this.A05);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A08(C17880vN.A0i(), this.A01, A13), this.A05, A13), this.A02, A13), this.A00, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDeepLinkOpen {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "deepLinkOpenFrom", A10);
        AnonymousClass186.A00(this.A05, "deepLinkSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "deepLinkType", A10);
        AnonymousClass186.A00(this.A00, "isContact", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "linkOwnerType", A10);
        return AnonymousClass184.A0S(this.A04, "sourceSurface", A10);
    }
}
