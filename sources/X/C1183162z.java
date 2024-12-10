package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62z  reason: invalid class name and case insensitive filesystem */
public final class C1183162z extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
    }

    public C1183162z() {
        super(4138, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A00, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageCtaImpression {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "ctaName", A10);
        AnonymousClass186.A00(this.A00, "isSenderSelf", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messageTypeCategory", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "threadType", A10);
    }
}
