package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76C  reason: invalid class name */
public final class AnonymousClass76C implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        return new AnonymousClass77F(parcel.readLong(), A0y, parcel.readInt(), readString, parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77F[i];
    }
}
