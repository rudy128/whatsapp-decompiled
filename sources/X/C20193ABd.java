package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: X.ABd  reason: case insensitive filesystem */
public final class C20193ABd implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Date date = (Date) parcel.readSerializable();
        Date date2 = (Date) parcel.readSerializable();
        Date date3 = (Date) parcel.readSerializable();
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                A0z.add(parcel.readSerializable());
            }
        }
        return new AEO(A0y, readString, readString2, date, date2, date3, (Date) parcel.readSerializable(), A0z, parcel.createStringArrayList());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEO[i];
    }
}
