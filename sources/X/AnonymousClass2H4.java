package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H4  reason: invalid class name */
public final class AnonymousClass2H4 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public AnonymousClass2H4() {
        super(2636, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(10, this.A00);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(9, this.A0A);
        r3.CHf(2, this.A04);
        r3.CHf(1, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(4, this.A07);
        r3.CHf(8, this.A0B);
        r3.CHf(12, this.A08);
        r3.CHf(3, this.A03);
        r3.CHf(11, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A05(AnonymousClass184.A0E(AnonymousClass184.A0A(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A03(AnonymousClass184.A04(AnonymousClass184.A0B(AnonymousClass184.A09(AnonymousClass184.A08(10, this.A00, A13), this.A01, A13), this.A02, A13), this.A0A, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A0B, A13), this.A08, A13), this.A03, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAckKickReceived {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callStanzaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A02), A10);
        AnonymousClass186.A00(this.A0A, "notificationStanzaType", A10);
        AnonymousClass186.A00(this.A04, "numOfflineStanzasProcessing", A10);
        AnonymousClass186.A00(this.A05, "numStanzasProcessing", A10);
        AnonymousClass186.A00(this.A06, "numStanzasProcessingForType", A10);
        AnonymousClass186.A00(this.A07, "numStanzasWithSameId", A10);
        AnonymousClass186.A00(this.A0B, "receiptStanzaType", A10);
        AnonymousClass186.A00(this.A08, "stanzaOfflineCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "stanzaType", A10);
        return AnonymousClass184.A0S(this.A09, "timeToAckKickInMs", A10);
    }
}
