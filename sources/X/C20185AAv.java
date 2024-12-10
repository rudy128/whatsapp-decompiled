package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAv  reason: case insensitive filesystem */
public final class C20185AAv implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        if (A0y != null) {
            String readString = parcel.readString();
            if (readString != null) {
                return new AEQ(A0y, readString);
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEQ[i];
    }
}
