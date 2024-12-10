package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACH implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        int i = 0;
        while (i != readInt) {
            i = AnonymousClass8BV.A01(parcel, C20264ADw.CREATOR, A0z, i);
        }
        return new C20265ADx(A0y, readString, A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20265ADx[i];
    }
}
