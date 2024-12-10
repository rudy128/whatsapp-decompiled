package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rO  reason: invalid class name and case insensitive filesystem */
public final class C171238rO extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;

    public C171238rO() {
        super(5236, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A04);
        r3.CHf(1, this.A00);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A05);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A06);
        r3.CHf(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass3MY.A0g(), this.A04, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A02, A13), this.A06, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEmailEvent {");
        AnonymousClass186.A00(this.A04, "accessSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "emailAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "emailActionStatus", A10);
        AnonymousClass186.A00(this.A05, "emailActionStatusReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "emailEntrypoint", A10);
        AnonymousClass186.A00(this.A06, "emailSessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "emailSurface", A10);
    }
}
