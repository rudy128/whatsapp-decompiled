package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62I  reason: invalid class name */
public final class AnonymousClass62I extends AnonymousClass184 {
    public Integer A00;
    public String A01;

    public AnonymousClass62I() {
        super(470, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(21, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A0D(AnonymousClass184.A0L(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0E(AnonymousClass184.A06(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamContactUsSession {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "contactUsExitState", A10);
        return AnonymousClass184.A0S(this.A01, "languageCode", A10);
    }
}
