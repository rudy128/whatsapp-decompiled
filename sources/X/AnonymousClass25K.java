package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.25K  reason: invalid class name */
public final class AnonymousClass25K implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C29681ch.CREATOR;
        return new C29681ch(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C29681ch[i];
    }
}
