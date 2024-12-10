package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CkH  reason: case insensitive filesystem */
public class C25686CkH {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C27063DRj A03;
    public final AtomicBoolean A04;
    public final C26185Cu9 A05;
    public final AtomicBoolean A06;
    public final boolean A07;

    public long A00(long j) {
        int i;
        C26185Cu9 cu9;
        C27063DRj dRj = this.A03;
        if (dRj == null) {
            return 0;
        }
        try {
            C25304Cd8.A01("getIntentBasedLowWatermarkUs");
            int i2 = dRj.cellMinLowWaterMarkMs;
            if (!this.A07 || (cu9 = this.A05) == null) {
                i = dRj.cellMaxLowWaterMarkMs;
            } else {
                i = C26185Cu9.A00(cu9, 11);
            }
            return (long) (1.0f * Math.min(((float) (((long) i2) * 1000)) + (dRj.cellLowWaterMarkMultiplier * ((float) j)), (float) (((long) i) * 1000)));
        } finally {
            C25304Cd8.A00();
        }
    }

    public C25686CkH(C26185Cu9 cu9, C27063DRj dRj, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, boolean z) {
        this.A03 = dRj;
        this.A04 = atomicBoolean;
        this.A06 = atomicBoolean2;
        this.A02 = ((long) i) * 1000;
        this.A01 = ((long) i2) * 1000;
        this.A00 = ((long) i3) * 1000;
        this.A05 = cu9;
        this.A07 = z;
    }

    public C25686CkH() {
        this((C26185Cu9) null, (C27063DRj) null, BE6.A16(false), BE6.A16(false), 1000, 15000, 30000, false);
    }
}
