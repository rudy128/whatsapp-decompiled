package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3z5  reason: invalid class name and case insensitive filesystem */
public final class C81343z5 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C81343z5() {
        super(4958, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A00, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatLockSecretCode {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "secretCodeAction", A10);
        AnonymousClass186.A00(this.A00, "secretCodeActive", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "secretCodeFlowType", A10);
    }
}
