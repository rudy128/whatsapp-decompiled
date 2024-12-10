package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1yI  reason: invalid class name and case insensitive filesystem */
public final class C42511yI implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = AnonymousClass1E2.CREATOR;
        return new AnonymousClass1E2(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1E2[i];
    }
}
