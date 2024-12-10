package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.LinkedHashSet;

public final class ABW implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.AEs, java.lang.Object, X.8pP] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        int readInt = parcel.readInt();
        LinkedHashSet A14 = C17880vN.A14();
        for (int i = 0; i < readInt; i++) {
            A14.add(AnonymousClass1KI.A00(parcel));
        }
        ? aEs = new C20284AEs();
        aEs.A09(parcel);
        aEs.A0D(aEs.A07, new BigDecimal(A0y));
        aEs.A01 = A14;
        return aEs;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pP[i];
    }
}
