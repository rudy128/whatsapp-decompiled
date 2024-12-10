package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqw  reason: case insensitive filesystem */
public final class C23839Bqw extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public C23839Bqw() {
        super(2032, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A00);
        r3.CHf(9, this.A05);
        r3.CHf(10, this.A02);
        r3.CHf(2, this.A06);
        r3.CHf(11, this.A0A);
        r3.CHf(6, this.A07);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A08);
        r3.CHf(1, this.A03);
        r3.CHf(5, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(BE9.A0h(AnonymousClass184.A04(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(C108955ca.A0e(), this.A04, A13), this.A00, A13), this.A05, A13), this.A02, A13), this.A06, A13), this.A0A);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A03(AnonymousClass184.A06(AnonymousClass184.A05(6, this.A07, A13), this.A01, A13), this.A08, A13), this.A03, A13), this.A09);
        AnonymousClass184.A0X(A13, 12);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamInlineVideoPlaybackClosed {");
        AnonymousClass186.A00(this.A04, "inlineVideoCancelBeforePlayStateT", A10);
        AnonymousClass186.A00(this.A00, "inlineVideoComplete", A10);
        AnonymousClass186.A00(this.A05, "inlineVideoCompletionRate", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "inlineVideoCtaClick", A10);
        AnonymousClass186.A00(this.A06, "inlineVideoDurationT", A10);
        AnonymousClass186.A00(this.A0A, "inlineVideoError", A10);
        AnonymousClass186.A00(this.A07, "inlineVideoPlayStartT", A10);
        AnonymousClass186.A00(this.A01, "inlineVideoPlayed", A10);
        AnonymousClass186.A00(this.A08, "inlineVideoStallT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "inlineVideoType", A10);
        return AnonymousClass184.A0S(this.A09, "inlineVideoWatchT", A10);
    }
}
