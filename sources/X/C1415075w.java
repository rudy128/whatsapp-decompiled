package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75w  reason: invalid class name and case insensitive filesystem */
public final class C1415075w implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AnonymousClass7PZ((D3j) D3j.CREATOR.createFromParcel(parcel), (AnonymousClass1BI) AnonymousClass3Ma.A08(parcel, AnonymousClass7PZ.class), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass7PZ[i];
    }
}
