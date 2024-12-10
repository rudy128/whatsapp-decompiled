package X;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;

public final class D9O implements C28649ECi, C28569E8a {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public E8W A07;
    public C28648ECh A08;
    public C26539D3a A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public D91[] A0H;
    public boolean[] A0I;
    public boolean[] A0J;
    public boolean[] A0K;
    public boolean A0L;
    public boolean A0M;
    public int[] A0N;
    public final Handler A0O;
    public final CPC A0P;
    public final C22785BOy A0Q;
    public final C26154CtM A0R;
    public final C25667Cjx A0S = new C25667Cjx("Loader:ExtractorMediaPeriod");
    public final C25717Ckn A0T;
    public final Runnable A0U;
    public final Runnable A0V;
    public final Uri A0W;
    public final E9Q A0X;
    public final C25215CbB A0Y;

    public D9O(Uri uri, C22785BOy bOy, C26154CtM ctM, E9Q e9q, C25215CbB cbB, C28585E8y[] e8yArr) {
        this.A0W = uri;
        this.A0X = e9q;
        this.A0R = ctM;
        this.A0Q = bOy;
        this.A0Y = cbB;
        this.A0P = new CPC(this, e8yArr);
        this.A0T = new C25717Ckn();
        this.A0U = new C21466AkX(this, 40);
        this.A0V = new C21466AkX(this, 41);
        this.A0O = new Handler();
        this.A0N = new int[0];
        this.A0H = new D91[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 3;
        ctM.A02();
    }

    public void BEV(long j) {
    }

    public void CK0(boolean z) {
    }

    public void CQr(byte b, boolean z) {
    }

    private long A00() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (D91 d91 : this.A0H) {
            C25698CkT ckT = d91.A09;
            synchronized (ckT) {
                j = ckT.A06;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    private void A01() {
        C26695D9t d9t = new C26695D9t(this.A0W, this.A0P, this, this.A0X, this.A0T);
        if (this.A0E) {
            long j = this.A06;
            C26056CrS.A03(AnonymousClass000.A1O((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
            long j2 = this.A03;
            if (j2 == -9223372036854775807L || j < j2) {
                long j3 = this.A07.BYo(j).A00.A00;
                long j4 = this.A06;
                d9t.A05.A00 = j3;
                d9t.A02 = j4;
                d9t.A04 = true;
                this.A06 = -9223372036854775807L;
            } else {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
        }
        int i = 0;
        for (D91 d91 : this.A0H) {
            C25698CkT ckT = d91.A09;
            i += ckT.A00 + ckT.A02;
        }
        this.A02 = i;
        this.A0S.A00(this, d9t, this.A00);
        this.A0R.A07(new CJ1(d9t.A03), new CTB((D48) null, (Object) null, 1, -1, 0, C26154CtM.A00(d9t.A02), C26154CtM.A00(this.A03)));
    }

    public static void A02(D48 d48, D9O d9o, int i) {
        D48 d482 = BE8.A0L(d9o.A09, i).A02[0];
        if (!d9o.A0J[i] || !d482.equals(d48)) {
            BE8.A0L(d9o.A09, i).A02[0] = d48;
            d9o.A0R.A05(d48, C26233CvQ.A01(d48.A0S), d9o.A04);
            d9o.A0J[i] = true;
        }
    }

    public static void A03(D9O d9o, int i) {
        if (d9o.A0D && d9o.A0K[i] && !d9o.A0H[i].A09.A01()) {
            d9o.A06 = 0;
            d9o.A0D = false;
            d9o.A0C = true;
            d9o.A04 = 0;
            d9o.A02 = 0;
            for (D91 A052 : d9o.A0H) {
                A052.A05();
            }
            d9o.A08.BqD(d9o);
        }
    }

    public static boolean A04(D9O d9o) {
        if (d9o.A0C || d9o.A06 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public C28586E8z A05(int i) {
        D91[] d91Arr = this.A0H;
        int length = d91Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.A0N[i2] == i) {
                return d91Arr[i2];
            }
        }
        D91 d91 = new D91(this.A0Y);
        d91.A03 = this;
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0N, i3);
        this.A0N = copyOf;
        copyOf[length] = i;
        D91[] d91Arr2 = (D91[]) Arrays.copyOf(this.A0H, i3);
        this.A0H = d91Arr2;
        d91Arr2[length] = d91;
        return d91;
    }

    public boolean BFn(long j, long j2) {
        if (this.A0B || this.A0D || (this.A0E && this.A01 == 0)) {
            return false;
        }
        boolean A012 = this.A0T.A01();
        if (this.A0S.A00 != null) {
            return A012;
        }
        A01();
        return true;
    }

    public void BIl(long j, boolean z) {
        long j2;
        int i;
        int length = this.A0H.length;
        for (int i2 = 0; i2 < length; i2++) {
            D91 d91 = this.A0H[i2];
            boolean z2 = this.A0I[i2];
            C25698CkT ckT = d91.A09;
            synchronized (ckT) {
                int i3 = ckT.A02;
                if (i3 != 0) {
                    long[] jArr = ckT.A0E;
                    int i4 = ckT.A04;
                    if (j >= jArr[i4]) {
                        if (z2 && (i = ckT.A03) != i3) {
                            i3 = i + 1;
                        }
                        int i5 = -1;
                        for (int i6 = 0; i6 < i3 && jArr[i4] <= j; i6++) {
                            if (!z || (ckT.A0A[i4] & 1) != 0) {
                                i5 = i6;
                            }
                            i4++;
                            if (i4 == ckT.A01) {
                                i4 = 0;
                            }
                        }
                        if (i5 != -1) {
                            j2 = C25698CkT.A00(ckT, i5);
                        }
                    }
                }
                j2 = -1;
            }
            D91.A01(d91, j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r7 > r3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BMc(X.C25721Ckr r18, long r19) {
        /*
            r17 = this;
            r9 = r19
            r0 = r17
            X.E8W r1 = r0.A07
            boolean r0 = r1.BgN()
            if (r0 != 0) goto L_0x000f
            r9 = 0
            return r9
        L_0x000f:
            X.Ca6 r1 = r1.BYo(r9)
            X.Cls r0 = r1.A00
            long r7 = r0.A01
            X.Cls r0 = r1.A01
            long r5 = r0.A01
            r11 = r18
            long r3 = r11.A01
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            long r0 = r11.A00
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            return r9
        L_0x002c:
            long r13 = r19 - r3
            long r3 = r3 ^ r19
            long r1 = r19 ^ r13
            long r1 = r1 & r3
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            r13 = -9223372036854775808
        L_0x0039:
            long r11 = r11.A00
            long r3 = r19 + r11
            long r1 = r19 ^ r3
            long r11 = r11 ^ r3
            long r1 = r1 & r11
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004a:
            r2 = 1
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
        L_0x005d:
            if (r1 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0071
            long r0 = r7 - r19
            long r3 = java.lang.Math.abs(r0)
            long r0 = r5 - r19
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
        L_0x0071:
            return r7
        L_0x0072:
            r2 = 0
            goto L_0x005d
        L_0x0074:
            if (r2 != 0) goto L_0x0077
            return r13
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9O.BMc(X.Ckr, long):long");
    }

    public long BNp(long j) {
        long BNq;
        if (this.A0B) {
            BNq = this.A03;
        } else {
            BNq = BNq();
        }
        return BNq - j;
    }

    public long BNq() {
        long j;
        long j2;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        long j3 = this.A06;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        if (this.A0A) {
            int length = this.A0H.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.A0K[i]) {
                    C25698CkT ckT = this.A0H[i].A09;
                    synchronized (ckT) {
                        j2 = ckT.A06;
                    }
                    j = Math.min(j, j2);
                }
            }
        } else {
            j = A00();
        }
        if (j == Long.MIN_VALUE) {
            return this.A04;
        }
        return j;
    }

    public long BVO() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return BNq();
    }

    public C26539D3a Bag() {
        return this.A09;
    }

    public void BjV() {
        IOException iOException;
        C25667Cjx cjx = this.A0S;
        int i = this.A00;
        IOException iOException2 = cjx.A01;
        if (iOException2 == null) {
            BG8 bg8 = cjx.A00;
            if (bg8 != null && (iOException = bg8.A01) != null && bg8.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public /* bridge */ /* synthetic */ void Bwq(E7O e7o, boolean z) {
        C26695D9t d9t = (C26695D9t) e7o;
        this.A0R.A06(new CJ1(d9t.A03), new CTB((D48) null, (Object) null, 1, -1, 0, C26154CtM.A00(d9t.A02), C26154CtM.A00(this.A03)));
        if (!z) {
            if (this.A05 == -1) {
                this.A05 = d9t.A01;
            }
            for (D91 A052 : this.A0H) {
                A052.A05();
            }
            if (this.A01 > 0) {
                this.A08.BqD(this);
            }
        }
    }

    public /* bridge */ /* synthetic */ void Bws(E7O e7o) {
        long j;
        C26695D9t d9t = (C26695D9t) e7o;
        if (this.A03 == -9223372036854775807L) {
            long A002 = A00();
            if (A002 == Long.MIN_VALUE) {
                j = 0;
            } else {
                j = A002 + 10000;
            }
            this.A03 = j;
            this.A0Q.A07(j, this.A07.BgN());
        }
        this.A0R.A09(new CJ1(d9t.A03), new CTB((D48) null, (Object) null, 1, -1, 0, C26154CtM.A00(d9t.A02), C26154CtM.A00(this.A03)), d9t);
        if (this.A05 == -1) {
            this.A05 = d9t.A01;
        }
        this.A0B = true;
        this.A08.BqD(this);
    }

    public /* bridge */ /* synthetic */ CJ6 Bww(E7O e7o, IOException iOException) {
        boolean z;
        E8W e8w;
        C26695D9t d9t = (C26695D9t) e7o;
        IOException iOException2 = iOException;
        if ((iOException2 instanceof BOJ) || ((iOException2 instanceof BPM) && ((BPM) iOException2).responseCode == 410)) {
            z = true;
        } else {
            z = false;
        }
        this.A0R.A08(new CJ1(d9t.A03), new CTB((D48) null, (Object) null, 1, -1, 0, C26154CtM.A00(d9t.A02), C26154CtM.A00(this.A03)), iOException2, z);
        long j = this.A05;
        if (j == -1) {
            j = d9t.A01;
            this.A05 = j;
        }
        if (z) {
            return C25667Cjx.A04;
        }
        D91[] d91Arr = this.A0H;
        int i = 0;
        for (D91 d91 : d91Arr) {
            C25698CkT ckT = d91.A09;
            i += ckT.A00 + ckT.A02;
        }
        boolean A1D = C108975cc.A1D(i, this.A02);
        if (j == -1 && ((e8w = this.A07) == null || e8w.BR1() == -9223372036854775807L)) {
            boolean z2 = this.A0E;
            if (!z2 || A04(this)) {
                this.A0C = z2;
                this.A04 = 0;
                this.A02 = 0;
                for (D91 A052 : d91Arr) {
                    A052.A05();
                }
                d9t.A05.A00 = 0;
                d9t.A02 = 0;
                d9t.A04 = true;
            } else {
                this.A0D = true;
                return C25667Cjx.A03;
            }
        } else {
            this.A02 = i;
        }
        if (A1D) {
            return C25667Cjx.A06;
        }
        return C25667Cjx.A05;
    }

    public void CCK(C28648ECh eCh, long j) {
        this.A08 = eCh;
        this.A0T.A01();
        A01();
    }

    public long CDQ() {
        if (!this.A0L) {
            this.A0R.A04();
            this.A0L = true;
        }
        if (!this.A0C) {
            return -9223372036854775807L;
        }
        if (!this.A0B) {
            int i = 0;
            for (D91 d91 : this.A0H) {
                C25698CkT ckT = d91.A09;
                i += ckT.A00 + ckT.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0C = false;
        return this.A04;
    }

    public long CHB(long j, boolean z) {
        if (!this.A07.BgN()) {
            j = 0;
        }
        this.A04 = j;
        this.A0C = false;
        if (this.A06 == -9223372036854775807L) {
            int length = this.A0H.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                D91 d91 = this.A0H[i];
                C25698CkT ckT = d91.A09;
                synchronized (ckT) {
                    ckT.A03 = 0;
                }
                d91.A05 = d91.A04;
                if (d91.A03(false, j) == -1 && (this.A0K[i] || !this.A0A)) {
                    break;
                }
                i++;
            }
            return j;
        }
        this.A0D = false;
        this.A06 = j;
        this.A0B = false;
        BG8 bg8 = this.A0S.A00;
        if (bg8 != null) {
            bg8.A00(false);
        } else {
            for (D91 A052 : this.A0H) {
                A052.A05();
            }
        }
        return j;
    }

    public long CHG(E90[] e90Arr, C28650ECj[] eCjArr, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        C26679D9c d9c;
        C26056CrS.A03(this.A0E);
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = eCjArr.length;
            if (i4 >= length) {
                break;
            }
            D9T d9t = e90Arr[i4];
            if (d9t != null && (eCjArr[i4] == null || !zArr[i4])) {
                int i5 = d9t.A00;
                boolean[] zArr3 = this.A0I;
                C26056CrS.A03(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                e90Arr[i4] = null;
            }
            i4++;
        }
        if (!this.A0M ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (e90Arr[i6] == null && (d9c = eCjArr[i6]) != null) {
                C26679D9c d9c2 = d9c;
                int[] iArr = d9c2.A03;
                C26056CrS.A03(AnonymousClass000.A1T(iArr.length, 1));
                C26056CrS.A03(AnonymousClass000.A1P(iArr[0]));
                int indexOf = this.A09.A02.indexOf(d9c2.A02);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                boolean[] zArr4 = this.A0I;
                C26056CrS.A03(!zArr4[indexOf]);
                this.A01++;
                zArr4[indexOf] = true;
                e90Arr[i6] = new D9T(this, indexOf);
                zArr2[i6] = true;
                if (!z) {
                    D91 d91 = this.A0H[indexOf];
                    C25698CkT ckT = d91.A09;
                    synchronized (ckT) {
                        ckT.A03 = 0;
                    }
                    d91.A05 = d91.A04;
                    if (d91.A03(true, j) == -1) {
                        C25698CkT ckT2 = d91.A09;
                        z = true;
                        if (ckT2.A00 + ckT2.A03 != 0) {
                        }
                    }
                    z = false;
                } else {
                    continue;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0D = false;
            this.A0C = false;
            C25667Cjx cjx = this.A0S;
            boolean A1W = AnonymousClass000.A1W(cjx.A00);
            D91[] d91Arr = this.A0H;
            int length2 = d91Arr.length;
            if (A1W) {
                while (i3 < length2) {
                    d91Arr[i3].A04();
                    i3++;
                }
                BG8 bg8 = cjx.A00;
                C26056CrS.A01(bg8);
                bg8.A00(false);
            } else {
                while (i3 < length2) {
                    d91Arr[i3].A05();
                    i3++;
                }
            }
        } else if (z) {
            j = CHB(j, false);
            while (i3 < e90Arr.length) {
                if (e90Arr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0M = true;
        return j;
    }
}
