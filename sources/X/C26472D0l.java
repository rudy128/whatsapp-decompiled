package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0l  reason: case insensitive filesystem */
public final class C26472D0l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                C26300CxD.A0K(parcel, readInt, 4);
                parcel.readInt();
            } else if (c != 2) {
                bArr = C26300CxD.A0P(parcel, bArr, c, 3, readInt);
            } else {
                str = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23041BaI(str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23041BaI[i];
    }
}
