package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb6  reason: case insensitive filesystem */
public final class C23091Bb6 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final PendingIntent A01;
    public final ECM A02;
    public final C23168BcO A03;
    public final EC2 A04;
    public final EC3 A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.EC3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.EC2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.EC2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.EC3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.EC3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.EC2} */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.Cyx] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23091Bb6(android.app.PendingIntent r5, android.os.IBinder r6, android.os.IBinder r7, android.os.IBinder r8, X.C23168BcO r9, int r10) {
        /*
            r4 = this;
            r4.<init>()
            r4.A00 = r10
            r4.A03 = r9
            r3 = 0
            if (r6 != 0) goto L_0x003e
            r1 = r3
        L_0x000b:
            r4.A05 = r1
            r4.A01 = r5
            if (r7 != 0) goto L_0x002b
            r1 = r3
        L_0x0012:
            r4.A04 = r1
            if (r8 == 0) goto L_0x0022
            java.lang.String r1 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r3 = r8.queryLocalInterface(r1)
            boolean r0 = r3 instanceof X.ECM
            if (r0 == 0) goto L_0x0025
            X.ECM r3 = (X.ECM) r3
        L_0x0022:
            r4.A02 = r3
            return
        L_0x0025:
            X.Bfx r3 = new X.Bfx
            r3.<init>(r8, r1)
            goto L_0x0022
        L_0x002b:
            java.lang.String r2 = "com.google.android.gms.location.ILocationCallback"
            android.os.IInterface r1 = r7.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.EC2
            if (r0 == 0) goto L_0x0038
            X.EC2 r1 = (X.EC2) r1
            goto L_0x0012
        L_0x0038:
            X.Bfz r1 = new X.Bfz
            r1.<init>(r7, r2)
            goto L_0x0012
        L_0x003e:
            java.lang.String r2 = "com.google.android.gms.location.ILocationListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.EC3
            if (r0 == 0) goto L_0x004b
            X.EC3 r1 = (X.EC3) r1
            goto L_0x000b
        L_0x004b:
            X.Bg0 r1 = new X.Bg0
            r1.<init>(r6, r2)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23091Bb6.<init>(android.app.PendingIntent, android.os.IBinder, android.os.IBinder, android.os.IBinder, X.BcO, int):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        boolean A0J = DJ0.A0J(parcel, this.A03, i);
        EC3 ec3 = this.A05;
        IBinder iBinder = null;
        if (ec3 == null) {
            asBinder = null;
        } else {
            asBinder = ec3.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 3);
        C26293Cx2.A09(parcel, this.A01, 4, i, A0J);
        EC2 ec2 = this.A04;
        if (ec2 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = ec2.asBinder();
        }
        C26293Cx2.A04(asBinder2, parcel, 5);
        ECM ecm = this.A02;
        if (ecm != null) {
            iBinder = ecm.asBinder();
        }
        C26293Cx2.A04(iBinder, parcel, 6);
        C26293Cx2.A05(parcel, A002);
    }
}
