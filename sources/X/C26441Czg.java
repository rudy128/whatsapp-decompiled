package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czg  reason: case insensitive filesystem */
public final class C26441Czg implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C23152Bc8[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c == 2) {
                j2 = C26300CxD.A07(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23152Bc8(j, z, j2);
    }
}
