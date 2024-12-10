package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cfo  reason: case insensitive filesystem */
public abstract class C25441Cfo {
    public static Context A00;
    public static EC9 A01;

    public static Context A00(Context context) {
        Context context2 = A00;
        if (context2 == null) {
            try {
                context2 = C26274CwP.A04(context, C26274CwP.A09, "com.google.android.gms.maps_dynamite").A00;
            } catch (Exception e) {
                Log.e("zzca", "Failed to load maps module, use legacy", e);
                AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            A00 = context2;
        }
        return context2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.EC9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.EC9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.EC9} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.EC9 A01(android.content.Context r4) {
        /*
            X.C18210vx.A00(r4)
            X.EC9 r0 = A01
            if (r0 != 0) goto L_0x00b0
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.A00(r4, r0)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "zzca"
            java.lang.String r0 = "Making Creator dynamically"
            android.util.Log.i(r1, r0)
            android.content.Context r0 = A00(r4)
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.String r0 = "com.google.android.gms.maps.internal.CreatorImpl"
            X.C18210vx.A00(r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Object r3 = r0.newInstance()     // Catch:{ InstantiationException -> 0x006b, IllegalAccessException -> 0x0086 }
            android.os.IBinder r3 = (android.os.IBinder) r3
            if (r3 != 0) goto L_0x0034
            r2 = 0
        L_0x0031:
            A01 = r2
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)
            boolean r0 = r2 instanceof X.EC9
            if (r0 == 0) goto L_0x0041
            X.EC9 r2 = (X.EC9) r2
            goto L_0x0031
        L_0x0041:
            X.BgI r2 = new X.BgI
            r2.<init>(r3, r1)
            goto L_0x0031
        L_0x0047:
            android.content.Context r0 = A00(r4)     // Catch:{ RemoteException -> 0x0065 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ RemoteException -> 0x0065 }
            X.Bde r1 = new X.Bde     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0065 }
            X.Cyz r2 = (X.C26399Cyz) r2     // Catch:{ RemoteException -> 0x0065 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            android.os.Parcel r1 = X.C26399Cyz.A00(r1, r2)     // Catch:{ RemoteException -> 0x0065 }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0065 }
            r0 = 6
            r2.A06(r0, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x00ae
        L_0x0065:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x006b:
            java.lang.String r2 = X.BE7.A0l(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            int r0 = r2.length()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r1 = "Unable to instantiate the dynamic class "
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r1.concat(r2)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x009a
        L_0x0080:
            java.lang.String r0 = new java.lang.String     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x007b
        L_0x0086:
            java.lang.String r2 = X.BE7.A0l(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            int r0 = r2.length()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r1 = "Unable to call the default constructor of "
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r1.concat(r2)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x009a:
            throw r0     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x009b:
            java.lang.String r0 = new java.lang.String     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x0096
        L_0x00a1:
            java.lang.String r0 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00a8:
            X.C1p r0 = new X.C1p
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            X.EC9 r0 = A01
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25441Cfo.A01(android.content.Context):X.EC9");
    }
}
