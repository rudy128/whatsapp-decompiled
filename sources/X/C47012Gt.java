package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gt  reason: invalid class name and case insensitive filesystem */
public final class C47012Gt extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public C47012Gt() {
        super(3524, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A08);
        r3.CHf(2, this.A01);
        r3.CHf(9, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A09);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A00);
        r3.CHf(8, this.A07);
        r3.CHf(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A0B(AnonymousClass184.A04(C17880vN.A0h(), this.A08, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A09, A13), this.A04, A13), (Object) null, A13), (Object) null, A13), this.A05, A13), this.A00, A13), this.A07, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamE2eMessageDecryptFailSender {");
        AnonymousClass186.A00(this.A08, "clientMessageId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "e2eCiphertextType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "e2eDestination", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "e2eFailureReason", A10);
        AnonymousClass186.A00(this.A09, "e2eSenderJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "e2eSenderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "messageMediaType", A10);
        AnonymousClass186.A00(this.A00, "offline", A10);
        AnonymousClass186.A00(this.A07, "retryCount", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A06), "revokeType", A10);
    }
}
