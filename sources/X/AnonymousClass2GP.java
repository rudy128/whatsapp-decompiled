package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GP  reason: invalid class name */
public final class AnonymousClass2GP extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A02);
        r3.CHf(1, this.A06);
        r3.CHf(9, this.A03);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A04);
    }

    public AnonymousClass2GP() {
        super(5204, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A0B(AnonymousClass184.A03(8, this.A02, A13), this.A06, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCoexPrivacySysMsg {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "coexStatusReplyPrivacyDisclaimerUserAction", A10);
        AnonymousClass186.A00(this.A06, "coexSysMsgBusinessId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "coexSysMsgInsertionChannel", A10);
        AnonymousClass186.A00(this.A00, "coexSysMsgInsertionSuccess", A10);
        AnonymousClass186.A00(this.A01, "coexSysMsgIsSelf", A10);
        AnonymousClass186.A00(this.A05, "coexSysMsgMultiDeviceId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "coexSysMsgStateTransitionAttempt", A10);
    }
}
