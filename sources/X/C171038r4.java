package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r4  reason: invalid class name and case insensitive filesystem */
public final class C171038r4 extends AnonymousClass184 {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
    }

    public C171038r4() {
        super(4474, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWhatsappQuickPromotionClientEligibilityWaterfallPrivate {");
        AnonymousClass186.A00(this.A00, "eligibilityStatus", A10);
        AnonymousClass186.A00(this.A01, "promotionId", A10);
        AnonymousClass186.A00(this.A02, "qpFailureReason", A10);
        return AnonymousClass184.A0S(this.A03, "step", A10);
    }
}
