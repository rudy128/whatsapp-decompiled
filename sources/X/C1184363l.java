package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63l  reason: invalid class name and case insensitive filesystem */
public final class C1184363l extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C1184363l() {
        super(4536, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A07);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A06(C108975cc.A0T(AnonymousClass184.A0A(AnonymousClass184.A07(C108975cc.A0S(AnonymousClass184.A03(C108955ca.A0e(), this.A07, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAiStickerFetch {");
        AnonymousClass186.A00(this.A07, "aiStickerFetchErrorCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "aiStickerFetchErrorType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "aiStickerFetchEventType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "aiStickerFetchOriginType", A10);
        AnonymousClass186.A00(this.A03, "numberOfAnimatedReturned", A10);
        AnonymousClass186.A00(this.A04, "numberOfReturnedOptions", A10);
        AnonymousClass186.A00(this.A05, "stickerSessionId", A10);
        return AnonymousClass184.A0S(this.A06, "userSessionId", A10);
    }
}
