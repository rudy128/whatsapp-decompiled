package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.CqU  reason: case insensitive filesystem */
public final class C26013CqU {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C25199Caq A04;
    public final C26539D3a A05;
    public final CSJ A06;
    public final Integer A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C26013CqU(Timeline timeline, C26539D3a d3a, CSJ csj, long j) {
        this(timeline, new C25199Caq(0, -1, -1, -1), d3a, csj, AnonymousClass00R.A00, (Object) null, 1, j, -9223372036854775807L, false, false);
    }

    public static void A00(C26013CqU cqU, C26013CqU cqU2) {
        cqU2.A0D = cqU.A0D;
        cqU2.A0C = cqU.A0C;
        cqU2.A0B = cqU.A0B;
    }

    public C26013CqU A01(C25199Caq caq, long j, long j2) {
        long j3 = j2;
        Timeline timeline = this.A03;
        Object obj = this.A08;
        C25199Caq caq2 = caq;
        if (caq2.A00 == -1) {
            j3 = -9223372036854775807L;
        }
        return new C26013CqU(timeline, caq2, this.A05, this.A06, this.A07, obj, this.A00, j, j3, this.A0A, this.A09);
    }

    public C26013CqU A02(C26539D3a d3a, CSJ csj) {
        Timeline timeline = this.A03;
        Object obj = this.A08;
        C25199Caq caq = this.A04;
        long j = this.A02;
        long j2 = this.A01;
        C26539D3a d3a2 = d3a;
        CSJ csj2 = csj;
        C26013CqU cqU = new C26013CqU(timeline, caq, d3a2, csj2, this.A07, obj, this.A00, j, j2, this.A0A, this.A09);
        A00(this, cqU);
        return cqU;
    }

    public C26013CqU(Timeline timeline, C25199Caq caq, C26539D3a d3a, CSJ csj, Integer num, Object obj, int i, long j, long j2, boolean z, boolean z2) {
        this.A03 = timeline;
        this.A08 = obj;
        this.A04 = caq;
        this.A02 = j;
        this.A01 = j2;
        this.A0D = j;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A05 = d3a;
        this.A06 = csj;
        this.A07 = num;
        this.A09 = z2;
    }
}
