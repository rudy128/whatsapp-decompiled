package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G5  reason: invalid class name */
public final class AnonymousClass2G5 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2G5() {
        super(3522, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPrivacyHighlightDaily {");
        AnonymousClass186.A00(this.A02, "dialogAppearCount", A10);
        AnonymousClass186.A00(this.A03, "dialogSelectCount", A10);
        AnonymousClass186.A00(this.A04, "narrativeAppearCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "privacyHighlightCategory", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "privacyHighlightSurface", A10);
    }
}
