package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC3 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pJ r6 = new AnonymousClass8pJ();
        String readString = parcel.readString();
        if (readString != null) {
            r6.A00 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                r6.A01 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    r6.A02 = readString3;
                    int readInt = parcel.readInt();
                    r6.A03 = C17880vN.A11();
                    int i = 0;
                    while (i < readInt) {
                        String readString4 = parcel.readString();
                        if (readString4 != null) {
                            String readString5 = parcel.readString();
                            if (readString5 != null) {
                                AnonymousClass8BT.A1R(readString4, readString5, r6.A03);
                                i++;
                            } else {
                                throw AnonymousClass000.A0n("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                    return r6;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pJ[i];
    }
}
