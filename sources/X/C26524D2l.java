package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2l  reason: case insensitive filesystem */
public final class C26524D2l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 3) {
                str2 = C26300CxD.A0D(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23077Bas(j, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23077Bas[i];
    }
}
