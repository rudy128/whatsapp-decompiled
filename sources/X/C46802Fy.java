package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fy  reason: invalid class name and case insensitive filesystem */
public final class C46802Fy extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C46802Fy() {
        super(3050, new C18180vt(1, 10, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A04(AnonymousClass184.A08(AnonymousClass184.A09(AnonymousClass184.A05(AnonymousClass184.A06(C17880vN.A0l(), this.A02, A13), this.A03, A13), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A01, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidNetworkUsageDetailed {");
        AnonymousClass186.A00(this.A02, "kbytesReceived", A10);
        AnonymousClass186.A00(this.A03, "kbytesTransmitted", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "networkCategory", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "sessionCategory", A10);
        return AnonymousClass184.A0S(this.A04, "sessionDuration", A10);
    }
}
