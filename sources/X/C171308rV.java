package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rV  reason: invalid class name and case insensitive filesystem */
public final class C171308rV extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;

    public C171308rV() {
        super(3052, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(7, this.A04);
        r3.CHf(3, this.A01);
        r3.CHf(5, this.A05);
        r3.CHf(4, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(C108975cc.A0S(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A09(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A02, A13), this.A03, A13), this.A06);
        AnonymousClass184.A0X(A13, 9);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsStructuredMessageInteraction {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "bizPlatform", A10);
        AnonymousClass186.A00(this.A04, "businessOwnerJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "messageClass", A10);
        AnonymousClass186.A00(this.A05, "messageClassAttributes", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messageInteraction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "messageMediaType", A10);
        return AnonymousClass184.A0S(this.A06, "templateId", A10);
    }
}
