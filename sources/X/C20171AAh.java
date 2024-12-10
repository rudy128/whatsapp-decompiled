package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAh  reason: case insensitive filesystem */
public final class C20171AAh implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AnonymousClass8D3(AnonymousClass3Ma.A08(parcel, AnonymousClass8D3.class), parcel.readLong(), parcel.readLong(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8D3[i];
    }
}
