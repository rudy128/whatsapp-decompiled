package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0c  reason: case insensitive filesystem */
public final class C26463D0c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 3) {
                int A04 = C26300CxD.A04(parcel, readInt);
                if (A04 == 0) {
                    bool = null;
                } else {
                    C26300CxD.A0J(parcel, A04, 4);
                    bool = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
                }
            } else if (c != 4) {
                str3 = C26300CxD.A0E(parcel, str3, c, 5, readInt);
            } else {
                str2 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23173BcT(bool, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23173BcT[i];
    }
}
