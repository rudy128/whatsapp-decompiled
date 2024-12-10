package X;

import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Set;

public final class CWB {
    public final PackageManager A00;
    public final C199410f A01;
    public final C23552Blf A02;

    public CWB(PackageManager packageManager, C23552Blf blf, Set set) {
        this.A00 = packageManager;
        this.A01 = C199410f.copyOf((Collection) set);
        this.A02 = C23552Blf.copyOf(blf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r2 = r8.getAuthority()
            if (r2 == 0) goto L_0x010c
            android.content.pm.PackageManager r4 = r7.A00
            if (r4 == 0) goto L_0x00fc
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r0 = 0
            if (r3 < r1) goto L_0x0013
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0013:
            android.content.pm.ProviderInfo r0 = r4.resolveContentProvider(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r6 = r0.packageName
            if (r6 == 0) goto L_0x00ec
            r0 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x00d4 }
            if (r0 == 0) goto L_0x00d4
            android.content.pm.Signature[] r1 = r0.signatures
            if (r1 == 0) goto L_0x00d4
            int r0 = r1.length
            if (r0 == 0) goto L_0x00d4
            X.10f r5 = X.C199410f.copyOf((java.lang.Object[]) r1)
            if (r5 == 0) goto L_0x00d4
            X.Blf r0 = r7.A02
            X.10f r3 = r0.get(r6)
            X.1IZ r2 = r5.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            X.10f r0 = r7.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x003c
        L_0x0054:
            return
        L_0x0055:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Untrusted provider package "
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = " ["
            r4.append(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r5.iterator()
        L_0x006e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r5.next()
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            int r1 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r0 = 0
            r2.update(r3, r0, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            byte[] r0 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r6.add(r0)
            goto L_0x006e
        L_0x0095:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x009b:
            java.lang.String r3 = ", "
            java.util.Iterator r2 = r6.iterator()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00ce }
            if (r0 == 0) goto L_0x00c0
        L_0x00ab:
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x00ce }
            java.lang.CharSequence r0 = X.BEA.A0b(r0)     // Catch:{ IOException -> 0x00ce }
            r1.append(r0)     // Catch:{ IOException -> 0x00ce }
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00ce }
            if (r0 == 0) goto L_0x00c0
            r1.append(r3)     // Catch:{ IOException -> 0x00ce }
            goto L_0x00ab
        L_0x00c0:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = X.BEA.A0m(r0, r4)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No signature for package "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " resolving authority "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No package name for authority "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No provider for authority "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No authority in URI "
            java.lang.String r1 = X.AnonymousClass001.A1E(r8, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CWB.A00(android.net.Uri):void");
    }
}
