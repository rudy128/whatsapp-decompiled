package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64K  reason: invalid class name */
public final class AnonymousClass64K extends AnonymousClass184 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public AnonymousClass64K() {
        super(4470, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(15, this.A06);
        r3.CHf(6, this.A07);
        r3.CHf(7, this.A08);
        r3.CHf(8, this.A00);
        r3.CHf(9, this.A09);
        r3.CHf(10, this.A0A);
        r3.CHf(11, this.A0B);
        r3.CHf(12, this.A0C);
        r3.CHf(13, this.A0D);
        r3.CHf(14, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0H(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaBloksSupportVideo {");
        AnonymousClass186.A00(this.A01, "appUniqueId", A10);
        AnonymousClass186.A00(this.A02, "approxWatchTime", A10);
        AnonymousClass186.A00(this.A03, "captionState", A10);
        AnonymousClass186.A00(this.A04, "deviceCategory", A10);
        AnonymousClass186.A00(this.A05, "deviceOs", A10);
        AnonymousClass186.A00(this.A06, "playbackSessionId", A10);
        AnonymousClass186.A00(this.A07, "supportVideoDuration", A10);
        AnonymousClass186.A00(this.A08, "timeMs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "videoEventType", A10);
        AnonymousClass186.A00(this.A09, "videoId", A10);
        AnonymousClass186.A00(this.A0A, "videoLocale", A10);
        AnonymousClass186.A00(this.A0B, "videoMediaGroupId", A10);
        AnonymousClass186.A00(this.A0C, "videoName", A10);
        AnonymousClass186.A00(this.A0D, "videoTimePosition", A10);
        return AnonymousClass184.A0S(this.A0E, "watchTimeInMs", A10);
    }
}
