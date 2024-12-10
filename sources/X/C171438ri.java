package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ri  reason: invalid class name and case insensitive filesystem */
public final class C171438ri extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C171438ri() {
        super(3222, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A04);
        r3.CHf(7, this.A01);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A07);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A06(C17880vN.A0j(), this.A02, A13), this.A07);
        AnonymousClass184.A0X(A13, 11);
        A13.put(AnonymousClass184.A08(C17880vN.A0l(), this.A03, A13), this.A08);
        AnonymousClass184.A0X(A13, 12);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStructuredMessageReceive {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "bizPlatform", A10);
        AnonymousClass186.A00(this.A04, "businessOwnerJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "entryPointConversationInitiated", A10);
        AnonymousClass186.A00(this.A05, "entryPointConversionApp", A10);
        AnonymousClass186.A00(this.A06, "entryPointConversionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messageClass", A10);
        AnonymousClass186.A00(this.A07, "messageClassAttributes", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "messageMediaType", A10);
        return AnonymousClass184.A0S(this.A08, "templateId", A10);
    }
}
