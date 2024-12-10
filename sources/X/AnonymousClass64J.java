package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64J  reason: invalid class name */
public final class AnonymousClass64J extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public AnonymousClass64J() {
        super(1584, new C18180vt(1, 1, 100, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(15, this.A00);
        r3.CHf(7, this.A07);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(10, this.A08);
        r3.CHf(1, this.A09);
        r3.CHf(14, this.A0A);
        r3.CHf(16, this.A05);
        r3.CHf(11, this.A06);
        r3.CHf(13, this.A0B);
        r3.CHf(9, this.A0C);
        r3.CHf(8, this.A0D);
        r3.CHf(6, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A07(C17880vN.A0k(), this.A01, A13), this.A02, A13), this.A00);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A03(AnonymousClass184.A0C(C108975cc.A0T(C108975cc.A0S(C108955ca.A0e(), this.A07, A13), this.A03, A13), this.A04, A13), this.A08, A13), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 17);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A0A(AnonymousClass184.A0B(AnonymousClass184.A0F(AnonymousClass184.A0D(16, this.A05, A13), this.A06, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaStreamPlayback {");
        AnonymousClass186.A00(this.A01, "bytesDownloadedStart", A10);
        AnonymousClass186.A00(this.A02, "bytesTransferred", A10);
        AnonymousClass186.A00(this.A00, "didPlay", A10);
        AnonymousClass186.A00(this.A07, "initialBufferingT", A10);
        AnonymousClass186.A00(this.A03, "mediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "mediaType", A10);
        AnonymousClass186.A00(this.A08, "overallPlayT", A10);
        AnonymousClass186.A00(this.A09, "overallT", A10);
        AnonymousClass186.A00(this.A0A, "playbackCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "playbackOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "playbackState", A10);
        AnonymousClass186.A00(this.A0B, "seekCount", A10);
        AnonymousClass186.A00(this.A0C, "totalRebufferingCount", A10);
        AnonymousClass186.A00(this.A0D, "totalRebufferingT", A10);
        return AnonymousClass184.A0S(this.A0E, "videoDuration", A10);
    }
}
