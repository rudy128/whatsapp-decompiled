package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r9  reason: invalid class name and case insensitive filesystem */
public final class C171088r9 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public C171088r9() {
        super(5600, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A03);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A03);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(C17880vN.A0k(), this.A01, A13), this.A02, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamQbmCallingStats {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callDirection", A10);
        AnonymousClass186.A00(this.A03, "callDurationSec", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "callStatus", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "contactType", A10);
        return AnonymousClass184.A0S(this.A04, "threadIdHmac", A10);
    }
}
