package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62l  reason: invalid class name and case insensitive filesystem */
public final class C1181762l extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C1181762l() {
        super(3560, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A02, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusReplyReceived {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "statusMediaType", A10);
        AnonymousClass186.A00(this.A02, "statusPosterJid", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "statusReplyMessageType", A10);
    }
}
