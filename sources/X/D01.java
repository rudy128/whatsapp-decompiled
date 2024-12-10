package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D01 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23179BcZ.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23178BcY(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23178BcY[i];
    }
}
