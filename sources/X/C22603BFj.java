package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.BFj  reason: case insensitive filesystem */
public abstract class C22603BFj extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: com.google.android.gms.maps.internal.IGoogleMapDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: com.google.android.gms.maps.internal.IGoogleMapDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: com.google.android.gms.maps.internal.IGoogleMapDelegate} */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0287, code lost:
        if (r4.A0M.A06() != false) goto L_0x02e8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C23399BgQ
            if (r0 == 0) goto L_0x001c
            r2 = r11
            X.BgQ r2 = (X.C23399BgQ) r2
            r0 = 1
            if (r14 != r0) goto L_0x032c
            android.os.Parcelable$Creator r0 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r1 = X.BEA.A0M(r12, r0)
            com.google.android.gms.maps.model.LatLng r1 = (com.google.android.gms.maps.model.LatLng) r1
            X.E5Z r0 = r2.A00
            r0.BxZ(r1)
        L_0x0017:
            r13.writeNoException()
        L_0x001a:
            r0 = 1
            return r0
        L_0x001c:
            boolean r0 = r11 instanceof X.C23398BgP
            if (r0 == 0) goto L_0x002c
            r1 = r11
            X.BgP r1 = (X.C23398BgP) r1
            r0 = 1
            if (r14 != r0) goto L_0x032c
            X.E5X r0 = r1.A00
            r0.BnV()
            goto L_0x0017
        L_0x002c:
            boolean r0 = r11 instanceof X.C23397BgO
            if (r0 == 0) goto L_0x0040
            r2 = r11
            X.BgO r2 = (X.C23397BgO) r2
            r0 = 1
            if (r14 != r0) goto L_0x032c
            int r1 = r12.readInt()
            X.E5Y r0 = r2.A00
            r0.Bnb(r1)
            goto L_0x0017
        L_0x0040:
            boolean r0 = r11 instanceof X.C23396BgN
            if (r0 == 0) goto L_0x007f
            r1 = r11
            X.BgN r1 = (X.C23396BgN) r1
            r0 = 1
            if (r14 == r0) goto L_0x006b
            r0 = 2
            if (r14 != r0) goto L_0x032c
            android.os.IBinder r0 = r12.readStrongBinder()
            X.EBq r1 = X.C23400BgR.A00(r0)
            X.Ccd r0 = new X.Ccd
            r0.<init>(r1)
            r1 = 0
        L_0x005b:
            X.Bde r0 = new X.Bde
            r0.<init>(r1)
            r13.writeNoException()
            android.os.IBinder r0 = r0.asBinder()
            r13.writeStrongBinder(r0)
            goto L_0x001a
        L_0x006b:
            android.os.IBinder r0 = r12.readStrongBinder()
            X.EBq r2 = X.C23400BgR.A00(r0)
            X.E5W r1 = r1.A00
            X.Ccd r0 = new X.Ccd
            r0.<init>(r2)
            android.view.View r1 = r1.BSu(r0)
            goto L_0x005b
        L_0x007f:
            boolean r0 = r11 instanceof X.C23395BgM
            if (r0 == 0) goto L_0x011c
            r1 = r11
            X.BgM r1 = (X.C23395BgM) r1
            r0 = 1
            if (r14 != r0) goto L_0x032c
            android.os.IBinder r0 = r12.readStrongBinder()
            X.EBq r0 = X.C23400BgR.A00(r0)
            X.E2H r1 = r1.A00
            X.Ccd r3 = new X.Ccd
            r3.<init>(r0)
            X.DKN r1 = (X.DKN) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.A01
            com.whatsapp.location.LocationPicker2 r0 = (com.whatsapp.location.LocationPicker2) r0
            X.75M r2 = r0.A0V
            X.EBq r1 = r3.A00     // Catch:{ RemoteException -> 0x0320 }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x0320 }
            r0 = 2
            android.os.Parcel r1 = X.C26399Cyz.A02(r1, r0)     // Catch:{ RemoteException -> 0x0320 }
            java.lang.String r0 = r1.readString()     // Catch:{ RemoteException -> 0x0320 }
            r1.recycle()     // Catch:{ RemoteException -> 0x0320 }
            r2.A0a(r0, r3)
            goto L_0x0017
        L_0x00b9:
            java.lang.Object r4 = r1.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r4 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r4
            java.lang.Object r0 = r3.A01()
            X.6yC r0 = (X.C139086yC) r0
            if (r0 == 0) goto L_0x0017
            X.11S r1 = r4.A02
            X.2nL r0 = r0.A02
            com.whatsapp.jid.UserJid r7 = r0.A06
            boolean r0 = r1.A0O(r7)
            if (r0 != 0) goto L_0x0017
            int[] r1 = X.C108945cZ.A1W()
            X.Bti r0 = r4.A0N
            r0.getLocationOnScreen(r1)
            com.google.android.gms.maps.model.LatLng r1 = r3.A00()
            X.Ccm r0 = r4.A06
            X.C17960vV.A07(r0)
            X.CZk r0 = r0.A00()
            android.graphics.Point r0 = r0.A00(r1)
            android.graphics.Rect r5 = X.AnonymousClass3MW.A07()
            int r1 = r0.x
            r5.left = r1
            int r0 = r0.y
            r5.top = r0
            r5.right = r1
            r5.bottom = r0
            X.7By r3 = r4.A0O
            X.2nL r2 = r3.A0O
            r10 = 0
            if (r2 == 0) goto L_0x0119
            double r0 = r2.A00
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            double r0 = r2.A01
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
        L_0x010e:
            X.1BI r6 = r3.A0I
            android.content.Intent r0 = X.A09.A00(r4, r5, r6, r7, r8, r9, r10)
            r4.startActivity(r0)
            goto L_0x0017
        L_0x0119:
            r8 = r10
            r9 = r10
            goto L_0x010e
        L_0x011c:
            boolean r0 = r11 instanceof X.C23394BgL
            if (r0 == 0) goto L_0x014c
            r4 = r11
            X.BgL r4 = (X.C23394BgL) r4
            r0 = 1
            if (r14 != r0) goto L_0x032c
            android.os.IBinder r3 = r12.readStrongBinder()
            if (r3 != 0) goto L_0x0139
            r1 = 0
        L_0x012d:
            X.E5a r2 = r4.A00
            X.Ccm r0 = new X.Ccm
            r0.<init>(r1)
            r2.Bxb(r0)
            goto L_0x0017
        L_0x0139:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)
            boolean r0 = r1 instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate
            if (r0 == 0) goto L_0x0146
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = (com.google.android.gms.maps.internal.IGoogleMapDelegate) r1
            goto L_0x012d
        L_0x0146:
            X.BgE r1 = new X.BgE
            r1.<init>(r3, r2)
            goto L_0x012d
        L_0x014c:
            boolean r0 = r11 instanceof X.C23393BgK
            if (r0 == 0) goto L_0x01f8
            r1 = r11
            X.BgK r1 = (X.C23393BgK) r1
            r2 = 1
            if (r14 == r2) goto L_0x0176
            r0 = 2
            if (r14 != r0) goto L_0x032c
            X.E2G r1 = r1.A00
            X.DKI r1 = (X.DKI) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0164;
                case 1: goto L_0x0168;
                default: goto L_0x0162;
            }
        L_0x0162:
            goto L_0x0017
        L_0x0164:
            java.lang.Object r1 = r1.A01
            goto L_0x01f1
        L_0x0168:
            java.lang.Object r1 = r1.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            r0 = 0
            r1.A0a = r0
            X.Ccm r0 = r1.A06
            X.C17960vV.A07(r0)
            goto L_0x0017
        L_0x0176:
            X.E2G r4 = r1.A00
            X.DKI r4 = (X.DKI) r4
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x0181;
                default: goto L_0x017f;
            }
        L_0x017f:
            goto L_0x0017
        L_0x0181:
            java.lang.Object r1 = r4.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            r0 = 0
            r1.A0a = r0
            X.Ccm r0 = r1.A06
            X.C17960vV.A07(r0)
            r0.A04()
            X.7By r3 = r1.A0O
            X.6eC r0 = r3.A0L
            if (r0 == 0) goto L_0x01a7
            X.Ccm r0 = r1.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A0a(r0)
            goto L_0x0017
        L_0x01a7:
            X.6yC r0 = r3.A0N
            if (r0 == 0) goto L_0x01df
            com.google.android.gms.maps.model.LatLng r3 = r0.A00()
            X.Ccm r0 = r1.A06
            X.CZk r0 = r0.A00()
            X.BcK r0 = r0.A02()
            com.google.android.gms.maps.model.LatLngBounds r0 = r0.A04
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x0017
            X.7By r0 = r1.A0O
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x0017
            r1.A0a = r2
            X.Ccm r2 = r1.A06
            float r1 = r1.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = java.lang.Math.min(r1, r0)
            X.CLK r0 = X.C26080Crv.A02(r3, r0)
            r2.A0A(r0, r4)
            goto L_0x0017
        L_0x01df:
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x0017
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r1.A0b = r0
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0q(r1, r2)
            goto L_0x0017
        L_0x01ef:
            java.lang.Object r1 = r4.A01
        L_0x01f1:
            X.Bti r1 = (X.C24001Bti) r1
            r0 = 0
            r1.A0B = r0
            goto L_0x0017
        L_0x01f8:
            r1 = r11
            X.BgJ r1 = (X.C23392BgJ) r1
            r5 = 1
            if (r14 != r5) goto L_0x032c
            android.os.IBinder r0 = r12.readStrongBinder()
            X.EBq r0 = X.C23400BgR.A00(r0)
            X.E2I r1 = r1.A00
            X.Ccd r3 = new X.Ccd
            r3.<init>(r0)
            X.DKP r1 = (X.DKP) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x028a
            java.lang.Object r4 = r1.A01
            com.whatsapp.location.LocationPicker2 r4 = (com.whatsapp.location.LocationPicker2) r4
            X.75M r0 = r4.A0V
            boolean r0 = r0.A0i
            if (r0 != 0) goto L_0x02e8
            X.EBq r1 = r3.A00     // Catch:{ RemoteException -> 0x0326 }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x0326 }
            r0 = 2
            android.os.Parcel r1 = X.C26399Cyz.A02(r1, r0)     // Catch:{ RemoteException -> 0x0326 }
            java.lang.String r0 = r1.readString()     // Catch:{ RemoteException -> 0x0326 }
            r1.recycle()     // Catch:{ RemoteException -> 0x0326 }
            r6 = 0
            if (r0 != 0) goto L_0x0233
            r0 = 0
            goto L_0x02e9
        L_0x0233:
            X.75M r0 = r4.A0V
            com.whatsapp.location.PlaceInfo r0 = r0.A0U
            if (r0 == 0) goto L_0x0247
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0247
            X.Ccd r1 = (X.C25280Ccd) r1
            X.CLL r0 = r4.A03
            r1.A04(r0)
            r1.A02()
        L_0x0247:
            X.CLL r0 = r4.A04
            r3.A04(r0)
            X.75M r0 = r4.A0V
            r0.A0Z(r3)
            r2 = 2131886125(0x7f12002d, float:1.940682E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.75M r0 = r4.A0V
            com.whatsapp.location.PlaceInfo r0 = r0.A0U
            java.lang.String r0 = r0.A06
            r1[r6] = r0
            java.lang.String r2 = r4.getString(r2, r1)
            android.content.Context r1 = r4.getBaseContext()
            X.11C r0 = r4.A08
            X.AnonymousClass1Y5.A00(r1, r0, r2)
            X.75M r0 = r4.A0V
            android.view.View r0 = r0.A08
            r1 = 8
            r0.setVisibility(r1)
            X.75M r0 = r4.A0V
            android.view.View r0 = r0.A0B
            r0.setVisibility(r1)
            X.75M r0 = r4.A0V
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x02e5
            X.17x r0 = r4.A0M
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x02e8
            goto L_0x02e5
        L_0x028a:
            java.lang.Object r6 = r1.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r6 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r6
            X.Ccm r0 = r6.A06
            X.C17960vV.A07(r0)
            X.7By r0 = r6.A0O
            r0.A0W = r5
            r4 = 0
            r0.A0U = r4
            android.view.View r2 = r0.A0C
            X.2nL r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x02a3
            r0 = 0
        L_0x02a3:
            r2.setVisibility(r0)
            java.lang.Object r0 = r3.A01()
            boolean r0 = r0 instanceof X.C139086yC
            if (r0 == 0) goto L_0x031a
            java.lang.Object r2 = r3.A01()
            X.6yC r2 = (X.C139086yC) r2
            boolean r0 = r3.A09()
            if (r0 != 0) goto L_0x02d4
            X.7By r1 = r6.A0O
            java.util.List r0 = r2.A04
            java.lang.Object r0 = r0.get(r4)
            X.2nL r0 = (X.C60072nL) r0
            X.6yC r2 = r1.A0K(r0)
            if (r2 == 0) goto L_0x031a
            java.lang.String r1 = r2.A03
            java.util.Map r0 = r6.A0W
            java.lang.Object r3 = r0.get(r1)
            X.Ccd r3 = (X.C25280Ccd) r3
        L_0x02d4:
            int r0 = r2.A00
            if (r0 == r5) goto L_0x031a
            java.util.List r4 = r2.A04
            int r0 = r4.size()
            if (r0 != r5) goto L_0x02f1
            X.7By r0 = r6.A0O
            r0.A0X(r2, r5)
        L_0x02e5:
            r3.A03()
        L_0x02e8:
            r0 = 1
        L_0x02e9:
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x001a
        L_0x02f1:
            X.Ccm r0 = r6.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0305
            X.7By r0 = r6.A0O
            r0.A0X(r2, r5)
            goto L_0x02e8
        L_0x0305:
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0d(r6, r4, r5)
            X.7By r2 = r6.A0O
            X.Ccm r0 = r6.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            X.6eC r0 = new X.6eC
            r0.<init>(r4, r1)
            r2.A0L = r0
            goto L_0x02e8
        L_0x031a:
            X.7By r0 = r6.A0O
            r0.A0N()
            goto L_0x02e8
        L_0x0320:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x0326:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x032c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22603BFj.A01(android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A01(parcel, parcel2, i);
    }
}
