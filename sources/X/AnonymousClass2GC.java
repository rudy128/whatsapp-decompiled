package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GC  reason: invalid class name */
public final class AnonymousClass2GC extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass2GC() {
        super(4512, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A05, A13), this.A04, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 7);
        A13.put(C17880vN.A0m(), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGroupJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "actionType", A10);
        AnonymousClass186.A00(this.A05, "appSessionId", A10);
        AnonymousClass186.A00(this.A04, "groupSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "surface", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "threadType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "userRole", A10);
    }
}
