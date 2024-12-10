package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FG  reason: invalid class name */
public final class AnonymousClass2FG extends AnonymousClass184 {
    public Double A00;
    public Integer A01;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
    }

    public AnonymousClass2FG() {
        super(2958, AnonymousClass184.A02(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamTestAnonymousDailyId {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "psTestEnumField", A10);
        return AnonymousClass184.A0S(this.A00, "psTestFloatField", A10);
    }
}
