package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fw  reason: invalid class name and case insensitive filesystem */
public final class C46782Fw extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public C46782Fw() {
        super(4750, new C18180vt(1, 1, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(3, this.A04);
        r3.CHf(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A08(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A04, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAddressingModeMismatch {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "iqResponse", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "localAddressingMode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mismatchOrigin", A10);
        AnonymousClass186.A00(this.A04, "notificationTag", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "serverAddressingMode", A10);
    }
}
