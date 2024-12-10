package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bk  reason: invalid class name and case insensitive filesystem */
public final class C89024bk implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C72903Ny(AnonymousClass3Ma.A08(parcel, C72903Ny.class), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C72903Ny[i];
    }
}
