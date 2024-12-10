package X;

import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: X.027  reason: invalid class name */
public abstract class AnonymousClass027 {
    public static AnonymousClass1HD A00(AnonymousClass1HD r4, AnonymousClass1HD r5) {
        Locale A06;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < r4.A04() + r5.A04(); i++) {
            if (i < r4.A04()) {
                A06 = r4.A06(i);
            } else {
                A06 = r5.A06(i - r4.A04());
            }
            if (A06 != null) {
                linkedHashSet.add(A06);
            }
        }
        return AnonymousClass1HD.A03((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static AnonymousClass1HD A01(AnonymousClass1HD r1, AnonymousClass1HD r2) {
        if (r1.A07()) {
            return AnonymousClass1HD.A00();
        }
        return A00(r1, r2);
    }
}
