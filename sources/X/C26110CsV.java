package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.CsV  reason: case insensitive filesystem */
public final class C26110CsV {
    public Bundle A00;
    public C28451E1r A01;
    public C28452E1s A02;
    public LinkedList A03;
    public final Context A04;
    public final ViewGroup A05;
    public final GoogleMapOptions A06;
    public final List A07;
    public final C28452E1s A08;

    /* JADX WARNING: type inference failed for: r3v5, types: [X.Cyz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.os.Bundle r3, X.C28567E7x r4, X.C26110CsV r5) {
        /*
            X.E1r r0 = r5.A01
            if (r0 == 0) goto L_0x0008
            r4.CSg()
        L_0x0007:
            return
        L_0x0008:
            java.util.LinkedList r0 = r5.A03
            if (r0 != 0) goto L_0x0012
            java.util.LinkedList r0 = X.AnonymousClass8BR.A14()
            r5.A03 = r0
        L_0x0012:
            r0.add(r4)
            if (r3 == 0) goto L_0x0023
            android.os.Bundle r0 = r5.A00
            if (r0 != 0) goto L_0x002e
            java.lang.Object r0 = r3.clone()
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5.A00 = r0
        L_0x0023:
            X.E1s r0 = r5.A08
            r5.A02 = r0
            if (r0 == 0) goto L_0x0007
            X.E1r r0 = r5.A01
            if (r0 != 0) goto L_0x0007
            goto L_0x0032
        L_0x002e:
            r0.putAll(r3)
            goto L_0x0023
        L_0x0032:
            android.content.Context r1 = r5.A04     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.C25407Cf9.A00(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.EC9 r4 = X.C25441Cfo.A01(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.Bde r0 = new X.Bde     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            com.google.android.gms.maps.GoogleMapOptions r3 = r5.A06     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.Cyz r4 = (X.C26399Cyz) r4     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            android.os.Parcel r2 = X.C26399Cyz.A00(r0, r4)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r1 = 0
            if (r3 != 0) goto L_0x005a
            r2.writeInt(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
        L_0x004e:
            r0 = 3
            android.os.Parcel r4 = r4.A05(r0, r2)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            android.os.IBinder r2 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            if (r2 != 0) goto L_0x0064
            goto L_0x0062
        L_0x005a:
            r0 = 1
            r2.writeInt(r0)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r3.writeToParcel(r2, r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            goto L_0x004e
        L_0x0062:
            r3 = 0
            goto L_0x0070
        L_0x0064:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r3 = r2.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            boolean r0 = r3 instanceof com.google.android.gms.maps.internal.IMapViewDelegate     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.maps.internal.IMapViewDelegate r3 = (com.google.android.gms.maps.internal.IMapViewDelegate) r3     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
        L_0x0070:
            r4.recycle()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            goto L_0x007a
        L_0x0074:
            X.BgF r3 = new X.BgF     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r3.<init>(r2, r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            goto L_0x0070
        L_0x007a:
            if (r3 == 0) goto L_0x0007
            X.E1s r2 = r5.A02     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            android.view.ViewGroup r1 = r5.A05     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.DJ4 r0 = new X.DJ4     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0.<init>(r1, r3)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.DJ5 r2 = (X.DJ5) r2     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.CsV r2 = r2.A00     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r2.A01 = r0     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            java.util.LinkedList r0 = r2.A03     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
        L_0x0091:
            boolean r0 = r1.hasNext()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.next()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.E7x r0 = (X.C28567E7x) r0     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0.CSg()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            goto L_0x0091
        L_0x00a1:
            java.util.LinkedList r0 = r2.A03     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0.clear()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0 = 0
            r2.A00 = r0     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            java.util.List r3 = r5.A07     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
        L_0x00af:
            boolean r0 = r2.hasNext()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r1 = r2.next()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.E5a r1 = (X.C28516E5a) r1     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.E1r r0 = r5.A01     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            X.DJ4 r0 = (X.DJ4) r0     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            r0.A00(r1)     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            goto L_0x00af
        L_0x00c3:
            r3.clear()     // Catch:{ RemoteException -> 0x00c7, C1p -> 0x0007 }
            return
        L_0x00c7:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26110CsV.A00(android.os.Bundle, X.E7x, X.CsV):void");
    }

    public static final void A01(C26110CsV csV, int i) {
        while (!csV.A03.isEmpty() && ((C28567E7x) csV.A03.getLast()).CSZ() >= i) {
            csV.A03.removeLast();
        }
    }

    public C26110CsV(Context context, ViewGroup viewGroup, GoogleMapOptions googleMapOptions) {
        this();
        this.A07 = AnonymousClass000.A13();
        this.A05 = viewGroup;
        this.A04 = context;
        this.A06 = googleMapOptions;
    }

    public C26110CsV() {
        this.A08 = new DJ5(this);
    }
}
