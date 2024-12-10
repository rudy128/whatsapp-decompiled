package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ACQ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        Object createFromParcel;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        String A0y = C72453Mb.A0y(parcel);
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            int i = 0;
            while (i != readInt) {
                i = AnonymousClass8BV.A01(parcel, AET.CREATOR, A0z, i);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AE1.CREATOR.createFromParcel(parcel);
        }
        AE1 ae1 = (AE1) createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = AE1.CREATOR.createFromParcel(parcel);
        }
        AE1 ae12 = (AE1) createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = AE1.CREATOR.createFromParcel(parcel);
        }
        AE1 ae13 = (AE1) createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = AE1.CREATOR.createFromParcel(parcel);
        }
        AE1 ae14 = (AE1) createFromParcel4;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            obj = C20250ADi.CREATOR.createFromParcel(parcel);
        }
        return new AEU((C20250ADi) obj, ae1, ae12, ae13, ae14, A0y, readString, readString2, parcel.readString(), A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEU[i];
    }
}
