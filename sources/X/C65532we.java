package X;

/* renamed from: X.2we  reason: invalid class name and case insensitive filesystem */
public class C65532we implements C18360wH {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C65532we(int i, String str, Object obj) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BGj(X.C18400wL r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = r4.A02
            java.lang.Object r0 = r4.A01
            X.0wD r0 = (X.C18330wD) r0
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0017 }
            X.0wH r0 = r0.A02     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r0.BGj(r5)     // Catch:{ all -> 0x0017 }
            android.os.Trace.endSection()
            return r1
        L_0x0017:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x001c:
            java.lang.String r3 = r4.A02
            java.lang.Object r1 = r4.A01
            X.0wy r1 = (X.C18670wy) r1
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r2 = r5.BMD(r0)
            X.2wu r1 = (X.C65662wu) r1
            int r0 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0063;
                case 2: goto L_0x0068;
                default: goto L_0x0031;
            }
        L_0x0031:
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = r2.getPackageName()
            java.lang.String r1 = r1.getInstallerPackageName(r0)
            if (r1 == 0) goto L_0x0060
            r0 = 32
            r2 = 95
            java.lang.String r1 = r1.replace(r0, r2)
            r0 = 47
            java.lang.String r0 = r1.replace(r0, r2)
        L_0x004d:
            X.0wd r1 = new X.0wd
            r1.<init>(r3, r0)
            return r1
        L_0x0053:
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto L_0x0060
            int r0 = r0.targetSdkVersion
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x004d
        L_0x0060:
            java.lang.String r0 = ""
            goto L_0x004d
        L_0x0063:
            java.lang.String r0 = com.google.firebase.FirebaseCommonRegistrar.A01(r2)
            goto L_0x004d
        L_0x0068:
            java.lang.String r0 = com.google.firebase.FirebaseCommonRegistrar.A02(r2)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65532we.BGj(X.0wL):java.lang.Object");
    }
}
