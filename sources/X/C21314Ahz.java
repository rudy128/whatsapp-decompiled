package X;

/* renamed from: X.Ahz  reason: case insensitive filesystem */
public final class C21314Ahz implements C22486B9s {
    public final BDK A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BCL(X.C186309dz r6, X.C22484B9q r7, X.AnonymousClass5YR r8) {
        /*
            r5 = this;
            X.BDK r1 = r5.A00
            X.AeE r1 = (X.C21084AeE) r1
            java.lang.String r4 = "com.facebook.katana"
            X.00H r0 = r1.A01
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            r2 = 0
            android.content.Context r0 = r1.A00
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.facebook.GET_PHONE_ID"
            r1.setAction(r0)
            r0 = 128(0x80, float:1.794E-43)
            java.util.List r0 = r3.queryBroadcastReceivers(r1, r0)
            java.util.Iterator r1 = X.AnonymousClass8BS.A0r(r0)
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.taskAffinity
            if (r0 == 0) goto L_0x0027
            boolean r0 = X.AnonymousClass1YF.A0Y(r0, r4, r2)
            if (r0 == 0) goto L_0x0027
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x004b }
            int r2 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x004b }
            goto L_0x0051
        L_0x0049:
            r1 = 0
            goto L_0x0053
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "FacebookAppInfoHelper/getFacebookAppInfo/ failed to retrieve version code for FB app"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0051:
            r1 = r2
            r2 = 1
        L_0x0053:
            X.9rD r0 = new X.9rD
            r0.<init>(r2, r1)
            boolean r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21314Ahz.BCL(X.9dz, X.B9q, X.5YR):boolean");
    }

    public C21314Ahz(BDK bdk) {
        this.A00 = bdk;
    }
}
