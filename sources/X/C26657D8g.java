package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D8g  reason: case insensitive filesystem */
public class C26657D8g implements EAG {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public long A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -9223372036854775807L;
    public C25085CWv A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public boolean A0E;
    public final C26185Cu9 A0F;
    public final AtomicBoolean A0G;
    public final boolean A0H;
    public final int A0I;
    public final C25215CbB A0J;
    public final C91 A0K;
    public final C25686CkH A0L;
    public final C24788CKh A0M;
    public final AtomicBoolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public volatile long A0T = -9223372036854775807L;
    public volatile long A0U = -9223372036854775807L;

    private void A02(boolean z) {
        this.A0D = 0;
        this.A0E = false;
        if (z) {
            C25215CbB cbB = this.A0J;
            synchronized (cbB) {
                cbB.A02(0);
            }
        }
        this.A0T = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A01();
    }

    public long BNH() {
        return 0;
    }

    public void C1Z() {
        A02(false);
    }

    public void C2x() {
        A02(true);
    }

    public void C78() {
        A02(true);
    }

    public boolean CG3() {
        return false;
    }

    private long A00() {
        C26185Cu9 cu9;
        long j = this.A0T;
        long j2 = this.A0U;
        if (j == -9223372036854775807L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.A05;
            if (j3 == -9223372036854775807L) {
                this.A05 = elapsedRealtime;
            } else if (elapsedRealtime - j3 > j2) {
                this.A0T = -9223372036854775807L;
                this.A05 = -9223372036854775807L;
            }
        }
        long j4 = this.A0T;
        if (j4 != -9223372036854775807L) {
            UUID uuid = C24736CHy.A04;
            return Util.A04(j4);
        } else if (!this.A0B || (cu9 = this.A0F) == null) {
            return this.A03;
        } else {
            int i = 3;
            if (this.A0A) {
                i = 7;
            }
            return (long) (C26185Cu9.A00(cu9, i) * 1000);
        }
    }

    private void A01() {
        this.A07 = -1;
        this.A06 = -1;
        this.A08 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
    }

    public C25215CbB BMx() {
        return this.A0J;
    }

    public void C94(C26539D3a d3a, ECg[] eCgArr, C28650ECj[] eCjArr) {
        int i = this.A0I;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < eCgArr.length; i2++) {
                if (eCjArr[i2] != null) {
                    int i3 = eCgArr[i2].A0B;
                    boolean z = this.A0C;
                    int i4 = A7Y.A0F;
                    if (z) {
                        if (i3 == 1) {
                            i4 = this.A00;
                        } else if (i3 == 2) {
                            i4 = this.A01;
                        }
                    } else if (i3 == 1) {
                        i4 = 3538944;
                    } else if (i3 == 2) {
                        i4 = 13107200;
                    }
                    i += i4;
                }
            }
        }
        this.A0D = i;
        this.A0J.A02(i);
    }

    public void CJt(long j, long j2) {
        this.A06 = j;
        this.A07 = j2;
        if (j == -1 || j2 == -1) {
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x016c, code lost:
        if ((r3 - r1) < r7) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (r2 > 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014e, code lost:
        if ((com.facebook.android.exoplayer2.util.Util.A05(r27) - r3) < r1) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CLn(float r26, long r27, long r29, boolean r31) {
        /*
            r25 = this;
            java.lang.String r0 = "shouldContinueLoading"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x0178 }
            r1 = 1
            r6 = r25
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.A0G     // Catch:{ all -> 0x0178 }
            boolean r0 = r10.get()     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x0011
            r1 = 0
        L_0x0011:
            r5 = 0
            if (r1 != 0) goto L_0x002a
            long r1 = r6.A06     // Catch:{ all -> 0x0178 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            long r1 = r6.A07     // Catch:{ all -> 0x0178 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            goto L_0x002a
        L_0x0023:
            boolean r0 = r6.A0H     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x002a
            if (r31 != 0) goto L_0x002a
            r5 = 1
        L_0x002a:
            r7 = 0
            if (r5 == 0) goto L_0x0044
            boolean r0 = r6.A0R     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x0040
            java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0178 }
            r10 = -1
            X.CWv r8 = new X.CWv     // Catch:{ all -> 0x0178 }
            r14 = r10
            r16 = r10
            r12 = r10
            r8.<init>(r9, r10, r12, r14, r16)     // Catch:{ all -> 0x0178 }
            r6.A09 = r8     // Catch:{ all -> 0x0178 }
        L_0x0040:
            X.C25304Cd8.A00()
            return r7
        L_0x0044:
            X.CbB r9 = r6.A0J     // Catch:{ all -> 0x0178 }
            int r1 = r9.A00()     // Catch:{ all -> 0x0178 }
            int r0 = r6.A0D     // Catch:{ all -> 0x0178 }
            boolean r17 = X.C108975cc.A1C(r1, r0)
            X.CkH r5 = r6.A0L     // Catch:{ all -> 0x0178 }
            r15 = 0
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.A04     // Catch:{ all -> 0x0178 }
            boolean r0 = r8.get()     // Catch:{ all -> 0x0178 }
            r2 = r29
            if (r0 == 0) goto L_0x0094
            long r0 = r5.A02     // Catch:{ all -> 0x0178 }
        L_0x0060:
            r13 = 0
            boolean r4 = r8.get()     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x0079
            long r2 = r5.A02     // Catch:{ all -> 0x0178 }
        L_0x006a:
            boolean r4 = r6.A0P     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x00b4
            boolean r4 = r6.A0O     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x009f
            boolean r4 = r10.get()     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x009f
            goto L_0x00b4
        L_0x0079:
            X.DRj r4 = r5.A03     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x0091
            int r8 = r4.cellHighWaterMarkDeltaMs     // Catch:{ all -> 0x0178 }
            long r2 = r5.A00(r2)     // Catch:{ all -> 0x0178 }
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            long r11 = X.C17890vO.A03(r8)
            long r2 = r2 + r11
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x0091
            goto L_0x006a
        L_0x0091:
            long r2 = r5.A00     // Catch:{ all -> 0x0178 }
            goto L_0x006a
        L_0x0094:
            long r0 = r5.A00(r2)     // Catch:{ all -> 0x0178 }
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x0060
            long r0 = r5.A01     // Catch:{ all -> 0x0178 }
            goto L_0x0060
        L_0x009f:
            long r11 = r2 - r0
            long r4 = r6.A00()     // Catch:{ all -> 0x0178 }
            long r0 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x0178 }
            boolean r4 = r6.A0S     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x00b2
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0178 }
            goto L_0x00b4
        L_0x00b2:
            long r2 = r0 + r11
        L_0x00b4:
            r4 = 1065353216(0x3f800000, float:1.0)
            r8 = r26
            int r4 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cd
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00c9
            double r4 = (double) r0     // Catch:{ all -> 0x0178 }
            double r0 = (double) r8     // Catch:{ all -> 0x0178 }
            double r4 = r4 * r0
            long r0 = java.lang.Math.round(r4)     // Catch:{ all -> 0x0178 }
        L_0x00c9:
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0178 }
        L_0x00cd:
            java.lang.Integer r16 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0178 }
            int r4 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00df
            boolean r4 = r6.A0Q     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x00d9
            if (r17 != 0) goto L_0x00da
        L_0x00d9:
            r7 = 1
        L_0x00da:
            r6.A0E = r7     // Catch:{ all -> 0x0178 }
            if (r7 != 0) goto L_0x00f3
            goto L_0x00f1
        L_0x00df:
            int r4 = (r27 > r2 ? 1 : (r27 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00ec
            if (r17 != 0) goto L_0x00ec
            boolean r7 = r6.A0E     // Catch:{ all -> 0x0178 }
            if (r7 != 0) goto L_0x00f3
            java.lang.Integer r16 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0178 }
            goto L_0x00f3
        L_0x00ec:
            java.lang.Integer r16 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0178 }
            r6.A0E = r7     // Catch:{ all -> 0x0178 }
            goto L_0x00f3
        L_0x00f1:
            java.lang.Integer r16 = X.AnonymousClass00R.A0Y     // Catch:{ all -> 0x0178 }
        L_0x00f3:
            boolean r4 = r6.A0R     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x0110
            if (r7 != 0) goto L_0x0110
            int r4 = r6.A0D     // Catch:{ all -> 0x0178 }
            long r7 = (long) r4     // Catch:{ all -> 0x0178 }
            int r4 = r9.A00()     // Catch:{ all -> 0x0178 }
            long r4 = (long) r4     // Catch:{ all -> 0x0178 }
            X.CWv r15 = new X.CWv     // Catch:{ all -> 0x0178 }
            r21 = r0
            r23 = r2
            r17 = r7
            r19 = r4
            r15.<init>(r16, r17, r19, r21, r23)     // Catch:{ all -> 0x0178 }
            r6.A09 = r15     // Catch:{ all -> 0x0178 }
        L_0x0110:
            long r1 = r6.A06     // Catch:{ all -> 0x0178 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
            long r1 = r6.A07     // Catch:{ all -> 0x0178 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
            boolean r0 = r6.A0E     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r10.get()     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x0164
            if (r31 != 0) goto L_0x0164
            long r1 = r6.A06     // Catch:{ all -> 0x0178 }
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0150
            long r3 = r6.A02     // Catch:{ all -> 0x0178 }
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0144
            java.util.UUID r0 = X.C24736CHy.A04     // Catch:{ all -> 0x0178 }
            long r3 = com.facebook.android.exoplayer2.util.Util.A05(r27)     // Catch:{ all -> 0x0178 }
            r6.A02 = r3     // Catch:{ all -> 0x0178 }
        L_0x0144:
            java.util.UUID r0 = X.C24736CHy.A04     // Catch:{ all -> 0x0178 }
            long r7 = com.facebook.android.exoplayer2.util.Util.A05(r27)     // Catch:{ all -> 0x0178 }
            long r7 = r7 - r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r9 = 0
            if (r0 >= 0) goto L_0x0151
        L_0x0150:
            r9 = 1
        L_0x0151:
            long r7 = r6.A07     // Catch:{ all -> 0x0178 }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0178 }
            long r1 = r6.A08     // Catch:{ all -> 0x0178 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0168
            r6.A08 = r3     // Catch:{ all -> 0x0178 }
            goto L_0x0167
        L_0x0164:
            boolean r5 = r6.A0E     // Catch:{ all -> 0x0178 }
            goto L_0x0174
        L_0x0167:
            r1 = r3
        L_0x0168:
            long r3 = r3 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x016f
        L_0x016e:
            r0 = 1
        L_0x016f:
            if (r9 == 0) goto L_0x0174
            if (r0 == 0) goto L_0x0174
            r5 = 1
        L_0x0174:
            X.C25304Cd8.A00()
            return r5
        L_0x0178:
            r0 = move-exception
            X.C25304Cd8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26657D8g.CLn(float, long, long, boolean):boolean");
    }

    public boolean CMR(float f, long j, boolean z, boolean z2) {
        long j2;
        long j3;
        C26185Cu9 cu9;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (!z) {
            if (!this.A0B || (cu9 = this.A0F) == null) {
                j2 = this.A04;
            } else {
                int i = 2;
                if (this.A0A) {
                    i = 6;
                }
                j2 = (long) (C26185Cu9.A00(cu9, i) * 1000);
            }
            j3 = (long) (((float) j2) * 1.0f);
        } else if (z2) {
            j3 = (long) (C26185Cu9.A00(this.A0F, 9) * 1000);
        } else {
            j3 = A00();
        }
        if (j3 > 0 && j < j3 && (this.A0Q || this.A0J.A00() < this.A0D)) {
            return false;
        }
        this.A0T = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A01();
        return true;
    }

    public C26657D8g(C25215CbB cbB, C91 c91, C25686CkH ckH, C24788CKh cKh, C26185Cu9 cu9, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean A1C = C108975cc.A1C(i, 0);
        String A1H = AnonymousClass001.A1H(" cannot be less than ", "0", AnonymousClass000.A11("mBufferForPlaybackMs"));
        if (A1C) {
            boolean A1C2 = C108975cc.A1C(i2, 0);
            String A1H2 = AnonymousClass001.A1H(" cannot be less than ", "0", AnonymousClass000.A11("mBufferForPlaybackAfterRebufferMs"));
            if (A1C2) {
                this.A0J = cbB;
                this.A04 = ((long) i) * 1000;
                this.A03 = ((long) i2) * 1000;
                this.A0F = cu9;
                this.A0I = i3;
                this.A01 = i4;
                this.A00 = i5;
                this.A0C = z;
                this.A0Q = z2;
                this.A0H = z3;
                this.A0L = ckH;
                this.A0K = c91;
                this.A0M = cKh;
                this.A0G = atomicBoolean;
                this.A0N = atomicBoolean2;
                this.A0A = z4;
                this.A0B = z5;
                this.A0R = z6;
                this.A0P = z7;
                this.A0S = z8;
                this.A0O = z9;
                return;
            }
            throw BE8.A0W(A1H2);
        }
        throw BE8.A0W(A1H);
    }
}
