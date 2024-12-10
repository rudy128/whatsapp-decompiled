package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1z0  reason: invalid class name and case insensitive filesystem */
public final class C42951z0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        return new AnonymousClass1EC(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1EC[i];
    }
}
