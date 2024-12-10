package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.24d  reason: invalid class name and case insensitive filesystem */
public final class C446224d implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C446124c((C20271AEe) parcel.readParcelable(C446124c.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C446124c[i];
    }
}
