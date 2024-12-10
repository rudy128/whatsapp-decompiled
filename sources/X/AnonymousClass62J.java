package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62J  reason: invalid class name */
public final class AnonymousClass62J extends AnonymousClass184 {
    public Integer A00;
    public String A01;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A00);
    }

    public AnonymousClass62J() {
        super(3720, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C17880vN.A0i(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCtwaJwtVerificationState {");
        AnonymousClass186.A00(this.A01, "failReason", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "verificationState", A10);
    }
}
