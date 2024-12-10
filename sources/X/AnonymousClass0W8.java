package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.0W8  reason: invalid class name */
public final class AnonymousClass0W8 implements Alignment {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0W8) {
                AnonymousClass0W8 r5 = (AnonymousClass0W8) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public long BC1(C24246By4 by4, long j, long j2) {
        float f;
        float f2 = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float f3 = ((float) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) / 2.0f;
        if (by4 == C24246By4.Ltr) {
            f = this.A00;
        } else {
            f = -1.0f * this.A00;
        }
        return C7A.A00(C22339B3q.A01(f2 * (1.0f + f)), C22339B3q.A01(f3 * (1.0f + this.A01)));
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public AnonymousClass0W8(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BiasAlignment(horizontalBias=");
        A10.append(this.A00);
        A10.append(", verticalBias=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
