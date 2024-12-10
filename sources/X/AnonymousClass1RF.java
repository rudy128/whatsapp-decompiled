package X;

/* renamed from: X.1RF  reason: invalid class name */
public class AnonymousClass1RF {
    public final AnonymousClass11U A00 = new AnonymousClass11U();
    public final AnonymousClass11U A01 = new AnonymousClass11U();
    public volatile boolean A02 = false;

    public static boolean A00(AnonymousClass11U r3, boolean z) {
        boolean z2;
        synchronized (r3) {
            z2 = false;
            if (r3.A00 > 3) {
                z2 = true;
            }
        }
        if (z2) {
            return false;
        }
        if (z) {
            r3.A01();
            return true;
        }
        r3.A02();
        return true;
    }

    public static boolean A01(AnonymousClass1RF r1) {
        if (!r1.A01.A05() || !r1.A00.A05()) {
            return false;
        }
        return true;
    }

    public static boolean A02(AnonymousClass1RF r4) {
        boolean z;
        boolean z2;
        AnonymousClass11U r3 = r4.A01;
        synchronized (r3) {
            z = false;
            if (r3.A00 == 5) {
                z = true;
            }
        }
        if (z) {
            AnonymousClass11U r32 = r4.A00;
            synchronized (r32) {
                z2 = false;
                if (r32.A00 == 5) {
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A03(AnonymousClass1RF r4) {
        boolean z;
        boolean z2;
        AnonymousClass11U r3 = r4.A01;
        synchronized (r3) {
            z = false;
            if (r3.A00 == 4) {
                z = true;
            }
        }
        if (!z) {
            AnonymousClass11U r32 = r4.A00;
            synchronized (r32) {
                z2 = false;
                if (r32.A00 == 4) {
                    z2 = true;
                }
            }
            if (z2 || A02(r4)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
