package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76Y  reason: invalid class name */
public final class AnonymousClass76Y implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass77U(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77U[i];
    }
}
