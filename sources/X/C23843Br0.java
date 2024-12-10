package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br0  reason: case insensitive filesystem */
public final class C23843Br0 extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C23843Br0() {
        super(1766, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(13, this.A06);
        r3.CHf(14, this.A07);
        r3.CHf(11, this.A08);
        r3.CHf(10, this.A09);
        r3.CHf(15, this.A0A);
        r3.CHf(12, this.A0B);
        r3.CHf(16, this.A0C);
        r3.CHf(7, this.A00);
        r3.CHf(6, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(3, this.A0D);
        r3.CHf(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(BE9.A0h(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A03(C17880vN.A0i(), this.A01, A13), this.A02, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09);
        AnonymousClass184.A0X(A13, 18);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A09(AnonymousClass184.A0I(BE9.A0i(15, this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A00, A13), this.A03, A13), this.A04, A13), this.A0D, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaDailyDataUsage {");
        AnonymousClass186.A00(this.A01, "bytesReceived", A10);
        AnonymousClass186.A00(this.A02, "bytesSent", A10);
        AnonymousClass186.A00(this.A06, "countDownloaded", A10);
        AnonymousClass186.A00(this.A07, "countForward", A10);
        AnonymousClass186.A00(this.A08, "countMessageReceived", A10);
        AnonymousClass186.A00(this.A09, "countMessageSent", A10);
        AnonymousClass186.A00(this.A0A, "countShared", A10);
        AnonymousClass186.A00(this.A0B, "countUploaded", A10);
        AnonymousClass186.A00(this.A0C, "countViewed", A10);
        AnonymousClass186.A00(this.A00, "isAutoDownload", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mediaTransferOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "mediaType", A10);
        AnonymousClass186.A00(this.A0D, "transferDate", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "transferRadio", A10);
    }
}
