package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class AAY implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        boolean A02 = A3Y.A02(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, C20245ADd.CREATOR, A0z, i);
            }
        }
        return new C20256ADo(readString, A0z, A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20256ADo[i];
    }
}
