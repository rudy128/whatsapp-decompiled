package X;

/* renamed from: X.2km  reason: invalid class name and case insensitive filesystem */
public final class C58492km {
    public final AnonymousClass118 A00;
    public final C23661Hd A01;
    public final AnonymousClass1DC A02;

    public C58492km(AnonymousClass118 r2, C23661Hd r3, AnonymousClass1DC r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r1.startsWith("SM-A320") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r1 >= 1801) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r5 = this;
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = android.os.Build.MODEL
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "GT-I920"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "SM-G988"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "SM-A320"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x003a
        L_0x0037:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x003a:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0037
        L_0x004e:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x005a
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0037
        L_0x005a:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x0065
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0037
        L_0x0065:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x0070
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0037
        L_0x0070:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x007b
            goto L_0x0037
        L_0x007b:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0086
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x0037
        L_0x0086:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x0091
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0091
            goto L_0x0037
        L_0x0091:
            X.1Hd r1 = r5.A01
            r0 = 1
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00e4
            X.118 r0 = r5.A00
            android.content.Context r2 = r0.A00
            X.C18070vi.A0X(r2)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x00e1
            X.1Jq r4 = X.AnonymousClass1IP.A02(r2)
            if (r4 == 0) goto L_0x00e4
            android.content.Context r0 = X.C23671He.A00(r2)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x00ce
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x00ce
            goto L_0x0037
        L_0x00ce:
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x00e1
            r0 = 3
            if (r2 < r0) goto L_0x00e4
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x00e4
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x00e4
        L_0x00e1:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        L_0x00e4:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58492km.A00():java.lang.Integer");
    }

    public final boolean A01() {
        Integer A002 = A00();
        if (A002 == AnonymousClass00R.A00 || A002 == AnonymousClass00R.A0C) {
            return true;
        }
        return false;
    }
}
