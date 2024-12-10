package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Eu  reason: invalid class name and case insensitive filesystem */
public final class C46502Eu extends AnonymousClass184 {
    public Long A00;

    public C46502Eu() {
        super(5164, AnonymousClass184.A01(), 3, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(C17880vN.A0i(), this.A00);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWamTestAnonymousRealtime {");
        return AnonymousClass184.A0S(this.A00, "psRealtimeTestIntField", A10);
    }
}
