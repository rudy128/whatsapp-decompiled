package X;

import java.util.Random;

/* renamed from: X.Ct1  reason: case insensitive filesystem */
public class C26138Ct1 {
    public static final C26138Ct1 A06 = new C26138Ct1(true);
    public static final C26138Ct1 A07 = new C26138Ct1(true);
    public static final C26138Ct1 A08 = new C26138Ct1(true);
    public static final C26138Ct1 A09 = new C26138Ct1(true);
    public static final C26138Ct1 A0A = new C26138Ct1(true);
    public static final C26138Ct1 A0B = new C26138Ct1(true);
    public static final C26138Ct1 A0C;
    public static final C26138Ct1 A0D;
    public static final C26138Ct1 A0E;
    public static final C26138Ct1 A0F = new C26138Ct1(false);
    public static final C26138Ct1 A0G;
    public static final C26138Ct1 A0H;
    public static final C26138Ct1 A0I = new C26138Ct1(true);
    public static final C26138Ct1 A0J = new C26138Ct1(true);
    public static final C26138Ct1 A0K = new C26138Ct1(true);
    public static final C26138Ct1 A0L;
    public static final C26138Ct1 A0M;
    public static final C26138Ct1 A0N = new C26138Ct1(false);
    public static final C26138Ct1 A0O;
    public static final C26138Ct1[] A0P;
    public static final Random A0Q = new Random();
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long[] A04;
    public final boolean A05;

    static {
        C26138Ct1 ct1 = new C26138Ct1(false);
        A0C = ct1;
        C26138Ct1 ct12 = new C26138Ct1(false);
        A0E = ct12;
        C26138Ct1 ct13 = new C26138Ct1(true);
        A0M = ct13;
        C26138Ct1 ct14 = new C26138Ct1(true);
        A0L = ct14;
        C26138Ct1 ct15 = new C26138Ct1(true);
        A0O = ct15;
        C26138Ct1 ct16 = new C26138Ct1(false);
        A0G = ct16;
        C26138Ct1 ct17 = new C26138Ct1(false);
        A0H = ct17;
        C26138Ct1 ct18 = new C26138Ct1(false);
        A0D = ct18;
        C26138Ct1[] ct1Arr = new C26138Ct1[8];
        ct1Arr[0] = ct1;
        ct1Arr[1] = ct12;
        AnonymousClass001.A1R(ct13, ct14, ct1Arr);
        C17900vP.A0P(ct15, ct16, ct17, ct18, ct1Arr);
        A0P = ct1Arr;
    }

    public void A02() {
        synchronized (this) {
        }
    }

    private void A00(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0Q.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            A03();
        }
    }

    public static void A01(C26138Ct1 ct1) {
        ct1.A01 = Long.MIN_VALUE;
        ct1.A02 = Long.MAX_VALUE;
        ct1.A03 = 0;
    }

    public void A03() {
        if (this.A05) {
            synchronized (this) {
                A01(this);
                this.A00 = 0;
            }
            return;
        }
        A01(this);
        this.A00 = 0;
    }

    public void A04(long j) {
        if (this.A05) {
            synchronized (this) {
                A00(j);
            }
            return;
        }
        A00(j);
    }

    public C26138Ct1(boolean z) {
        A01(this);
        this.A05 = z;
    }
}
