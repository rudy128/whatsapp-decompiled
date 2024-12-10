package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABg  reason: case insensitive filesystem */
public final class C20196ABg implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C173418v2.CREATOR;
        return new C173418v2(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C173418v2[i];
    }
}
