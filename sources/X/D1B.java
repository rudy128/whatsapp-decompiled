package X;

import android.os.Parcelable;

public final class D1B implements Parcelable.Creator {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.Cyy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.BgS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.BgS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.BgS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.BgS} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Bbr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.Cyy] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r5 = X.C26300CxD.A02(r12)
            r2 = 0
            r10 = r2
            r8 = r2
            r7 = r2
            r9 = r2
            r3 = 0
        L_0x000b:
            int r0 = r12.dataPosition()
            if (r0 >= r5) goto L_0x003f
            int r1 = r12.readInt()
            char r0 = (char) r1
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x0022;
                case 3: goto L_0x0027;
                case 4: goto L_0x003a;
                case 5: goto L_0x002c;
                case 6: goto L_0x0035;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.C26300CxD.A0I(r12, r1)
            goto L_0x000b
        L_0x001d:
            android.os.IBinder r2 = X.C26300CxD.A09(r12, r1)
            goto L_0x000b
        L_0x0022:
            android.os.IBinder r10 = X.C26300CxD.A09(r12, r1)
            goto L_0x000b
        L_0x0027:
            java.lang.String r8 = X.C26300CxD.A0D(r12, r1)
            goto L_0x000b
        L_0x002c:
            android.os.Parcelable$Creator r0 = X.C23194Bco.CREATOR
            android.os.Parcelable r7 = X.C26300CxD.A0A(r12, r0, r1)
            X.Bco r7 = (X.C23194Bco) r7
            goto L_0x000b
        L_0x0035:
            android.os.IBinder r9 = X.C26300CxD.A09(r12, r1)
            goto L_0x000b
        L_0x003a:
            long r3 = X.C26300CxD.A07(r12, r1)
            goto L_0x000b
        L_0x003f:
            X.C26300CxD.A0H(r12, r5)
            r5 = 0
            if (r2 != 0) goto L_0x0082
            r6 = r5
        L_0x0046:
            if (r10 != 0) goto L_0x006f
            r1 = r5
        L_0x0049:
            if (r9 == 0) goto L_0x0057
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IDiscoveryListener"
            android.os.IInterface r5 = r9.queryLocalInterface(r2)
            boolean r0 = r5 instanceof X.EBv
            if (r0 == 0) goto L_0x0069
            X.EBv r5 = (X.EBv) r5
        L_0x0057:
            X.Bbr r0 = new X.Bbr
            r0.<init>()
            r0.A03 = r6
            r0.A01 = r1
            r0.A05 = r8
            r0.A00 = r3
            r0.A04 = r7
            r0.A02 = r5
            return r0
        L_0x0069:
            X.Bga r5 = new X.Bga
            r5.<init>(r9, r2)
            goto L_0x0057
        L_0x006f:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback"
            android.os.IInterface r1 = r10.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.C23401BgS
            if (r0 == 0) goto L_0x007c
            X.BgS r1 = (X.C23401BgS) r1
            goto L_0x0049
        L_0x007c:
            X.BgS r1 = new X.BgS
            r1.<init>(r10, r2)
            goto L_0x0049
        L_0x0082:
            X.EBx r6 = X.BEA.A0U(r2)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D1B.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23138Bbr[i];
    }
}
