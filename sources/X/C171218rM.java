package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rM  reason: invalid class name and case insensitive filesystem */
public final class C171218rM extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C171218rM() {
        super(2952, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(9, this.A00);
        r3.CHf(8, this.A01);
        r3.CHf(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0A(AnonymousClass184.A0B(AnonymousClass184.A0C(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A07(C17880vN.A0h(), this.A05, A13), this.A02, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessMessageLevelCsat {");
        AnonymousClass186.A00(this.A05, "businessJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "csatActionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "csatEntryPoint", A10);
        AnonymousClass186.A00(this.A04, "csatUserRating", A10);
        AnonymousClass186.A00(this.A00, "hasCsatRating", A10);
        AnonymousClass186.A00(this.A01, "isCsatRatingChanged", A10);
        return AnonymousClass184.A0S(this.A06, "messageTemplateId", A10);
    }
}
