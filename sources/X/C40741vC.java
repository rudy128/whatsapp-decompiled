package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1vC  reason: invalid class name and case insensitive filesystem */
public class C40741vC implements C40301uU {
    public static final C40741vC A00 = new Object();
    public static final C40111uB A01 = C40111uB.A01("c", "v", "i", "o");

    public /* bridge */ /* synthetic */ Object CB7(C39941tt r17, float f) {
        C39941tt r2 = r17;
        if (r2.A0B() == AnonymousClass00R.A00) {
            r2.A0F();
        }
        r2.A0G();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (r2.A0M()) {
            int A09 = r2.A09(A01);
            if (A09 != 0) {
                float f2 = f;
                if (A09 == 1) {
                    arrayList = C40491un.A03(r2, f2);
                } else if (A09 == 2) {
                    arrayList2 = C40491un.A03(r2, f2);
                } else if (A09 != 3) {
                    r2.A0J();
                    r2.A0K();
                } else {
                    arrayList3 = C40491un.A03(r2, f2);
                }
            } else {
                z = r2.A0N();
            }
        }
        r2.A0I();
        if (r2.A0B() == AnonymousClass00R.A01) {
            r2.A0H();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new C40781vG(new PointF(), Collections.emptyList(), false);
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                PointF pointF3 = (PointF) arrayList.get(i2);
                PointF pointF4 = (PointF) arrayList3.get(i2);
                PointF pointF5 = (PointF) arrayList2.get(i);
                PointF pointF6 = C40761vE.A00;
                arrayList4.add(new C40771vF(new PointF(pointF3.x + pointF4.x, pointF3.y + pointF4.y), new PointF(pointF2.x + pointF5.x, pointF2.y + pointF5.y), pointF2));
            }
            if (z) {
                PointF pointF7 = (PointF) arrayList.get(0);
                PointF pointF8 = (PointF) arrayList.get(size - 1);
                PointF pointF9 = (PointF) arrayList3.get(size - 1);
                PointF pointF10 = (PointF) arrayList2.get(0);
                PointF pointF11 = C40761vE.A00;
                arrayList4.add(new C40771vF(new PointF(pointF8.x + pointF9.x, pointF8.y + pointF9.y), new PointF(pointF7.x + pointF10.x, pointF7.y + pointF10.y), pointF7));
            }
            return new C40781vG(pointF, arrayList4, z);
        }
    }
}
