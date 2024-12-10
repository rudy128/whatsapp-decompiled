package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qn  reason: invalid class name and case insensitive filesystem */
public final class C170868qn extends AnonymousClass184 {
    public Integer A00;
    public Long A01;

    public C170868qn() {
        super(4918, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamResetIdentityKey {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "resetIdentityReasonCode", A10);
        return AnonymousClass184.A0S(this.A01, "resetIdentityTimestampS", A10);
    }
}
