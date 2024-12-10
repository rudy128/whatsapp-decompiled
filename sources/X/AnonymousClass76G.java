package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76G  reason: invalid class name */
public final class AnonymousClass76G implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C109875eA(AnonymousClass3Ma.A08(parcel, C109875eA.class), parcel.readString(), parcel.readString(), parcel.readFloat(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109875eA[i];
    }
}
