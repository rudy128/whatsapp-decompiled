package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABr  reason: case insensitive filesystem */
public final class C20207ABr implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pF r1 = new AnonymousClass8pF();
        r1.A0B(parcel);
        r1.A01 = (C1418477e) AnonymousClass3Ma.A08(parcel, C1418477e.class);
        r1.A02 = parcel.readString();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pF[i];
    }
}
