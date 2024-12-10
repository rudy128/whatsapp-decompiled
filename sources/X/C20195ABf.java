package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABf  reason: case insensitive filesystem */
public final class C20195ABf implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C173448v5.CREATOR;
        return new C173448v5(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C173448v5[i];
    }
}
