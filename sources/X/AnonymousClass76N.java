package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76N  reason: invalid class name */
public final class AnonymousClass76N implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass4DO valueOf;
        AnonymousClass4DP valueOf2;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = AnonymousClass4DO.valueOf(parcel.readString());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = AnonymousClass4DP.valueOf(parcel.readString());
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new AnonymousClass77L(valueOf, valueOf2, num, A0y, readString, readString2, readString3);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77L[i];
    }
}
