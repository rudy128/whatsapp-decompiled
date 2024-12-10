package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ABZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        String A0y = C72453Mb.A0y(parcel);
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, AEV.CREATOR, A0z, i);
            }
        }
        if (parcel.readInt() != 0) {
            obj = AEV.CREATOR.createFromParcel(parcel);
        }
        return new AES((AEV) obj, A0y, A0z, parcel.readInt(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AES[i];
    }
}
