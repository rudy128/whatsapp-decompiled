package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.24a  reason: invalid class name and case insensitive filesystem */
public final class C445924a implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AnonymousClass24Z(parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass24Z[i];
    }
}
