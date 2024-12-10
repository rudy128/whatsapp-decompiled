package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rK  reason: invalid class name and case insensitive filesystem */
public final class C171198rK extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C171198rK() {
        super(1780, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(1, this.A01);
        r3.CHf(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A03(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A06(C17880vN.A0i(), this.A02, A13), this.A03, A13), this.A00, A13), this.A04, A13), this.A05, A13), this.A01, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidFetchBloksRequest {");
        AnonymousClass186.A00(this.A02, "bloksCategory", A10);
        AnonymousClass186.A00(this.A03, "bloksFetchRetryCount", A10);
        AnonymousClass186.A00(this.A00, "bloksFetchSuccess", A10);
        AnonymousClass186.A00(this.A04, "bloksFetchTimeT", A10);
        AnonymousClass186.A00(this.A05, "bloksVersion", A10);
        AnonymousClass186.A00(this.A01, "isTriggeredOnBackground", A10);
        return AnonymousClass184.A0S(this.A06, "triggeringSource", A10);
    }
}
