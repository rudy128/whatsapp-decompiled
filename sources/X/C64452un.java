package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2un  reason: invalid class name and case insensitive filesystem */
public final class C64452un implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = AnonymousClass1EF.CREATOR;
        return new AnonymousClass1EF((AnonymousClass1ED) AnonymousClass1ED.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1EF[i];
    }
}
