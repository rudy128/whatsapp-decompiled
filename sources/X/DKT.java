package X;

import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public class DKT implements C28516E5a {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DKT(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [X.Cyz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bxb(X.C25284Ccm r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r4 = r16
            if (r0 == 0) goto L_0x014d
            java.lang.Object r7 = r15.A01
            X.Btp r7 = (X.C24003Btp) r7
            java.lang.Object r2 = r15.A02
            X.Ba7 r2 = (X.C23031Ba7) r2
            java.lang.Object r8 = r15.A03
            com.google.android.gms.maps.model.LatLng r8 = (com.google.android.gms.maps.model.LatLng) r8
            java.lang.Object r9 = r15.A04
            android.view.View r9 = (android.view.View) r9
            android.content.Context r0 = r7.getContext()
            boolean r0 = X.C28281Zt.A0B(r0)
            if (r0 == 0) goto L_0x0036
            android.content.Context r1 = r7.getContext()
            r0 = 2132017211(0x7f14003b, float:1.9672694E38)
            X.Ba7 r0 = X.C23031Ba7.A00(r1, r0)
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            r2 = r0
        L_0x002e:
            A00(r7, r9, r4, r8, r2)
            X.CXy r0 = r7.A00
            if (r0 == 0) goto L_0x0047
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x002b
        L_0x0038:
            X.EBp r1 = r0.A00     // Catch:{ RemoteException -> 0x0041 }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x0041 }
            r0 = 1
            X.C26399Cyz.A03(r1, r0)     // Catch:{ RemoteException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x0047:
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x014c
            int r0 = r0.intValue()
            double r2 = (double) r0
            double r5 = r8.A00
            double r0 = r8.A01
            int r8 = r9.getWidth()
            int r12 = r8 * 2
            int r8 = r9.getHeight()
            int r11 = r8 * 2
            android.content.Context r13 = r7.getContext()
            if (r12 <= 0) goto L_0x0149
            if (r11 <= 0) goto L_0x0149
            X.BbE r10 = new X.BbE
            r10.<init>()
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r5, r0)
            r10.A05 = r8
            r8 = 1086324736(0x40c00000, float:6.0)
            r10.A01 = r8
            r9 = 2130968795(0x7f0400db, float:1.7546254E38)
            r8 = 2131099868(0x7f0600dc, float:1.7812101E38)
            int r8 = X.AnonymousClass3Ma.A00(r13, r9, r8)
            r10.A04 = r8
            r9 = 2130968794(0x7f0400da, float:1.7546252E38)
            r8 = 2131099867(0x7f0600db, float:1.78121E38)
            int r8 = X.AnonymousClass3Ma.A00(r13, r9, r8)
            r10.A03 = r8
            r10.A00 = r2
            com.google.android.gms.maps.internal.IGoogleMapDelegate r4 = r4.A01     // Catch:{ RemoteException -> 0x0143 }
            X.Cyz r4 = (X.C26399Cyz) r4     // Catch:{ RemoteException -> 0x0143 }
            android.os.Parcel r9 = X.C26399Cyz.A01(r10, r4)     // Catch:{ RemoteException -> 0x0143 }
            r8 = 35
            android.os.Parcel r14 = r4.A05(r8, r9)     // Catch:{ RemoteException -> 0x0143 }
            android.os.IBinder r13 = r14.readStrongBinder()     // Catch:{ RemoteException -> 0x0143 }
            if (r13 != 0) goto L_0x00a8
            r10 = 0
            goto L_0x00b4
        L_0x00a8:
            java.lang.String r9 = "com.google.android.gms.maps.model.internal.ICircleDelegate"
            android.os.IInterface r10 = r13.queryLocalInterface(r9)     // Catch:{ RemoteException -> 0x0143 }
            boolean r8 = r10 instanceof X.C28635EBp     // Catch:{ RemoteException -> 0x0143 }
            if (r8 == 0) goto L_0x00bd
            X.EBp r10 = (X.C28635EBp) r10     // Catch:{ RemoteException -> 0x0143 }
        L_0x00b4:
            r14.recycle()     // Catch:{ RemoteException -> 0x0143 }
            X.CXy r9 = new X.CXy     // Catch:{ RemoteException -> 0x0143 }
            r9.<init>(r10)     // Catch:{ RemoteException -> 0x0143 }
            goto L_0x00c3
        L_0x00bd:
            X.BgB r10 = new X.BgB     // Catch:{ RemoteException -> 0x0143 }
            r10.<init>(r13, r9)     // Catch:{ RemoteException -> 0x0143 }
            goto L_0x00b4
        L_0x00c3:
            int r10 = java.lang.Math.min(r12, r11)
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r5, r0)
            X.CYw r5 = new X.CYw
            r5.<init>()
            r0 = 0
            r11 = 4708598829799178240(0x41584db040000000, double:6371009.0)
            double r2 = r2 / r11
            com.google.android.gms.maps.model.LatLng r0 = X.DJ0.A0E(r8, r0, r2)
            r5.A01(r0)
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            com.google.android.gms.maps.model.LatLng r0 = X.DJ0.A0E(r8, r0, r2)
            r5.A01(r0)
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            com.google.android.gms.maps.model.LatLng r0 = X.DJ0.A0E(r8, r0, r2)
            r5.A01(r0)
            r0 = 4643457506423603200(0x4070e00000000000, double:270.0)
            com.google.android.gms.maps.model.LatLng r0 = X.DJ0.A0E(r8, r0, r2)
            r5.A01(r0)
            com.google.android.gms.maps.model.LatLngBounds r1 = r5.A00()
            java.lang.String r0 = "bounds must not be null"
            X.C18210vx.A02(r1, r0)
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r2 = X.C26080Crv.A00     // Catch:{ RemoteException -> 0x013d }
            java.lang.String r0 = "CameraUpdateFactory is not initialized"
            X.C18210vx.A02(r2, r0)     // Catch:{ RemoteException -> 0x013d }
            X.Cyz r2 = (X.C26399Cyz) r2     // Catch:{ RemoteException -> 0x013d }
            r0 = 50
            android.os.Parcel r1 = X.C26399Cyz.A01(r1, r2)     // Catch:{ RemoteException -> 0x013d }
            r1.writeInt(r10)     // Catch:{ RemoteException -> 0x013d }
            r1.writeInt(r10)     // Catch:{ RemoteException -> 0x013d }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x013d }
            r0 = 11
            com.google.android.gms.dynamic.IObjectWrapper r0 = X.C23331BfJ.A02(r1, r2, r0)     // Catch:{ RemoteException -> 0x013d }
            X.C18210vx.A00(r0)     // Catch:{ RemoteException -> 0x013d }
            android.os.Parcel r1 = X.C26399Cyz.A00(r0, r4)     // Catch:{ RemoteException -> 0x0137 }
            r0 = 4
            r4.A06(r0, r1)     // Catch:{ RemoteException -> 0x0137 }
            goto L_0x014a
        L_0x0137:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x013d:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x0143:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x0149:
            r9 = 0
        L_0x014a:
            r7.A00 = r9
        L_0x014c:
            return
        L_0x014d:
            java.lang.Object r6 = r15.A01
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r5 = r15.A02
            X.Ba7 r5 = (X.C23031Ba7) r5
            java.lang.Object r3 = r15.A03
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            java.lang.Object r2 = r15.A04
            android.view.View r2 = (android.view.View) r2
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.C28281Zt.A0B(r0)
            if (r0 == 0) goto L_0x0179
            android.content.Context r1 = r6.getContext()
            r0 = 2132017211(0x7f14003b, float:1.9672694E38)
            X.Ba7 r0 = X.C23031Ba7.A00(r1, r0)
        L_0x0172:
            if (r5 != 0) goto L_0x0175
            r5 = r0
        L_0x0175:
            A00(r6, r2, r4, r3, r5)
            return
        L_0x0179:
            r0 = 0
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKT.Bxb(X.Ccm):void");
    }

    public static void A00(View view, View view2, C25284Ccm ccm, LatLng latLng, C23031Ba7 ba7) {
        ccm.A0I(ba7);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167635);
        ccm.A07(0, dimensionPixelSize * 2, dimensionPixelSize, dimensionPixelSize);
        C18210vx.A02(latLng, "location must not be null.");
        ccm.A09(C26080Crv.A00(new CameraPosition(latLng, 15.0f, 0.0f, 0.0f)));
        C17960vV.A05(view2);
        view2.setVisibility(0);
    }
}
