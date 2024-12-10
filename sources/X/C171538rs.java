package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rs  reason: invalid class name and case insensitive filesystem */
public final class C171538rs extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public String A0A;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A09);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(9, this.A02);
        r3.CHf(10, this.A08);
        r3.CHf(11, this.A0A);
    }

    public C171538rs() {
        super(6094, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A09, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A00, A13), this.A01, A13), this.A06, A13), this.A07, A13), this.A02, A13), this.A08, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReportingTokenValidationFailureSender {");
        AnonymousClass186.A00(this.A09, "clientMessageId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "e2eReceiverType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "e2eSenderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "editType", A10);
        AnonymousClass186.A00(this.A00, "isLid", A10);
        AnonymousClass186.A00(this.A01, "isMessageRetry", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "messageMediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "messageType", A10);
        AnonymousClass186.A00(this.A02, "offline", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "reportingTokenValidationFailureReason", A10);
        return AnonymousClass184.A0S(this.A0A, "senderJid", A10);
    }
}
