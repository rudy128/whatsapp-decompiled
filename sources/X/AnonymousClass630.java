package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.630  reason: invalid class name */
public final class AnonymousClass630 extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public AnonymousClass630() {
        super(5144, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(8, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(C17880vN.A0h(), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A0A(C17880vN.A0j(), this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamOutOfOrderMessage {");
        AnonymousClass186.A00(this.A00, "numCallMsg", A10);
        AnonymousClass186.A00(this.A01, "numGroupCallMsg", A10);
        AnonymousClass186.A00(this.A02, "numOutOfOrderCallMsg", A10);
        return AnonymousClass184.A0S(this.A03, "numOutOfOrderGroupCallMsg", A10);
    }
}
