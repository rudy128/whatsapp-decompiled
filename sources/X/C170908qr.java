package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qr  reason: invalid class name and case insensitive filesystem */
public final class C170908qr extends AnonymousClass184 {
    public Integer A00;
    public String A01;
    public String A02;

    public C170908qr() {
        super(3574, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatPsaRead {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "messageMediaType", A10);
        AnonymousClass186.A00(this.A01, "psaCampaignId", A10);
        return AnonymousClass184.A0S(this.A02, "psaMsgId", A10);
    }
}
