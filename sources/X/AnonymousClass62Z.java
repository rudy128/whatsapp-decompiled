package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62Z  reason: invalid class name */
public final class AnonymousClass62Z extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass62Z() {
        super(4868, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A00, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBotBizJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "botBizActionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "botBizEntryPoint", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "botBizType", A10);
    }
}
