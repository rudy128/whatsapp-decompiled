package X;

import android.hardware.Camera;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.Csv  reason: case insensitive filesystem */
public class C26132Csv {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26132Csv)) {
            return false;
        }
        C26132Csv csv = (C26132Csv) obj;
        return this.A02 == csv.A02 && this.A01 == csv.A01;
    }

    public static int A00(C26132Csv csv) {
        return csv.A02 * csv.A01;
    }

    public static void A01(C26132Csv csv, StringBuilder sb) {
        sb.append(csv.A02);
        sb.append('x');
        sb.append(csv.A01);
    }

    public int hashCode() {
        int i = this.A01;
        int i2 = this.A02;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public C26132Csv(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i * i2;
    }

    public static void A02(AbstractCollection abstractCollection, List list, int i) {
        Camera.Size size = (Camera.Size) list.get(i);
        abstractCollection.add(new C26132Csv(size.width, size.height));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE8.A1C(A10, this.A02);
        return C17880vN.A0t(A10, this.A01);
    }
}
