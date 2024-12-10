package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s1  reason: invalid class name and case insensitive filesystem */
public final class C171628s1 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C171628s1() {
        super(2494, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A08);
        r3.CHf(12, this.A09);
        r3.CHf(5, this.A00);
        r3.CHf(21, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(10, this.A0A);
        r3.CHf(1, this.A0B);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(2, this.A0C);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A06);
        r3.CHf(4, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        Object A0R = AnonymousClass184.A0R(A13, 17);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0M(AnonymousClass184.A0L(18, A0R, A13), A0R, A13), A0R, A13), this.A08, A13), this.A09);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A0N(C17880vN.A0l(), this.A00, A13), this.A04);
        Object A0R2 = AnonymousClass184.A0R(A13, 14);
        A13.put(AnonymousClass184.A06(AnonymousClass184.A0B(AnonymousClass184.A0A(C108975cc.A0S(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass184.A0C(AnonymousClass184.A05(AnonymousClass184.A0I(15, A0R2, A13), A0R2, A13), this.A05, A13), this.A0A, A13), this.A0B, A13), this.A01, A13), this.A02, A13), this.A0C, A13), this.A03, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageStanzaReceive {");
        AnonymousClass186.A00(this.A08, "dbReadsCount", A10);
        AnonymousClass186.A00(this.A09, "dbWritesCount", A10);
        AnonymousClass186.A00(this.A00, "hasSenderKeyDistributionMessage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "mediaType", A10);
        AnonymousClass186.A00(this.A0A, "messageStanzaDecryptQueueSize", A10);
        AnonymousClass186.A00(this.A0B, "messageStanzaDuration", A10);
        AnonymousClass186.A00(this.A01, "messageStanzaE2eSuccess", A10);
        AnonymousClass186.A00(this.A02, "messageStanzaIsEphemeral", A10);
        AnonymousClass186.A00(this.A0C, "messageStanzaOfflineCount", A10);
        AnonymousClass186.A00(this.A03, "messageStanzaRevoke", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "messageStanzaStage", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A07), "messageType", A10);
    }
}
