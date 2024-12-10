package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACK implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        boolean A02 = A3Y.A02(parcel);
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt2 = parcel.readInt();
            A0z = C17880vN.A0z(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = AnonymousClass8BV.A01(parcel, C20265ADx.CREATOR, A0z, i);
            }
        }
        return new ADQ(readInt, A0z, A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADQ[i];
    }
}
