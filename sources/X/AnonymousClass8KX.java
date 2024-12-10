package X;

import android.os.SystemClock;
import java.io.File;

/* renamed from: X.8KX  reason: invalid class name */
public class AnonymousClass8KX extends C20025A3t {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final String A0F;
    public final boolean A0G;
    public final File A0H;
    public final String A0I;
    public final boolean A0J;
    public final long[] A0K;

    private boolean A00(long[] jArr) {
        try {
            String A012 = C20025A3t.A01(C108945cZ.A17(this.A0I));
            if (A012 == null) {
                return false;
            }
            String[] split = A012.split("\\s+");
            jArr[0] = Long.parseLong(split[9]);
            jArr[1] = Long.parseLong(split[11]);
            jArr[2] = Long.parseLong(split[13]);
            jArr[3] = Long.parseLong(split[14]);
            jArr[4] = Long.parseLong(split[41]);
            return true;
        } catch (Throwable unused) {
            this.A0D = false;
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if ((r10 - (r3 * 10)) <= 0) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01() {
        /*
            r15 = this;
            boolean r0 = r15.A0D
            r14 = 0
            if (r0 == 0) goto L_0x0118
            long r8 = android.os.SystemClock.uptimeMillis()
            long[] r1 = r15.A0K
            boolean r0 = r15.A00(r1)
            if (r0 == 0) goto L_0x0118
            r0 = 0
            r12 = r1[r0]
            r0 = 1
            r10 = r1[r0]
            r0 = 2
            r6 = r1[r0]
            long r4 = r15.A00
            long r6 = r6 * r4
            r0 = 3
            r2 = r1[r0]
            long r2 = r2 * r4
            r0 = 4
            r0 = r1[r0]
            long r0 = r0 * r4
            long r4 = r15.A09
            long r8 = r8 - r4
            r15.A0B = r8
            long r4 = r15.A0A
            long r6 = r6 - r4
            int r4 = (int) r6
            r15.A04 = r4
            long r5 = r15.A08
            long r2 = r2 - r5
            int r5 = (int) r2
            r15.A03 = r5
            long r2 = r15.A05
            long r0 = r0 - r2
            int r2 = (int) r0
            r15.A00 = r2
            long r0 = r15.A07
            long r12 = r12 - r0
            int r0 = (int) r12
            r15.A02 = r0
            long r0 = r15.A06
            long r10 = r10 - r0
            int r0 = (int) r10
            r15.A01 = r0
            boolean r0 = r15.A0G
            if (r0 == 0) goto L_0x0063
            int r4 = r4 + r5
            int r4 = r4 + r2
            long r10 = X.C17890vO.A03(r4)
            long r10 = r10 / r8
            r5 = 10
            long r3 = r10 / r5
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0063
            long r3 = r3 * r5
            long r10 = r10 - r3
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0118
        L_0x0063:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            int r9 = r15.A0E
            boolean r0 = r15.A0J
            if (r0 == 0) goto L_0x00fd
            java.lang.String r11 = r15.A0F
        L_0x006f:
            long r0 = r15.A0B
            int r3 = (int) r0
            int r10 = r15.A04
            int r8 = r15.A03
            int r7 = r15.A00
            int r6 = r15.A02
            int r5 = r15.A01
            java.lang.String r0 = ""
            r2.append(r0)
            if (r3 != 0) goto L_0x0084
            r3 = 1
        L_0x0084:
            int r0 = r10 + r8
            int r0 = r0 + r7
            long r0 = (long) r0
            long r3 = (long) r3
            X.C20025A3t.A02(r2, r0, r3)
            java.lang.String r0 = "% "
            r2.append(r0)
            if (r9 < 0) goto L_0x009b
            r2.append(r9)
            java.lang.String r0 = "/"
            r2.append(r0)
        L_0x009b:
            r2.append(r11)
            java.lang.String r0 = "： "
            r2.append(r0)
            long r0 = (long) r10
            X.C20025A3t.A02(r2, r0, r3)
            java.lang.String r0 = "% user + "
            r2.append(r0)
            long r0 = (long) r8
            X.C20025A3t.A02(r2, r0, r3)
            java.lang.String r0 = "% kernel"
            r2.append(r0)
            java.lang.String r0 = " + "
            if (r7 <= 0) goto L_0x00c5
            r2.append(r0)
            long r0 = (long) r7
            X.C20025A3t.A02(r2, r0, r3)
            java.lang.String r0 = "% iowait"
            r2.append(r0)
        L_0x00c5:
            if (r6 > 0) goto L_0x00c9
            if (r5 <= 0) goto L_0x00ea
        L_0x00c9:
            java.lang.String r0 = " / faults："
            r2.append(r0)
            java.lang.String r1 = " "
            if (r6 <= 0) goto L_0x00dd
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = " minor"
            r2.append(r0)
        L_0x00dd:
            if (r5 <= 0) goto L_0x00ea
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = " major"
            r2.append(r0)
        L_0x00ea:
            java.lang.String r0 = "\n"
            r2.append(r0)
            int r1 = r2.length()
            r0 = 1
            int r1 = r1 - r0
            r2.setLength(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r15.A0F
            r1.append(r0)
            java.lang.String r0 = "("
            r1.append(r0)
            int r0 = android.os.Process.getThreadPriority(r9)
            r1.append(r0)
            java.lang.String r11 = X.AnonymousClass8BU.A0q(r1)
            goto L_0x006f
        L_0x0118:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KX.A01():java.lang.String");
    }

    public void A02() {
        if (this.A0D) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A0K;
            if (A00(jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = this.A00;
                long j5 = j3 * j4;
                long j6 = jArr[3] * j4;
                long j7 = jArr[4] * j4;
                if (this.A0C) {
                    this.A07 = j;
                    this.A06 = j2;
                    this.A0A = j5;
                    this.A08 = j6;
                } else {
                    this.A09 = uptimeMillis;
                    this.A0A = j5;
                    this.A08 = j6;
                    this.A07 = j;
                    this.A06 = j2;
                }
                this.A05 = j7;
                this.A0C = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        if (r1.canRead() == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8KX(int r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 5
            long[] r0 = new long[r0]
            r8.A0K = r0
            r5 = 1
            r8.A0C = r5
            int r4 = android.os.Process.myPid()
            r8.A0E = r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r7 = "/proc/"
            r1.append(r7)
            r1.append(r4)
            java.lang.String r6 = "/task/"
            r1.append(r6)
            r1.append(r9)
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8.A0I = r0
            java.io.File r1 = X.C108945cZ.A17(r0)
            r8.A0H = r1
            boolean r0 = r1.exists()
            r3 = 0
            if (r0 == 0) goto L_0x0041
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r8.A0D = r0
            java.lang.String r2 = "<unknown>"
            int r0 = android.os.Process.myPid()
            if (r9 != r0) goto L_0x0058
            java.lang.String r2 = "main"
        L_0x004e:
            r8.A0F = r2
            if (r9 != r4) goto L_0x0053
            r5 = 0
        L_0x0053:
            r8.A0G = r5
            r8.A0J = r3
            return
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ all -> 0x004e }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004e }
            r1.append(r0)     // Catch:{ all -> 0x004e }
            r1.append(r6)     // Catch:{ all -> 0x004e }
            r1.append(r9)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "/comm"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x004e }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = X.C20025A3t.A01(r0)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004e
            r2 = r0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KX.<init>(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r1.canRead() == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8KX() {
        /*
            r4 = this;
            r4.<init>()
            r0 = 5
            long[] r0 = new long[r0]
            r4.A0K = r0
            r3 = 1
            r4.A0C = r3
            int r2 = android.os.Process.myPid()
            r4.A0E = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "/proc/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.A0I = r0
            java.io.File r1 = X.C108945cZ.A17(r0)
            r4.A0H = r1
            boolean r0 = r1.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0039
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r4.A0D = r0
            android.app.ActivityThread r1 = android.app.ActivityThread.currentActivityThread()
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = r1.getProcessName()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r1.getProcessName()
        L_0x004c:
            r4.A0F = r0
            r4.A0G = r2
            r4.A0J = r3
            return
        L_0x0053:
            java.lang.String r0 = "<unknown>"
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KX.<init>():void");
    }
}
