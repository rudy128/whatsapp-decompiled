package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cze  reason: case insensitive filesystem */
public final class C26439Cze implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                z = C26300CxD.A0M(parcel, c, 2, readInt, z);
            } else {
                bArr = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23038BaF(bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23038BaF[i];
    }
}
