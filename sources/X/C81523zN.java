package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zN  reason: invalid class name and case insensitive filesystem */
public final class C81523zN extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A01);
        r3.CHf(2, this.A04);
    }

    public C81523zN() {
        super(3022, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0h(), this.A02, A13), this.A00, A13), this.A03, A13), this.A01, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCtwaWelcomeMessage {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "ctwaWelcomeMessageAction", A10);
        AnonymousClass186.A00(this.A00, "ctwaWelcomeMessageContainsIcebreakers", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "ctwaWelcomeMessageError", A10);
        AnonymousClass186.A00(this.A01, "ctwaWelcomeMessageIcebreakersContainAutoreply", A10);
        return AnonymousClass184.A0S(this.A04, "firstWelcomeMessageImpressionTime", A10);
    }
}
