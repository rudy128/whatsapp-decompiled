package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czr  reason: case insensitive filesystem */
public final class C26452Czr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        IBinder iBinder = null;
        C23203Bcx bcx = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                iBinder = C26300CxD.A09(parcel, readInt);
            } else if (c == 3) {
                bcx = (C23203Bcx) C26300CxD.A0A(parcel, C23203Bcx.CREATOR, readInt);
            } else if (c != 4) {
                z2 = C26300CxD.A0M(parcel, c, 5, readInt, z2);
            } else {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23136Bbp(iBinder, bcx, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23136Bbp[i];
    }
}
