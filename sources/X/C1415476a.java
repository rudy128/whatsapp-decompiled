package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76a  reason: invalid class name and case insensitive filesystem */
public final class C1415476a implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        long readLong = parcel.readLong();
        return new C1417276s(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readLong, parcel.readLong(), parcel.readLong());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417276s[i];
    }
}
