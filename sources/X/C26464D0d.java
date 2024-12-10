package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0d  reason: case insensitive filesystem */
public final class C26464D0d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return D41.A00(parcel.readInt());
        } catch (C1Y e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new D41[i];
    }
}
