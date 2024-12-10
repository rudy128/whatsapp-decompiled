package X;

import java.util.Arrays;

/* renamed from: X.1sH  reason: invalid class name and case insensitive filesystem */
public class C38971sH {
    public static int A0C = 1;
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public Integer A06;
    public boolean A07;
    public boolean A08 = false;
    public float[] A09 = new float[9];
    public float[] A0A = new float[9];
    public C38991sJ[] A0B = new C38991sJ[16];

    public void A00() {
        this.A06 = AnonymousClass00R.A0Y;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public final void A02(C38991sJ r4) {
        int i = 0;
        while (true) {
            int i2 = this.A03;
            if (i >= i2) {
                C38991sJ[] r1 = this.A0B;
                int length = r1.length;
                if (i2 >= length) {
                    r1 = (C38991sJ[]) Arrays.copyOf(r1, length * 2);
                    this.A0B = r1;
                }
                int i3 = this.A03;
                r1[i3] = r4;
                this.A03 = i3 + 1;
                return;
            } else if (this.A0B[i] != r4) {
                i++;
            } else {
                return;
            }
        }
    }

    public void A01(float f) {
        this.A00 = f;
        this.A08 = true;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            C38991sJ r3 = this.A0B[i2];
            C39041sO r2 = r3.A01;
            r3.A00 += r2.BLx(this) * f;
            r2.CET(this, false);
        }
        this.A03 = 0;
    }

    public final void A03(C38991sJ r6) {
        int i = this.A03;
        int i2 = 0;
        while (i2 < i) {
            C38991sJ[] r2 = this.A0B;
            if (r2[i2] != r6) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        r2[i2] = r2[i4];
                        i2 = i4;
                    } else {
                        this.A03 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A04(C38991sJ r5) {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A03(r5, false);
        }
        this.A03 = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.A02);
        return sb.toString();
    }

    public C38971sH(Integer num) {
        this.A06 = num;
    }
}
