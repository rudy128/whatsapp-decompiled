package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0H implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                int A04 = C26300CxD.A04(parcel, readInt);
                if (A04 == 0) {
                    num = null;
                } else {
                    C26300CxD.A0J(parcel, A04, 4);
                    num = AnonymousClass8BT.A0i(parcel);
                }
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23150Bc3(str, num.intValue());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23150Bc3[i];
    }
}
