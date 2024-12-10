package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Cue  reason: case insensitive filesystem */
public final class C26206Cue {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public BOK A06;
    public C26013CqU A07;
    public C25732Cl2 A08;
    public E9e A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public final Looper A0H;
    public final D9J A0I;
    public final C25746ClG A0J;
    public final C28617EAp A0K;
    public final C25717Ckn A0L;
    public final CopyOnWriteArraySet A0M;
    public final Handler A0N;
    public final Handler A0O;
    public final C25197Cao A0P;
    public final C5B A0Q;
    public final CSJ A0R;
    public final ECg[] A0S;

    public void A0A(long j) {
        this.A0D = true;
        this.A02++;
        this.A04 = j;
        D9J d9j = this.A0I;
        C25199Caq caq = this.A07.A04;
        UUID uuid = C24736CHy.A04;
        C25646Cjc.A00(d9j.A0g, new C24838CMg(caq, Util.A04(j)), 17);
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((CZC) it.next()).A00(1);
        }
    }

    public void A0B(E9e e9e, boolean z, boolean z2) {
        this.A06 = null;
        this.A09 = e9e;
        C26013CqU A012 = A01(2, z, z2);
        this.A0C = true;
        this.A02++;
        C25936Cp1 cp1 = this.A0I.A0g;
        C25646Cjc A002 = C25936Cp1.A00();
        A002.A00 = cp1.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, e9e);
        A002.A01 = cp1;
        A002.A01();
        A02(this, A012, 5, 1, false, false);
    }

    public void A0C(boolean z) {
        if (z) {
            this.A06 = null;
            this.A09 = null;
        }
        C26013CqU A012 = A01(1, z, z);
        this.A02++;
        C25936Cp1 cp1 = this.A0I.A0g;
        C25646Cjc A002 = C25936Cp1.A00();
        A002.A00 = cp1.A00.obtainMessage(6, z ? 1 : 0, 0);
        A002.A01 = cp1;
        A002.A01();
        A02(this, A012, 5, 1, false, false);
    }

    public static long A00(C26206Cue cue, long j) {
        UUID uuid = C24736CHy.A04;
        long A052 = Util.A05(j);
        C26013CqU cqU = cue.A07;
        C25199Caq caq = cqU.A04;
        if (caq.A00 == -1) {
            cqU.A03.A08(cue.A0P, caq.A02, false);
        }
        return A052;
    }

    private C26013CqU A01(int i, boolean z, boolean z2) {
        int i2;
        long A002;
        long A052;
        Timeline timeline;
        Object obj;
        C26539D3a d3a;
        CSJ csj;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            A052 = 0;
            this.A05 = 0;
        } else {
            this.A01 = A04();
            boolean A032 = A03(this);
            if (A032) {
                i2 = this.A00;
            } else {
                i2 = this.A07.A04.A02;
            }
            this.A00 = i2;
            if (A032) {
                A002 = this.A05;
            } else {
                A002 = A00(this, this.A07.A0D);
            }
            this.A05 = A002;
            if (A03(this)) {
                A052 = this.A04;
            } else {
                long j = this.A07.A0D;
                UUID uuid = C24736CHy.A04;
                A052 = Util.A05(j);
            }
        }
        this.A04 = A052;
        if (z2) {
            timeline = Timeline.A00;
            obj = null;
        } else {
            C26013CqU cqU = this.A07;
            timeline = cqU.A03;
            obj = cqU.A08;
        }
        C26013CqU cqU2 = this.A07;
        C25199Caq caq = cqU2.A04;
        long j2 = cqU2.A02;
        long j3 = cqU2.A01;
        if (z2) {
            d3a = C26539D3a.A03;
            csj = this.A0R;
        } else {
            d3a = cqU2.A05;
            csj = cqU2.A06;
        }
        return new C26013CqU(timeline, caq, d3a, csj, AnonymousClass00R.A00, obj, i, j2, j3, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if ("waslive_quickdashv2".equals(((X.CUI) r9).A07) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A08 != r3.A08) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        r2 = (X.CW8) r1.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C26206Cue r25, X.C26013CqU r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            r6 = r25
            X.CqU r4 = r6.A07
            com.facebook.android.exoplayer2.Timeline r1 = r4.A03
            r3 = r26
            com.facebook.android.exoplayer2.Timeline r0 = r3.A03
            r22 = 0
            if (r1 != r0) goto L_0x0015
            java.lang.Object r1 = r4.A08
            java.lang.Object r0 = r3.A08
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            int r1 = r4.A00
            int r0 = r3.A00
            boolean r21 = X.AnonymousClass000.A1S(r1, r0)
            boolean r1 = r4.A0A
            boolean r0 = r3.A0A
            boolean r20 = X.AnonymousClass000.A1S(r1, r0)
            X.CSJ r1 = r4.A06
            X.CSJ r0 = r3.A06
            if (r1 == r0) goto L_0x002e
            r22 = 1
        L_0x002e:
            r6.A07 = r3
            if (r2 != 0) goto L_0x0034
            if (r28 != 0) goto L_0x0223
        L_0x0034:
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r19 = r0.iterator()
        L_0x003a:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r8 = r19.next()
            X.CZC r8 = (X.CZC) r8
            X.CqU r0 = r6.A07
            com.facebook.android.exoplayer2.Timeline r3 = r0.A03
            java.lang.Object r9 = r0.A08
            X.Cuc r4 = r8.A05
            boolean r0 = r9 instanceof X.CUI
            if (r0 == 0) goto L_0x003a
            int r0 = r3.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r4.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r1.next()
            X.E9x r0 = (X.C28606E9x) r0
            r0.C8e()
            goto L_0x0062
        L_0x0072:
            X.DRp r15 = r4.A0O
            boolean r0 = r15.enableQuickDashPlayback
            r5 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0088
            r0 = r9
            X.CUI r0 = (X.CUI) r0
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "waslive_quickdashv2"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            X.CbZ r0 = r4.A09
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0096
            if (r1 != 0) goto L_0x0096
            goto L_0x003a
        L_0x0096:
            X.ClG r2 = r8.A04
            r0 = 0
            r3.A09(r2, r7, r0)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2.A03
            long r0 = r0 + r2
            long r0 = r0 / r10
            long r2 = r8.A01
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x013b
            r8.A01 = r0
            X.CKo r2 = r4.A0L
            X.Cyh r4 = r2.A00
            android.os.Handler r14 = r4.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r7] = r0
            r0 = 0
            r2[r5] = r0
            r0 = 15
            X.BE7.A17(r14, r4, r2, r0)
            r8.A00 = r7
        L_0x00c1:
            X.CUI r9 = (X.CUI) r9
            r8.A02 = r9
            if (r9 == 0) goto L_0x003a
            boolean r0 = r9.A0B
            r11 = 0
            if (r0 == 0) goto L_0x015d
            java.util.List r1 = r9.A09
            int r0 = r1.size()
            if (r0 < r5) goto L_0x015d
            java.lang.Object r2 = r1.get(r7)
            X.CW8 r2 = (X.CW8) r2
            int r1 = r2.A00()
            r0 = -1
            if (r1 == r0) goto L_0x015d
            java.util.List r0 = r2.A01
            java.lang.Object r0 = r0.get(r1)
            X.CR8 r0 = (X.CR8) r0
            java.util.List r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x015d
            java.lang.Object r1 = r1.get(r7)
            X.CPE r1 = (X.CPE) r1
            long r12 = r9.A04
            boolean r0 = r1 instanceof X.BP2
            if (r0 != 0) goto L_0x015d
            X.BP1 r1 = (X.BP1) r1
            X.BP5 r0 = r1.A00
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.List r0 = r0.A04
            java.util.Iterator r18 = r0.iterator()
            r16 = r12
        L_0x010d:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r9 = r18.next()
            X.CX5 r9 = (X.CX5) r9
            long r2 = r9.A04
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0132
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r11.add(r0)
        L_0x0132:
            long r0 = r9.A03
            int r9 = r9.A02
            long r9 = (long) r9
            long r0 = r0 * r9
            long r16 = r2 + r0
            goto L_0x010d
        L_0x013b:
            int r2 = r8.A00
            int r3 = r2 + 1
            r8.A00 = r3
            X.CKo r2 = r4.A0L
            X.Cyh r4 = r2.A00
            android.os.Handler r14 = r4.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r7] = r0
            long r0 = (long) r3
            r2[r5] = r0
            r0 = 15
            X.BE7.A17(r14, r4, r2, r0)
            goto L_0x00c1
        L_0x0156:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x015d
            r11 = 0
        L_0x015d:
            java.util.List r0 = r8.A03
            if (r0 != 0) goto L_0x01e0
            if (r11 != 0) goto L_0x01ec
        L_0x0163:
            r8.A03 = r11
            X.CUI r0 = r8.A02
            long[] r2 = X.CA7.A00(r0)
            X.CUI r0 = r8.A02
            java.lang.String r1 = X.C26205Cuc.A00(r0)
            java.util.LinkedList r18 = X.AnonymousClass8BR.A14()
            if (r1 == 0) goto L_0x0184
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0184
            r0 = r18
            r0.add(r1)
        L_0x0184:
            X.CUI r9 = r8.A02
            long r0 = r9.A02
            r25 = r0
            long r15 = r9.A04
            long r12 = r9.A00
            long r10 = r9.A03
            boolean r0 = r9.A0D
            r24 = r0
            r7 = r2[r7]
            r2 = r2[r5]
            boolean r0 = r9.A0A
            r23 = r0
            java.lang.String r0 = r9.A08
            r17 = r0
            r0 = 11
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r0 = r25
            X.BE8.A1N(r9, r0)
            r0 = r15
            X.AnonymousClass3MX.A1S(r9, r5, r0)
            r0 = 2
            X.AnonymousClass3MX.A1S(r9, r0, r12)
            r0 = 3
            X.AnonymousClass3MX.A1S(r9, r0, r10)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C17890vO.A1P(r9, r0)
            r1 = 5
            r0 = r24
            X.AnonymousClass8BR.A1L(r9, r1, r0)
            r0 = 6
            X.AnonymousClass3MX.A1S(r9, r0, r7)
            r0 = 7
            X.AnonymousClass3MX.A1S(r9, r0, r2)
            r1 = 8
            r0 = r23
            X.AnonymousClass8BR.A1L(r9, r1, r0)
            r0 = 9
            r9[r0] = r18
            r0 = 10
            r9[r0] = r17
            r0 = 17
            X.BE7.A17(r14, r4, r9, r0)
            goto L_0x003a
        L_0x01e0:
            if (r11 == 0) goto L_0x0163
            int r1 = r0.size()
            int r0 = r11.size()
            if (r1 == r0) goto L_0x0163
        L_0x01ec:
            int r1 = r11.size()
            int r0 = r15.maxNumGapsToNotify
            if (r1 <= r0) goto L_0x021c
            int r2 = r11.size()
            X.CbZ r0 = r4.A10
            if (r0 != 0) goto L_0x0215
            r0 = 0
        L_0x01fd:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.BE8.A1A(r0, r1, r7, r2, r5)
            java.lang.String r0 = "Too many gaps received for videoId %s. NumGaps: %d"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.DGM r2 = r4.A0o
            java.lang.String r1 = "MANIFEST"
            java.lang.String r0 = "MANIFEST_GAPS_RECEIVED_MORE_THAN_EXPECTED"
            r2.CAR(r1, r0, r3)
            goto L_0x0163
        L_0x0215:
            X.CbZ r0 = r4.A10
            X.D47 r0 = r0.A0C
            java.lang.String r0 = r0.A0H
            goto L_0x01fd
        L_0x021c:
            r0 = 21
            X.BE7.A17(r14, r4, r11, r0)
            goto L_0x0163
        L_0x0223:
            if (r29 == 0) goto L_0x023d
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x022b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r0 = r1.next()
            X.CZC r0 = (X.CZC) r0
            r2 = r27
            r0.A00(r2)
            goto L_0x022b
        L_0x023d:
            if (r22 == 0) goto L_0x02cc
            X.C5B r1 = r6.A0Q
            X.CqU r0 = r6.A07
            X.CSJ r0 = r0.A06
            java.lang.Object r0 = r0.A02
            X.BPD r1 = (X.BPD) r1
            X.CXB r0 = (X.CXB) r0
            r1.A00 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r9 = r0.iterator()
        L_0x0253:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r2 = r9.next()
            X.CZC r2 = (X.CZC) r2
            X.CqU r0 = r6.A07
            X.D3a r3 = r0.A05
            X.CSJ r0 = r0.A06
            X.ECj[] r1 = r0.A04
            X.CYC r0 = new X.CYC
            r0.<init>(r1)
            X.Cuc r5 = r2.A05
            X.BPD r0 = r5.A06
            if (r0 == 0) goto L_0x02b6
            X.CXB r8 = r0.A00
            if (r8 == 0) goto L_0x02b6
            r0 = 2
            int r0 = r8.A00(r0)
            java.lang.String r4 = ""
            r7 = 1
            if (r0 != r7) goto L_0x0298
            java.util.List r0 = r5.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x0286:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0298
            java.lang.Object r1 = r2.next()
            X.E9x r1 = (X.C28606E9x) r1
            X.C0Q r0 = X.C0Q.A0C
            r1.CAS(r0, r4)
            goto L_0x0286
        L_0x0298:
            int r0 = r8.A00(r7)
            if (r0 != r7) goto L_0x02b6
            java.util.List r0 = r5.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x02a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r1 = r2.next()
            X.E9x r1 = (X.C28606E9x) r1
            X.C0Q r0 = X.C0Q.A0B
            r1.CAS(r0, r4)
            goto L_0x02a4
        L_0x02b6:
            java.util.List r0 = r5.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x02bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0253
            java.lang.Object r0 = r1.next()
            X.E9x r0 = (X.C28606E9x) r0
            r0.C93(r3)
            goto L_0x02bc
        L_0x02cc:
            if (r20 == 0) goto L_0x02de
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x02d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02de
            r1.next()
            goto L_0x02d4
        L_0x02de:
            if (r21 == 0) goto L_0x02fc
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r3 = r0.iterator()
        L_0x02e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r2 = r3.next()
            X.CZC r2 = (X.CZC) r2
            boolean r1 = r6.A0F
            X.CqU r0 = r6.A07
            int r0 = r0.A00
            r2.A01(r1, r0)
            goto L_0x02e6
        L_0x02fc:
            if (r30 == 0) goto L_0x030e
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0304:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x030e
            r1.next()
            goto L_0x0304
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26206Cue.A02(X.Cue, X.CqU, int, int, boolean, boolean):void");
    }

    public static boolean A03(C26206Cue cue) {
        if (AnonymousClass000.A1P(cue.A07.A03.A01()) || cue.A02 > 0) {
            return true;
        }
        return false;
    }

    public long A05() {
        C26013CqU cqU = this.A07;
        Timeline timeline = cqU.A03;
        if (AnonymousClass000.A1P(timeline.A01())) {
            return -9223372036854775807L;
        }
        if (!A03(this)) {
            C25199Caq caq = cqU.A04;
            if (caq.A00 != -1) {
                timeline.A08(this.A0P, caq.A02, false);
                UUID uuid = C24736CHy.A04;
                return -9223372036854775807L;
            }
        }
        return Util.A05(timeline.A09(this.A0J, A04(), 0).A03);
    }

    public C25257Cbw A06(C28491E3w e3w) {
        IllegalStateException A0k;
        if (this.A0A) {
            C25717Ckn ckn = this.A0L;
            synchronized (ckn) {
                boolean z = false;
                while (!ckn.A00) {
                    try {
                        ckn.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    AnonymousClass8BS.A0x();
                }
            }
            Thread currentThread = Thread.currentThread();
            Looper looper = this.A0H;
            if (currentThread != looper.getThread()) {
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = currentThread.getName();
                A1b[1] = looper.getThread().getName();
                String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", A1b);
                if (this.A0B) {
                    A0k = null;
                } else {
                    A0k = BE6.A0k();
                }
                Log.w("ExoPlayerImpl", format, A0k);
                this.A0B = true;
            }
        }
        int A042 = A04();
        D9J d9j = this.A0I;
        Timeline timeline = this.A07.A03;
        if (A042 == -1) {
            A042 = 0;
        }
        return new C25257Cbw(d9j.A0W.getLooper(), d9j, e3w, timeline, this.A0K, A042);
    }

    public void A08(int i) {
        if (this.A0G != i) {
            this.A0G = i;
            C25936Cp1 cp1 = this.A0I.A0g;
            C25646Cjc A002 = C25936Cp1.A00();
            A002.A00 = cp1.A00.obtainMessage(12, i, 0);
            A002.A01 = cp1;
            A002.A01();
            Iterator it = this.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r3.A04.A00 == -1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r19, long r20) {
        /*
            r18 = this;
            r5 = r18
            X.CqU r3 = r5.A07
            com.facebook.android.exoplayer2.Timeline r10 = r3.A03
            r13 = r19
            r0 = r20
            if (r19 < 0) goto L_0x00b8
            int r2 = r10.A01()
            boolean r9 = X.AnonymousClass000.A1P(r2)
            if (r9 != 0) goto L_0x001c
            int r2 = r10.A01()
            if (r13 >= r2) goto L_0x00b8
        L_0x001c:
            r4 = 1
            r5.A0D = r4
            int r2 = r5.A02
            int r2 = r2 + 1
            r5.A02 = r2
            boolean r2 = A03(r5)
            if (r2 != 0) goto L_0x0033
            X.Caq r2 = r3.A04
            int r6 = r2.A00
            r3 = -1
            r2 = 1
            if (r6 != r3) goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r8 = 0
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "ExoPlayerImpl"
            java.lang.String r0 = "seekTo ignored because an ad is playing"
            android.util.Log.w(r1, r0)
            android.os.Handler r2 = r5.A0N
            r1 = -1
            X.CqU r0 = r5.A07
            android.os.Message r0 = r2.obtainMessage(r8, r4, r1, r0)
            r0.sendToTarget()
        L_0x004a:
            return
        L_0x004b:
            r5.A01 = r13
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0089
            if (r2 != 0) goto L_0x0087
            r2 = 0
        L_0x005a:
            r5.A05 = r2
            r5.A00 = r8
        L_0x005e:
            X.D9J r3 = r5.A0I
            java.util.UUID r2 = X.C24736CHy.A04
            long r0 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            X.Cp1 r3 = r3.A0g
            X.CP6 r2 = new X.CP6
            r2.<init>(r10, r13, r0)
            r0 = 3
            X.C25646Cjc.A00(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0077:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.CZC r0 = (X.CZC) r0
            r0.A00(r4)
            goto L_0x0077
        L_0x0087:
            r2 = r0
            goto L_0x005a
        L_0x0089:
            if (r2 != 0) goto L_0x00b1
            X.ClG r6 = r5.A0J
            r2 = 0
            X.ClG r2 = r10.A09(r6, r13, r2)
            long r14 = r2.A02
        L_0x0095:
            X.ClG r12 = r5.A0J
            X.Cao r11 = r5.A0P
            r16 = 0
            android.util.Pair r6 = r10.A07(r11, r12, r13, r14, r16)
            X.C26056CrS.A01(r6)
            java.util.UUID r2 = X.C24736CHy.A04
            long r2 = com.facebook.android.exoplayer2.util.Util.A05(r14)
            r5.A05 = r2
            int r2 = X.C108965cb.A01(r6)
            r5.A00 = r2
            goto L_0x005e
        L_0x00b1:
            java.util.UUID r2 = X.C24736CHy.A04
            long r14 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            goto L_0x0095
        L_0x00b8:
            X.C2m r2 = new X.C2m
            r2.<init>(r10, r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26206Cue.A09(int, long):void");
    }

    public int A04() {
        if (A03(this)) {
            return this.A01;
        }
        C26013CqU cqU = this.A07;
        return cqU.A03.A08(this.A0P, cqU.A04.A02, false).A00;
    }

    public void A07() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        BEA.A1K(this, "Release ", A10);
        A10.append(" [");
        A10.append("ExoPlayerLib/2.8.1");
        A10.append("] [");
        A10.append(Util.A02);
        A10.append("] [");
        synchronized (C25926Cop.class) {
            str = C25926Cop.A00;
        }
        Log.i("ExoPlayerImpl", BEA.A0m(str, A10));
        this.A09 = null;
        D9J d9j = this.A0I;
        synchronized (d9j) {
            if (!d9j.A0N) {
                d9j.A0g.A00.sendEmptyMessage(7);
                boolean z = false;
                while (!d9j.A0N) {
                    try {
                        d9j.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    AnonymousClass8BS.A0x();
                }
            }
        }
        this.A0N.removeCallbacksAndMessages((Object) null);
        this.A07 = A01(1, false, false);
    }

    public C26206Cue(EAG eag, C5B c5b, C28409E0a e0a, C28617EAp eAp, ECg[] eCgArr, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Looper mainLooper;
        StringBuilder A10 = AnonymousClass000.A10();
        BEA.A1K(this, "Init ", A10);
        A10.append(" [");
        A10.append("ExoPlayerLib/2.8.1");
        A10.append("] [");
        Log.i("ExoPlayerImpl", BEA.A0m(Util.A02, A10));
        C25717Ckn ckn = new C25717Ckn();
        this.A0L = ckn;
        try {
            this.A0A = z14;
            ECg[] eCgArr2 = eCgArr;
            int length = eCgArr2.length;
            C26056CrS.A03(AnonymousClass000.A1R(length));
            this.A0S = eCgArr2;
            C5B c5b2 = c5b;
            C26056CrS.A01(c5b2);
            this.A0Q = c5b2;
            this.A0E = false;
            this.A0G = 0;
            this.A0M = new CopyOnWriteArraySet();
            CSJ csj = new CSJ(C25716Ckm.A01, (Object) null, new C25715Ckl[length], new C28650ECj[length]);
            this.A0R = csj;
            this.A0J = new C25746ClG();
            this.A0P = new C25197Cao();
            this.A08 = C25732Cl2.A05;
            this.A0H = Looper.myLooper();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            C22618BFz bFz = new C22618BFz(mainLooper, this, 1);
            this.A0N = bFz;
            C28617EAp eAp2 = eAp;
            this.A0K = eAp2;
            this.A07 = new C26013CqU(Timeline.A00, C26539D3a.A03, csj, 0);
            boolean z15 = this.A0E;
            boolean z16 = z3;
            boolean z17 = z2;
            boolean z18 = z;
            long j2 = j;
            int i2 = i;
            boolean z19 = z11;
            boolean z20 = z10;
            boolean z21 = z9;
            boolean z22 = z8;
            C28409E0a e0a2 = e0a;
            boolean z23 = z7;
            EAG eag2 = eag;
            boolean z24 = z6;
            boolean z25 = z15;
            D9J d9j = new D9J(bFz, this, eag2, C25935Cp0.A01, c5b2, csj, e0a2, eAp2, eCgArr2, this.A0G, i2, j2, z25, z18, z17, z16, z4, z5, z24, z23, z22, z21, z20, z19, z12, z13);
            this.A0I = d9j;
            this.A0O = new Handler(d9j.A0W.getLooper());
            ckn.A01();
        } catch (Throwable th) {
            this.A0L.A01();
            throw th;
        }
    }
}
