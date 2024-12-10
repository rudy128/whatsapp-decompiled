package X;

import android.os.Parcelable;

public final class D1A implements Parcelable.Creator {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.EBy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.EBr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.EBr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.EBy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.EBy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.EBr} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Bbu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.Cyy] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r2 = X.C26300CxD.A02(r14)
            r5 = 0
            r12 = r5
            r11 = r5
            r10 = r5
            r7 = r5
            r9 = r5
            r8 = r5
            r3 = 0
        L_0x000d:
            int r0 = r14.dataPosition()
            if (r0 >= r2) goto L_0x004b
            int r1 = r14.readInt()
            char r0 = (char) r1
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x0024;
                case 3: goto L_0x0029;
                case 4: goto L_0x002e;
                case 5: goto L_0x0046;
                case 6: goto L_0x0033;
                case 7: goto L_0x003c;
                case 8: goto L_0x0041;
                default: goto L_0x001b;
            }
        L_0x001b:
            X.C26300CxD.A0I(r14, r1)
            goto L_0x000d
        L_0x001f:
            android.os.IBinder r5 = X.C26300CxD.A09(r14, r1)
            goto L_0x000d
        L_0x0024:
            android.os.IBinder r12 = X.C26300CxD.A09(r14, r1)
            goto L_0x000d
        L_0x0029:
            java.lang.String r11 = X.C26300CxD.A0D(r14, r1)
            goto L_0x000d
        L_0x002e:
            java.lang.String r10 = X.C26300CxD.A0D(r14, r1)
            goto L_0x000d
        L_0x0033:
            android.os.Parcelable$Creator r0 = X.C23195Bcp.CREATOR
            android.os.Parcelable r7 = X.C26300CxD.A0A(r14, r0, r1)
            X.Bcp r7 = (X.C23195Bcp) r7
            goto L_0x000d
        L_0x003c:
            android.os.IBinder r9 = X.C26300CxD.A09(r14, r1)
            goto L_0x000d
        L_0x0041:
            byte[] r8 = X.C26300CxD.A0O(r14, r1)
            goto L_0x000d
        L_0x0046:
            long r3 = X.C26300CxD.A07(r14, r1)
            goto L_0x000d
        L_0x004b:
            X.C26300CxD.A0H(r14, r2)
            r6 = 0
            if (r5 != 0) goto L_0x0092
            r1 = r6
        L_0x0052:
            if (r12 != 0) goto L_0x007f
            r2 = r6
        L_0x0055:
            if (r9 == 0) goto L_0x0063
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r6 = r9.queryLocalInterface(r5)
            boolean r0 = r6 instanceof X.C28639EBt
            if (r0 == 0) goto L_0x0079
            X.EBt r6 = (X.C28639EBt) r6
        L_0x0063:
            X.Bbu r0 = new X.Bbu
            r0.<init>()
            r0.A03 = r1
            r0.A01 = r2
            r0.A05 = r11
            r0.A06 = r10
            r0.A00 = r3
            r0.A04 = r7
            r0.A02 = r6
            r0.A07 = r8
            return r0
        L_0x0079:
            X.BgY r6 = new X.BgY
            r6.<init>(r9, r5)
            goto L_0x0063
        L_0x007f:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback"
            android.os.IInterface r2 = r12.queryLocalInterface(r5)
            boolean r0 = r2 instanceof X.C28637EBr
            if (r0 == 0) goto L_0x008c
            X.EBr r2 = (X.C28637EBr) r2
            goto L_0x0055
        L_0x008c:
            X.BgW r2 = new X.BgW
            r2.<init>(r12, r5)
            goto L_0x0055
        L_0x0092:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener"
            android.os.IInterface r1 = r5.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.C28642EBy
            if (r0 == 0) goto L_0x009f
            X.EBy r1 = (X.C28642EBy) r1
            goto L_0x0052
        L_0x009f:
            X.Bgd r1 = new X.Bgd
            r1.<init>(r5, r2)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D1A.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23141Bbu[i];
    }
}
