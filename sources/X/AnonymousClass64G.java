package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64G  reason: invalid class name */
public final class AnonymousClass64G extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;

    public AnonymousClass64G() {
        super(5862, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(2, this.A06);
        r3.CHf(3, this.A07);
        r3.CHf(14, this.A01);
        r3.CHf(15, this.A08);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(8, this.A0C);
        r3.CHf(9, this.A09);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A0A);
        r3.CHf(12, this.A0D);
        r3.CHf(13, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A05, A13), this.A06, A13), this.A07);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0H(14, this.A01, A13), this.A08, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A0C, A13), this.A09, A13), this.A04, A13), this.A0A, A13), this.A0D, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaInteractions {");
        AnonymousClass186.A00(this.A05, "downloadTs", A10);
        AnonymousClass186.A00(this.A06, "firstViewTs", A10);
        AnonymousClass186.A00(this.A07, "forwardCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "groupSizeBucket", A10);
        AnonymousClass186.A00(this.A08, "imageOpenCount", A10);
        AnonymousClass186.A00(this.A00, "isHd", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mediaDownloadMode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mediaDownloadOrigin", A10);
        AnonymousClass186.A00(this.A0C, "mediaUuid", A10);
        AnonymousClass186.A00(this.A09, "messageDeliveryTs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "overallMediaType", A10);
        AnonymousClass186.A00(this.A0A, "reactCount", A10);
        AnonymousClass186.A00(this.A0D, "threadId", A10);
        return AnonymousClass184.A0S(this.A0B, "viewCount", A10);
    }
}
