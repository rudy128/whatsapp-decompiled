package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC1 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pT r2 = new AnonymousClass8pT();
        boolean z = false;
        r2.A0a = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A08 = (C1418477e) AnonymousClass3Ma.A08(parcel, C1418477e.class);
        r2.A0B = parcel.readString();
        r2.A0A = parcel.readString();
        r2.A0O = parcel.readString();
        r2.A0Q = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A03 = parcel.readInt();
        r2.A0Y = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A0U = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A06 = parcel.readLong();
        r2.A04 = parcel.readInt();
        r2.A0G = parcel.readString();
        r2.A0H = parcel.readString();
        r2.A00 = parcel.readInt();
        r2.A0W = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A0V = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A0S = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A0R = AnonymousClass000.A1T(parcel.readByte(), 1);
        r2.A0J = parcel.readString();
        r2.A05 = parcel.readLong();
        r2.A01 = parcel.readInt();
        r2.A06 = AnonymousClass000.A1T(parcel.readByte(), 1);
        if (parcel.readByte() == 1) {
            z = true;
        }
        r2.A07 = z;
        r2.A02 = parcel.readString();
        r2.A05 = parcel.readString();
        r2.A00 = parcel.readInt();
        r2.A03 = parcel.readString();
        r2.A01 = parcel.readInt();
        r2.A0C = parcel.readString();
        r2.A0E = parcel.readString();
        r2.A0D = parcel.readString();
        r2.A09 = Long.valueOf(parcel.readLong());
        r2.A04 = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            r2.A0F = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                r2.A0I = readString2;
                boolean z2 = false;
                r2.A0P = AnonymousClass000.A1T(parcel.readByte(), 1);
                r2.A0Z = AnonymousClass000.A1T(parcel.readByte(), 1);
                r2.A0X = AnonymousClass000.A1T(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z2 = true;
                }
                r2.A0T = z2;
                r2.A0N = parcel.readString();
                r2.A0M = parcel.readString();
                r2.A0L = parcel.readString();
                r2.A0K = parcel.readString();
                return r2;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pT[i];
    }
}
