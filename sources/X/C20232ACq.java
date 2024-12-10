package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACq  reason: case insensitive filesystem */
public final class C20232ACq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20275AEi.CREATOR.createFromParcel(parcel);
        }
        return new AEE((C20275AEi) createFromParcel, A0y, readString, createByteArray);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEE[i];
    }
}
