package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABc  reason: case insensitive filesystem */
public final class C20192ABc implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong2 = parcel.readLong();
        return new AEX(A0y, readString, readString2, readString3, readString4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), readInt, readInt2, readInt3, readInt4, readInt5, readLong, readLong2, C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEX[i];
    }
}
