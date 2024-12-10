package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1K implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                z2 = C26300CxD.A0M(parcel, c, 2, readInt, z2);
            } else {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23151Bc4(z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23151Bc4[i];
    }
}
