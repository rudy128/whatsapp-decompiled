package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABp  reason: case insensitive filesystem */
public final class C20205ABp implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        String readString = parcel.readString();
        C17960vV.A06(readString);
        C18070vi.A0X(readString);
        String readString2 = parcel.readString();
        C17960vV.A06(readString2);
        C18070vi.A0X(readString2);
        String readString3 = parcel.readString();
        if (readString3 != null) {
            return new AnonymousClass8nD(readString, readString2, readString3, parcel.readString(), (String) null, false);
        }
        throw C17880vN.A0g();
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8nD[i];
    }
}
