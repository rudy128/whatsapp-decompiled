package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.765  reason: invalid class name */
public final class AnonymousClass765 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        String readString = parcel.readString();
        C17960vV.A07(readString);
        File A17 = C108945cZ.A17(readString);
        boolean booleanValue = A3Y.A00(parcel).booleanValue();
        return new C1417176r((AnonymousClass77X) AnonymousClass77X.CREATOR.createFromParcel(parcel), A17, A0A, parcel.readInt(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417176r[i];
    }
}
