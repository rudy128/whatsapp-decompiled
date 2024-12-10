package X;

import android.content.pm.PackageManager;

/* renamed from: X.9ih  reason: invalid class name and case insensitive filesystem */
public class C189199ih {
    public final PackageManager A00;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185359cS A00() {
        /*
            r6 = this;
            r5 = 0
            android.content.pm.PackageManager r2 = r6.A00     // Catch:{ NameNotFoundException -> 0x0045 }
            java.lang.String r1 = X.C24717CHe.A00     // Catch:{ NameNotFoundException -> 0x0045 }
            r0 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r3 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo
            if (r0 != 0) goto L_0x0010
            return r5
        L_0x0010:
            android.content.pm.Signature[] r2 = r3.signatures
            if (r2 == 0) goto L_0x005c
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x005c
            r0 = 0
            r1 = r2[r0]
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A01
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            java.lang.Integer r4 = X.AnonymousClass00R.A00
        L_0x0025:
            int r1 = r3.versionCode
            r0 = 20297189(0x135b5e5, float:3.3374953E-38)
            r2 = -1
            if (r1 < r0) goto L_0x002e
            r2 = 1
        L_0x002e:
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo
            if (r0 == 0) goto L_0x003c
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "com.facebook.appmanager.api.level"
            int r2 = r1.getInt(r0, r2)
        L_0x003c:
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo
            boolean r0 = r0.enabled
            X.9cS r5 = new X.9cS
            r5.<init>(r4, r2, r0)
        L_0x0045:
            return r5
        L_0x0046:
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0051
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            goto L_0x0025
        L_0x0051:
            android.content.pm.Signature r0 = X.AnonymousClass9U3.A02
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            goto L_0x0025
        L_0x005c:
            java.lang.Integer r4 = X.AnonymousClass00R.A0N
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189199ih.A00():X.9cS");
    }

    public C189199ih(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
