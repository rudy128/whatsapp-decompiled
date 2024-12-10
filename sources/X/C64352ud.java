package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
public final class C64352ud implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable readParcelable = parcel.readParcelable(AnonymousClass273.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        SparseIntArray sparseIntArray = new SparseIntArray(readInt6);
        while (readInt6 != 0) {
            sparseIntArray.put(parcel.readInt(), parcel.readInt());
            readInt6--;
        }
        return new AnonymousClass273(readParcelable, sparseIntArray, readInt, readInt2, readInt3, readInt4, readInt5);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass273[i];
    }
}
