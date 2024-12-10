package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bT  reason: invalid class name */
public final class AnonymousClass4bT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C75853lr(parcel.readString(), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C75853lr[i];
    }
}
