package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qs  reason: invalid class name and case insensitive filesystem */
public final class C170918qs extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public String A02;

    public C170918qs() {
        super(5572, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A00);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A03(C17880vN.A0k(), this.A00, A13), this.A02, A13), this.A01);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMmSignal {");
        AnonymousClass186.A00(this.A00, "disclosed", A10);
        AnonymousClass186.A00(this.A02, "mmSignalData", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "mmSignalType", A10);
    }
}
