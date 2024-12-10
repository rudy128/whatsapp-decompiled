package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1x2  reason: invalid class name and case insensitive filesystem */
public final class C41771x2 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        int readInt = parcel.readInt();
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        long readLong2 = parcel.readLong();
        int readInt2 = parcel.readInt();
        long readLong3 = parcel.readLong();
        boolean z = false;
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C41761x1(readString, readInt, readInt2, parcel.readInt(), readLong, readLong2, readLong3, z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C41761x1[i];
    }
}
