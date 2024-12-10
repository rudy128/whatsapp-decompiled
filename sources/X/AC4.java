package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC4 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pZ r3 = new AnonymousClass8pZ();
        r3.A01 = parcel.readInt();
        r3.A09 = parcel.readString();
        r3.A0C = parcel.readString();
        r3.A03 = parcel.readString();
        r3.A03 = parcel.readString();
        r3.A07 = parcel.readString();
        r3.A04 = parcel.readString();
        r3.A05 = parcel.readString();
        r3.A02 = parcel.readLong();
        r3.A00 = parcel.readInt();
        r3.A02 = parcel.readString();
        r3.A06 = parcel.readString();
        r3.A04 = parcel.readString();
        boolean z = false;
        r3.A0E = AnonymousClass000.A1T(parcel.readByte(), 1);
        if (parcel.readByte() == 1) {
            z = true;
        }
        r3.A0F = z;
        r3.A0B = parcel.readString();
        r3.A08 = parcel.readString();
        r3.A00 = parcel.readInt();
        r3.A05 = parcel.readString();
        r3.A01 = parcel.readInt();
        return r3;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pZ[i];
    }
}
