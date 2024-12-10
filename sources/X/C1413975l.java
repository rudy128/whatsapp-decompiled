package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75l  reason: invalid class name and case insensitive filesystem */
public final class C1413975l implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AD8 ad8 = (AD8) AnonymousClass3Ma.A08(parcel, AnonymousClass77A.class);
        boolean z = true;
        boolean A1O = AnonymousClass000.A1O(parcel.readInt());
        boolean A1R = C72473Md.A1R(parcel);
        if (parcel.readInt() == 0) {
            z = false;
        }
        return new AnonymousClass77A(ad8, A1O, A1R, z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77A[i];
    }
}
