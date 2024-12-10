package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACJ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        AnonymousClass9I2 valueOf = AnonymousClass9I2.valueOf(C72453Mb.A0y(parcel));
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, C20265ADx.CREATOR, A0z, i);
            }
        }
        if (parcel.readInt() != 0) {
            obj = ADY.CREATOR.createFromParcel(parcel);
        }
        return new AED((ADY) obj, valueOf, parcel.readString(), A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AED[i];
    }
}
