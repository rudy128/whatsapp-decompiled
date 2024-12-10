package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75i  reason: invalid class name and case insensitive filesystem */
public final class C1413675i implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C115175tW((C20287AEv) AnonymousClass3Ma.A08(parcel, C115175tW.class), C137126ux.A00(parcel.readString()), parcel.readString(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C115175tW[i];
    }
}
