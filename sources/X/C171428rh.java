package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rh  reason: invalid class name and case insensitive filesystem */
public final class C171428rh extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public C171428rh() {
        super(2110, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(8, this.A02);
        r3.CHf(6, this.A05);
        r3.CHf(1, this.A07);
        r3.CHf(5, this.A06);
        r3.CHf(2, this.A08);
        r3.CHf(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A03(AnonymousClass184.A08(AnonymousClass184.A0A(AnonymousClass184.A05(AnonymousClass184.A06(C108955ca.A0e(), this.A04, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A05, A13), this.A07, A13), this.A06, A13), this.A08, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPushLatency {");
        AnonymousClass186.A00(C17900vP.A08(this.A04), "deliveredPriority", A10);
        AnonymousClass186.A00(this.A00, "fbnsAvailable", A10);
        AnonymousClass186.A00(this.A01, "gcmAvailable", A10);
        AnonymousClass186.A00(this.A02, "hasSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "originalPriority", A10);
        AnonymousClass186.A00(this.A07, "pushDelayT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "pushTransport", A10);
        AnonymousClass186.A00(this.A08, "serverTimestampT", A10);
        return AnonymousClass184.A0S(this.A03, "wasSessionDozed", A10);
    }
}
