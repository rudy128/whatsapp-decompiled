package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G6  reason: invalid class name */
public final class AnonymousClass2G6 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Long A03;
    public String A04;

    public AnonymousClass2G6() {
        super(5562, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamProfilePhotoFetchStats {");
        AnonymousClass186.A00(this.A03, "cacheAgeSec", A10);
        AnonymousClass186.A00(this.A04, "fetchLocation", A10);
        AnonymousClass186.A00(this.A00, "fetchUsesCache", A10);
        AnonymousClass186.A00(this.A01, "hasPrivacyTokenForTarget", A10);
        return AnonymousClass184.A0S(this.A02, "hasSharedGroupWithTarget", A10);
    }
}
