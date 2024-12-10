package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bf  reason: invalid class name and case insensitive filesystem */
public final class C88974bf implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C89284cD(parcel.createStringArrayList(), A3Y.A00(parcel).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89284cD[i];
    }
}
