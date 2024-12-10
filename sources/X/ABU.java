package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ABU implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                A0z.add(AnonymousClass3Ma.A08(parcel, C20280AEo.class));
            }
        }
        return new C20280AEo(A0y, readString, readString2, parcel.readString(), A0z, readLong);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20280AEo[i];
    }
}
