package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63n  reason: invalid class name and case insensitive filesystem */
public final class C1184563n extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C1184563n() {
        super(1368, new C18180vt(1, 1, 5, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A04);
        r3.CHf(6, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A07);
        r3.CHf(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 5);
        A13.put(C108975cc.A0T(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0B(AnonymousClass184.A03(C108975cc.A0S(AnonymousClass184.A08(C17880vN.A0k(), this.A04, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A06, A13), this.A02, A13), this.A07, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidEmojiDictionaryFetch {");
        AnonymousClass186.A00(this.A04, "currentLanguages", A10);
        AnonymousClass186.A00(this.A00, "doNetworkFetch", A10);
        AnonymousClass186.A00(this.A01, "isFirstAttempt", A10);
        AnonymousClass186.A00(this.A05, "requestedLanguages", A10);
        AnonymousClass186.A00(this.A06, "result", A10);
        AnonymousClass186.A00(this.A02, "resultHttpCode", A10);
        AnonymousClass186.A00(this.A07, "resultLanguages", A10);
        return AnonymousClass184.A0S(this.A03, "timeSinceLastRequestMsT", A10);
    }
}
