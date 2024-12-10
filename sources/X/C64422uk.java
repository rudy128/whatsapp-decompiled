package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uk  reason: invalid class name and case insensitive filesystem */
public final class C64422uk implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C47712Jo.CREATOR;
        return new C47712Jo(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C47712Jo[i];
    }
}
