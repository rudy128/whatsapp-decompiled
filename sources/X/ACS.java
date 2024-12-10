package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACS implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AE1 ae1 = (AE1) AE1.CREATOR.createFromParcel(parcel);
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AE1.CREATOR.createFromParcel(parcel);
        }
        AE1 ae12 = (AE1) createFromParcel;
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList = C17880vN.A0z(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = AnonymousClass8BV.A01(parcel, C20252ADk.CREATOR, arrayList, i);
            }
        }
        return new AET(ae1, ae12, A0y, readString, readString2, parcel.readString(), arrayList, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AET[i];
    }
}
