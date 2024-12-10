package X;

/* renamed from: X.Cf9  reason: case insensitive filesystem */
public final class C25407Cf9 {
    public static boolean A00;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Cyz] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.Cyz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r7) {
        /*
            java.lang.Class<X.Cf9> r6 = X.C25407Cf9.class
            monitor-enter(r6)
            java.lang.String r0 = "Context is null"
            X.C18210vx.A02(r7, r0)     // Catch:{ all -> 0x0076 }
            boolean r0 = A00     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0074
            X.EC9 r5 = X.C25441Cfo.A01(r7)     // Catch:{ C1p -> 0x0072 }
            X.BgI r5 = (X.C23391BgI) r5     // Catch:{ RemoteException -> 0x006c }
            r0 = 4
            android.os.Parcel r4 = X.C26399Cyz.A02(r5, r0)     // Catch:{ RemoteException -> 0x006c }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x006c }
            if (r3 != 0) goto L_0x001f
            r1 = 0
            goto L_0x002b
        L_0x001f:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x006c }
            boolean r0 = r1 instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate     // Catch:{ RemoteException -> 0x006c }
            if (r0 == 0) goto L_0x003f
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r1 = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) r1     // Catch:{ RemoteException -> 0x006c }
        L_0x002b:
            r4.recycle()     // Catch:{ RemoteException -> 0x006c }
            X.C18210vx.A00(r1)     // Catch:{ RemoteException -> 0x006c }
            X.C26080Crv.A00 = r1     // Catch:{ RemoteException -> 0x006c }
            r0 = 5
            android.os.Parcel r4 = X.C26399Cyz.A02(r5, r0)     // Catch:{ RemoteException -> 0x006c }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x006c }
            if (r3 != 0) goto L_0x0047
            goto L_0x0045
        L_0x003f:
            X.BgD r1 = new X.BgD     // Catch:{ RemoteException -> 0x006c }
            r1.<init>(r3, r2)     // Catch:{ RemoteException -> 0x006c }
            goto L_0x002b
        L_0x0045:
            r1 = 0
            goto L_0x0053
        L_0x0047:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x006c }
            boolean r0 = r1 instanceof X.C28634EBo     // Catch:{ RemoteException -> 0x006c }
            if (r0 == 0) goto L_0x0062
            X.EBo r1 = (X.C28634EBo) r1     // Catch:{ RemoteException -> 0x006c }
        L_0x0053:
            r4.recycle()     // Catch:{ RemoteException -> 0x006c }
            X.EBo r0 = X.CFF.A00     // Catch:{ RemoteException -> 0x006c }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "delegate must not be null"
            X.C18210vx.A02(r1, r0)     // Catch:{ RemoteException -> 0x006c }
            X.CFF.A00 = r1     // Catch:{ RemoteException -> 0x006c }
            goto L_0x0068
        L_0x0062:
            X.BgA r1 = new X.BgA     // Catch:{ RemoteException -> 0x006c }
            r1.<init>(r3, r2)     // Catch:{ RemoteException -> 0x006c }
            goto L_0x0053
        L_0x0068:
            r0 = 1
            A00 = r0     // Catch:{ all -> 0x0076 }
            goto L_0x0074
        L_0x006c:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0072:
            monitor-exit(r6)
            return
        L_0x0074:
            monitor-exit(r6)
            return
        L_0x0076:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25407Cf9.A00(android.content.Context):void");
    }
}
