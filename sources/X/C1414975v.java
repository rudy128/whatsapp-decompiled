package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.75v  reason: invalid class name and case insensitive filesystem */
public final class C1414975v implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ArrayList A0z = C17880vN.A0z(A0A);
        for (int i = 0; i != A0A; i++) {
            A0z.add(Double.valueOf(parcel.readDouble()));
        }
        int readInt = parcel.readInt();
        ArrayList A0z2 = C17880vN.A0z(readInt);
        for (int i2 = 0; i2 != readInt; i2++) {
            A0z2.add(Double.valueOf(parcel.readDouble()));
        }
        return new AnonymousClass774(parcel.readString(), A0z, A0z2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass774[i];
    }
}
