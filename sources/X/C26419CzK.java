package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.CzK  reason: case insensitive filesystem */
public final class C26419CzK implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        HashSet A12 = C17880vN.A12();
        C23258Be8 be8 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i2 = 1;
            if (c != 1) {
                i2 = 2;
                if (c != 2) {
                    i2 = 3;
                    if (c != 3) {
                        i2 = 4;
                        if (c != 4) {
                            i2 = 5;
                            if (c != 5) {
                                C26300CxD.A0I(parcel, readInt);
                            } else {
                                str3 = C26300CxD.A0D(parcel, readInt);
                            }
                        } else {
                            str2 = C26300CxD.A0D(parcel, readInt);
                        }
                    } else {
                        str = C26300CxD.A0D(parcel, readInt);
                    }
                } else {
                    be8 = (C23258Be8) C26300CxD.A0A(parcel, C23258Be8.CREATOR, readInt);
                }
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
            C17890vO.A1D(A12, i2);
        }
        if (parcel.dataPosition() == A02) {
            return new C23257Be7(be8, str, str2, str3, A12, i);
        }
        throw new C27213DZn(parcel, AnonymousClass001.A1I("Overread allowed size end=", AnonymousClass000.A10(), A02));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23257Be7[i];
    }
}
