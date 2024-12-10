package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.1vE  reason: invalid class name and case insensitive filesystem */
public abstract class C40761vE {
    public static final PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        boolean z = false;
        if ((i ^ i2) >= 0) {
            z = true;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(C28647ECf eCf, C26046CrD crD, C26046CrD crD2, List list, int i) {
        if (crD.A01(eCf.getName(), i)) {
            String name = eCf.getName();
            C26046CrD crD3 = new C26046CrD(crD2);
            crD3.A01.add(name);
            C26046CrD crD4 = new C26046CrD(crD3);
            crD4.A00 = eCf;
            list.add(crD4);
        }
    }
}
