package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2i  reason: case insensitive filesystem */
public final class C26521D2i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 3) {
                str2 = C26300CxD.A0D(parcel, readInt);
            } else if (c != 4) {
                z = C26300CxD.A0M(parcel, c, 5, readInt, z);
            } else {
                C26300CxD.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23163BcJ(str, str2, i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23163BcJ[i];
    }
}
