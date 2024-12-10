package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fi  reason: invalid class name and case insensitive filesystem */
public final class C46642Fi extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public C46642Fi() {
        super(1638, new C18180vt(1, 50, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A03);
        r3.CHf(12, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A04(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A03(AnonymousClass184.A0C(11, (Object) null, A13), (Object) null, A13), this.A00, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A01, A13), (Object) null, A13), (Object) null, A13), this.A03, A13), this.A02);
        AnonymousClass184.A0X(A13, 9);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidScrollPerfEvent {");
        AnonymousClass186.A00(this.A00, "frameDropsPerMin", A10);
        AnonymousClass186.A00(this.A01, "largeFrameDropsPerMin", A10);
        AnonymousClass186.A00(this.A03, "scrollDurationT", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "surface", A10);
    }
}
