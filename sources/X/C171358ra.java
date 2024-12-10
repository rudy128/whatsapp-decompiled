package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ra  reason: invalid class name and case insensitive filesystem */
public final class C171358ra extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C171358ra() {
        super(834, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A00);
        r3.CHf(4, this.A07);
        r3.CHf(8, this.A01);
        r3.CHf(5, this.A05);
        r3.CHf(3, this.A02);
        r3.CHf(9, this.A06);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A05(AnonymousClass184.A07(AnonymousClass184.A0A(AnonymousClass184.A06(C17880vN.A0m(), this.A00, A13), this.A07, A13), this.A01, A13), this.A05, A13), this.A02, A13), this.A06, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPlacesApiQuery {");
        AnonymousClass186.A00(this.A00, "placesApiCached", A10);
        AnonymousClass186.A00(this.A07, "placesApiFailureDescription", A10);
        AnonymousClass186.A00(this.A01, "placesApiPlacesCount", A10);
        AnonymousClass186.A00(this.A05, "placesApiRequestIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "placesApiResponse", A10);
        AnonymousClass186.A00(this.A06, "placesApiResponseT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "placesApiSource", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "placesApiSourceDefault", A10);
    }
}
