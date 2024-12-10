package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uo  reason: invalid class name and case insensitive filesystem */
public final class C64462uo implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = AnonymousClass1ED.CREATOR;
        return new AnonymousClass1ED(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1ED[i];
    }
}
