package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fa  reason: invalid class name and case insensitive filesystem */
public final class C46562Fa extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public C46562Fa() {
        super(3184, new C18180vt(1, 10, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A03(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReactionActions {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A01), A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "reactionAction", A10);
    }
}
