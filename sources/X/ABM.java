package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABM implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.8pK, X.AEs, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        ? aEs = new C20284AEs();
        aEs.A01 = A0A;
        aEs.A00 = readInt;
        aEs.A09(parcel);
        return aEs;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pK[i];
    }
}
