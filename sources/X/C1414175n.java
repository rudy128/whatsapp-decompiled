package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75n  reason: invalid class name and case insensitive filesystem */
public final class C1414175n implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Double valueOf;
        int A0A = C72453Mb.A0A(parcel);
        double readDouble = parcel.readDouble();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Double.valueOf(parcel.readDouble());
        }
        return new C1417376t(valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readDouble, A0A, parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417376t[i];
    }
}
