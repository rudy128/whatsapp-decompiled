package X;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public abstract class CZJ {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final Object A04 = C17880vN.A0p();
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.CwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        if (r6 == null) goto L_0x0107;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r10 = this;
            java.lang.Object r3 = r10.A04
            monitor-enter(r3)
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x0163
            r4 = 1
            android.content.Context r2 = r10.A03     // Catch:{ C2E -> 0x0013 }
            X.E5J r1 = X.C26274CwP.A08     // Catch:{ C2E -> 0x0013 }
            java.lang.String r0 = r10.A06     // Catch:{ C2E -> 0x0013 }
            X.CwP r5 = X.C26274CwP.A04(r2, r1, r0)     // Catch:{ C2E -> 0x0013 }
            goto L_0x007b
        L_0x0013:
            java.lang.String r2 = "%s.%s"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "com.google.android.gms.vision"
            r8 = 0
            r1[r8] = r0     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = r10.A07     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = X.AnonymousClass8BS.A0l(r5, r2, r1, r4)     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = "Cannot load thick client module, fall back to load optional module %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0174 }
            r1[r8] = r7     // Catch:{ all -> 0x0174 }
            r0 = 3
            java.lang.String r6 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x0036
            X.BE7.A1L(r2, r6, r1)     // Catch:{ all -> 0x0174 }
        L_0x0036:
            android.content.Context r1 = r10.A03     // Catch:{ C2E -> 0x003f }
            X.E5J r0 = X.C26274CwP.A09     // Catch:{ C2E -> 0x003f }
            X.CwP r5 = X.C26274CwP.A04(r1, r0, r7)     // Catch:{ C2E -> 0x003f }
            goto L_0x007b
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "Error loading optional module %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0174 }
            r0[r8] = r7     // Catch:{ all -> 0x0174 }
            X.CBL.A00(r1, r2, r0)     // Catch:{ all -> 0x0174 }
            boolean r0 = r10.A01     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x007a
            java.lang.String r2 = "Broadcasting download intent for dependency %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0174 }
            r1[r8] = r5     // Catch:{ all -> 0x0174 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x005d
            X.BE7.A1L(r2, r6, r1)     // Catch:{ all -> 0x0174 }
        L_0x005d:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0174 }
            r2.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"
            r2.setClassName(r1, r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCIES"
            r2.putExtra(r0, r5)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCY"
            r2.setAction(r0)     // Catch:{ all -> 0x0174 }
            android.content.Context r0 = r10.A03     // Catch:{ all -> 0x0174 }
            r0.sendBroadcast(r2)     // Catch:{ all -> 0x0174 }
            r10.A01 = r4     // Catch:{ all -> 0x0174 }
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x0150
            android.content.Context r9 = r10.A03     // Catch:{ C2E | RemoteException -> 0x0148 }
            r8 = r10
            boolean r0 = r10 instanceof X.C23494Bhy     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r0 == 0) goto L_0x00ee
            X.Bhy r8 = (X.C23494Bhy) r8     // Catch:{ C2E | RemoteException -> 0x0148 }
            java.lang.String r0 = "com.google.android.gms.vision.dynamite.face"
            int r2 = X.C26274CwP.A00(r9, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            java.lang.String r1 = "com.google.android.gms.vision.dynamite"
            r0 = 0
            int r0 = X.C26274CwP.A01(r9, r1, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r2 <= r0) goto L_0x00ac
            java.lang.String r0 = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"
        L_0x0097:
            android.os.IBinder r2 = r5.A09(r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r2 == 0) goto L_0x00ec
            java.lang.String r1 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator"
            android.os.IInterface r6 = r2.queryLocalInterface(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = r6 instanceof X.ECB     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r0 == 0) goto L_0x00af
            X.ECB r6 = (X.ECB) r6     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r6 != 0) goto L_0x00b4
            goto L_0x00ec
        L_0x00ac:
            java.lang.String r0 = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"
            goto L_0x0097
        L_0x00af:
            X.Bh8 r6 = new X.Bh8     // Catch:{ C2E | RemoteException -> 0x0148 }
            r6.<init>(r2, r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
        L_0x00b4:
            X.Bde r5 = new X.Bde     // Catch:{ C2E | RemoteException -> 0x0148 }
            r5.<init>(r9)     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.Bb8 r2 = r8.A00     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.C18210vx.A00(r2)     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.Cyu r6 = (X.C26394Cyu) r6     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ C2E | RemoteException -> 0x0148 }
            java.lang.String r0 = r6.A01     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.BE9.A15(r5, r1, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = X.BE8.A1V(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            r2.writeToParcel(r1, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.Parcel r5 = r6.A00(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.IBinder r2 = r5.readStrongBinder()     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r2 != 0) goto L_0x00dc
            r7 = 0
            goto L_0x0144
        L_0x00dc:
            java.lang.String r1 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector"
            android.os.IInterface r7 = r2.queryLocalInterface(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = r7 instanceof X.ECA     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r0 != 0) goto L_0x0144
            X.Bh7 r7 = new X.Bh7     // Catch:{ C2E | RemoteException -> 0x0148 }
            r7.<init>(r2, r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            goto L_0x0144
        L_0x00ec:
            r7 = 0
            goto L_0x0107
        L_0x00ee:
            X.Bhx r8 = (X.C23493Bhx) r8     // Catch:{ C2E | RemoteException -> 0x0148 }
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r2 = r5.A09(r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            r7 = 0
            if (r2 == 0) goto L_0x0107
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r6 = r2.queryLocalInterface(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = r6 instanceof X.EC1     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r0 == 0) goto L_0x010a
            X.EC1 r6 = (X.EC1) r6     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r6 != 0) goto L_0x010f
        L_0x0107:
            r10.A00 = r7     // Catch:{ C2E | RemoteException -> 0x0148 }
            goto L_0x0150
        L_0x010a:
            X.Bh6 r6 = new X.Bh6     // Catch:{ C2E | RemoteException -> 0x0148 }
            r6.<init>(r2, r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
        L_0x010f:
            X.Bde r5 = new X.Bde     // Catch:{ C2E | RemoteException -> 0x0148 }
            r5.<init>(r9)     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.BaJ r2 = r8.A00     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.C18210vx.A00(r2)     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.Cyu r6 = (X.C26394Cyu) r6     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ C2E | RemoteException -> 0x0148 }
            java.lang.String r0 = r6.A01     // Catch:{ C2E | RemoteException -> 0x0148 }
            X.BE9.A15(r5, r1, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = X.BE8.A1V(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            r2.writeToParcel(r1, r0)     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.Parcel r5 = r6.A00(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            android.os.IBinder r2 = r5.readStrongBinder()     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r2 == 0) goto L_0x0144
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r7 = r2.queryLocalInterface(r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
            boolean r0 = r7 instanceof X.EC0     // Catch:{ C2E | RemoteException -> 0x0148 }
            if (r0 != 0) goto L_0x0144
            X.Bh5 r7 = new X.Bh5     // Catch:{ C2E | RemoteException -> 0x0148 }
            r7.<init>(r2, r1)     // Catch:{ C2E | RemoteException -> 0x0148 }
        L_0x0144:
            r5.recycle()     // Catch:{ C2E | RemoteException -> 0x0148 }
            goto L_0x0107
        L_0x0148:
            r2 = move-exception
            java.lang.String r1 = r10.A05     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "Error creating remote native handle"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0174 }
        L_0x0150:
            boolean r1 = r10.A02     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x0165
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x0165
            java.lang.String r1 = r10.A05     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0174 }
            r10.A02 = r4     // Catch:{ all -> 0x0174 }
        L_0x0161:
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0174 }
        L_0x0163:
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            goto L_0x0173
        L_0x0165:
            if (r1 == 0) goto L_0x0161
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r1 = r10.A05     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "Native handle is now available."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x0161
        L_0x0173:
            return r0
        L_0x0174:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZJ.A00():java.lang.Object");
    }

    public final void A01() {
        Object obj;
        Parcel obtain;
        Parcel obtain2;
        synchronized (this.A04) {
            if (this.A00 != null) {
                try {
                    if (this instanceof C23494Bhy) {
                        Object A002 = A00();
                        C18210vx.A00(A002);
                        obj = (ECA) A002;
                    } else if (A00() != null) {
                        Object A003 = A00();
                        C18210vx.A00(A003);
                        obj = (EC0) A003;
                    }
                    C26394Cyu cyu = (C26394Cyu) obj;
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(cyu.A01);
                    obtain2 = Parcel.obtain();
                    AnonymousClass000.A18(cyu.A00, obtain, obtain2, 3);
                    obtain.recycle();
                    obtain2.recycle();
                } catch (RemoteException e) {
                    Log.e(this.A05, "Could not finalize native handle", e);
                } catch (Throwable th) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th;
                }
            }
        }
    }

    public CZJ(Context context, String str, String str2) {
        this.A03 = context;
        this.A05 = str;
        String valueOf = String.valueOf(str2);
        this.A06 = BE9.A0o("com.google.android.gms.vision.dynamite.", valueOf, valueOf.length());
        this.A07 = str2;
    }
}
