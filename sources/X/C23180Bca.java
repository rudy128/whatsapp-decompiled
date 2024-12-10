package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bca  reason: case insensitive filesystem */
public final class C23180Bca extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final ECC A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.ECC} */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.ECC] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23180Bca(android.os.IBinder r4, java.lang.String r5, java.lang.String r6, android.content.IntentFilter[] r7) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x0020
            java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.ECC
            if (r0 == 0) goto L_0x001a
            X.ECC r1 = (X.ECC) r1
        L_0x0011:
            r3.A00 = r1
        L_0x0013:
            r3.A03 = r7
            r3.A01 = r5
            r3.A02 = r6
            return
        L_0x001a:
            X.Bi1 r1 = new X.Bi1
            r1.<init>(r4, r2)
            goto L_0x0011
        L_0x0020:
            r0 = 0
            r3.A00 = r0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23180Bca.<init>(android.os.IBinder, java.lang.String, java.lang.String, android.content.IntentFilter[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C26293Cx2.A00(parcel);
        ECC ecc = this.A00;
        if (ecc == null) {
            asBinder = null;
        } else {
            asBinder = ecc.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 2);
        C26293Cx2.A0F(parcel, this.A03, 3, i);
        C26293Cx2.A0A(parcel, this.A01, 4, false);
        C26293Cx2.A0A(parcel, this.A02, 5, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23180Bca() {
        this.A00 = null;
        throw AnonymousClass000.A0s("zzr");
    }
}
