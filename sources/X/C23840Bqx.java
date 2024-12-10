package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqx  reason: case insensitive filesystem */
public final class C23840Bqx extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public C23840Bqx() {
        super(1914, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(12, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(9, this.A07);
        r3.CHf(11, this.A08);
        r3.CHf(4, this.A09);
        r3.CHf(8, this.A0A);
        r3.CHf(7, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A06(BE9.A0h(AnonymousClass184.A0B(AnonymousClass184.A07(BE9.A0i(AnonymousClass184.A0C(AnonymousClass184.A08(C17880vN.A0j(), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A00, A13), this.A01, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidMediaFileScanEvent {");
        AnonymousClass186.A00(this.A02, "analyzeT", A10);
        AnonymousClass186.A00(this.A03, "bytesAnalyzed", A10);
        AnonymousClass186.A00(this.A04, "bytesMerged", A10);
        AnonymousClass186.A00(this.A05, "bytesRelinked", A10);
        AnonymousClass186.A00(this.A06, "filesAnalyzed", A10);
        AnonymousClass186.A00(this.A07, "filesMerged", A10);
        AnonymousClass186.A00(this.A08, "filesRelinked", A10);
        AnonymousClass186.A00(this.A09, "filesScanned", A10);
        AnonymousClass186.A00(this.A0A, "filesToAnalyze", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "origin", A10);
        return AnonymousClass184.A0S(this.A0B, "scanT", A10);
    }
}
