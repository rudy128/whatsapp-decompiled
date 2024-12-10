package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76A  reason: invalid class name */
public final class AnonymousClass76A implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass77C(parcel.readInt(), parcel.readInt(), C72453Mb.A0y(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77C[i];
    }
}
