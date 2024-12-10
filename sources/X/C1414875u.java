package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.75u  reason: invalid class name and case insensitive filesystem */
public final class C1414875u implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i++) {
            A0z.add(AnonymousClass3Ma.A08(parcel, AnonymousClass77K.class));
        }
        int readInt2 = parcel.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            A0z2.add(AnonymousClass3Ma.A08(parcel, AnonymousClass77K.class));
        }
        return new AnonymousClass77K(A0z, A0z2, A0A, C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77K[i];
    }
}
