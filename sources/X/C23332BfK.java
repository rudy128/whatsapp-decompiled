package X;

import android.os.Looper;

/* renamed from: X.BfK  reason: case insensitive filesystem */
public final class C23332BfK extends BG7 {
    public final /* synthetic */ C26157CtR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23332BfK(Looper looper, C26157CtR ctR) {
        super(looper);
        this.A00 = ctR;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0332, code lost:
        if (r9 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            X.CtR r2 = r12.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0B
            int r1 = r0.get()
            int r0 = r13.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r13.what
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0017
            if (r2 == r0) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            java.lang.Object r0 = r13.obj
            X.CWE r0 = (X.CWE) r0
            r0.A00()
        L_0x001e:
            return
        L_0x001f:
            int r1 = r13.what
            r8 = 4
            r4 = 1
            r7 = 5
            if (r1 == r4) goto L_0x002d
            r0 = 7
            if (r1 == r0) goto L_0x002d
            if (r1 == r8) goto L_0x002d
            if (r1 != r7) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.BeN()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r1 = r13.what
            r6 = 8
            r3 = 3
            r5 = 0
            if (r1 != r8) goto L_0x0063
            int r1 = r13.arg2
            X.Bcx r0 = new X.Bcx
            r0.<init>(r1)
            r2.A07 = r0
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            X.C26157CtR.A02(r5, r2, r3)
            return
        L_0x0063:
            if (r1 == r7) goto L_0x0087
            if (r1 != r3) goto L_0x0091
            java.lang.Object r1 = r13.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r5 = r1
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
        L_0x0070:
            int r0 = r13.arg2
            X.Bcx r1 = new X.Bcx
            r1.<init>(r0, r5)
        L_0x0077:
            X.E5F r0 = r2.A08
            r0.C3H(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            return
        L_0x0087:
            X.Bcx r1 = r2.A07
            if (r1 != 0) goto L_0x0077
            X.Bcx r1 = new X.Bcx
            r1.<init>(r6)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r1 != r0) goto L_0x00ad
            X.C26157CtR.A02(r5, r2, r7)
            X.E1l r0 = r2.A0H
            if (r0 == 0) goto L_0x00a4
            int r1 = r13.arg2
            X.DIs r0 = (X.C26911DIs) r0
            X.E7w r0 = r0.A00
            r0.onConnectionSuspended(r1)
        L_0x00a4:
            int r0 = r13.arg2
            r2.A07(r0)
            X.C26157CtR.A03(r5, r2, r7, r4)
            return
        L_0x00ad:
            r0 = 2
            if (r1 != r0) goto L_0x00b6
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00b6:
            int r2 = r13.what
            r0 = 2
            if (r2 == r0) goto L_0x00d5
            if (r2 == r4) goto L_0x00d5
            r0 = 7
            if (r2 == r0) goto L_0x00d5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Don't know how to handle message: "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r2, r1)
            return
        L_0x00d5:
            java.lang.Object r3 = r13.obj
            X.CWE r3 = (X.CWE) r3
            monitor-enter(r3)
            java.lang.Object r8 = r3.A00     // Catch:{ all -> 0x0340 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x0340 }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r7 = "GmsClient"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0340 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0340 }
            java.lang.String r0 = "Callback proxy "
            r1.append(r0)     // Catch:{ all -> 0x0340 }
            r1.append(r2)     // Catch:{ all -> 0x0340 }
            java.lang.String r0 = " being reused. This is not safe."
            X.BE9.A1H(r0, r7, r1)     // Catch:{ all -> 0x0340 }
        L_0x00f7:
            monitor-exit(r3)     // Catch:{ all -> 0x0340 }
            if (r8 == 0) goto L_0x0111
            r2 = r3
            X.BdT r2 = (X.C23217BdT) r2
            int r7 = r2.A00
            r0 = 0
            if (r7 != 0) goto L_0x0129
            boolean r0 = r2 instanceof X.C23215BdR
            if (r0 == 0) goto L_0x0114
            X.BdR r2 = (X.C23215BdR) r2
            X.CtR r0 = r2.A00
            X.E5F r1 = r0.A08
            X.Bcx r0 = X.C23203Bcx.A04
            r1.C3H(r0)
        L_0x0111:
            monitor-enter(r3)
            goto L_0x0336
        L_0x0114:
            r0 = r2
            X.BdS r0 = (X.C23216BdS) r0
            java.lang.String r11 = "GmsClient"
            android.os.IBinder r8 = r0.A00     // Catch:{ RemoteException -> 0x0123 }
            X.C18210vx.A00(r8)     // Catch:{ RemoteException -> 0x0123 }
            java.lang.String r10 = r8.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0123 }
            goto L_0x0140
        L_0x0123:
            java.lang.String r0 = "service probably died"
            android.util.Log.w(r11, r0)
            goto L_0x015d
        L_0x0129:
            X.CtR r1 = r2.A02
            X.C26157CtR.A02(r5, r1, r4)
            android.os.Bundle r1 = r2.A01
            if (r1 == 0) goto L_0x013a
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
        L_0x013a:
            X.Bcx r1 = new X.Bcx
            r1.<init>(r7, r0)
            goto L_0x0167
        L_0x0140:
            X.CtR r7 = r0.A01
            java.lang.String r9 = r7.A05()
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L_0x018f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "service descriptor mismatch: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " vs. "
            X.BEA.A1N(r0, r10, r11, r1)
        L_0x015d:
            X.CtR r0 = r2.A02
            X.C26157CtR.A02(r5, r0, r4)
            X.Bcx r1 = new X.Bcx
            r1.<init>(r6, r5)
        L_0x0167:
            boolean r0 = r2 instanceof X.C23215BdR
            if (r0 == 0) goto L_0x017f
            X.BdR r2 = (X.C23215BdR) r2
            X.CtR r2 = r2.A00
            X.E5F r0 = r2.A08
            r0.C3H(r1)
        L_0x0174:
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            goto L_0x0111
        L_0x017f:
            X.BdS r2 = (X.C23216BdS) r2
            X.CtR r2 = r2.A01
            X.E1m r0 = r2.A0I
            if (r0 == 0) goto L_0x0174
            X.DIt r0 = (X.C26912DIt) r0
            X.E5C r0 = r0.A00
            r0.onConnectionFailed(r1)
            goto L_0x0174
        L_0x018f:
            boolean r0 = r7 instanceof X.C23020BZw
            if (r0 == 0) goto L_0x01c0
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23496Bi0
            if (r0 != 0) goto L_0x0332
            X.Bi0 r9 = new X.Bi0
            r9.<init>(r8, r1)
        L_0x01a2:
            r0 = 2
            r1 = 4
            boolean r0 = X.C26157CtR.A03(r9, r7, r0, r1)
            if (r0 != 0) goto L_0x01b1
            r0 = 3
            boolean r0 = X.C26157CtR.A03(r9, r7, r0, r1)
            if (r0 == 0) goto L_0x015d
        L_0x01b1:
            r7.A07 = r5
            X.E1l r0 = r7.A0H
            if (r0 == 0) goto L_0x0111
            X.DIs r0 = (X.C26911DIs) r0
            X.E7w r0 = r0.A00
            r0.onConnected(r5)
            goto L_0x0111
        L_0x01c0:
            boolean r0 = r7 instanceof X.C23022BZy
            if (r0 == 0) goto L_0x01d4
            java.lang.String r1 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23283BeX
            if (r0 != 0) goto L_0x0332
            X.BeX r9 = new X.BeX
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x01d4:
            boolean r0 = r7 instanceof X.C23019BZv
            if (r0 == 0) goto L_0x01e8
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23404BgV
            if (r0 != 0) goto L_0x0332
            X.BgV r9 = new X.BgV
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x01e8:
            boolean r0 = r7 instanceof X.C23015BZr
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            android.os.IInterface r9 = r8.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C23436Bh1
            if (r0 != 0) goto L_0x0332
            X.Bh1 r9 = new X.Bh1
            r9.<init>(r8)
            goto L_0x01a2
        L_0x01fc:
            boolean r0 = r7 instanceof X.C23010BZk
            if (r0 == 0) goto L_0x0210
            java.lang.String r1 = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23403BgU
            if (r0 != 0) goto L_0x0332
            X.BgU r9 = new X.BgU
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x0210:
            boolean r0 = r7 instanceof X.C23021BZx
            if (r0 == 0) goto L_0x0225
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23402BgT
            if (r0 != 0) goto L_0x0332
            X.BgT r9 = new X.BgT
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x0225:
            boolean r0 = r7 instanceof X.C23018BZu
            if (r0 == 0) goto L_0x023a
            java.lang.String r1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.ECI
            if (r0 != 0) goto L_0x0332
            X.Bfy r9 = new X.Bfy
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x023a:
            boolean r0 = r7 instanceof X.C23009BZj
            if (r0 == 0) goto L_0x024f
            java.lang.String r0 = "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"
            android.os.IInterface r9 = r8.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C23333BfL
            if (r0 != 0) goto L_0x0332
            X.BfL r9 = new X.BfL
            r9.<init>(r8)
            goto L_0x01a2
        L_0x024f:
            boolean r0 = r7 instanceof X.C23008BZi
            if (r0 == 0) goto L_0x0264
            java.lang.String r0 = "com.google.android.gms.clearcut.internal.IClearcutLoggerService"
            android.os.IInterface r9 = r8.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C28633EBn
            if (r0 != 0) goto L_0x0332
            X.Cz1 r9 = new X.Cz1
            r9.<init>(r8)
            goto L_0x01a2
        L_0x0264:
            boolean r0 = r7 instanceof X.C23007BZh
            if (r0 == 0) goto L_0x0279
            java.lang.String r0 = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService"
            android.os.IInterface r9 = r8.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C23278BeS
            if (r0 != 0) goto L_0x0332
            X.BeS r9 = new X.BeS
            r9.<init>(r8)
            goto L_0x01a2
        L_0x0279:
            boolean r0 = r7 instanceof X.C23011BZl
            if (r0 == 0) goto L_0x028e
            java.lang.String r1 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23248Bdy
            if (r0 != 0) goto L_0x0332
            X.Bdy r9 = new X.Bdy
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x028e:
            boolean r0 = r7 instanceof X.C23016BZs
            if (r0 == 0) goto L_0x02a3
            java.lang.String r1 = "com.google.android.gms.auth.api.internal.IAuthService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23247Bdx
            if (r0 != 0) goto L_0x0332
            X.Bdx r9 = new X.Bdx
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x02a3:
            boolean r0 = r7 instanceof X.C23014BZq
            if (r0 == 0) goto L_0x02b8
            java.lang.String r1 = "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23246Bdw
            if (r0 != 0) goto L_0x0332
            X.Bdw r9 = new X.Bdw
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x02b8:
            boolean r0 = r7 instanceof X.BZp
            if (r0 == 0) goto L_0x02cd
            java.lang.String r1 = "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23238Bdo
            if (r0 != 0) goto L_0x0332
            X.Bdo r9 = new X.Bdo
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x02cd:
            boolean r0 = r7 instanceof X.C23013BZo
            if (r0 == 0) goto L_0x02e2
            java.lang.String r1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23237Bdn
            if (r0 != 0) goto L_0x0332
            X.Bdn r9 = new X.Bdn
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x02e2:
            boolean r0 = r7 instanceof X.C23012BZn
            if (r0 == 0) goto L_0x02f7
            java.lang.String r1 = "com.google.android.gms.auth.api.identity.internal.ISignInService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23239Bdp
            if (r0 != 0) goto L_0x0332
            X.Bdp r9 = new X.Bdp
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x02f7:
            boolean r0 = r7 instanceof X.C23006BZg
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"
            android.os.IInterface r9 = r8.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C23234Bdk
            if (r0 != 0) goto L_0x0332
            X.Bdk r9 = new X.Bdk
            r9.<init>(r8)
            goto L_0x01a2
        L_0x030c:
            boolean r0 = r7 instanceof X.BZm
            if (r0 == 0) goto L_0x0321
            java.lang.String r1 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23282BeW
            if (r0 != 0) goto L_0x0332
            X.BeW r9 = new X.BeW
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x0321:
            java.lang.String r1 = "com.google.android.gms.auth.api.signin.internal.ISignInService"
            android.os.IInterface r9 = r8.queryLocalInterface(r1)
            boolean r0 = r9 instanceof X.C23236Bdm
            if (r0 != 0) goto L_0x0332
            X.Bdm r9 = new X.Bdm
            r9.<init>(r8, r1)
            goto L_0x01a2
        L_0x0332:
            if (r9 == 0) goto L_0x015d
            goto L_0x01a2
        L_0x0336:
            r3.A01 = r4     // Catch:{ all -> 0x033d }
            monitor-exit(r3)     // Catch:{ all -> 0x033d }
            r3.A00()
            return
        L_0x033d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x033d }
            throw r0
        L_0x0340:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0340 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23332BfK.handleMessage(android.os.Message):void");
    }
}
