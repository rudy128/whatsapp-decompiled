package X;

/* renamed from: X.1Hf  reason: invalid class name and case insensitive filesystem */
public final class C23681Hf {
    public final C23661Hd A00;
    public final C19880zA A01;
    public final AnonymousClass118 A02;

    public C23681Hf(C19880zA r2, AnonymousClass118 r3, C23661Hd r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 3);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r1.startsWith("SM-A320") == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        if (r1.equalsIgnoreCase("lya-al00") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (r1.equalsIgnoreCase("mar-al00") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        if (r1.equalsIgnoreCase("vog-tl00") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0118, code lost:
        if (r1.equalsIgnoreCase("vog-al00") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0122, code lost:
        if (r1.equalsIgnoreCase("jsn-al00a") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r1.equalsIgnoreCase("moto g(100)") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0138, code lost:
        if (r1.equalsIgnoreCase("asus_z01qd") != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (((X.AnonymousClass1I6) r2.get()).A00("org.chromium.arc.device_management") != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r6 = this;
            X.1Hd r3 = r6.A00
            X.0z4 r5 = r3.A01
            X.00H r1 = r5.A00
            java.lang.Object r0 = r1.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r4 = "is_chrome_device_cached"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r0 = 0
            boolean r1 = r1.getBoolean(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0060
        L_0x0025:
            X.00H r2 = r3.A02     // Catch:{ RuntimeException -> 0x0051 }
            java.lang.Object r1 = r2.get()     // Catch:{ RuntimeException -> 0x0051 }
            X.1I6 r1 = (X.AnonymousClass1I6) r1     // Catch:{ RuntimeException -> 0x0051 }
            java.lang.String r0 = "org.chromium.arc"
            boolean r0 = r1.A00(r0)     // Catch:{ RuntimeException -> 0x0051 }
            if (r0 != 0) goto L_0x0044
            java.lang.Object r1 = r2.get()     // Catch:{ RuntimeException -> 0x0051 }
            X.1I6 r1 = (X.AnonymousClass1I6) r1     // Catch:{ RuntimeException -> 0x0051 }
            java.lang.String r0 = "org.chromium.arc.device_management"
            boolean r0 = r1.A00(r0)     // Catch:{ RuntimeException -> 0x0051 }
            r1 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r5)     // Catch:{ RuntimeException -> 0x0051 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r1)     // Catch:{ RuntimeException -> 0x0051 }
            r0.apply()     // Catch:{ RuntimeException -> 0x0051 }
            goto L_0x0060
        L_0x0051:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "DeviceUtils/isChromeDevice/DeadObjectException"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 0
        L_0x0060:
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
        L_0x0064:
            if (r3 != 0) goto L_0x008e
            X.118 r0 = r6.A02
            android.content.Context r5 = r0.A00
            X.C18070vi.A0X(r5)
            X.1Jq r4 = X.AnonymousClass1IP.A02(r5)
            if (r4 == 0) goto L_0x015d
            android.content.Context r0 = X.C23671He.A00(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x013b
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x013b
            java.lang.Integer r3 = X.AnonymousClass00R.A00
        L_0x008e:
            return r3
        L_0x008f:
            r0 = 1
            boolean r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0099
            java.lang.Integer r3 = X.AnonymousClass00R.A0Y
            goto L_0x0064
        L_0x0099:
            java.lang.String r0 = "oneplus"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r2)
            r3 = 0
            if (r0 == 0) goto L_0x00b4
            java.lang.String r1 = android.os.Build.MODEL
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "OPD"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            goto L_0x0064
        L_0x00b4:
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = android.os.Build.MODEL
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "GT-I920"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "SM-G988"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "SM-A320"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            goto L_0x0064
        L_0x00e4:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00e1
        L_0x00f8:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x0104
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00e1
        L_0x0104:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x010f
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00e1
        L_0x010f:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x011a
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00e1
        L_0x011a:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x0125
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0125
            goto L_0x00e1
        L_0x0125:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0130
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0130
            goto L_0x00e1
        L_0x0130:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x0064
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0064
            goto L_0x00e1
        L_0x013b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x015a
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x015a
            r0 = 3
            if (r2 < r0) goto L_0x015d
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x015d
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x015d
        L_0x015a:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            return r3
        L_0x015d:
            java.lang.Integer r3 = X.AnonymousClass00R.A0j
            return r3
        L_0x0160:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23681Hf.A00():java.lang.Integer");
    }
}
