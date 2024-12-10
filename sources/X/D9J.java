package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class D9J implements C28648ECh, Handler.Callback, C28493E3y {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public C24838CMg A07;
    public CP6 A08;
    public C26013CqU A09;
    public ECg A0A;
    public C25721Ckr A0B;
    public E9e A0C;
    public Integer A0D = AnonymousClass00R.A00;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public ECg[] A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final long A0T;
    public final long A0U;
    public final Handler A0V;
    public final HandlerThread A0W;
    public final DA2 A0X;
    public final C26206Cue A0Y;
    public final CWR A0Z;
    public final EAG A0a;
    public final C26244Cvi A0b;
    public final C25197Cao A0c;
    public final C25746ClG A0d;
    public final C5B A0e;
    public final DA0 A0f;
    public final C25936Cp1 A0g;
    public final DA1 A0h;
    public final ArrayList A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final ECg[] A0o;
    public final E7M[] A0p;
    public final CSJ A0q;
    public final C28409E0a A0r;
    public final C28617EAp A0s;

    private int A00(Timeline timeline, Timeline timeline2, int i) {
        Timeline timeline3 = timeline;
        int i2 = i;
        int A002 = timeline.A00();
        int i3 = -1;
        for (int i4 = 0; i4 < A002 && i3 == -1; i4++) {
            C25197Cao cao = this.A0c;
            i2 = timeline3.A03(cao, this.A0d, i2, this.A03, this.A0O);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.A04(timeline.A08(cao, i2, true).A03);
        }
        return i3;
    }

    private void A06() {
        this.A0M = false;
        DA0 da0 = this.A0X.A02;
        if (!da0.A02) {
            da0.A00 = SystemClock.elapsedRealtime();
            da0.A02 = true;
        }
        DA0 da02 = this.A0f;
        if (!da02.A02) {
            da02.A00 = SystemClock.elapsedRealtime();
            da02.A02 = true;
        }
        if (this.A0n) {
            DA1 da1 = this.A0h;
            synchronized (da1) {
                if (!da1.A01) {
                    da1.A00 = SystemClock.elapsedRealtime();
                    da1.A01 = true;
                }
            }
        }
        for (ECg eCg : this.A0P) {
            C26659D8i d8i = (C26659D8i) eCg;
            C26056CrS.A03(C17890vO.A1R(d8i.A01));
            d8i.A01 = 2;
            d8i.A0E();
        }
    }

    public static void A0F(C25257Cbw cbw) {
        synchronized (cbw) {
        }
        try {
            cbw.A08.BcJ(cbw.A01, cbw.A04);
        } finally {
            cbw.A03(true);
        }
    }

    private void A0I(boolean z) {
        C25199Caq caq = this.A0b.A05.A02.A04;
        long A012 = A01(caq, this.A09.A0D, false, true);
        if (A012 != this.A09.A0D) {
            C26013CqU cqU = this.A09;
            this.A09 = cqU.A01(caq, A012, cqU.A01);
            if (z) {
                this.A0Z.A00(5);
            }
        }
    }

    private void A0K(boolean z, boolean z2) {
        A0L(true, z, z);
        this.A0Z.A01 += this.A02 + (z2 ? 1 : 0);
        this.A02 = 0;
        this.A0a.C78();
        A0A(1);
    }

    private Pair A02(CP6 cp6, boolean z) {
        int A002;
        Timeline timeline = this.A09.A03;
        Timeline timeline2 = cp6.A02;
        if (!AnonymousClass000.A1P(timeline.A01())) {
            if (AnonymousClass000.A1P(timeline2.A01())) {
                timeline2 = timeline;
            }
            try {
                C25746ClG clG = this.A0d;
                C25197Cao cao = this.A0c;
                Pair A072 = timeline2.A07(cao, clG, cp6.A00, cp6.A01, 0);
                C26056CrS.A01(A072);
                if (timeline == timeline2) {
                    return A072;
                }
                int A042 = timeline.A04(timeline2.A08(cao, C108965cb.A01(A072), true).A03);
                if (A042 != -1) {
                    return Pair.create(Integer.valueOf(A042), A072.second);
                }
                if (z && (A002 = A00(timeline2, timeline, C108965cb.A01(A072))) != -1) {
                    return A03(timeline, timeline.A08(cao, A002, false).A00);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C24413C2m(timeline, cp6.A00, cp6.A01);
            }
        }
        return null;
    }

    private Pair A03(Timeline timeline, int i) {
        Timeline timeline2 = timeline;
        Pair A072 = timeline2.A07(this.A0c, this.A0d, i, -9223372036854775807L, 0);
        C26056CrS.A01(A072);
        return A072;
    }

    private void A04() {
        int i;
        CWR cwr = this.A0Z;
        C26013CqU cqU = this.A09;
        if (cqU != cwr.A02 || cwr.A01 > 0 || cwr.A03) {
            Handler handler = this.A0V;
            int i2 = cwr.A01;
            if (cwr.A03) {
                i = cwr.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, cqU).sendToTarget();
            cwr.A02 = this.A09;
            cwr.A01 = 0;
            cwr.A03 = false;
        }
    }

    private void A05() {
        C26244Cvi cvi = this.A0b;
        C25237CbY cbY = cvi.A04;
        C25237CbY cbY2 = cvi.A06;
        if (cbY != null && !cbY.A07) {
            if (cbY2 == null || cbY2.A01 == cbY) {
                ECg[] eCgArr = this.A0P;
                int length = eCgArr.length;
                int i = 0;
                while (i < length) {
                    if (eCgArr[i].Bco()) {
                        i++;
                    } else {
                        return;
                    }
                }
                cbY.A08.BjV();
            }
        }
    }

    private void A07() {
        this.A0X.A02.A00();
        this.A0f.A00();
        if (this.A0n) {
            this.A0h.A00();
        }
        for (ECg eCg : this.A0P) {
            C26659D8i d8i = (C26659D8i) eCg;
            if (d8i.A01 == 2) {
                d8i.A01 = 1;
                d8i.A0F();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r3 == Long.MIN_VALUE) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r10 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r10.A02 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        if (r10.A00 != r7) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        if (r0 <= r2) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        if (r0 > r4) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        A0E(r10.A03);
        r1 = r13.A01;
        r8.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r1 >= r8.size()) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r10 = (X.DS8) r8.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08() {
        /*
            r13 = this;
            X.Cvi r0 = r13.A0b
            X.CbY r6 = r0.A05
            if (r6 == 0) goto L_0x004f
            X.ECi r0 = r6.A08
            long r9 = r0.CDQ()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r13.A0B(r9)
            X.CqU r0 = r13.A09
            long r1 = r0.A0D
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            X.CqU r7 = r13.A09
            X.Caq r8 = r7.A04
            long r11 = r7.A01
            X.CqU r0 = r7.A01(r8, r9, r11)
            r13.A09 = r0
            X.CWR r1 = r13.A0Z
            r0 = 5
            r1.A00(r0)
        L_0x0032:
            X.CqU r5 = r13.A09
            X.ECg[] r0 = r13.A0P
            int r0 = r0.length
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0050
            X.CTA r0 = r6.A02
            long r3 = r0.A03
        L_0x0041:
            r5.A0C = r3
            X.CqU r3 = r13.A09
            long r1 = r3.A0D
            X.ECi r0 = r6.A08
            long r0 = r0.BNp(r1)
            r3.A0B = r0
        L_0x004f:
            return
        L_0x0050:
            X.ECi r0 = r6.A08
            long r3 = r0.BNq()
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
        L_0x005c:
            X.CTA r0 = r6.A02
            long r3 = r0.A01
            goto L_0x0041
        L_0x0061:
            X.DA2 r1 = r13.A0X
            X.ECg r0 = r1.A00
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.Bed()
            if (r0 != 0) goto L_0x00cc
            X.ECg r0 = r1.A00
            boolean r0 = r0.Bg8()
            if (r0 != 0) goto L_0x007d
            X.ECg r0 = r1.A00
            boolean r0 = r0.Bco()
            if (r0 != 0) goto L_0x00cc
        L_0x007d:
            X.DA2.A00(r1)
            X.E8d r0 = r1.A01
            long r4 = r0.BXM()
        L_0x0086:
            r13.A06 = r4
            long r0 = r6.A00
            long r4 = r4 - r0
            X.CqU r0 = r13.A09
            long r2 = r0.A0D
            java.util.ArrayList r8 = r13.A0i
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0121
            X.CqU r7 = r13.A09
            X.Caq r9 = r7.A04
            int r1 = r9.A00
            r0 = -1
            if (r1 != r0) goto L_0x0121
            long r0 = r7.A02
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00a9
            r0 = 1
            long r2 = r2 - r0
        L_0x00a9:
            int r7 = r9.A02
            int r11 = r13.A01
        L_0x00ad:
            if (r11 <= 0) goto L_0x00d3
            int r0 = r11 + -1
            java.lang.Object r1 = r8.get(r0)
            X.DS8 r1 = (X.DS8) r1
            if (r1 == 0) goto L_0x00d3
            int r0 = r1.A00
            if (r0 > r7) goto L_0x00c7
            int r0 = r1.A00
            if (r0 != r7) goto L_0x00d3
            long r0 = r1.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d3
        L_0x00c7:
            int r11 = r11 + -1
            r13.A01 = r11
            goto L_0x00ad
        L_0x00cc:
            X.DA0 r0 = r1.A02
            long r4 = r0.BXM()
            goto L_0x0086
        L_0x00d3:
            int r0 = r8.size()
            if (r11 >= r0) goto L_0x0121
            java.lang.Object r10 = r8.get(r11)
            X.DS8 r10 = (X.DS8) r10
            if (r10 == 0) goto L_0x0121
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x00f8
            int r0 = r10.A00
            if (r0 < r7) goto L_0x00f1
            if (r0 != r7) goto L_0x00f8
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00f8
        L_0x00f1:
            int r11 = r11 + 1
            r13.A01 = r11
            goto L_0x00d3
        L_0x00f6:
            if (r10 == 0) goto L_0x0121
        L_0x00f8:
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x0121
            int r0 = r10.A00
            if (r0 != r7) goto L_0x0121
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0121
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0121
            X.Cbw r0 = r10.A03
            r13.A0E(r0)
            int r1 = r13.A01
            r8.remove(r1)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0121
            java.lang.Object r10 = r8.get(r1)
            X.DS8 r10 = (X.DS8) r10
            goto L_0x00f6
        L_0x0121:
            X.CqU r0 = r13.A09
            r0.A0D = r4
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9J.A08():void");
    }

    private void A09(byte b, boolean z) {
        C25237CbY cbY = this.A0b.A04;
        if (cbY != null && this.A0S) {
            cbY.A08.CQr(b, z);
        }
    }

    private void A0A(int i) {
        long j;
        C26013CqU cqU = this.A09;
        int i2 = i;
        if (cqU.A00 != i2) {
            Timeline timeline = cqU.A03;
            Object obj = cqU.A08;
            C26013CqU cqU2 = new C26013CqU(timeline, cqU.A04, cqU.A05, cqU.A06, cqU.A07, obj, i2, cqU.A02, cqU.A01, cqU.A0A, cqU.A09);
            C26013CqU.A00(cqU, cqU2);
            this.A09 = cqU2;
            if (i2 == 2) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            this.A04 = j;
        }
    }

    private void A0B(long j) {
        C25237CbY cbY = this.A0b.A05;
        if (AnonymousClass000.A1W(cbY)) {
            j += cbY.A00;
        }
        this.A06 = j;
        this.A0X.A02.A01(j);
        for (ECg eCg : this.A0P) {
            long j2 = this.A06;
            C26659D8i d8i = (C26659D8i) eCg;
            d8i.A08 = false;
            d8i.A02 = j2;
            d8i.A0I(j2, false);
        }
    }

    private void A0C(C24838CMg cMg, boolean z) {
        CWR cwr = this.A0Z;
        boolean z2 = true;
        cwr.A01++;
        C24838CMg cMg2 = cMg;
        C25199Caq caq = cMg2.A01;
        long j = cMg2.A00;
        boolean A1P = AnonymousClass000.A1P((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1)));
        try {
            if (this.A0C == null || this.A02 > 0) {
                this.A07 = cMg2;
                this.A08 = null;
            } else {
                long j2 = j;
                C26244Cvi cvi = this.A0b;
                C25237CbY cbY = cvi.A05;
                boolean z3 = z;
                if (!(z || cbY == null || j == 0)) {
                    j2 = cbY.A08.BMc(this.A0B, j);
                }
                UUID uuid = C24736CHy.A04;
                if (Util.A05(j2) != Util.A05(this.A09.A0D)) {
                    j = A01(caq, j2, z3, AnonymousClass3Ma.A1Z(cvi.A05, cvi.A06));
                    if (j == j) {
                        z2 = false;
                    }
                    A1P |= z2;
                }
            }
        } finally {
            this.A09 = this.A09.A01(caq, j, j);
            if (A1P) {
                cwr.A00(2);
            }
        }
    }

    private void A0D(C25237CbY cbY) {
        C25237CbY cbY2 = this.A0b.A05;
        if (cbY2 != null && cbY != cbY2) {
            ECg[] eCgArr = this.A0o;
            int length = eCgArr.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                ECg eCg = eCgArr[i2];
                zArr[i2] = AnonymousClass000.A1O(((C26659D8i) eCg).A01);
                C25715Ckl[] cklArr = cbY2.A05.A03;
                if (cklArr[i2] != null) {
                    i++;
                }
                if (zArr[i2]) {
                    if (cklArr[i2] != null) {
                        C26659D8i d8i = (C26659D8i) eCg;
                        if (d8i.A08) {
                            if (d8i.A06 != cbY.A0B[i2]) {
                            }
                        }
                    }
                    A0G(eCg);
                }
            }
            this.A09 = this.A09.A02(cbY2.A03, cbY2.A05);
            A0M(zArr, i);
        }
    }

    private void A0E(C25257Cbw cbw) {
        Looper looper = cbw.A03;
        C25936Cp1 cp1 = this.A0g;
        Handler handler = cp1.A00;
        if (looper == handler.getLooper()) {
            A0F(cbw);
            int i = this.A09.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        C25646Cjc.A00(cp1, cbw, 15);
    }

    private void A0G(ECg eCg) {
        DA2 da2 = this.A0X;
        if (eCg == da2.A00) {
            da2.A01 = null;
            da2.A00 = null;
        }
        C26659D8i d8i = (C26659D8i) eCg;
        if (d8i.A01 == 2) {
            d8i.A01 = 1;
            d8i.A0F();
        }
        C26056CrS.A03(C17890vO.A1R(d8i.A01));
        d8i.A0C.A00 = null;
        d8i.A01 = 0;
        d8i.A06 = null;
        d8i.A0A = null;
        d8i.A08 = false;
        d8i.A0H();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r16 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(boolean r16) {
        /*
            r15 = this;
            X.Cvi r4 = r15.A0b
            X.CbY r6 = r4.A04
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x00aa
            r2 = 0
        L_0x000a:
            r8 = -9223372036854775808
            r7 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r15.A0J(r7)
        L_0x0014:
            return
        L_0x0015:
            long r12 = r15.A06
            long r0 = r6.A00
            long r12 = r12 - r0
            boolean r0 = r15.A0m
            if (r0 == 0) goto L_0x008b
            X.CbY r0 = r4.A05
            if (r6 == r0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            long r10 = r15.A0P()
        L_0x0028:
            X.EAG r8 = r15.A0a
            X.DA2 r0 = r15.A0X
            X.Cl2 r0 = r0.BXC()
            float r9 = r0.A01
            boolean r1 = r15.A0K
            r0 = 1
            if (r1 != 0) goto L_0x003a
            r14 = 0
            if (r16 == 0) goto L_0x003b
        L_0x003a:
            r14 = 1
        L_0x003b:
            boolean r4 = r8.CLn(r9, r10, r12, r14)
            boolean r1 = r15.A0R
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0K
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0M
            if (r1 == 0) goto L_0x0076
            if (r4 != 0) goto L_0x0076
            X.CqU r1 = r15.A09
            int r5 = r1.A00
            r1 = 2
            if (r5 != r1) goto L_0x0076
            java.lang.Object[] r5 = X.AnonymousClass8BR.A1a()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r8
            X.AnonymousClass3MX.A1S(r5, r7, r12)
            long r10 = r10 / r8
            X.AnonymousClass3MX.A1S(r5, r0, r10)
            long r2 = r2 / r8
            X.AnonymousClass3MX.A1S(r5, r1, r2)
            java.lang.String r1 = "PlaybackPositionMs: %d, bufferedDurationMs: %d, nextLoadPositionMs: %d"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r1, r5)
            android.os.Handler r1 = r15.A0V
            r0 = 5
            X.BE7.A18(r1, r2, r0)
            r15.A0R = r7
        L_0x0076:
            r15.A0J(r4)
            if (r4 == 0) goto L_0x0014
            long r3 = r15.A06
            long r0 = r6.A00
            long r3 = r3 - r0
            X.ECi r2 = r6.A08
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.BFn(r3, r0)
            return
        L_0x008b:
            X.ECi r0 = r6.A08
            long r10 = r0.BNp(r12)
            boolean r0 = r15.A0J
            if (r0 == 0) goto L_0x0028
            X.CbY r8 = r4.A05
        L_0x0097:
            if (r8 == 0) goto L_0x0028
            if (r8 == r6) goto L_0x0028
            long r0 = r15.A06
            long r4 = r8.A00
            long r0 = r0 - r4
            X.ECi r4 = r8.A08
            long r0 = r4.BNp(r0)
            long r10 = r10 + r0
            X.CbY r8 = r8.A01
            goto L_0x0097
        L_0x00aa:
            X.ECi r0 = r6.A08
            long r2 = r0.BVO()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9J.A0H(boolean):void");
    }

    private void A0J(boolean z) {
        C26013CqU cqU = this.A09;
        boolean z2 = z;
        if (cqU.A0A != z2) {
            Timeline timeline = cqU.A03;
            Object obj = cqU.A08;
            C25199Caq caq = cqU.A04;
            long j = cqU.A02;
            long j2 = cqU.A01;
            C26013CqU cqU2 = new C26013CqU(timeline, caq, cqU.A05, cqU.A06, cqU.A07, obj, cqU.A00, j, j2, z2, cqU.A09);
            C26013CqU.A00(cqU, cqU2);
            this.A09 = cqU2;
        }
    }

    private void A0L(boolean z, boolean z2, boolean z3) {
        Object obj;
        Timeline timeline;
        C25199Caq caq;
        long j;
        long j2;
        C26539D3a d3a;
        CSJ csj;
        E9e e9e;
        int i;
        this.A0g.A00.removeMessages(2);
        this.A0M = false;
        this.A0X.A02.A00();
        this.A0f.A00();
        if (this.A0n) {
            this.A0h.A00();
        }
        this.A06 = 0;
        for (ECg A0G2 : this.A0P) {
            try {
                A0G(A0G2);
            } catch (BOK | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0P = new ECg[0];
        C26244Cvi cvi = this.A0b;
        cvi.A08(!z2);
        A0J(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            timeline = Timeline.A00;
            cvi.A07 = timeline;
            ArrayList arrayList = this.A0i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DS8) it.next()).A03.A03(false);
            }
            arrayList.clear();
            this.A01 = 0;
            obj = null;
        } else {
            C26013CqU cqU = this.A09;
            timeline = cqU.A03;
            obj = cqU.A08;
        }
        C26013CqU cqU2 = this.A09;
        if (z2) {
            Timeline timeline2 = cqU2.A03;
            if (AnonymousClass000.A1P(timeline2.A01())) {
                i = 0;
            } else {
                i = timeline2.A09(this.A0d, timeline2.A05(this.A0O), 0).A00;
            }
            caq = new C25199Caq(i, -1, -1, -1);
            j2 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            caq = cqU2.A04;
            j = cqU2.A0D;
            j2 = this.A09.A01;
        }
        C26013CqU cqU3 = this.A09;
        int i2 = cqU3.A00;
        if (z3) {
            d3a = C26539D3a.A03;
            csj = this.A0q;
        } else {
            d3a = cqU3.A05;
            csj = cqU3.A06;
        }
        this.A09 = new C26013CqU(timeline, caq, d3a, csj, AnonymousClass00R.A00, obj, i2, j, j2, false, false);
        if (z && (e9e = this.A0C) != null) {
            e9e.CEM(this);
            this.A0C = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r12.A09.A00 != 3) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r18 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(boolean[] r22, int r23) {
        /*
            r21 = this;
            r0 = r23
            X.ECg[] r0 = new X.ECg[r0]
            r12 = r21
            r12.A0P = r0
            X.Cvi r11 = r12.A0b
            X.CbY r0 = r11.A05
            r20 = r0
            r10 = 0
            r2 = 0
        L_0x0010:
            X.ECg[] r1 = r12.A0o
            int r0 = r1.length
            if (r10 >= r0) goto L_0x0100
            r0 = r20
            X.CSJ r0 = r0.A05
            X.Ckl[] r0 = r0.A03
            r0 = r0[r10]
            if (r0 == 0) goto L_0x00de
            boolean r5 = r22[r10]
            int r19 = r2 + 1
            X.CbY r14 = r11.A05
            r9 = r1[r10]
            X.ECg[] r0 = r12.A0P
            r0[r2] = r9
            r8 = r9
            X.D8i r8 = (X.C26659D8i) r8
            int r0 = r8.A01
            if (r0 != 0) goto L_0x00dc
            X.CbY r0 = r11.A06
            boolean r16 = X.AnonymousClass000.A1Z(r0, r14)
            X.CSJ r2 = r14.A05
            X.Ckl[] r1 = r2.A03
            r15 = r1[r10]
            X.ECj[] r1 = r2.A04
            r4 = r1[r10]
            r3 = 0
            if (r4 == 0) goto L_0x005b
            r1 = r4
            X.D9c r1 = (X.C26679D9c) r1
            int[] r1 = r1.A03
            int r2 = r1.length
        L_0x004b:
            X.D48[] r7 = new X.D48[r2]
        L_0x004d:
            if (r3 >= r2) goto L_0x005d
            r1 = r4
            X.D9c r1 = (X.C26679D9c) r1
            X.D48[] r1 = r1.A04
            r1 = r1[r3]
            r7[r3] = r1
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005b:
            r2 = 0
            goto L_0x004b
        L_0x005d:
            boolean r1 = r12.A0K
            if (r1 == 0) goto L_0x006a
            X.CqU r1 = r12.A09
            int r2 = r1.A00
            r1 = 3
            r18 = 1
            if (r2 == r1) goto L_0x006c
        L_0x006a:
            r18 = 0
        L_0x006c:
            if (r5 != 0) goto L_0x0071
            r6 = 1
            if (r18 != 0) goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            X.E90[] r1 = r14.A0B
            r13 = r1[r10]
            long r4 = r12.A06
            boolean r1 = r12.A0G
            if (r1 != 0) goto L_0x00ea
            long r2 = r0.A00
        L_0x007e:
            long r0 = r14.A00
            r14 = 1
            r8.A04 = r15
            r8.A01 = r14
            r14 = r16
            r8.A0J(r6, r14)
            boolean r14 = r8.A08
            r14 = r14 ^ 1
            X.C26056CrS.A03(r14)
            r8.A06 = r13
            long r13 = r8.A02
            r16 = -9223372036854775808
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x009d
            r8.A02 = r2
        L_0x009d:
            r8.A0A = r7
            r8.A03 = r0
            r8.A0G(r7, r0)
            r0 = 0
            r8.A08 = r0
            r8.A02 = r4
            r8.A0I(r4, r6)
            X.DA2 r2 = r12.A0X
            boolean r0 = r9 instanceof X.BOG
            if (r0 == 0) goto L_0x00e2
            r1 = r9
            X.BOG r1 = (X.BOG) r1
        L_0x00b5:
            if (r1 == 0) goto L_0x00cb
            X.E8d r0 = r2.A01
            if (r1 == r0) goto L_0x00cb
            if (r0 != 0) goto L_0x00f2
            r2.A01 = r1
            r2.A00 = r9
            X.DA0 r0 = r2.A02
            X.Cl2 r0 = r0.A01
            r1.CK1(r0)
            X.DA2.A00(r2)
        L_0x00cb:
            if (r18 == 0) goto L_0x00dc
            int r0 = r8.A01
            boolean r0 = X.BE8.A1T(r0)
            X.C26056CrS.A03(r0)
            r0 = 2
            r8.A01 = r0
            r8.A0E()
        L_0x00dc:
            r2 = r19
        L_0x00de:
            int r10 = r10 + 1
            goto L_0x0010
        L_0x00e2:
            boolean r0 = r9 instanceof X.C22774BOn
            if (r0 == 0) goto L_0x00cb
            r1 = r9
            X.BOn r1 = (X.C22774BOn) r1
            goto L_0x00b5
        L_0x00ea:
            X.CTA r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            long r2 = r2 + r0
            goto L_0x007e
        L_0x00f2:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
            r1 = 2
            r0 = 1000(0x3e8, float:1.401E-42)
            X.BOK r0 = X.BOK.A00(r2, r1, r0)
            throw r0
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9J.A0M(boolean[], int):void");
    }

    private boolean A0N() {
        C25237CbY cbY = this.A0b.A05;
        long j = cbY.A02.A01;
        if (j == -9223372036854775807L || this.A09.A0D < j) {
            return true;
        }
        C25237CbY cbY2 = cbY.A01;
        if (cbY2 == null) {
            return false;
        }
        if (cbY2.A07 || cbY2.A02.A04.A00 != -1) {
            return true;
        }
        return false;
    }

    private boolean A0O(DS8 ds8) {
        Object obj = ds8.A02;
        if (obj == null) {
            C25257Cbw cbw = ds8.A03;
            Timeline timeline = cbw.A09;
            int i = cbw.A00;
            long j = cbw.A02;
            UUID uuid = C24736CHy.A04;
            Pair A022 = A02(new CP6(timeline, i, Util.A04(j)), false);
            if (A022 != null) {
                int A012 = C108965cb.A01(A022);
                long A052 = C17880vN.A05(A022.second);
                Object obj2 = this.A09.A03.A08(this.A0c, A012, true).A03;
                ds8.A00 = A012;
                ds8.A01 = A052;
                ds8.A02 = obj2;
                return true;
            }
        } else {
            int A042 = this.A09.A03.A04(obj);
            if (A042 != -1) {
                ds8.A00 = A042;
                return true;
            }
        }
        return false;
    }

    public long A0P() {
        long j;
        C25237CbY cbY = this.A0b.A04;
        if (cbY != null) {
            E90[] e90Arr = cbY.A0B;
            long j2 = Long.MAX_VALUE;
            for (E90 e90 : e90Arr) {
                if (e90 instanceof D9T) {
                    D9T d9t = (D9T) e90;
                    C25698CkT ckT = d9t.A01.A0H[d9t.A00].A09;
                    synchronized (ckT) {
                        if (ckT.A02 == 0) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = ckT.A0E[ckT.A04];
                        }
                    }
                    j2 = Math.min(j2, j);
                }
            }
            if (!(j2 == Long.MAX_VALUE || j2 == -9223372036854775807L)) {
                return cbY.A08.BNp(j2);
            }
        }
        return 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    public void A0Q(X.C25732Cl2 r4) {
        /*
            r3 = this;
            android.os.Handler r1 = r3.A0V
            r0 = 1
            X.BE7.A18(r1, r4, r0)
            X.Cvi r0 = r3.A0b
            X.CbY r2 = r0.A05
            if (r2 != 0) goto L_0x0011
            X.CbY r2 = r0.A04
        L_0x000e:
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            X.CSJ r0 = r2.A05
            if (r0 == 0) goto L_0x001e
            X.ECj[] r0 = r0.A04
            int r1 = r0.length
            r0 = 0
        L_0x0019:
            if (r0 >= r1) goto L_0x001e
            int r0 = r0 + 1
            goto L_0x0019
        L_0x001e:
            X.CbY r2 = r2.A01
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9J.A0Q(X.Cl2):void");
    }

    public /* bridge */ /* synthetic */ void BqD(C28601E9s e9s) {
        C25646Cjc.A00(this.A0g, e9s, 10);
    }

    public void C1a(C28649ECi eCi) {
        C25646Cjc.A00(this.A0g, eCi, 9);
    }

    public void C5z(Timeline timeline, E9e e9e, Object obj) {
        C25646Cjc.A00(this.A0g, new CP5(timeline, e9e, obj), 8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d4, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A05(r7) > 1000) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02e7, code lost:
        if (r9.Bed() == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02f3, code lost:
        if (r9.Bed() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03d2, code lost:
        if (A0N() != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03de, code lost:
        if (((X.C26659D8i) r1).A0B == 1) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0496, code lost:
        if ((r12 - r5) >= ((long) r8)) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r9.A00 < 100) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04d7, code lost:
        if (r25 == false) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04e7, code lost:
        if (((X.C26659D8i) r1).A0B == 1) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ae0, code lost:
        if (r9.equals(r6) == false) goto L_0x0ae2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0c10, code lost:
        if (r0.A0K != false) goto L_0x0c12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c30, code lost:
        if (r1.A08 == r2) goto L_0x0c32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0c32, code lost:
        A0H(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0c56, code lost:
        if (X.C26244Cvi.A04(r1) == false) goto L_0x0c58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0ca5, code lost:
        r6.A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        if (r5.A01 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0372 A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x054a A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x05ba A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05ce A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05e1 A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0838 A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x089b A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08ae A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125 A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x0b1e A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0b3e A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0182 A[Catch:{ all -> 0x08b4, all -> 0x07ab, BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:420:0x07a0=Splitter:B:420:0x07a0, B:466:0x08a0=Splitter:B:466:0x08a0, B:437:0x0830=Splitter:B:437:0x0830} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r39) {
        /*
            r38 = this;
            java.lang.String r18 = "ExoPlayerImplInternal"
            r4 = 1
            r3 = 0
            r0 = r38
            r2 = r39
            int r1 = r2.what     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            switch(r1) {
                case 0: goto L_0x070d;
                case 1: goto L_0x0740;
                case 2: goto L_0x000e;
                case 3: goto L_0x07b6;
                case 4: goto L_0x08c8;
                case 5: goto L_0x08e1;
                case 6: goto L_0x08e9;
                case 7: goto L_0x0603;
                case 8: goto L_0x08f4;
                case 9: goto L_0x0b90;
                case 10: goto L_0x0c24;
                case 11: goto L_0x061e;
                case 12: goto L_0x0c37;
                case 13: goto L_0x0c46;
                case 14: goto L_0x0c5d;
                case 15: goto L_0x0c8e;
                case 16: goto L_0x0d4c;
                case 17: goto L_0x0d45;
                case 18: goto L_0x0cd0;
                default: goto L_0x000d;
            }     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x000d:
            return r3
        L_0x000e:
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E9e r2 = r0.A0C     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 == 0) goto L_0x001d
            int r1 = r0.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 <= 0) goto L_0x0047
            r2.BjW()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x001d:
            X.Cvi r10 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r12 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r12 == 0) goto L_0x05ed
            X.CbY r15 = r10.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.String r1 = "doSomeWork"
            X.C25304Cd8.A01(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A08()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r1
            X.ECi r9 = r12.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r0.A0T     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1 - r7
            boolean r7 = r0.A0k     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9.BIl(r1, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECg[] r14 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r13 = r14.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x028d
        L_0x0047:
            X.Cvi r9 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r6 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r6 == 0) goto L_0x007c
            X.CTA r1 = r6.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x010c
            boolean r1 = r6.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x010c
            boolean r1 = r6.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0067
            X.ECi r1 = r6.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r1.BNq()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x010c
        L_0x0067:
            X.CbY r6 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r6.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x010c
            int r2 = r9.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 100
            if (r2 >= r1) goto L_0x010c
        L_0x007c:
            long r1 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r5 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r6 != 0) goto L_0x009e
            X.Caq r8 = r5.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r2 = r9.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r7 = r8.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r9.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2.A08(r1, r7, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r8.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = -1
            if (r2 != r1) goto L_0x0107
            long r1 = r8.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10 = r7
            r11 = r5
            r13 = r1
            X.CTA r12 = X.C26244Cvi.A02(r9, r10, r11, r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x00a2
        L_0x009e:
            X.CTA r12 = X.C26244Cvi.A00(r6, r9, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x00a2:
            if (r12 == 0) goto L_0x0107
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r5 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r12.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r0.A0c     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r5.A08(r1, r2, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r11 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E7M[] r10 = r0.A0p     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.C5B r8 = r0.A0e     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r1 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbB r23 = r1.BMx()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E9e r7 = r0.A0C     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x00e0
            long r5 = r12.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x00c6:
            X.CbY r1 = new X.CbY     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r1
            r20 = r12
            r21 = r7
            r22 = r8
            r24 = r11
            r25 = r10
            r26 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r5 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x00f1
            X.CbY r2 = r9.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x00e8
        L_0x00e0:
            long r5 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5 + r1
            goto L_0x00c6
        L_0x00e8:
            boolean r2 = X.AnonymousClass000.A1W(r2)
            X.C26056CrS.A03(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.A01 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x00f1:
            r2 = 0
            r9.A08 = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9.A04 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r9.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r2 + 1
            r9.A00 = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECi r5 = r1.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r12.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.CCK(r0, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0J(r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x010c
        L_0x0107:
            X.E9e r1 = r0.A0C     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.BjW()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x010c:
            X.CbY r2 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r11 = 0
            if (r2 == 0) goto L_0x0125
            boolean r1 = r2.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0182
            boolean r1 = r2.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0125
            X.ECi r1 = r2.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r1.BNq()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0182
        L_0x0125:
            r0.A0J(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0128:
            X.CbY r12 = r9.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r12 == 0) goto L_0x001d
            X.CbY r10 = r9.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r13 = 0
        L_0x012f:
            boolean r1 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x018c
            if (r12 == r10) goto L_0x018c
            long r7 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r2 = r12.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0G     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0140
            long r5 = r2.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0147
        L_0x0140:
            X.CTA r1 = r2.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r2.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5 + r1
        L_0x0147:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018c
            if (r13 == 0) goto L_0x0150
            r0.A04()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0150:
            X.CTA r1 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r13 = 3
            if (r1 == 0) goto L_0x0158
            r13 = 0
        L_0x0158:
            X.CbY r8 = r9.A06()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0D(r12)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r12 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r8.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r7 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r12
            r20 = r7
            r21 = r5
            r23 = r1
            X.CqU r1 = r19.A01(r20, r21, r23)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CWR r1 = r0.A0Z     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.A00(r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A08()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12 = r8
            r13 = 1
            goto L_0x012f
        L_0x0182:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0128
            r0.A0H(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0128
        L_0x018c:
            X.CTA r1 = r10.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x026c
            X.CbY r1 = r10.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x001d
            boolean r1 = r1.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x019c
            goto L_0x001d
        L_0x019c:
            X.ECg[] r13 = r0.A0o     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r12 = r13.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r11 >= r12) goto L_0x01bb
            r5 = r13[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90[] r1 = r10.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2 = r1[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r5
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90 r1 = r1.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != r2) goto L_0x001d
            if (r2 == 0) goto L_0x01b8
            boolean r1 = r5.Bco()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x01b8
            goto L_0x001d
        L_0x01b8:
            int r11 = r11 + 1
            goto L_0x019c
        L_0x01bb:
            X.CSJ r1 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r23 = r1
            X.CbY r5 = r9.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x01c8
            X.CbY r2 = r5.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 1
            if (r2 != 0) goto L_0x01c9
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            X.C26056CrS.A03(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r14 = r5.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9.A06 = r14     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r15 = r14.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECi r1 = r14.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r1.CDQ()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r22 = X.AnonymousClass000.A1O(r1)
            r11 = 0
        L_0x01e4:
            if (r11 >= r12) goto L_0x001d
            r10 = r13[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r23
            X.Ckl[] r2 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r2[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0268
            if (r22 != 0) goto L_0x0264
            r1 = r10
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0268
            X.ECj[] r1 = r15.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = r1[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Ckl[] r6 = r15.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r6[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r5 = X.AnonymousClass000.A1W(r1)
            r2 = r2[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r6[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x0264
            boolean r1 = r1.equals(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0264
            r5 = 0
            if (r7 == 0) goto L_0x0215
            goto L_0x0217
        L_0x0215:
            r2 = 0
            goto L_0x021d
        L_0x0217:
            r1 = r7
            X.D9c r1 = (X.C26679D9c) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int[] r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r1.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x021d:
            X.D48[] r9 = new X.D48[r2]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x021f:
            if (r5 >= r2) goto L_0x022d
            r1 = r7
            X.D9c r1 = (X.C26679D9c) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D48[] r1 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r1[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9[r5] = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = r5 + 1
            goto L_0x021f
        L_0x022d:
            java.lang.String r2 = "replaceStream"
            r1 = r18
            android.util.Log.e(r1, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90[] r1 = r14.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r8 = r1[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0G     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x025c
            long r1 = r14.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = r1
        L_0x023f:
            X.D8i r10 = (X.C26659D8i) r10     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r7 = r10.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = r7 ^ 1
            X.C26056CrS.A03(r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10.A06 = r8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r10.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r20 = -9223372036854775808
            int r19 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r19 != 0) goto L_0x0254
            r10.A02 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0254:
            r10.A0A = r9     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10.A03 = r5     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10.A0G(r9, r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0268
        L_0x025c:
            X.CTA r1 = r14.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r14.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1 + r5
            goto L_0x023f
        L_0x0264:
            X.D8i r10 = (X.C26659D8i) r10     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10.A08 = r4     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0268:
            int r11 = r11 + 1
            goto L_0x01e4
        L_0x026c:
            X.ECg[] r2 = r0.A0o     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r2.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r11 >= r1) goto L_0x001d
            r5 = r2[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90[] r1 = r10.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2 = r1[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 == 0) goto L_0x028a
            r1 = r5
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90 r1 = r1.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != r2) goto L_0x028a
            boolean r1 = r5.Bco()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x028a
            X.D8i r5 = (X.C26659D8i) r5     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.A08 = r4     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x028a:
            int r11 = r11 + 1
            goto L_0x026c
        L_0x028d:
            boolean r26 = X.C108975cc.A1D(r13, r4)
            r25 = 1
            r24 = 1
            r11 = 0
            r23 = 0
        L_0x0298:
            java.lang.String r22 = "Temporarily ignoring stream error: "
            if (r11 >= r13) goto L_0x0388
            r9 = r14[r11]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9.CF7(r1, r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r15.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x02db
            boolean r1 = r0.A0J     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x037c
            boolean r1 = r9.Bco()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x02d6
            boolean r1 = r0.A0E     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x02db
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = -1
            int r7 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r7 == 0) goto L_0x02db
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r7 - r1
            java.util.UUID r1 = X.C24736CHy.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r19 = com.facebook.android.exoplayer2.util.Util.A05(r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x02db
        L_0x02d6:
            r1 = r9
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.A08 = r4     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x02db:
            boolean r1 = r9 instanceof X.BOF     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x02eb
            if (r26 == 0) goto L_0x02e9
            boolean r1 = r9.Bed()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r26 = 1
            if (r1 != 0) goto L_0x02eb
        L_0x02e9:
            r26 = 0
        L_0x02eb:
            if (r24 == 0) goto L_0x02f5
            boolean r1 = r9.Bed()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r24 = 1
            if (r1 != 0) goto L_0x02f7
        L_0x02f5:
            r24 = 0
        L_0x02f7:
            boolean r1 = r9.Bg8()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x036e
            boolean r1 = r9.Bed()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x036e
            X.CbY r1 = r10.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0314
            boolean r1 = r1.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0314
            boolean r1 = r9.Bco()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0314
            goto L_0x036e
        L_0x0314:
            r21 = 0
            r1 = r9
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BPN -> 0x0322 }
            X.E90 r1 = r1.A06     // Catch:{ BPN -> 0x0322 }
            X.C26056CrS.A01(r1)     // Catch:{ BPN -> 0x0322 }
            r1.BjU()     // Catch:{ BPN -> 0x0322 }
            goto L_0x035d
        L_0x0322:
            r7 = move-exception
            java.lang.Class r2 = r7.getClass()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Class<X.BPN> r1 = X.BPN.class
            boolean r1 = r2.equals(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05a8
            boolean r1 = r0.A0I     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05a8
            long r1 = r0.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0360
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r22
            java.lang.String r2 = X.C17900vP.A0C(r1, r2, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A05 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0j     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x035d
            android.os.Handler r2 = r0.A0V     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 4
            X.BE7.A18(r2, r7, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x035d:
            r0.A0A = r9     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x036b
        L_0x0360:
            long r19 = X.AnonymousClass8BR.A04(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r0.A0U     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r8 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x05a8
            goto L_0x035d
        L_0x036b:
            r23 = 1
            goto L_0x0370
        L_0x036e:
            r21 = 1
        L_0x0370:
            if (r25 == 0) goto L_0x0376
            r25 = 1
            if (r21 != 0) goto L_0x0378
        L_0x0376:
            r25 = 0
        L_0x0378:
            int r11 = r11 + 1
            goto L_0x0298
        L_0x037c:
            boolean r1 = r0.A0E     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x02d6
            boolean r1 = r9.Bco()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x02db
            goto L_0x02d6
        L_0x0388:
            if (r25 != 0) goto L_0x038d
            r0.A05()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x038d:
            boolean r1 = r0.A0L     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x03b0
            if (r26 == 0) goto L_0x03b0
            if (r24 != 0) goto L_0x03b0
            X.ECg[] r8 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r7 = r8.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r6 = 0
        L_0x0399:
            if (r6 >= r7) goto L_0x03b0
            r5 = r8[r6]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r5 instanceof X.BOF     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x03ad
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r5.CF7(r1, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r24 = r5.Bed()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x03ad:
            int r6 = r6 + 1
            goto L_0x0399
        L_0x03b0:
            X.CTA r1 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9 = 3
            if (r24 == 0) goto L_0x03c2
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0536
            goto L_0x052e
        L_0x03c2:
            X.CqU r5 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r5.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            if (r2 != r1) goto L_0x04c5
            X.ECg[] r1 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x042d
            boolean r1 = r0.A0N()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x04c5
        L_0x03d4:
            X.ECg r1 = r0.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x042a
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r37 = 1
            if (r1 != r4) goto L_0x042a
        L_0x03e0:
            java.lang.Integer r1 = r0.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r1
            X.CqU r14 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r14.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == r9) goto L_0x041e
            com.facebook.android.exoplayer2.Timeline r15 = r14.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r13 = r14.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r12 = r14.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r14.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r14.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r11 = r14.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r10 = r14.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r8 = r14.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r7 = new X.CqU     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r24 = r7
            r25 = r15
            r26 = r12
            r27 = r10
            r28 = r8
            r29 = r19
            r30 = r13
            r31 = r9
            r32 = r5
            r34 = r1
            r36 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.C26013CqU.A00(r14, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r7     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = -1
            r0.A04 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x041e:
            boolean r1 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0425
            r0.A06()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0425:
            r1 = 0
            r0.A0A = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0543
        L_0x042a:
            r37 = 0
            goto L_0x03e0
        L_0x042d:
            if (r25 != 0) goto L_0x0431
            goto L_0x04bb
        L_0x0431:
            boolean r1 = r5.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x03d4
            X.CbY r11 = r10.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r2 = r11.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r2.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r8 = r1 ^ 1
            boolean r1 = r11.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x044e
            long r1 = r2.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0443:
            boolean r5 = r0.A0m     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x0475
            X.CbY r12 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r5 = r10.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r12 == r5) goto L_0x0475
            goto L_0x0461
        L_0x044e:
            X.ECi r1 = r11.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.BNq()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r6 = -9223372036854775808
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0443
            if (r8 == 0) goto L_0x0443
            X.CTA r1 = r11.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0443
        L_0x0461:
            if (r12 == 0) goto L_0x0475
            long r5 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r12.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5 - r7
            X.ECi r7 = r12.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r28 = r7.BNp(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r0.A0P()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r28 = r28 + r5
            goto L_0x0480
        L_0x0475:
            long r5 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r11.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5 - r7
            X.ECi r7 = r11.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r28 = r7.BNp(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0480:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r8 = r0.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r8 <= 0) goto L_0x0498
            long r5 = r0.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10 = 0
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0498
            long r12 = r12 - r5
            long r5 = (long) r8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            r31 = 1
            if (r7 < 0) goto L_0x049a
        L_0x0498:
            r31 = 0
        L_0x049a:
            r6 = -9223372036854775808
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x03d4
            X.EAG r5 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DA2 r1 = r0.A0X     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cl2 r1 = r1.BXC()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            float r2 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0M     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r26 = r5
            r27 = r2
            r30 = r1
            boolean r1 = r26.CMR(r27, r28, r30, r31)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x03d4
            java.lang.Integer r1 = X.AnonymousClass00R.A0u     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x04c3
        L_0x04bb:
            X.ECg r1 = r0.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x04c5
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Integer r1 = r1.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x04c3:
            r0.A0D = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x04c5:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != r9) goto L_0x0543
            X.ECg[] r1 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x04d7
            boolean r1 = r0.A0N()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x04d9
            goto L_0x0543
        L_0x04d7:
            if (r25 != 0) goto L_0x0543
        L_0x04d9:
            boolean r1 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0M = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECg r1 = r0.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x052b
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r37 = 1
            if (r1 != r4) goto L_0x052b
        L_0x04e9:
            X.CqU r13 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r13.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            if (r2 == r1) goto L_0x0540
            com.facebook.android.exoplayer2.Timeline r1 = r13.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r1
            java.lang.Object r15 = r13.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r14 = r13.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r13.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r13.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r12 = r13.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r11 = r13.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r10 = r13.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Integer r8 = r13.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r31 = 2
            X.CqU r7 = new X.CqU     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r24 = r7
            r25 = r19
            r26 = r14
            r27 = r11
            r28 = r10
            r29 = r8
            r30 = r15
            r32 = r5
            r34 = r1
            r36 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.C26013CqU.A00(r13, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r7     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A04 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0540
        L_0x052b:
            r37 = 0
            goto L_0x04e9
        L_0x052e:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x03c2
        L_0x0536:
            X.CTA r1 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x03c2
            r1 = 4
            r0.A0A(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0540:
            r0.A07()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0543:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            if (r2 != r1) goto L_0x05a9
            X.ECg[] r8 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r6 = r8.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = 0
        L_0x054e:
            if (r5 >= r6) goto L_0x05a9
            r1 = r8[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BPN -> 0x055d }
            X.E90 r1 = r1.A06     // Catch:{ BPN -> 0x055d }
            X.C26056CrS.A01(r1)     // Catch:{ BPN -> 0x055d }
            r1.BjU()     // Catch:{ BPN -> 0x055d }
            goto L_0x05a3
        L_0x055d:
            r7 = move-exception
            java.lang.Class r2 = r7.getClass()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Class<X.BPN> r1 = X.BPN.class
            boolean r1 = r2.equals(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05a8
            boolean r1 = r0.A0I     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05a8
            long r1 = r0.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0599
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r22
            java.lang.String r2 = X.C17900vP.A0C(r1, r2, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A05 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0j     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05a3
            android.os.Handler r2 = r0.A0V     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 4
            X.BE7.A18(r2, r7, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x05a3
        L_0x0599:
            long r11 = X.AnonymousClass8BR.A04(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r0.A0U     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x05a8
        L_0x05a3:
            int r5 = r5 + 1
            r23 = 1
            goto L_0x054e
        L_0x05a8:
            throw r7     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x05a9:
            boolean r1 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05b3
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == r9) goto L_0x05ce
        L_0x05b3:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            if (r2 == r1) goto L_0x05ce
            X.ECg[] r1 = r0.A0P     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x05c5
            r1 = 4
            if (r2 == r1) goto L_0x05c5
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x05d0
        L_0x05c5:
            X.Cp1 r1 = r0.A0g     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r2 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            r2.removeMessages(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x05df
        L_0x05ce:
            r7 = 10
        L_0x05d0:
            X.Cp1 r1 = r0.A0g     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r6 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = 2
            r6.removeMessages(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r16 = r16 + r7
            r1 = r16
            r6.sendEmptyMessageAtTime(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x05df:
            if (r23 != 0) goto L_0x05e8
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A05 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x05e8:
            X.C25304Cd8.A00()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x05ed:
            r0.A05()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = 10
            X.Cp1 r1 = r0.A0g     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r6 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = 2
            r6.removeMessages(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r16 = r16 + r7
            r1 = r16
            r6.sendEmptyMessageAtTime(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0603:
            r0.A0L(r4, r4, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r1 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.C2x()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0A(r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.HandlerThread r1 = r0.A0W     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.quit()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            monitor-enter(r0)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0N = r4     // Catch:{ all -> 0x061b }
            r0.notifyAll()     // Catch:{ all -> 0x061b }
            monitor-exit(r0)     // Catch:{ all -> 0x061b }
            return r4
        L_0x061b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x061b }
            throw r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x061e:
            X.Cvi r6 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r6.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0d4c
            X.DA2 r1 = r0.A0X     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.BXC()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r10 = r6.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r5 = r6.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2 = 1
        L_0x062e:
            if (r10 == 0) goto L_0x0d4c
            boolean r1 = r10.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0d4c
            boolean r1 = r10.A02()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x063b
            goto L_0x0641
        L_0x063b:
            if (r10 != r5) goto L_0x063e
            r2 = 0
        L_0x063e:
            X.CbY r10 = r10.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x062e
        L_0x0641:
            r9 = 4
            if (r2 == 0) goto L_0x06be
            X.CbY r7 = r6.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r10 = r6.A09(r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECg[] r6 = r0.A0o     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = r6.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean[] r8 = new boolean[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r12 = r7.A00(r8, r1, r10)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r10 = r7.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r1 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r2 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECj[] r1 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2.C94(r10, r6, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r2 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r2.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == r9) goto L_0x0684
            long r1 = r2.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0684
            X.CqU r10 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r11 = r10.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r10.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r14 = r1
            X.CqU r1 = r10.A01(r11, r12, r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CWR r2 = r0.A0Z     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 5
            r2.A00(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0B(r12)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0684:
            boolean[] r11 = new boolean[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r13 = 0
            r10 = 0
        L_0x0688:
            if (r13 >= r5) goto L_0x06e8
            r14 = r6[r13]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r14
            X.D8i r1 = (X.C26659D8i) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r11[r13] = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90[] r1 = r7.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2 = r1[r13]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 == 0) goto L_0x069f
            int r10 = r10 + 1
        L_0x069f:
            boolean r1 = r11[r13]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x06bb
            r12 = r14
            X.D8i r12 = (X.C26659D8i) r12     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E90 r1 = r12.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 == r1) goto L_0x06ae
            r0.A0G(r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x06bb
        L_0x06ae:
            boolean r1 = r8[r13]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x06bb
            long r1 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12.A08 = r3     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12.A02 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12.A0I(r1, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x06bb:
            int r13 = r13 + 1
            goto L_0x0688
        L_0x06be:
            r6.A09(r10)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r10.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x06f7
            X.CTA r1 = r10.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r10.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E7M[] r5 = r10.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = r5.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean[] r5 = new boolean[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10.A00(r5, r1, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r6 = r10.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r1 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r5 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECg[] r2 = r0.A0o     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECj[] r1 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.C94(r6, r2, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x06f7
        L_0x06e8:
            X.CqU r5 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r2 = r7.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r1 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r5.A02(r2, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0M(r11, r10)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x06f7:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == r9) goto L_0x0d4c
            r0.A0H(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A08()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cp1 r1 = r0.A0g     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r2 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x070d:
            java.lang.Object r6 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E9e r6 = (X.E9e) r6     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r2.arg1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r5 = X.AnonymousClass000.A1O(r1)
            int r1 = r2.arg2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r2 = X.AnonymousClass000.A1O(r1)
            int r1 = r0.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1 + 1
            r0.A02 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0L(r4, r5, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r1 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.C1Z()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0C = r6     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            r0.A0A(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cue r1 = r0.A0Y     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r6.CCT(r1, r0, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cp1 r1 = r0.A0g     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r2 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0740:
            int r1 = r2.arg1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r8 = X.AnonymousClass000.A1O(r1)
            r7 = 3
            r0.A0M = r3     // Catch:{ all -> 0x07ab }
            r0.A0K = r8     // Catch:{ all -> 0x07ab }
            X.Cvi r5 = r0.A0b     // Catch:{ all -> 0x07ab }
            X.CbY r1 = r5.A04     // Catch:{ all -> 0x07ab }
            if (r1 == 0) goto L_0x0756
            X.ECi r1 = r1.A08     // Catch:{ all -> 0x07ab }
            r1.CK0(r8)     // Catch:{ all -> 0x07ab }
        L_0x0756:
            if (r8 != 0) goto L_0x0777
            r0.A07()     // Catch:{ all -> 0x07ab }
            r0.A08()     // Catch:{ all -> 0x07ab }
            boolean r2 = r0.A0l     // Catch:{ all -> 0x07ab }
            r1 = 2
            r0.A09(r1, r2)     // Catch:{ all -> 0x07ab }
            boolean r1 = r0.A0F     // Catch:{ all -> 0x07ab }
            if (r1 == 0) goto L_0x07a0
            X.CbY r5 = r5.A04     // Catch:{ all -> 0x07ab }
            if (r5 == 0) goto L_0x07a0
            X.ECi r9 = r5.A08     // Catch:{ all -> 0x07ab }
            long r1 = r0.A06     // Catch:{ all -> 0x07ab }
            long r5 = r5.A00     // Catch:{ all -> 0x07ab }
            long r1 = r1 - r5
            r9.BEV(r1)     // Catch:{ all -> 0x07ab }
            goto L_0x07a0
        L_0x0777:
            boolean r1 = r0.A0l     // Catch:{ all -> 0x07ab }
            r0.A09(r3, r1)     // Catch:{ all -> 0x07ab }
            X.EAG r5 = r0.A0a     // Catch:{ all -> 0x07ab }
            r1 = -1
            r5.CJt(r1, r1)     // Catch:{ all -> 0x07ab }
            X.CqU r1 = r0.A09     // Catch:{ all -> 0x07ab }
            int r2 = r1.A00     // Catch:{ all -> 0x07ab }
            if (r2 != r7) goto L_0x0795
            r0.A06()     // Catch:{ all -> 0x07ab }
            X.Cp1 r1 = r0.A0g     // Catch:{ all -> 0x07ab }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x07ab }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x07ab }
            goto L_0x07a0
        L_0x0795:
            r1 = 2
            if (r2 != r1) goto L_0x07a0
            X.Cp1 r1 = r0.A0g     // Catch:{ all -> 0x07ab }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x07ab }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x07ab }
        L_0x07a0:
            android.os.Handler r2 = r0.A0V     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.BE7.A18(r2, r1, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x07ab:
            r5 = move-exception
            android.os.Handler r2 = r0.A0V     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.BE7.A18(r2, r1, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            throw r5     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x07b6:
            java.lang.Object r12 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CP6 r12 = (X.CP6) r12     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CWR r9 = r0.A0Z     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r17 = 1
            int r1 = r9.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1 + 1
            r9.A01 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.util.Pair r10 = r0.A02(r12, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = 0
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 != 0) goto L_0x07ff
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r5 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r5.A01()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x07e1
            r1 = 0
            goto L_0x07ef
        L_0x07e1:
            boolean r1 = r0.A0O     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r5.A05(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ClG r1 = r0.A0d     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ClG r1 = r5.A09(r1, r2, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x07ef:
            r24 = -1
            r23 = -1
            X.Caq r13 = new X.Caq     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r21 = r13
            r22 = r1
            r26 = r23
            r21.<init>(r22, r23, r24, r26)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0824
        L_0x07ff:
            java.lang.Object r1 = r10.first     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = X.BE6.A0F(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r10.second     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r1.longValue()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r1 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r13 = r1.A07(r2, r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r10.second     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.longValue()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r10 = r12.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r14 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            r16 = 0
            if (r14 != 0) goto L_0x0830
            goto L_0x082e
        L_0x0824:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x082e:
            r16 = 1
        L_0x0830:
            X.E9e r10 = r0.A0C     // Catch:{ all -> 0x08b4 }
            if (r10 == 0) goto L_0x089b
            int r10 = r0.A02     // Catch:{ all -> 0x08b4 }
            if (r10 > 0) goto L_0x089b
            int r10 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r10 != 0) goto L_0x0844
            r7 = 4
            r0.A0A(r7)     // Catch:{ all -> 0x08b4 }
            r0.A0L(r3, r4, r3)     // Catch:{ all -> 0x08b4 }
            goto L_0x08a0
        L_0x0844:
            X.CqU r10 = r0.A09     // Catch:{ all -> 0x08b4 }
            X.Caq r10 = r10.A04     // Catch:{ all -> 0x08b4 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x08b4 }
            if (r10 == 0) goto L_0x087b
            X.Cvi r10 = r0.A0b     // Catch:{ all -> 0x08b4 }
            X.CbY r11 = r10.A05     // Catch:{ all -> 0x08b4 }
            if (r11 == 0) goto L_0x0859
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0859
            goto L_0x085c
        L_0x0859:
            r21 = r1
            goto L_0x0864
        L_0x085c:
            X.ECi r8 = r11.A08     // Catch:{ all -> 0x08b4 }
            X.Ckr r7 = r0.A0B     // Catch:{ all -> 0x08b4 }
            long r21 = r8.BMc(r7, r1)     // Catch:{ all -> 0x08b4 }
        L_0x0864:
            java.util.UUID r7 = X.C24736CHy.A04     // Catch:{ all -> 0x08b4 }
            long r14 = com.facebook.android.exoplayer2.util.Util.A05(r21)     // Catch:{ all -> 0x08b4 }
            X.CqU r7 = r0.A09     // Catch:{ all -> 0x08b4 }
            long r7 = r7.A0D     // Catch:{ all -> 0x08b4 }
            long r10 = com.facebook.android.exoplayer2.util.Util.A05(r7)     // Catch:{ all -> 0x08b4 }
            int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x087d
            X.CqU r7 = r0.A09     // Catch:{ all -> 0x08b4 }
            long r1 = r7.A0D     // Catch:{ all -> 0x08b4 }
            goto L_0x08a0
        L_0x087b:
            r21 = r1
        L_0x087d:
            X.Cvi r7 = r0.A0b     // Catch:{ all -> 0x08b4 }
            X.CbY r8 = r7.A05     // Catch:{ all -> 0x08b4 }
            X.CbY r7 = r7.A06     // Catch:{ all -> 0x08b4 }
            boolean r24 = X.AnonymousClass3Ma.A1Z(r8, r7)
            r19 = r0
            r20 = r13
            r23 = r3
            long r10 = r19.A01(r20, r21, r23, r24)     // Catch:{ all -> 0x08b4 }
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0897
            r17 = 0
        L_0x0897:
            r16 = r16 | r17
            r1 = r10
            goto L_0x08a0
        L_0x089b:
            r0.A08 = r12     // Catch:{ all -> 0x08b4 }
            r7 = 0
            r0.A07 = r7     // Catch:{ all -> 0x08b4 }
        L_0x08a0:
            X.CqU r7 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10 = r7
            r11 = r13
            r12 = r1
            r14 = r5
            X.CqU r1 = r10.A01(r11, r12, r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r16 == 0) goto L_0x0d4c
            r1 = 2
            r9.A00(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x08b4:
            r8 = move-exception
            X.CqU r7 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r10 = r7
            r11 = r13
            r12 = r1
            r14 = r5
            X.CqU r1 = r10.A01(r11, r12, r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r16 == 0) goto L_0x08c7
            r1 = 2
            r9.A00(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x08c7:
            throw r8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x08c8:
            java.lang.Object r2 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cl2 r2 = (X.C25732Cl2) r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DA2 r1 = r0.A0X     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.CK1(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DA1 r1 = r0.A0h     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x08d8
            r1.CK1(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x08d8:
            X.DA0 r1 = r0.A0f     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0d4c
            r1.CK1(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x08e1:
            java.lang.Object r1 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Ckr r1 = (X.C25721Ckr) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0B = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x08e9:
            int r1 = r2.arg1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r0.A0K(r1, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x08f4:
            java.lang.Object r7 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CP5 r7 = (X.CP5) r7     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E9e r2 = r7.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E9e r1 = r0.A0C     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 != r1) goto L_0x0d4c
            X.CqU r15 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r6 = r15.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r5 = r7.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r7.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r25 = r1
            X.Cvi r7 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7.A07 = r5     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r15.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r21 = r1
            long r8 = r15.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r15.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r10 = r15.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r17 = r10
            boolean r10 = r15.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r16 = r10
            X.D3a r14 = r15.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r13 = r15.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Integer r12 = r15.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r11 = r15.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r10 = new X.CqU     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r10
            r20 = r5
            r22 = r14
            r23 = r13
            r24 = r12
            r26 = r17
            r27 = r8
            r29 = r1
            r31 = r16
            r32 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.C26013CqU.A00(r15, r10)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r10     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.util.ArrayList r8 = r0.A0i     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r8.size()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0948:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0967
            java.lang.Object r1 = r8.get(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DS8 r1 = (X.DS8) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0O(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0948
            java.lang.Object r1 = r8.get(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DS8 r1 = (X.DS8) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cbw r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.A03(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r8.remove(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0948
        L_0x0967:
            java.util.Collections.sort(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r8 = r0.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            if (r8 <= 0) goto L_0x09cf
            X.CWR r2 = r0.A0Z     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r2.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1 + r8
            r2.A01 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A02 = r3     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CP6 r1 = r0.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r8 = 0
            if (r1 == 0) goto L_0x098d
            android.util.Pair r2 = r0.A02(r1, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A08 = r8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r2 != 0) goto L_0x09bc
            goto L_0x0a85
        L_0x098d:
            X.CMg r6 = r0.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r6 == 0) goto L_0x09a0
            long r1 = r6.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r9 = r6.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A07 = r8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0997:
            X.CqU r7 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r6 = r9.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5 = -1
            if (r6 == r5) goto L_0x09f1
            goto L_0x0af3
        L_0x09a0:
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0d4c
            int r1 = r5.A01()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0a85
            boolean r1 = r0.A0O     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r5.A05(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.util.Pair r2 = r0.A03(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x09bc:
            java.lang.Object r1 = r2.first     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = X.BE6.A0F(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r2.second     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.longValue()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r9 = r7.A07(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0997
        L_0x09cf:
            X.CqU r2 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r2.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r9 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r2.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r8 = r6.A01()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r8 = X.AnonymousClass000.A1P(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r8 == 0) goto L_0x09f4
            int r5 = r5.A01()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r5 = X.AnonymousClass000.A1P(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 != 0) goto L_0x0d4c
            X.Caq r9 = r7.A07(r9, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r7 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x09f1:
            r12 = r1
            goto L_0x0af3
        L_0x09f4:
            X.CbY r11 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r11 != 0) goto L_0x0a33
            X.CbY r11 = r7.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r11 != 0) goto L_0x0a33
            X.Cao r8 = r0.A0c     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r8 = r6.A08(r8, r9, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r8 = r8.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0a04:
            int r12 = r5.A04(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r8 = -1
            if (r12 != r8) goto L_0x0a8e
            int r1 = r0.A00(r6, r5, r9)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == r8) goto L_0x0a85
            X.Cao r6 = r0.A0c     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r5.A08(r6, r1, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r1 = r1.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.util.Pair r2 = r0.A03(r5, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r2.first     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r10 = X.BE6.A0F(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r2.second     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.longValue()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r9 = r7.A07(r10, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.A08(r6, r10, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0a36
        L_0x0a33:
            java.lang.Object r8 = r11.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0a04
        L_0x0a36:
            if (r11 == 0) goto L_0x0ae2
            java.lang.Object r13 = r6.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0a3a:
            X.CTA r12 = r11.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r5 = r12.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r20 = r5.A00(r8)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r12.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r23 = r5
            long r5 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r25 = r5
            long r15 = r12.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r12.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r14 = r12.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r17 = r14
            boolean r12 = r12.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r14 = r12
            X.CTA r12 = new X.CTA     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r12
            r21 = r23
            r23 = r25
            r25 = r15
            r27 = r5
            r29 = r17
            r30 = r14
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0a68:
            r11.A02 = r12     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r5 = r11.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x0ae2
            X.CbY r11 = r11.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r5 = r11.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r5 = r5.equals(r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == 0) goto L_0x0a3a
            X.CTA r6 = r11.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r5 = r6.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r5 = r5.A00(r10)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r12 = X.C26244Cvi.A01(r6, r7, r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0a68
        L_0x0a85:
            r1 = 4
            r0.A0A(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0L(r3, r4, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0a8e:
            if (r12 == r9) goto L_0x0ad0
            X.CqU r14 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r5 = r14.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r20 = r5
            java.lang.Object r5 = r14.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r25 = r5
            X.Caq r5 = r14.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r21 = r5.A00(r12)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r9 = r14.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r14.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r11 = r14.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r26 = r11
            boolean r11 = r14.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r31 = r11
            X.D3a r11 = r14.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r17 = r11
            X.CSJ r11 = r14.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r16 = r11
            java.lang.Integer r15 = r14.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r13 = r14.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r11 = new X.CqU     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r11
            r22 = r17
            r23 = r16
            r24 = r15
            r27 = r9
            r29 = r5
            r32 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.C26013CqU.A00(r14, r11)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r11     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0ad0:
            X.CqU r5 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r6 = r5.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = r6.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 == r8) goto L_0x0afe
            X.Caq r9 = r7.A07(r12, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r5 = r9.equals(r6)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 != 0) goto L_0x0afe
        L_0x0ae2:
            X.CbY r6 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r5 = r7.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r13 = X.AnonymousClass3Ma.A1Z(r6, r5)
            r8 = r0
            r10 = r1
            r12 = r3
            long r12 = r8.A01(r9, r10, r12, r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r7 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0af3:
            r10 = r7
            r11 = r9
            r14 = r1
            X.CqU r1 = r10.A01(r11, r12, r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0afe:
            long r14 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r13 = r6.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r12 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r12 != 0) goto L_0x0b0a
            X.CbY r12 = r7.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r11 = 0
            goto L_0x0b3c
        L_0x0b0a:
            X.CTA r2 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r2.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r1.A00(r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = X.C26244Cvi.A01(r2, r7, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12.A02 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0b18:
            X.CTA r1 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0b38
            com.facebook.android.exoplayer2.Timeline r9 = r7.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r6 = r7.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ClG r5 = r7.A0B     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r2 = r7.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r7.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r9
            r20 = r6
            r21 = r5
            r22 = r13
            r23 = r2
            r24 = r1
            int r13 = r19.A03(r20, r21, r22, r23, r24)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0b38:
            X.CbY r1 = r12.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r11 = r12
            r12 = r1
        L_0x0b3c:
            if (r12 == 0) goto L_0x0d4c
            if (r11 == 0) goto L_0x0b0a
            if (r13 == r8) goto L_0x0b83
            java.lang.Object r5 = r12.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            com.facebook.android.exoplayer2.Timeline r2 = r7.A07     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r7.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cao r1 = r2.A08(r1, r13, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Object r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r5.equals(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0b83
            X.CTA r10 = X.C26244Cvi.A00(r11, r7, r14)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r10 == 0) goto L_0x0b83
            X.CTA r2 = r12.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r2.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r1.A00(r13)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r9 = X.C26244Cvi.A01(r2, r7, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r12.A02 = r9     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r9.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r10.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r16 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0b83
            long r5 = r9.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r10.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r16 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0b83
            X.Caq r2 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r1 = r10.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r2.equals(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0b83
            goto L_0x0b18
        L_0x0b83:
            boolean r1 = r7.A09(r11)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0d4c
            r0.A0I(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0b90:
            java.lang.Object r2 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECi r2 = (X.C28649ECi) r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r8 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r7 = r8.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r7 == 0) goto L_0x0d4c
            X.ECi r1 = r7.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != r2) goto L_0x0d4c
            X.DA2 r1 = r0.A0X     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.BXC()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7.A07 = r4     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECi r1 = r7.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r1 = r1.Bag()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7.A03 = r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7.A02()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r7.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.E7M[] r5 = r7.A0A     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            int r5 = r5.length     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean[] r5 = new boolean[r5]     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r21 = r7.A00(r5, r1, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r7.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r9 = r7.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r9.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1 - r21
            long r5 = r5 + r1
            r7.A00 = r5     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Caq r14 = r9.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r10 = r9.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r9.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r9.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r12 = r9.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r13 = r9.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r9 = new X.CTA     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r19 = r9
            r20 = r14
            r23 = r10
            r25 = r5
            r27 = r1
            r29 = r12
            r30 = r13
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7.A02 = r9     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.D3a r6 = r7.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CSJ r1 = r7.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.EAG r5 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECg[] r2 = r0.A0o     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECj[] r1 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.C94(r6, r2, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r8.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0c09
            X.CbY r1 = r8.A06()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CTA r1 = r1.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0B(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 0
            r0.A0D(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0c09:
            boolean r1 = r0.A0H     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0c12
            boolean r1 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2 = 2
            if (r1 == 0) goto L_0x0c13
        L_0x0c12:
            r2 = 0
        L_0x0c13:
            boolean r1 = r0.A0l     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A09(r2, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r2 = r0.A0K     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r8.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0c32
            X.ECi r1 = r1.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.CK0(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0c32
        L_0x0c24:
            java.lang.Object r2 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.ECi r2 = (X.C28649ECi) r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r1 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r1.A04     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0d4c
            X.ECi r1 = r1.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != r2) goto L_0x0d4c
        L_0x0c32:
            r0.A0H(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0c37:
            int r2 = r2.arg1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A03 = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r1 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.A01 = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.C26244Cvi.A04(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0d4c
            goto L_0x0c58
        L_0x0c46:
            int r1 = r2.arg1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r2 = X.AnonymousClass000.A1O(r1)
            r0.A0O = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r1 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.A09 = r2     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = X.C26244Cvi.A04(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0d4c
        L_0x0c58:
            r0.A0I(r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0c5d:
            java.lang.Object r6 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cbw r6 = (X.C25257Cbw) r6     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r6.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0c71
            r0.A0E(r6)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0c71:
            X.E9e r1 = r0.A0C     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0cc5
            int r1 = r0.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 > 0) goto L_0x0cc5
            X.DS8 r2 = new X.DS8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2.<init>(r6)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r0.A0O(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0ca5
            java.util.ArrayList r1 = r0.A0i     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.add(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.util.Collections.sort(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0c8e:
            java.lang.Object r6 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cbw r6 = (X.C25257Cbw) r6     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Looper r5 = r6.A03     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.Thread r1 = r5.getThread()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            boolean r1 = r1.isAlive()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 != 0) goto L_0x0caa
            java.lang.String r2 = "TAG"
            java.lang.String r1 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0ca5:
            r6.A03(r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0caa:
            r2 = 0
            java.util.List r1 = X.C25936Cp1.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.<init>(r5, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cp1 r5 = new X.Cp1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.<init>(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = 36
            X.Akc r2 = new X.Akc     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2.<init>((java.lang.Object) r0, (java.lang.Object) r6, (int) r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            android.os.Handler r1 = r5.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.post(r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0cc5:
            java.util.ArrayList r2 = r0.A0i     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DS8 r1 = new X.DS8     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1.<init>(r6)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r2.add(r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0cd0:
            java.lang.Object r9 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CMg r9 = (X.C24838CMg) r9     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r9.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cvi r10 = r0.A0b     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CbY r1 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r1 == 0) goto L_0x0d4c
            X.ECi r2 = r1.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Ckr r1 = X.C25721Ckr.A02     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r2.BMc(r1, r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r1 - r5
            long r13 = java.lang.Math.abs(r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r11 = 1200000(0x124f80, double:5.92879E-318)
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0d04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            java.lang.String r1 = "Unable to find keyframe, skip fast seek. Distance: "
            java.lang.String r2 = X.C17890vO.A0a(r1, r2, r7)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0d04:
            X.CbY r10 = r10.A05     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r10 != 0) goto L_0x0d0b
            r12 = 0
            goto L_0x0d16
        L_0x0d0b:
            long r5 = r0.A06     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r7 = r10.A00     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r5 = r5 - r7
            X.ECi r7 = r10.A08     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r12 = r7.BNp(r5)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0d16:
            long r5 = r0.A0P()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r12 = r12 + r5
            X.EAG r6 = r0.A0a     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.DA2 r5 = r0.A0X     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.Cl2 r5 = r5.BXC()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            float r5 = r5.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r15 = r3
            r10 = r6
            r11 = r5
            r14 = r3
            boolean r5 = r10.CMR(r11, r12, r14, r15)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            if (r5 != 0) goto L_0x0d3a
            java.lang.String r2 = "Can't start playback now, skip fast seek"
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CqU r1 = r0.A09     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            long r1 = r1.A0D     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0d3a:
            X.Caq r6 = r9.A01     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CMg r5 = new X.CMg     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r5.<init>(r6, r1)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0C(r5, r4)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            goto L_0x0d4c
        L_0x0d45:
            java.lang.Object r1 = r2.obj     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            X.CMg r1 = (X.C24838CMg) r1     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            r0.A0C(r1, r3)     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
        L_0x0d4c:
            r0.A04()     // Catch:{ BOK -> 0x0d64, IOException -> 0x0d50, RuntimeException -> 0x0d72 }
            return r4
        L_0x0d50:
            r5 = move-exception
            java.lang.String r2 = "Source error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            r1 = 2000(0x7d0, float:2.803E-42)
            X.BOK r5 = X.BOK.A00(r5, r3, r1)
            goto L_0x0d86
        L_0x0d64:
            r5 = move-exception
            java.lang.String r2 = "Playback error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            goto L_0x0d86
        L_0x0d72:
            r5 = move-exception
            java.lang.String r2 = "Internal runtime error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            r2 = 2
            r1 = 1000(0x3e8, float:1.401E-42)
            X.BOK r5 = X.BOK.A00(r5, r2, r1)
        L_0x0d86:
            r1 = 2
            X.BE7.A18(r6, r5, r1)
            r0.A04()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9J.handleMessage(android.os.Message):boolean");
    }

    private long A01(C25199Caq caq, long j, boolean z, boolean z2) {
        A07();
        this.A0M = false;
        A0A(2);
        C26244Cvi cvi = this.A0b;
        C25237CbY cbY = cvi.A05;
        C25237CbY cbY2 = cbY;
        while (true) {
            if (cbY2 == null) {
                break;
            }
            C25199Caq caq2 = cbY2.A02.A04;
            if (caq.equals(caq2) && cbY2.A07) {
                Timeline timeline = this.A09.A03;
                int i = caq2.A02;
                C25197Cao cao = this.A0c;
                timeline.A08(cao, i, false);
                int A002 = cao.A00(j);
                if (A002 == -1 || cao.A02.A00[A002] == cbY2.A02.A02) {
                    cvi.A09(cbY2);
                }
            }
            cbY2 = cvi.A06();
        }
        cvi.A09(cbY2);
        if (cbY != cbY2 || z2) {
            for (ECg A0G2 : this.A0P) {
                A0G(A0G2);
            }
            this.A0P = new ECg[0];
            cbY = null;
        }
        if (cbY2 != null) {
            A0D(cbY);
            if (cbY2.A06) {
                C28649ECi eCi = cbY2.A08;
                j = eCi.CHB(j, z);
                eCi.BIl(j - this.A0T, this.A0k);
            }
            A0B(j);
            A0H(this.A0Q);
        } else {
            cvi.A08(true);
            A0B(j);
        }
        this.A0g.A00.sendEmptyMessage(2);
        return j;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.CWR, java.lang.Object] */
    public D9J(Handler handler, C26206Cue cue, EAG eag, C25935Cp0 cp0, C5B c5b, CSJ csj, C28409E0a e0a, C28617EAp eAp, ECg[] eCgArr, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ECg[] eCgArr2 = eCgArr;
        this.A0o = eCgArr2;
        C5B c5b2 = c5b;
        this.A0e = c5b2;
        CSJ csj2 = csj;
        this.A0q = csj2;
        EAG eag2 = eag;
        this.A0a = eag2;
        C28409E0a e0a2 = e0a;
        this.A0r = e0a2;
        this.A0K = z;
        this.A03 = i;
        this.A0O = false;
        this.A0V = handler;
        this.A0Y = cue;
        C28617EAp eAp2 = eAp;
        this.A0s = eAp2;
        this.A0b = new C26244Cvi();
        this.A0S = z2;
        this.A0E = z3;
        this.A0Q = z4;
        this.A0H = z5;
        this.A0F = z6;
        this.A0R = z7;
        this.A0U = j;
        this.A0j = z8;
        this.A00 = i2;
        this.A0n = z10;
        this.A0m = z9;
        this.A0l = z11;
        this.A0J = z12;
        this.A0L = z13;
        this.A0G = z14;
        this.A0I = AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1)));
        this.A0T = eag2.BNH();
        this.A0k = eag2.CG3();
        this.A0B = C25721Ckr.A03;
        this.A09 = new C26013CqU(Timeline.A00, C26539D3a.A03, csj2, -9223372036854775807L);
        DA1 da1 = null;
        this.A0Z = new Object();
        int length = eCgArr2.length;
        E7M[] e7mArr = new E7M[length];
        this.A0p = e7mArr;
        for (int i3 = 0; i3 < length; i3++) {
            C26659D8i d8i = eCgArr[i3];
            d8i.A00 = i3;
            d8i.A05 = cp0;
            e7mArr[i3] = d8i;
        }
        this.A0X = new DA2(this, eAp2);
        this.A0f = new DA0(eAp2);
        this.A0h = z10 ? new DA1(eAp2) : da1;
        this.A0i = AnonymousClass000.A13();
        this.A0P = new ECg[0];
        this.A0d = new C25746ClG();
        this.A0c = new C25197Cao();
        c5b2.A00 = this;
        c5b2.A01 = e0a2;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0W = handlerThread;
        Looper A0G2 = BE7.A0G(handlerThread);
        List list = C25936Cp1.A01;
        this.A0g = new C25936Cp1(new Handler(A0G2, this));
    }
}
