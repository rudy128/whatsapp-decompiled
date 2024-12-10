package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gm  reason: invalid class name and case insensitive filesystem */
public final class C46942Gm extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C46942Gm() {
        super(2200, new C18180vt(1, 20, 200, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(9, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(2, this.A07);
        r3.CHf(4, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A04(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A0B(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamImageDownloadHashMismatch {");
        AnonymousClass186.A00(this.A00, "isStreaming", A10);
        AnonymousClass186.A00(this.A01, "mediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mediaType", A10);
        AnonymousClass186.A00(this.A03, "scan1Length", A10);
        AnonymousClass186.A00(this.A04, "scan2Length", A10);
        AnonymousClass186.A00(this.A05, "scan3Length", A10);
        AnonymousClass186.A00(this.A06, "scan4Length", A10);
        AnonymousClass186.A00(this.A07, "scanForHashMismatch", A10);
        return AnonymousClass184.A0S(this.A08, "scansAvailable", A10);
    }
}
