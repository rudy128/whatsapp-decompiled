package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D00 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 2) {
                str = C26300CxD.A0E(parcel, str, c, 3, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23178BcY.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23105BbK(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23105BbK[i];
    }
}
