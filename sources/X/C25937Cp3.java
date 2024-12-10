package X;

import android.content.Context;
import android.util.Log;

/* renamed from: X.Cp3  reason: case insensitive filesystem */
public class C25937Cp3 {
    public static C25937Cp3 A01;
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r0.flags & 129) == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(android.content.pm.PackageInfo r6, boolean r7) {
        /*
            r3 = 1
            r5 = 0
            if (r7 == 0) goto L_0x005f
            if (r6 == 0) goto L_0x0036
            java.lang.String r0 = "com.android.vending"
            java.lang.String r1 = r6.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
        L_0x0018:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L_0x0023
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            r7 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            android.content.pm.Signature[] r1 = r6.signatures
            if (r1 == 0) goto L_0x0036
            if (r7 == 0) goto L_0x0056
            X.BdU[] r4 = X.CF0.A00
        L_0x002c:
            int r0 = r1.length
            if (r0 == r3) goto L_0x0037
            java.lang.String r1 = "GoogleSignatureVerifier"
            java.lang.String r0 = "Package has more than one signature."
            android.util.Log.w(r1, r0)
        L_0x0036:
            return r5
        L_0x0037:
            r2 = 0
            r0 = r1[r5]
            byte[] r0 = r0.toByteArray()
            X.BdY r1 = new X.BdY
            r1.<init>(r0)
        L_0x0043:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x0036
            r0 = r4[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = r4[r2]
            if (r0 == 0) goto L_0x0036
            return r3
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0056:
            X.BdU[] r4 = new X.C23218BdU[r3]
            X.BdU[] r0 = X.CF0.A00
            r0 = r0[r5]
            r4[r5] = r0
            goto L_0x002c
        L_0x005f:
            if (r6 == 0) goto L_0x0036
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25937Cp3.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public C25937Cp3(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C25937Cp3 A00(Context context) {
        C18210vx.A00(context);
        synchronized (C25937Cp3.class) {
            if (A01 == null) {
                C23227Bdd bdd = CI1.A01;
                synchronized (CI1.class) {
                    if (CI1.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        CI1.A00 = context.getApplicationContext();
                    }
                }
                A01 = new C25937Cp3(context);
            }
        }
        return A01;
    }
}
