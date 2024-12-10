package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64E  reason: invalid class name */
public final class AnonymousClass64E extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public AnonymousClass64E() {
        super(2044, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(12, this.A08);
        r3.CHf(15, this.A09);
        r3.CHf(16, this.A00);
        r3.CHf(17, this.A0A);
        r3.CHf(8, this.A01);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A0B);
        r3.CHf(18, this.A02);
        r3.CHf(14, this.A03);
        r3.CHf(9, this.A05);
        r3.CHf(13, this.A0C);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108955ca.A0h(), this.A08);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass3MY.A0h(), this.A09, A13), this.A00, A13), this.A0A);
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass3MY.A0g(), this.A01);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0F(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A0B(AnonymousClass184.A0G(AnonymousClass184.A0K(AnonymousClass184.A0D(10, this.A04, A13), this.A0B, A13), this.A02, A13), this.A03, A13), this.A05, A13), (Object) null, A13), (Object) null, A13), this.A0C, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPttPlayback {");
        AnonymousClass186.A00(this.A08, "pttDuration", A10);
        AnonymousClass186.A00(this.A09, "pttMiniPlayerClick", A10);
        AnonymousClass186.A00(this.A00, "pttMiniPlayerClose", A10);
        AnonymousClass186.A00(this.A0A, "pttMiniPlayerPauseCnt", A10);
        AnonymousClass186.A00(this.A01, "pttPlaybackFailed", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "pttPlaybackSpeed", A10);
        AnonymousClass186.A00(this.A0B, "pttPlaybackSpeedCnt", A10);
        AnonymousClass186.A00(this.A02, "pttPlayedOutOfChat", A10);
        AnonymousClass186.A00(this.A03, "pttPlayedPct", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "pttPlayer", A10);
        AnonymousClass186.A00(this.A0C, "pttSeekCnt", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "pttTrigger", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A07), "pttType", A10);
    }
}
