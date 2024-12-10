package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62R  reason: invalid class name */
public final class AnonymousClass62R extends AnonymousClass184 {
    public Integer A00;
    public String A01;

    public AnonymousClass62R() {
        super(4548, new C18180vt(1, 20, 200, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPushShow {");
        AnonymousClass186.A00(this.A01, "psaCampaignId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "pushSurfaceId", A10);
    }
}
