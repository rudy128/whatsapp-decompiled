package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3yW  reason: invalid class name and case insensitive filesystem */
public final class C80993yW extends AnonymousClass184 {
    public Integer A00;

    public C80993yW() {
        super(3678, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 2);
        A13.put(C17880vN.A0j(), this.A00);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCtwaReliabilityUnderstand {");
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "reliabilityActionEnum", A10);
    }
}
