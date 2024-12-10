package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GJ  reason: invalid class name */
public final class AnonymousClass2GJ extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2GJ() {
        super(3656, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamRevokeMessageSend {");
        AnonymousClass186.A00(this.A00, "messageSendResultIsTerminal", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A01), A10);
        AnonymousClass186.A00(this.A03, "resendCount", A10);
        AnonymousClass186.A00(this.A04, "retryCount", A10);
        AnonymousClass186.A00(this.A05, "revokeDuration", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "revokeType", A10);
    }
}
