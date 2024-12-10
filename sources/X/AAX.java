package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class AAX implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        if (C72453Mb.A0A(parcel) == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, C20256ADo.CREATOR, A0z, i);
            }
        }
        return new ADW(A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADW[i];
    }
}
