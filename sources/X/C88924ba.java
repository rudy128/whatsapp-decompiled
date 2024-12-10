package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ba  reason: invalid class name and case insensitive filesystem */
public final class C88924ba implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C72913Nz(AnonymousClass3Ma.A08(parcel, C72913Nz.class), parcel.readInt(), parcel.readInt(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C72913Nz[i];
    }
}
