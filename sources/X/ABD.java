package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABD implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable A08 = AnonymousClass3Ma.A08(parcel, C1418477e.class);
        if (A08 != null) {
            C1418477e r1 = (C1418477e) A08;
            String readString = parcel.readString();
            if (readString != null) {
                AnonymousClass8pQ r0 = new AnonymousClass8pQ(r1, readString, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                r0.A09(parcel);
                return r0;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pQ[i];
    }
}
