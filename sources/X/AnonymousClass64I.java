package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64I  reason: invalid class name */
public final class AnonymousClass64I extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;

    public AnonymousClass64I() {
        super(4486, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0E);
        r3.CHf(2, this.A01);
        r3.CHf(11, this.A0A);
        r3.CHf(3, this.A0B);
        r3.CHf(12, this.A02);
        r3.CHf(13, this.A0C);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A0D);
        r3.CHf(7, this.A03);
        r3.CHf(8, this.A05);
        r3.CHf(14, this.A06);
        r3.CHf(9, this.A07);
        r3.CHf(15, this.A08);
        r3.CHf(10, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0H(AnonymousClass184.A0B(AnonymousClass184.A0G(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0F(AnonymousClass184.A0E(C108975cc.A0T(AnonymousClass184.A0D(C108975cc.A0S(C17880vN.A0h(), this.A0E, A13), this.A01, A13), this.A0A, A13), this.A0B, A13), this.A02, A13), this.A0C, A13), this.A00, A13), this.A04, A13), this.A0D, A13), this.A03, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaDownloadSla {");
        AnonymousClass186.A00(this.A0E, "clientMessageId", A10);
        AnonymousClass186.A00(this.A01, "downloadBytesTransfer", A10);
        AnonymousClass186.A00(this.A0A, "downloadEndTsInMs", A10);
        AnonymousClass186.A00(this.A0B, "downloadOverallT", A10);
        AnonymousClass186.A00(this.A02, "expressPathBytesSavedSla", A10);
        AnonymousClass186.A00(this.A0C, "expressPathTimeSavedSla", A10);
        AnonymousClass186.A00(this.A00, "isReuseDownload", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "mediaDownloadModePs", A10);
        AnonymousClass186.A00(this.A0D, "mediaIdDownload", A10);
        AnonymousClass186.A00(this.A03, "mediaSizePs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "networkType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "overallBackendStoreSla", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "overallDownloadResultPs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "overallLeverageExpressPathType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A09), "overallMediaTypePs", A10);
    }
}
