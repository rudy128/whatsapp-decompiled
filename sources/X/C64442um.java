package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2um  reason: invalid class name and case insensitive filesystem */
public final class C64442um implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C47732Jq.CREATOR;
        return new C47732Jq((AnonymousClass1E2) AnonymousClass1E2.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C47732Jq[i];
    }
}
