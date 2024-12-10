package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qx  reason: invalid class name and case insensitive filesystem */
public final class C170968qx extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A03);
        r3.CHf(5, this.A01);
    }

    public C170968qx() {
        super(5598, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A00, A13), this.A03);
        AnonymousClass184.A0X(A13, 4);
        A13.put(C17880vN.A0l(), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessTemplateCallingStats {");
        AnonymousClass186.A00(this.A02, "businessPhoneNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callDirection", A10);
        AnonymousClass186.A00(this.A03, "callDurationSec", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "callStatus", A10);
    }
}
