package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rI  reason: invalid class name and case insensitive filesystem */
public final class C171178rI extends AnonymousClass184 {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public C171178rI() {
        super(4360, new C18180vt(1, 20, 200, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A01);
        r3.CHf(1, this.A00);
        r3.CHf(5, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A03(C17880vN.A0m(), this.A01, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWhatsappQuickPromotionClientEligibilityWaterfall {");
        AnonymousClass186.A00(this.A01, "clientExtraData", A10);
        AnonymousClass186.A00(this.A00, "eligibilityStatus", A10);
        AnonymousClass186.A00(this.A02, "instanceLogData", A10);
        AnonymousClass186.A00(this.A03, "promotionId", A10);
        AnonymousClass186.A00(this.A04, "qpFailureReason", A10);
        return AnonymousClass184.A0S(this.A05, "step", A10);
    }
}
