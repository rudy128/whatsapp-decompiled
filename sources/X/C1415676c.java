package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76c  reason: invalid class name and case insensitive filesystem */
public final class C1415676c implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass77Z(parcel.readString(), C72453Mb.A0A(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77Z[i];
    }
}
