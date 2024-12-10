package X;

import android.os.Build;
import android.os.Debug;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.Cq7  reason: case insensitive filesystem */
public class C25992Cq7 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final MultiBufferLogger A0A;

    private void A00(long j, int i, long j2) {
        long j3 = j;
        if (j > j2) {
            this.A0A.writeStandardEntry(6, 44, 0, 0, i, 0, j3);
        }
    }

    private void A01(long j, int i, long j2) {
        long j3 = j;
        if (j != j2) {
            this.A0A.writeStandardEntry(6, 44, 0, 0, i, 0, j3);
        }
    }

    public C25992Cq7(MultiBufferLogger multiBufferLogger) {
        this.A0A = multiBufferLogger;
    }

    public void A02() {
        long globalAllocCount = (long) Debug.getGlobalAllocCount();
        A00(globalAllocCount, 9240593, this.A00);
        this.A00 = globalAllocCount;
        long globalAllocSize = (long) Debug.getGlobalAllocSize();
        A00(globalAllocSize, 9240594, this.A01);
        this.A01 = globalAllocSize;
        if (Build.VERSION.SDK_INT >= 23) {
            String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat != null) {
                long parseLong = Long.parseLong(runtimeStat);
                A00(parseLong, 9240595, this.A04);
                this.A04 = parseLong;
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat2 != null) {
                long parseLong2 = Long.parseLong(runtimeStat2);
                A00(parseLong2, 9240665, this.A05);
                this.A05 = parseLong2;
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat3 != null) {
                long parseLong3 = Long.parseLong(runtimeStat3);
                A00(parseLong3, 9240664, this.A02);
                this.A02 = parseLong3;
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat4 != null) {
                long parseLong4 = Long.parseLong(runtimeStat4);
                A00(parseLong4, 9240666, this.A03);
                this.A03 = parseLong4;
            }
        }
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        long freeMemory = j - runtime.freeMemory();
        long j2 = maxMemory - freeMemory;
        A01(freeMemory, 9240636, this.A09);
        A01(j2, 9240634, this.A06);
        A01(maxMemory, 9240635, this.A07);
        A01(j, 9240637, this.A08);
        this.A07 = maxMemory;
        this.A08 = j;
        this.A09 = freeMemory;
        this.A06 = j2;
    }
}
