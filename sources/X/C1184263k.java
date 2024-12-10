package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63k  reason: invalid class name and case insensitive filesystem */
public final class C1184263k extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C1184263k() {
        super(5290, new C18180vt(1, 1, 50, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A03);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A04, A13), this.A05, A13), this.A01, A13), this.A02, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSearchPerformance {");
        AnonymousClass186.A00(this.A03, "queryDebounceDuration", A10);
        AnonymousClass186.A00(this.A00, "queryIsCached", A10);
        AnonymousClass186.A00(this.A04, "queryResultSize", A10);
        AnonymousClass186.A00(this.A05, "querySearchDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "querySearchType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "queryTerminateStatus", A10);
        return AnonymousClass184.A0S(this.A06, "queryTokenLength", A10);
    }
}
