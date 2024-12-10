package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.762  reason: invalid class name */
public final class AnonymousClass762 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        boolean booleanValue = A3Y.A00(parcel).booleanValue();
        return new AnonymousClass77T(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77T[i];
    }
}
