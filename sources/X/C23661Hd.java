package X;

import android.content.Context;

/* renamed from: X.1Hd  reason: invalid class name and case insensitive filesystem */
public final class C23661Hd {
    public static final C23671He A03 = new Object();
    public final Context A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;

    public C23661Hd(Context context, C19830z4 r3, AnonymousClass00H r4) {
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final boolean A00() {
        return A02(true) && !A01();
    }

    public final boolean A01() {
        if (AnonymousClass1IP.A00(this.A00) >= 600) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (((android.content.SharedPreferences) r10.A01.A00.get()).getBoolean("detect_device_foldable", false) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(boolean r11) {
        /*
            r10 = this;
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r10.A02
            java.lang.Object r1 = r0.get()
            X.1I6 r1 = (X.AnonymousClass1I6) r1
            java.lang.String r0 = "android.hardware.sensor.hinge_angle"
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0016:
            X.0z4 r0 = r10.A01
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "detect_device_foldable"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r9 = 0
            if (r0 == 0) goto L_0x009d
        L_0x002a:
            r9 = 1
            if (r11 == 0) goto L_0x009d
            android.content.Context r0 = r10.A00
            android.graphics.Point r0 = X.AnonymousClass1IP.A01(r0)
            if (r0 == 0) goto L_0x009d
            int r8 = r0.x
            int r0 = r0.y
            r7 = r8
            if (r8 <= r0) goto L_0x003d
            r7 = r0
        L_0x003d:
            if (r8 >= r0) goto L_0x0040
            r8 = r0
        L_0x0040:
            X.0z4 r6 = r10.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            android.graphics.Point r2 = r6.A0X(r3)
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Point r1 = r6.A0Y(r0)
            int r5 = r1.x
            r0 = 0
            if (r5 == r3) goto L_0x0055
            r0 = 1
        L_0x0055:
            int r4 = r2.x
            if (r4 >= r7) goto L_0x005a
            r4 = r7
        L_0x005a:
            int r3 = r2.y
            if (r3 >= r8) goto L_0x005f
            r3 = r8
        L_0x005f:
            if (r5 <= r7) goto L_0x0062
            r5 = r7
        L_0x0062:
            int r2 = r1.y
            if (r2 <= r8) goto L_0x0067
            r2 = r8
        L_0x0067:
            r1 = r2
            if (r0 == 0) goto L_0x007b
            r0 = r4
            if (r4 >= r5) goto L_0x006e
            r0 = r5
        L_0x006e:
            r4 = r0
            if (r0 <= r5) goto L_0x0072
            r0 = r5
        L_0x0072:
            r5 = r0
            r2 = r3
            if (r3 >= r1) goto L_0x0077
            r2 = r1
        L_0x0077:
            r3 = r2
            if (r2 <= r1) goto L_0x007b
            r2 = r1
        L_0x007b:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "foldable_max_display_width"
            r1.putInt(r0, r4)
            java.lang.String r0 = "foldable_max_display_height"
            r1.putInt(r0, r3)
            r1.apply()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "foldable_min_display_width"
            r1.putInt(r0, r5)
            java.lang.String r0 = "foldable_min_display_height"
            r1.putInt(r0, r2)
            r1.apply()
        L_0x009d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23661Hd.A02(boolean):boolean");
    }
}
