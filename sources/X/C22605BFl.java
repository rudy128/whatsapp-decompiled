package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BFl  reason: case insensitive filesystem */
public abstract class C22605BFl extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public static UnsupportedOperationException A00(Parcel parcel, Parcelable.Creator creator) {
        C25910CoO.A00(parcel, creator);
        return new UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.Cyp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.Bhz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Bhz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.BbM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.Bhz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.Bhz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: android.os.Parcelable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x000d
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0010
        L_0x000b:
            r0 = 1
            return r0
        L_0x000d:
            X.BE7.A16(r8, r10)
        L_0x0010:
            r3 = r8
            boolean r0 = r8 instanceof X.Bi3
            if (r0 == 0) goto L_0x0020
            X.Bi3 r3 = (X.Bi3) r3
            r0 = 13
            if (r9 == r0) goto L_0x00da
            switch(r9) {
                case 1: goto L_0x00a3;
                case 2: goto L_0x0106;
                case 3: goto L_0x0092;
                case 4: goto L_0x0080;
                case 5: goto L_0x006e;
                case 6: goto L_0x005c;
                case 7: goto L_0x004a;
                case 8: goto L_0x0038;
                case 9: goto L_0x0026;
                default: goto L_0x001e;
            }
        L_0x001e:
            r0 = 0
            return r0
        L_0x0020:
            X.Bi2 r3 = (X.C23498Bi2) r3
            switch(r9) {
                case 2: goto L_0x0234;
                case 3: goto L_0x022d;
                case 4: goto L_0x0226;
                case 5: goto L_0x021f;
                case 6: goto L_0x0218;
                case 7: goto L_0x011c;
                case 8: goto L_0x0211;
                case 9: goto L_0x020a;
                case 10: goto L_0x0146;
                case 11: goto L_0x0138;
                case 12: goto L_0x0203;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01f5;
                case 15: goto L_0x01ee;
                case 16: goto L_0x01e7;
                case 17: goto L_0x01e0;
                case 18: goto L_0x01d9;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01cb;
                case 21: goto L_0x0025;
                case 22: goto L_0x01c4;
                case 23: goto L_0x01bd;
                case 24: goto L_0x0025;
                case 25: goto L_0x0025;
                case 26: goto L_0x01b6;
                case 27: goto L_0x01af;
                case 28: goto L_0x01a8;
                case 29: goto L_0x01a1;
                case 30: goto L_0x019a;
                case 31: goto L_0x0025;
                case 32: goto L_0x0025;
                case 33: goto L_0x0025;
                case 34: goto L_0x0193;
                case 35: goto L_0x018c;
                case 36: goto L_0x0185;
                case 37: goto L_0x017e;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001e
        L_0x0026:
            android.os.Parcelable$Creator r0 = X.C23156BcC.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 5
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onEntityUpdate"
            goto L_0x0117
        L_0x0038:
            android.os.Parcelable$Creator r0 = X.Bc6.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 3
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onConnectedCapabilityChanged"
            goto L_0x0117
        L_0x004a:
            android.os.Parcelable$Creator r0 = X.C23135Bbo.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 6
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onChannelEvent"
            goto L_0x0117
        L_0x005c:
            android.os.Parcelable$Creator r0 = X.C23170BcQ.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 4
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onNotificationReceived"
            goto L_0x0117
        L_0x006e:
            android.os.Parcelable$Creator r0 = X.C23163BcJ.CREATOR
            java.util.ArrayList r5 = r10.createTypedArrayList(r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 2
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onConnectedNodes"
            goto L_0x0117
        L_0x0080:
            android.os.Parcelable$Creator r0 = X.C23163BcJ.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 1
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onPeerDisconnected"
            goto L_0x0117
        L_0x0092:
            android.os.Parcelable$Creator r0 = X.C23163BcJ.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 0
            X.3Cf r2 = new X.3Cf
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onPeerConnected"
            goto L_0x0117
        L_0x00a3:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r7 = X.BEA.A0M(r10, r0)
            com.google.android.gms.common.data.DataHolder r7 = (com.google.android.gms.common.data.DataHolder) r7
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 48
            X.DTa r6 = new X.DTa
            r6.<init>(r7, r3, r0)
            java.lang.String r5 = "onDataItemChanged"
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0179 }
            int r2 = r7.A00     // Catch:{ all -> 0x0179 }
            int r0 = X.BE8.A0C(r4)     // Catch:{ all -> 0x0179 }
            int r0 = r0 + 18
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)     // Catch:{ all -> 0x0179 }
            r1.append(r4)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = ", rows="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ all -> 0x0179 }
            boolean r0 = X.C23508BiI.A01(r3, r0, r6, r5)     // Catch:{ all -> 0x0179 }
            if (r0 != 0) goto L_0x000b
            r7.close()
            goto L_0x000b
        L_0x00da:
            android.os.Parcelable$Creator r0 = X.C23107BbM.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BbM r5 = (X.C23107BbM) r5
            android.os.IBinder r4 = r10.readStrongBinder()
            if (r4 != 0) goto L_0x00f3
            r1 = 0
        L_0x00e9:
            X.BiI r3 = (X.C23508BiI) r3
            X.DTg r2 = new X.DTg
            r2.<init>((X.C23495Bhz) r1, (X.C23107BbM) r5, (X.C23508BiI) r3)
            java.lang.String r0 = "onRequestReceived"
            goto L_0x0117
        L_0x00f3:
            java.lang.String r2 = "com.google.android.gms.wearable.internal.IRpcResponseCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.C23495Bhz
            if (r0 == 0) goto L_0x0100
            X.Bhz r1 = (X.C23495Bhz) r1
            goto L_0x00e9
        L_0x0100:
            X.Bhz r1 = new X.Bhz
            r1.<init>(r4, r2)
            goto L_0x00e9
        L_0x0106:
            android.os.Parcelable$Creator r0 = X.C23107BbM.CREATOR
            android.os.Parcelable r5 = X.BEA.A0M(r10, r0)
            X.BiI r3 = (X.C23508BiI) r3
            r0 = 49
            X.DTa r2 = new X.DTa
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "onMessageReceived"
        L_0x0117:
            X.C23508BiI.A01(r3, r5, r2, r0)
            goto L_0x000b
        L_0x011c:
            android.os.Parcelable$Creator r0 = X.C23069Bak.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r10, r0)
            X.Bak r2 = (X.C23069Bak) r2
            boolean r0 = r3 instanceof X.BiF
            if (r0 == 0) goto L_0x023b
            X.BiG r3 = (X.C23506BiG) r3
            int r0 = r2.A00
            com.google.android.gms.common.api.Status r1 = X.CBN.A00(r0)
            int r0 = r2.A01
            X.DL1 r2 = new X.DL1
            r2.<init>(r1, r0)
            goto L_0x016a
        L_0x0138:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.BEA.A0M(r10, r0)
            boolean r0 = r3 instanceof X.C23504BiD
            if (r0 != 0) goto L_0x0174
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        L_0x0146:
            android.os.Parcelable$Creator r0 = X.C23061Bac.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r10, r0)
            X.Bac r2 = (X.C23061Bac) r2
            boolean r0 = r3 instanceof X.C23505BiE
            if (r0 == 0) goto L_0x0240
            X.BiG r3 = (X.C23506BiG) r3
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x015f
            r1.addAll(r0)
        L_0x015f:
            int r0 = r2.A00
            com.google.android.gms.common.api.Status r0 = X.CBN.A00(r0)
            X.DL2 r2 = new X.DL2
            r2.<init>(r0, r1)
        L_0x016a:
            X.E7v r0 = r3.A00
            if (r0 == 0) goto L_0x0174
            r0.CKS(r2)
            r0 = 0
            r3.A00 = r0
        L_0x0174:
            r11.writeNoException()
            goto L_0x000b
        L_0x0179:
            r0 = move-exception
            r7.close()
            throw r0
        L_0x017e:
            android.os.Parcelable$Creator r0 = X.C23058BaZ.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0185:
            android.os.Parcelable$Creator r0 = X.C23067Bai.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x018c:
            android.os.Parcelable$Creator r0 = X.C23063Bae.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0193:
            android.os.Parcelable$Creator r0 = X.C23078Bat.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x019a:
            android.os.Parcelable$Creator r0 = X.C23076Bar.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01a1:
            android.os.Parcelable$Creator r0 = X.C23057BaY.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01a8:
            android.os.Parcelable$Creator r0 = X.C23056BaX.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01af:
            android.os.Parcelable$Creator r0 = X.C23037BaE.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01b6:
            android.os.Parcelable$Creator r0 = X.C23036BaD.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01bd:
            android.os.Parcelable$Creator r0 = X.C23052BaT.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01c4:
            android.os.Parcelable$Creator r0 = X.C23053BaU.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01cb:
            android.os.Parcelable$Creator r0 = X.C23034BaB.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01d2:
            android.os.Parcelable$Creator r0 = X.C23033BaA.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01d9:
            android.os.Parcelable$Creator r0 = X.C23055BaW.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01e0:
            android.os.Parcelable$Creator r0 = X.C23054BaV.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01e7:
            android.os.Parcelable$Creator r0 = X.C23035BaC.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01ee:
            android.os.Parcelable$Creator r0 = X.C23035BaC.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01f5:
            android.os.Parcelable$Creator r0 = X.C23066Bah.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x01fc:
            android.os.Parcelable$Creator r0 = X.C23060Bab.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0203:
            android.os.Parcelable$Creator r0 = X.C23079Bau.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x020a:
            android.os.Parcelable$Creator r0 = X.C23065Bag.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0211:
            android.os.Parcelable$Creator r0 = X.C23064Baf.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0218:
            android.os.Parcelable$Creator r0 = X.C23051BaS.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x021f:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0226:
            android.os.Parcelable$Creator r0 = X.C23062Bad.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x022d:
            android.os.Parcelable$Creator r0 = X.C23068Baj.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x0234:
            android.os.Parcelable$Creator r0 = X.C23059Baa.CREATOR
            java.lang.UnsupportedOperationException r0 = A00(r10, r0)
            throw r0
        L_0x023b:
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        L_0x0240:
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22605BFl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
