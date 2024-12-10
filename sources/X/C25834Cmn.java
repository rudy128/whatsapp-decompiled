package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.Cmn  reason: case insensitive filesystem */
public final class C25834Cmn {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25834Cmn cmn = (C25834Cmn) obj;
            if (!(this.A04 == cmn.A04 && this.A05 == cmn.A05)) {
                return false;
            }
        }
        return true;
    }

    private void A00() {
        int A062;
        int A063;
        if (!this.A02) {
            int i = this.A05;
            int A042 = AnonymousClass1Z2.A04(4.5f, -1, i);
            int A043 = AnonymousClass1Z2.A04(3.0f, -1, i);
            if (A042 == -1 || A043 == -1) {
                int A044 = AnonymousClass1Z2.A04(4.5f, -16777216, i);
                int A045 = AnonymousClass1Z2.A04(3.0f, -16777216, i);
                if (A044 == -1 || A045 == -1) {
                    if (A042 != -1) {
                        A062 = AnonymousClass1Z2.A06(-1, A042);
                    } else {
                        A062 = AnonymousClass1Z2.A06(-16777216, A044);
                    }
                    this.A00 = A062;
                    if (A043 != -1) {
                        A063 = AnonymousClass1Z2.A06(-1, A043);
                    } else {
                        A063 = AnonymousClass1Z2.A06(-16777216, A045);
                    }
                } else {
                    this.A00 = AnonymousClass1Z2.A06(-16777216, A044);
                    A063 = AnonymousClass1Z2.A06(-16777216, A045);
                }
            } else {
                this.A00 = AnonymousClass1Z2.A06(-1, A042);
                A063 = AnonymousClass1Z2.A06(-1, A043);
            }
            this.A01 = A063;
            this.A02 = true;
        }
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        AnonymousClass1Z2.A07(this.A08, this.A07, fArr, this.A06);
        return fArr;
    }

    public int hashCode() {
        return (this.A05 * 31) + this.A04;
    }

    public C25834Cmn(int i, int i2) {
        this.A08 = Color.red(i);
        this.A07 = Color.green(i);
        this.A06 = Color.blue(i);
        this.A05 = i;
        this.A04 = i2;
    }

    public String toString() {
        StringBuilder A0u = BE6.A0u(C108955ca.A0x(this));
        A0u.append(" [RGB: #");
        BE7.A10(this.A05, A0u);
        A0u.append(']');
        A0u.append(" [HSL: ");
        A0u.append(Arrays.toString(A01()));
        A0u.append(']');
        A0u.append(" [Population: ");
        A0u.append(this.A04);
        A0u.append(']');
        A0u.append(" [Title Text: #");
        A00();
        BE7.A10(this.A01, A0u);
        A0u.append(']');
        A0u.append(" [Body Text: #");
        A00();
        return AnonymousClass8BW.A0l(Integer.toHexString(this.A00), A0u, ']');
    }
}
