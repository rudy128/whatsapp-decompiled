package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FZ  reason: invalid class name */
public final class AnonymousClass2FZ extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2FZ() {
        super(2862, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A03(C17880vN.A0i(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsIdUpdate {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "psIdAction", A10);
        AnonymousClass186.A00(this.A01, "psIdKey", A10);
        return AnonymousClass184.A0S(this.A02, "psIdRotationFrequence", A10);
    }
}
