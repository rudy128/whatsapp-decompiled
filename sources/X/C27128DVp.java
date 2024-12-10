package X;

import java.util.concurrent.Callable;

/* renamed from: X.DVp  reason: case insensitive filesystem */
public final /* synthetic */ class C27128DVp implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ DRB A06;

    public final Object call() {
        DRB drb = this.A06;
        long j = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        int i6 = 0;
        if (!DRB.A08(drb)) {
            int i7 = drb.A01 + 1;
            drb.A01 = i7;
            if (i7 >= 8) {
                i6 = -6;
            }
            return Integer.valueOf(i6);
        }
        drb.A0E.renderNativeFrame(j, i, i2, i3, i4, i5);
        drb.A01 = 0;
        return Integer.valueOf(DRB.A01(drb));
    }

    public /* synthetic */ C27128DVp(DRB drb, int i, int i2, int i3, int i4, int i5, long j) {
        this.A06 = drb;
        this.A05 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }
}
