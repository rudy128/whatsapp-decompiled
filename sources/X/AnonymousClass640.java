package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.640  reason: invalid class name */
public final class AnonymousClass640 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass640() {
        super(3568, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(12, this.A08);
        r3.CHf(6, this.A03);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(13, this.A09);
        r3.CHf(11, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0F(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0E(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A07, A13), this.A02, A13), this.A00, A13), this.A08, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A09, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusCrossPost {");
        AnonymousClass186.A00(this.A07, "cacSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "defaultStatusPrivacySettings", A10);
        AnonymousClass186.A00(this.A00, "isAutoCrossPosted", A10);
        AnonymousClass186.A00(this.A08, "statusCrossPostErrorName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "statusCrossPostMediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "statusCrossPostOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "statusCrossPostPerPostStatusPrivacySetting", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "statusCrossPostResult", A10);
        AnonymousClass186.A00(this.A09, "statusId", A10);
        return AnonymousClass184.A0S(this.A01, "undoClicked", A10);
    }
}
