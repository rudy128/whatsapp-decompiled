package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACo  reason: case insensitive filesystem */
public final class C20230ACo implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new C20275AEi(valueOf, l, A0y, readString, readString2, readString3, readString4, readString5, readString6, createByteArray);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20275AEi[i];
    }
}
