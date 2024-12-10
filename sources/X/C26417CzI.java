package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.CzI  reason: case insensitive filesystem */
public final class C26417CzI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        HashSet A12 = C17880vN.A12();
        ArrayList arrayList = null;
        int i = 0;
        C23256Be6 be6 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i3 = 1;
            if (c != 1) {
                i3 = 2;
                if (c != 2) {
                    i3 = 3;
                    if (c != 3) {
                        i3 = 4;
                        if (c != 4) {
                            C26300CxD.A0I(parcel, readInt);
                        } else {
                            be6 = (C23256Be6) C26300CxD.A0A(parcel, C23256Be6.CREATOR, readInt);
                        }
                    } else {
                        i2 = C26300CxD.A03(parcel, readInt);
                    }
                } else {
                    arrayList = C26300CxD.A0G(parcel, C23257Be7.CREATOR, readInt);
                }
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
            C17890vO.A1D(A12, i3);
        }
        if (parcel.dataPosition() == A02) {
            return new C23255Be5(be6, arrayList, A12, i, i2);
        }
        throw new C27213DZn(parcel, AnonymousClass001.A1I("Overread allowed size end=", AnonymousClass000.A10(), A02));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23255Be5[i];
    }
}
