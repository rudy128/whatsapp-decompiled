package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.ACs  reason: case insensitive filesystem */
public final class C20234ACs implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt);
        int i = 0;
        while (i != readInt) {
            i = AnonymousClass8BV.A01(parcel, C20253ADl.CREATOR, A0z2, i);
        }
        String readString = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            A0z = null;
        } else {
            int readInt2 = parcel.readInt();
            A0z = C17880vN.A0z(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                A0z.add(AnonymousClass3Ma.A08(parcel, C20277AEk.class));
            }
        }
        if (parcel.readInt() != 0) {
            obj = ADE.CREATOR.createFromParcel(parcel);
        }
        return new C20277AEk((ADE) obj, readString, A0z2, A0z, A0A);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20277AEk[i];
    }
}
