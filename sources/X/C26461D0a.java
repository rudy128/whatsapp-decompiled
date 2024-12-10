package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0a  reason: case insensitive filesystem */
public final class C26461D0a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c == 3) {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            } else if (c == 4) {
                bArr3 = C26300CxD.A0O(parcel, readInt);
            } else if (c != 5) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                strArr = C26300CxD.A0S(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23231Bdh(bArr, bArr2, bArr3, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23231Bdh[i];
    }
}
