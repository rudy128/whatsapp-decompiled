package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4bg  reason: invalid class name and case insensitive filesystem */
public final class C88984bg implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                A0z.add(C89454cU.CREATOR.createFromParcel(parcel));
            }
        }
        boolean booleanValue = A3Y.A00(parcel).booleanValue();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            obj = C89284cD.CREATOR.createFromParcel(parcel);
        }
        return new C89454cU((C89284cD) obj, A0y, readString, readString2, readString3, A0z, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89454cU[i];
    }
}
