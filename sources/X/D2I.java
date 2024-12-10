package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D2I implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23163BcJ.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new Bc6(str, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Bc6[i];
    }
}
