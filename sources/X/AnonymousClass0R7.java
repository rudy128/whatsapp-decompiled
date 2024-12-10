package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0R7  reason: invalid class name */
public final class AnonymousClass0R7 implements Parcelable.Creator {
    public static final AnonymousClass0CD A01(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return A00(parcel);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return A01(parcel);
    }

    public static AnonymousClass0CD A00(Parcel parcel) {
        String readString = parcel.readString();
        C17960vV.A06(readString);
        C18070vi.A0X(readString);
        String readString2 = parcel.readString();
        C17960vV.A06(readString2);
        C18070vi.A0X(readString2);
        String readString3 = parcel.readString();
        if (readString3 != null) {
            return new AnonymousClass0CD(Integer.valueOf(parcel.readInt()), readString, readString2, readString3);
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0CD[i];
    }
}
