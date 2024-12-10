package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqt  reason: case insensitive filesystem */
public final class C23836Bqt extends AnonymousClass184 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C23836Bqt() {
        super(4434, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A03(C108955ca.A0e(), this.A01, A13), this.A02, A13), this.A03, A13), this.A00, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBloksScriptCrashes {");
        AnonymousClass186.A00(this.A01, "bloksErrorAppId", A10);
        AnonymousClass186.A00(this.A02, "bloksErrorFeature", A10);
        AnonymousClass186.A00(this.A03, "bloksErrorFileName", A10);
        AnonymousClass186.A00(this.A00, "bloksErrorLineNumber", A10);
        AnonymousClass186.A00(this.A04, "bloksErrorMessage", A10);
        AnonymousClass186.A00(this.A05, "bloksErrorOncall", A10);
        return AnonymousClass184.A0S(this.A06, "bloksErrorProduct", A10);
    }
}
